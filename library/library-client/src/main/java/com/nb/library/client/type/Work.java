
package com.nb.library.client.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour work complex type.
 * 
 * <p>Le fragment de sch\u00e9ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="work">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="author" type="{type.client.library.nb.com}author" minOccurs="0"/>
 *         &lt;element name="createdAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="imageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeWork" type="{type.client.library.nb.com}typeWork" minOccurs="0"/>
 *         &lt;element name="typeWorkId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "work", propOrder = {
    "author",
    "createdAt",
    "id",
    "imageURL",
    "summary",
    "title",
    "typeWork",
    "typeWorkId",
    "updatedAt"
})
public class Work {

    protected Author author;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    protected int id;
    protected String imageURL;
    protected String summary;
    protected String title;
    protected TypeWork typeWork;
    protected int typeWorkId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 author.
     * 
     * @return
     *     possible object is
     *     {@link Author }
     *     
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 author.
     * 
     * @param value
     *     allowed object is
     *     {@link Author }
     *     
     */
    public void setAuthor(Author value) {
        this.author = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 createdAt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 createdAt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
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
     * Obtient la valeur de la propri\u00e9t\u00e9 imageURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 imageURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageURL(String value) {
        this.imageURL = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 summary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 summary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 typeWork.
     * 
     * @return
     *     possible object is
     *     {@link TypeWork }
     *     
     */
    public TypeWork getTypeWork() {
        return typeWork;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 typeWork.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeWork }
     *     
     */
    public void setTypeWork(TypeWork value) {
        this.typeWork = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 typeWorkId.
     * 
     */
    public int getTypeWorkId() {
        return typeWorkId;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 typeWorkId.
     * 
     */
    public void setTypeWorkId(int value) {
        this.typeWorkId = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 updatedAt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 updatedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedAt(XMLGregorianCalendar value) {
        this.updatedAt = value;
    }

}
