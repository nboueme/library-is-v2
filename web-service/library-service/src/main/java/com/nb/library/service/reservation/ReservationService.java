package com.nb.library.service.reservation;

import com.nb.library.entity.reservation.Reservation;
import com.nb.library.entity.reservation.UserAccount;
import com.nb.library.entity.reservation.Work;
import com.nb.library.repository.contract.ReservationDaoContract;
import com.nb.library.service.AbstractService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(name = "ReservationClient", serviceName = "ReservationService", portName = "ReservationPort", targetNamespace = "reservation.client.library.nb.com")
public class ReservationService extends AbstractService {

    private ReservationDaoContract contract = getDaoFactory().getReservationDao();

    @WebMethod
    public void addReservation(Reservation reservation) {
        contract.save(reservation);
    }

    @WebMethod
    public List<Reservation> listAllReservations() {
        return contract.findAll();
    }

    @WebMethod
    public List<Reservation> listReservationsByWork(Work work) {
        return contract.findAllByWorkId(work);
    }

    @WebMethod
    public List<Reservation> listReservationsByUser(UserAccount user) {
        return contract.findAllByUserId(user);
    }

    @WebMethod
    public Integer countReservationsByWork(Integer workId) {
        return contract.countAllByWorkId(workId);
    }

    @WebMethod
    public void update(Reservation reservation) {
        contract.update(reservation);
    }

    @WebMethod
    public void deleteReservation(Reservation reservation) {
        contract.delete(reservation);
    }
}
