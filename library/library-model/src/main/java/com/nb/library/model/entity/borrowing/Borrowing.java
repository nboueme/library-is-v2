
package com.nb.library.model.entity.borrowing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour borrowing complex type.
 * 
 * <p>Le fragment de sch\u00e9ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="borrowing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="borrowingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="extended" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="loaned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="work" type="{borrowing.entity.model.library.nb.com}work" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "borrowing", propOrder = {
    "bookId",
    "borrowingDate",
    "extended",
    "id",
    "loaned",
    "returnDate",
    "userId",
    "work"
})
public class Borrowing {

    protected int bookId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar borrowingDate;
    protected boolean extended;
    protected int id;
    protected boolean loaned;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar returnDate;
    protected int userId;
    protected Work work;

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 bookId.
     * 
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 bookId.
     * 
     */
    public void setBookId(int value) {
        this.bookId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 borrowingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBorrowingDate() {
        return borrowingDate;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 borrowingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBorrowingDate(XMLGregorianCalendar value) {
        this.borrowingDate = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 extended.
     * 
     */
    public boolean isExtended() {
        return extended;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 extended.
     * 
     */
    public void setExtended(boolean value) {
        this.extended = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 loaned.
     * 
     */
    public boolean isLoaned() {
        return loaned;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 loaned.
     * 
     */
    public void setLoaned(boolean value) {
        this.loaned = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 returnDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDate() {
        return returnDate;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 returnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDate(XMLGregorianCalendar value) {
        this.returnDate = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 userId.
     * 
     */
    public int getUserId() {
        return userId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 userId.
     * 
     */
    public void setUserId(int value) {
        this.userId = value;
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
