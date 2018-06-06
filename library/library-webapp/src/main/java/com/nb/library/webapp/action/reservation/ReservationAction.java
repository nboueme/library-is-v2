package com.nb.library.webapp.action.reservation;

import com.nb.library.client.reservation.Reservation;
import com.nb.library.client.reservation.Work;
import com.nb.library.client.user.UserAccount;
import com.nb.library.webapp.AbstractService;
import com.nb.library.webapp.utility.Constant;
import com.opensymphony.xwork2.ActionContext;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.GregorianCalendar;

public class ReservationAction extends AbstractService {

    private Reservation reservation;
    private Work work;

    public String addReservation() throws DatatypeConfigurationException {
        UserAccount userSession = (UserAccount) ActionContext.getContext().getSession().get(Constant.USER_SESSION);

        if (userSession == null)
            return LOGIN;

        reservation = new Reservation();
        com.nb.library.client.reservation.UserAccount user = new com.nb.library.client.reservation.UserAccount();
        user.setId(userSession.getId());
        reservation.setUser(user);
        reservation.setWork(work);
        reservation.setReservationDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));

        getManagerFactory().getReservationManager().addReservation(reservation);

        return SUCCESS;
    }

    public String deleteReservation() {
        UserAccount userSession = (UserAccount) ActionContext.getContext().getSession().get(Constant.USER_SESSION);

        if (userSession == null)
            return LOGIN;

        getManagerFactory().getReservationManager().deleteReservation(reservation);

        return SUCCESS;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}
