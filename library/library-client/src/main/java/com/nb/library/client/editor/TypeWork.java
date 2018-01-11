
package com.nb.library.client.editor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeWork complex type.
 * 
 * <p>Le fragment de sch\u00e9ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeWork">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="typeWork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="work" type="{editor.client.library.nb.com}work" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeWork", propOrder = {
    "id",
    "typeWork",
    "work"
})
public class TypeWork {

    protected int id;
    protected String typeWork;
    protected Work work;

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
     * Obtient la valeur de la propri\u00e9t\u00e9 typeWork.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeWork() {
        return typeWork;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 typeWork.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeWork(String value) {
        this.typeWork = value;
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
