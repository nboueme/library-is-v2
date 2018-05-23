package com.nb.library.repository.impl.soap;

import com.nb.library.client.reservation.Reservation;
import com.nb.library.client.reservation.ReservationClient;
import com.nb.library.client.reservation.ReservationService;
import com.nb.library.repository.contract.ReservationDaoContract;

import java.util.List;

public class SoapReservationDao implements ReservationDaoContract {

    private ReservationService service = new ReservationService();
    private ReservationClient client = service.getReservationPort();

    public List<Reservation> listReservations() {
        return client.listReservations();
    }
}
