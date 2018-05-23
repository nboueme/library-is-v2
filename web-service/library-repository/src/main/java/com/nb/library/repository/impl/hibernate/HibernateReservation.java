package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.reservation.Reservation;
import com.nb.library.entity.reservation.UserAccount;
import com.nb.library.entity.reservation.Work;
import com.nb.library.repository.contract.ReservationDaoContract;
import com.nb.library.repository.impl.data.ReservationRepository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public class HibernateReservation implements ReservationDaoContract {

    @Resource
    private ReservationRepository reservationRepository;

    @Transactional
    public void save(Reservation reservation) {
        reservationRepository.save(reservation);
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
    public void delete(Reservation reservation) {
        reservationRepository.deleteById(reservation.getId());
    }
}
