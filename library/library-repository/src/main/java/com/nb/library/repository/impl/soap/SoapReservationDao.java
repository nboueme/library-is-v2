package com.nb.library.repository.impl.soap;

import com.nb.library.client.reservation.*;
import com.nb.library.repository.contract.ReservationDaoContract;

import java.util.List;

public class SoapReservationDao implements ReservationDaoContract {

    private ReservationService service = new ReservationService();
    private ReservationClient client = service.getReservationPort();

    public List<Reservation> listReservationsByWork(Work work) {
        return client.listReservationsByWork(work);
    }

    public List<Reservation> listReservationsByUser(UserAccount user) {
        return client.listReservationsByUser(user);
    }
}
