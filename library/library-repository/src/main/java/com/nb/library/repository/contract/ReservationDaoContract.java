package com.nb.library.repository.contract;

import com.nb.library.client.reservation.Reservation;
import com.nb.library.client.reservation.UserAccount;
import com.nb.library.client.reservation.Work;

import java.util.List;

public interface ReservationDaoContract {
    void addReservation(Reservation reservation);

    List<Reservation> listReservationsByWork(Work work);

    List<Reservation> listReservationsByUser(UserAccount user);

    void deleteReservation(Reservation reservation);
}
