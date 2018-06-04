package com.nb.library.business.impl;

import com.nb.library.business.AbstractManager;
import com.nb.library.business.contract.ReservationManager;
import com.nb.library.client.reservation.Reservation;
import com.nb.library.client.reservation.UserAccount;
import com.nb.library.client.reservation.Work;

import java.util.ArrayList;
import java.util.List;

public class ReservationManagerImpl extends AbstractManager implements ReservationManager {

    public void addReservation(Reservation reservation) {
        getDaoFactory().getReservationDao().addReservation(reservation);
    }

    public List<Reservation> listAllReservations() {
        List<Reservation> reservations = getDaoFactory().getReservationDao().listAllReservations();
        List<Reservation> distinctReservations = new ArrayList<>(0);

        Integer workId = 0;

        for (Reservation reservation : reservations) {
            if (workId.equals(0)) {
                workId = reservation.getWork().getId();
                distinctReservations.add(reservation);
            }

            if (!workId.equals(reservation.getWork().getId())) {
                workId = reservation.getWork().getId();
                distinctReservations.add(reservation);
            }
        }

        return distinctReservations;
    }

    public List<Reservation> listReservationsByWork(Work work) {
        return getDaoFactory().getReservationDao().listReservationsByWork(work);
    }

    public List<Reservation> listReservationsByUser(UserAccount user) {
        return getDaoFactory().getReservationDao().listReservationsByUser(user);
    }

    public Integer countReservationsByWork(Integer workId) {
        return getDaoFactory().getReservationDao().countReservationsByWork(workId);
    }

    public void updateNotificationDate(Reservation reservation) {
        getDaoFactory().getReservationDao().updateNotificationDate(reservation);
    }

    public void deleteReservation(Reservation reservation) {
        getDaoFactory().getReservationDao().deleteReservation(reservation);
    }
}
