
package com.nb.library.client.reservation;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ReservationClient", targetNamespace = "reservation.client.library.nb.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReservationClient {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.nb.library.client.reservation.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listReservationsByWork", targetNamespace = "reservation.client.library.nb.com", className = "com.nb.library.client.reservation.ListReservationsByWork")
    @ResponseWrapper(localName = "listReservationsByWorkResponse", targetNamespace = "reservation.client.library.nb.com", className = "com.nb.library.client.reservation.ListReservationsByWorkResponse")
    @Action(input = "reservation.client.library.nb.com/ReservationClient/listReservationsByWorkRequest", output = "reservation.client.library.nb.com/ReservationClient/listReservationsByWorkResponse")
    public List<Reservation> listReservationsByWork(
        @WebParam(name = "arg0", targetNamespace = "")
        Work arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.nb.library.client.reservation.Reservation>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listReservationsByUser", targetNamespace = "reservation.client.library.nb.com", className = "com.nb.library.client.reservation.ListReservationsByUser")
    @ResponseWrapper(localName = "listReservationsByUserResponse", targetNamespace = "reservation.client.library.nb.com", className = "com.nb.library.client.reservation.ListReservationsByUserResponse")
    @Action(input = "reservation.client.library.nb.com/ReservationClient/listReservationsByUserRequest", output = "reservation.client.library.nb.com/ReservationClient/listReservationsByUserResponse")
    public List<Reservation> listReservationsByUser(
        @WebParam(name = "arg0", targetNamespace = "")
        UserAccount arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "countReservationsByWork", targetNamespace = "reservation.client.library.nb.com", className = "com.nb.library.client.reservation.CountReservationsByWork")
    @ResponseWrapper(localName = "countReservationsByWorkResponse", targetNamespace = "reservation.client.library.nb.com", className = "com.nb.library.client.reservation.CountReservationsByWorkResponse")
    @Action(input = "reservation.client.library.nb.com/ReservationClient/countReservationsByWorkRequest", output = "reservation.client.library.nb.com/ReservationClient/countReservationsByWorkResponse")
    public Integer countReservationsByWork(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteReservation", targetNamespace = "reservation.client.library.nb.com", className = "com.nb.library.client.reservation.DeleteReservation")
    @ResponseWrapper(localName = "deleteReservationResponse", targetNamespace = "reservation.client.library.nb.com", className = "com.nb.library.client.reservation.DeleteReservationResponse")
    @Action(input = "reservation.client.library.nb.com/ReservationClient/deleteReservationRequest", output = "reservation.client.library.nb.com/ReservationClient/deleteReservationResponse")
    public void deleteReservation(
        @WebParam(name = "arg0", targetNamespace = "")
        Reservation arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addReservation", targetNamespace = "reservation.client.library.nb.com", className = "com.nb.library.client.reservation.AddReservation")
    @ResponseWrapper(localName = "addReservationResponse", targetNamespace = "reservation.client.library.nb.com", className = "com.nb.library.client.reservation.AddReservationResponse")
    @Action(input = "reservation.client.library.nb.com/ReservationClient/addReservationRequest", output = "reservation.client.library.nb.com/ReservationClient/addReservationResponse")
    public void addReservation(
        @WebParam(name = "arg0", targetNamespace = "")
        Reservation arg0);

}
