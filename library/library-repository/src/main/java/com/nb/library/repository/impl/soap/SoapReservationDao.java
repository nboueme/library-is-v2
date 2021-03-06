package com.nb.library.repository.impl.soap;

import com.nb.library.client.reservation.*;
import com.nb.library.repository.contract.ReservationDaoContract;

import java.util.List;

public class SoapReservationDao implements ReservationDaoContract {

    private ReservationService service = new ReservationService();
    private ReservationClient client = service.getReservationPort();

    public void addReservation(Reservation reservation) {
        client.addReservation(reservation);
    }

    public List<Reservation> listAllReservations() {
        return client.listAllReservations();
    }

    public List<Reservation> listReservationsByWork(Work work) {
        return client.listReservationsByWork(work);
    }

    public List<Reservation> listReservationsByUser(UserAccount user) {
        return client.listReservationsByUser(user);
    }

    public Integer countReservationsByWork(Integer workId) {
        return client.countReservationsByWork(workId);
    }

    public void updateNotificationDate(Reservation reservation) {
        client.updateNotificationDate(reservation);
    }

    public void deleteReservation(Reservation reservation) {
        client.deleteReservation(reservation);
    }
}
