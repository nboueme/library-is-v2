
package com.nb.library.client.borrowing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getBorrowingByBookIdResponse complex type.
 * 
 * <p>Le fragment de sch\u00e9ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getBorrowingByBookIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{borrowing.client.library.nb.com}borrowing" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBorrowingByBookIdResponse", propOrder = {
    "_return"
})
public class GetBorrowingByBookIdResponse {

    @XmlElement(name = "return")
    protected Borrowing _return;

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 return.
     * 
     * @return
     *     possible object is
     *     {@link Borrowing }
     *     
     */
    public Borrowing getReturn() {
        return _return;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 return.
     * 
     * @param value
     *     allowed object is
     *     {@link Borrowing }
     *     
     */
    public void setReturn(Borrowing value) {
        this._return = value;
    }

}
