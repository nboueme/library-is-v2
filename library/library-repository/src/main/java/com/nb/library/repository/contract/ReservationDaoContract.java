package com.nb.library.repository.contract;

import com.nb.library.client.reservation.Reservation;

import java.util.List;

public interface ReservationDaoContract {
    List<Reservation> listReservations();
}
