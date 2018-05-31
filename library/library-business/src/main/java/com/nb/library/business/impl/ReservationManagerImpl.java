package com.nb.library.business.impl;

import com.nb.library.business.AbstractManager;
import com.nb.library.business.contract.ReservationManager;
import com.nb.library.client.reservation.Reservation;
import com.nb.library.client.reservation.UserAccount;
import com.nb.library.client.reservation.Work;

import java.util.List;

public class ReservationManagerImpl extends AbstractManager implements ReservationManager {

    public void addReservation(Reservation reservation) {
        getDaoFactory().getReservationDao().addReservation(reservation);
    }

    public List<Reservation> listAllReservations() {
        return getDaoFactory().getReservationDao().listAllReservations();
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

    public void update(Reservation reservation) {
        getDaoFactory().getReservationDao().update(reservation);
    }

    public void deleteReservation(Reservation reservation) {
        getDaoFactory().getReservationDao().deleteReservation(reservation);
    }
}
