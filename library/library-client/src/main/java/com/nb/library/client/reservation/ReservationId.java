
package com.nb.library.client.reservation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reservationId complex type.
 * 
 * <p>Le fragment de sch\u00e9ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservationId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{reservation.client.library.nb.com}userAccount" minOccurs="0"/>
 *         &lt;element name="work" type="{reservation.client.library.nb.com}work" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservationId", propOrder = {
    "user",
    "work"
})
public class ReservationId {

    protected UserAccount user;
    protected Work work;

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 user.
     * 
     * @return
     *     possible object is
     *     {@link UserAccount }
     *     
     */
    public UserAccount getUser() {
        return user;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 user.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAccount }
     *     
     */
    public void setUser(UserAccount value) {
        this.user = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 work.
     * 
     * @return
     *     possible object is
     *     {@link Work }
     *     
     */
    public Work getWork() {
        return work;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 work.
     * 
     * @param value
     *     allowed object is
     *     {@link Work }
     *     
     */
    public void setWork(Work value) {
        this.work = value;
    }

}
