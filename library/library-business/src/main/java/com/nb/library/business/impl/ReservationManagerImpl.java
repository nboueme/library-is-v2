package com.nb.library.business.impl;

import com.nb.library.business.AbstractManager;
import com.nb.library.business.contract.ReservationManager;
import com.nb.library.client.reservation.Reservation;
import com.nb.library.client.reservation.UserAccount;
import com.nb.library.client.reservation.Work;

import java.util.List;

public class ReservationManagerImpl extends AbstractManager implements ReservationManager {

    public List<Reservation> listReservationsByWork(Work work) {
        return getDaoFactory().getReservationDao().listReservationsByWork(work);
    }

    public List<Reservation> listReservationsByUser(UserAccount user) {
        return getDaoFactory().getReservationDao().listReservationsByUser(user);
    }
}
