package com.nb.library.business.contract;

import com.nb.library.client.reservation.Reservation;
import com.nb.library.client.reservation.UserAccount;
import com.nb.library.client.reservation.Work;

import java.util.List;

public interface ReservationManager {
    void addReservation(Reservation reservation);

    List<Reservation> listAllReservations();

    List<Reservation> listReservationsByWork(Work work);

    List<Reservation> listReservationsByUser(UserAccount user);

    Integer countReservationsByWork(Integer workId);

    void updateNotificationDate(Reservation reservation);

    void deleteReservation(Reservation reservation);
}
