
package com.nb.library.model.entity.editor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour book complex type.
 * 
 * <p>Le fragment de sch\u00e9ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="book">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="editorId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="purchaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="workId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "book", propOrder = {
    "editorId",
    "isbn",
    "price",
    "purchaseDate",
    "workId",
    "year"
})
public class Book {

    protected int editorId;
    @XmlElement(name = "ISBN")
    protected String isbn;
    protected double price;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purchaseDate;
    protected int workId;
    protected int year;

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 editorId.
     * 
     */
    public int getEditorId() {
        return editorId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 editorId.
     * 
     */
    public void setEditorId(int value) {
        this.editorId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 isbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 price.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 price.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 purchaseDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 purchaseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseDate(XMLGregorianCalendar value) {
        this.purchaseDate = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 workId.
     * 
     */
    public int getWorkId() {
        return workId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 workId.
     * 
     */
    public void setWorkId(int value) {
        this.workId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 year.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 year.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
