package com.nb.library.business.impl;

import com.nb.library.business.AbstractManager;
import com.nb.library.business.contract.ReservationManager;
import com.nb.library.client.reservation.Reservation;

import java.util.List;

public class ReservationManagerImpl extends AbstractManager implements ReservationManager {

    public List<Reservation> listReservations() {
        return getDaoFactory().getReservationDao().listReservations();
    }
}
