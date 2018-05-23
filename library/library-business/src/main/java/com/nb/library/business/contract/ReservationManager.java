package com.nb.library.business.contract;

import com.nb.library.client.reservation.Reservation;

import java.util.List;

public interface ReservationManager {
    List<Reservation> listReservations();
}
