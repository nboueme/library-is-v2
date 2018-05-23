
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

    private final static QName _ListReservations_QNAME = new QName("reservation.client.library.nb.com", "listReservations");
    private final static QName _ListReservationsResponse_QNAME = new QName("reservation.client.library.nb.com", "listReservationsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nb.library.client.reservation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListReservations }
     * 
     */
    public ListReservations createListReservations() {
        return new ListReservations();
    }

    /**
     * Create an instance of {@link ListReservationsResponse }
     * 
     */
    public ListReservationsResponse createListReservationsResponse() {
        return new ListReservationsResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReservations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "reservation.client.library.nb.com", name = "listReservations")
    public JAXBElement<ListReservations> createListReservations(ListReservations value) {
        return new JAXBElement<ListReservations>(_ListReservations_QNAME, ListReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReservationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "reservation.client.library.nb.com", name = "listReservationsResponse")
    public JAXBElement<ListReservationsResponse> createListReservationsResponse(ListReservationsResponse value) {
        return new JAXBElement<ListReservationsResponse>(_ListReservationsResponse_QNAME, ListReservationsResponse.class, null, value);
    }

}
