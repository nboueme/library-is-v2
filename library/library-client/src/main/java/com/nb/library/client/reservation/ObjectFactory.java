
package com.nb.library.client.reservation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nb.library.client.reservation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListReservationsByUser_QNAME = new QName("reservation.client.library.nb.com", "listReservationsByUser");
    private final static QName _AddReservationResponse_QNAME = new QName("reservation.client.library.nb.com", "addReservationResponse");
    private final static QName _ListReservationsByUserResponse_QNAME = new QName("reservation.client.library.nb.com", "listReservationsByUserResponse");
    private final static QName _DeleteReservation_QNAME = new QName("reservation.client.library.nb.com", "deleteReservation");
    private final static QName _ListReservationsByWorkResponse_QNAME = new QName("reservation.client.library.nb.com", "listReservationsByWorkResponse");
    private final static QName _AddReservation_QNAME = new QName("reservation.client.library.nb.com", "addReservation");
    private final static QName _DeleteReservationResponse_QNAME = new QName("reservation.client.library.nb.com", "deleteReservationResponse");
    private final static QName _ListReservationsByWork_QNAME = new QName("reservation.client.library.nb.com", "listReservationsByWork");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nb.library.client.reservation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddReservation }
     * 
     */
    public AddReservation createAddReservation() {
        return new AddReservation();
    }

    /**
     * Create an instance of {@link DeleteReservationResponse }
     * 
     */
    public DeleteReservationResponse createDeleteReservationResponse() {
        return new DeleteReservationResponse();
    }

    /**
     * Create an instance of {@link ListReservationsByWork }
     * 
     */
    public ListReservationsByWork createListReservationsByWork() {
        return new ListReservationsByWork();
    }

    /**
     * Create an instance of {@link DeleteReservation }
     * 
     */
    public DeleteReservation createDeleteReservation() {
        return new DeleteReservation();
    }

    /**
     * Create an instance of {@link ListReservationsByWorkResponse }
     * 
     */
    public ListReservationsByWorkResponse createListReservationsByWorkResponse() {
        return new ListReservationsByWorkResponse();
    }

    /**
     * Create an instance of {@link ListReservationsByUser }
     * 
     */
    public ListReservationsByUser createListReservationsByUser() {
        return new ListReservationsByUser();
    }

    /**
     * Create an instance of {@link AddReservationResponse }
     * 
     */
    public AddReservationResponse createAddReservationResponse() {
        return new AddReservationResponse();
    }

    /**
     * Create an instance of {@link ListReservationsByUserResponse }
     * 
     */
    public ListReservationsByUserResponse createListReservationsByUserResponse() {
        return new ListReservationsByUserResponse();
    }

    /**
     * Create an instance of {@link Work }
     * 
     */
    public Work createWork() {
        return new Work();
    }

    /**
     * Create an instance of {@link UserAccount }
     * 
     */
    public UserAccount createUserAccount() {
        return new UserAccount();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReservationsByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "reservation.client.library.nb.com", name = "listReservationsByUser")
    public JAXBElement<ListReservationsByUser> createListReservationsByUser(ListReservationsByUser value) {
        return new JAXBElement<ListReservationsByUser>(_ListReservationsByUser_QNAME, ListReservationsByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "reservation.client.library.nb.com", name = "addReservationResponse")
    public JAXBElement<AddReservationResponse> createAddReservationResponse(AddReservationResponse value) {
        return new JAXBElement<AddReservationResponse>(_AddReservationResponse_QNAME, AddReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReservationsByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "reservation.client.library.nb.com", name = "listReservationsByUserResponse")
    public JAXBElement<ListReservationsByUserResponse> createListReservationsByUserResponse(ListReservationsByUserResponse value) {
        return new JAXBElement<ListReservationsByUserResponse>(_ListReservationsByUserResponse_QNAME, ListReservationsByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "reservation.client.library.nb.com", name = "deleteReservation")
    public JAXBElement<DeleteReservation> createDeleteReservation(DeleteReservation value) {
        return new JAXBElement<DeleteReservation>(_DeleteReservation_QNAME, DeleteReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReservationsByWorkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "reservation.client.library.nb.com", name = "listReservationsByWorkResponse")
    public JAXBElement<ListReservationsByWorkResponse> createListReservationsByWorkResponse(ListReservationsByWorkResponse value) {
        return new JAXBElement<ListReservationsByWorkResponse>(_ListReservationsByWorkResponse_QNAME, ListReservationsByWorkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "reservation.client.library.nb.com", name = "addReservation")
    public JAXBElement<AddReservation> createAddReservation(AddReservation value) {
        return new JAXBElement<AddReservation>(_AddReservation_QNAME, AddReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "reservation.client.library.nb.com", name = "deleteReservationResponse")
    public JAXBElement<DeleteReservationResponse> createDeleteReservationResponse(DeleteReservationResponse value) {
        return new JAXBElement<DeleteReservationResponse>(_DeleteReservationResponse_QNAME, DeleteReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReservationsByWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "reservation.client.library.nb.com", name = "listReservationsByWork")
    public JAXBElement<ListReservationsByWork> createListReservationsByWork(ListReservationsByWork value) {
        return new JAXBElement<ListReservationsByWork>(_ListReservationsByWork_QNAME, ListReservationsByWork.class, null, value);
    }

}
