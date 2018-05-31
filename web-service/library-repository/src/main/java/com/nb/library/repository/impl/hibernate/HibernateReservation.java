package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.borrowing.Borrowing;
import com.nb.library.entity.reservation.Reservation;
import com.nb.library.entity.reservation.UserAccount;
import com.nb.library.entity.reservation.Work;
import com.nb.library.repository.contract.ReservationDaoContract;
import com.nb.library.repository.impl.data.BorrowingRepository;
import com.nb.library.repository.impl.data.ReservationRepository;
import com.nb.library.repository.impl.data.WorkRepository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HibernateReservation implements ReservationDaoContract {

    @Resource
    private ReservationRepository reservationRepository;

    @Resource
    private WorkRepository workRepository;

    @Resource
    private BorrowingRepository borrowingRepository;

    @Transactional
    public void save(Reservation reservation) {
        // Il n’est pas possible pour un usager de réserver une oeuvre qu’il a déjà en cours d’emprunt
        for (Borrowing borrowing : borrowingRepository.findAllByUserId(reservation.getUser().getId())) {
            if (borrowing.getBook().getWork().getId().equals(reservation.getWork().getId())) {
                System.out.println("Oeuvre " + borrowing.getBook().getWork().getId() + " déjà en cours d'emprunt par l'utilisateur " + borrowing.getUser().getId() + ".");
                return;
            }
        }

        // Vérification de l'existance de l'oeuvre en question et définition de la taille maximale de la liste
        Optional<com.nb.library.entity.work.Work> work = workRepository.findById(reservation.getWork().getId());
        int maxListSize;

        if (work.isPresent()) {
            maxListSize = work.get().getBooks().size() * 2;
        }
        else return;

        List<Reservation> reservationList = new ArrayList<>(0);
        reservationRepository
                .findAllByWorkId(reservation.getWork().getId())
                .iterator()
                .forEachRemaining(reservationList::add);

        // La liste de réservation ne peut comporter qu’un maximum de personnes correspondant à
        // 2x le nombre d’exemplaires de l’oeuvre
        if (reservationList.size() < maxListSize) {
            reservationRepository.save(reservation);
        }
        else {
            System.out.println("La liste de réservations pour l'oeuvre " + reservation.getWork().getId() + " ne peut exceder " + maxListSize + " exemplaires.");
        }
    }

    @Transactional
    public List<Reservation> findAll() {
        List<Reservation> reservations = new ArrayList<>(0);
        reservationRepository.findAll().iterator().forEachRemaining(reservations::add);
        return reservations;
    }

    @Transactional
    public List<Reservation> findAllByWorkId(Work work) {
        List<Reservation> reservations = new ArrayList<>(0);
        reservationRepository.findAllByWorkId(work.getId()).iterator().forEachRemaining(reservations::add);
        return reservations;
    }

    @Transactional
    public List<Reservation> findAllByUserId(UserAccount user) {
        List<Reservation> reservations = new ArrayList<>(0);
        reservationRepository.findAllByUserId(user.getId()).iterator().forEachRemaining(reservations::add);
        return reservations;
    }

    @Transactional
    public Integer countAllByWorkId(Integer workId) {
        return reservationRepository.countAllByWorkId(workId);
    }

    @Transactional
    public void update(Reservation reservation) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(reservation.getId());
        optionalReservation.ifPresent(transientReservation -> transientReservation.setNotificationDate(reservation.getNotificationDate()));
    }

    @Transactional
    public void delete(Reservation reservation) {
        reservationRepository.deleteById(reservation.getId());
    }
}
