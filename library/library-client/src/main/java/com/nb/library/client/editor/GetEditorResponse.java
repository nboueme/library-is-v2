
package com.nb.library.client.editor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getEditorResponse complex type.
 * 
 * <p>Le fragment de sch\u00e9ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getEditorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{editor.client.library.nb.com}editor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEditorResponse", propOrder = {
    "_return"
})
public class GetEditorResponse {

    @XmlElement(name = "return")
    protected Editor _return;

    /**
     * Obtient la valeur de la propri\u00e9t\u00e9 return.
     * 
     * @return
     *     possible object is
     *     {@link Editor }
     *     
     */
    public Editor getReturn() {
        return _return;
    }

    /**
     * D\u00e9finit la valeur de la propri\u00e9t\u00e9 return.
     * 
     * @param value
     *     allowed object is
     *     {@link Editor }
     *     
     */
    public void setReturn(Editor value) {
        this._return = value;
    }

}
