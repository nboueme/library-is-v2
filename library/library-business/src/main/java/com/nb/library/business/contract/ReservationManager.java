package com.nb.library.business.contract;

import com.nb.library.client.reservation.Reservation;
import com.nb.library.client.reservation.UserAccount;
import com.nb.library.client.reservation.Work;

import java.util.List;

public interface ReservationManager {
    List<Reservation> listReservationsByWork(Work work);

    List<Reservation> listReservationsByUser(UserAccount user);
}
