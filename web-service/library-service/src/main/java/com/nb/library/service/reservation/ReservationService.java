package com.nb.library.service.reservation;

import com.nb.library.entity.reservation.Reservation;
import com.nb.library.repository.contract.ReservationDaoContract;
import com.nb.library.service.AbstractService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(name = "ReservationClient", serviceName = "ReservationService", portName = "ReservationPort", targetNamespace = "reservation.client.library.nb.com")
public class ReservationService extends AbstractService {

    private ReservationDaoContract contract = getDaoFactory().getReservationDao();

    @WebMethod
    public List<Reservation> listReservations() {
        return contract.findAll();
    }
}
