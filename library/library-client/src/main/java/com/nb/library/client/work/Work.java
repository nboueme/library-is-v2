
package com.nb.library.client.work;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="authors" type="{work.client.library.nb.com}author" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="createdAt" type="{work.client.library.nb.com}localDateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="imageURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeWork" type="{work.client.library.nb.com}typeWork" minOccurs="0"/>
 *         &lt;element name="updatedAt" type="{work.client.library.nb.com}localDateTime" minOccurs="0"/>
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
    "authors",
    "createdAt",
    "id",
    "imageURL",
    "summary",
    "title",
    "typeWork",
    "updatedAt"
})
public class Work {

    @XmlElement(nillable = true)
    protected List<Author> authors;
    protected LocalDateTime createdAt;
    protected Integer id;
    protected String imageURL;
    protected String summary;
    protected String title;
    protected TypeWork typeWork;
    protected LocalDateTime updatedAt;

    /**
     * Gets the value of the authors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Author }
     * 
     * 
     */
    public List<Author> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<Author>();
        }
        return this.authors;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 createdAt.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 createdAt.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setCreatedAt(LocalDateTime value) {
        this.createdAt = value;
    }

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
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
     * Obtient la valeur de la propri\u00e9t\u00e9 updatedAt.
     * 
     * @return
     *     possible object is
     *     {@link LocalDateTime }
     *     
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 updatedAt.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalDateTime }
     *     
     */
    public void setUpdatedAt(LocalDateTime value) {
        this.updatedAt = value;
    }

}
