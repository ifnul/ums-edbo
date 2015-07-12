
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderOfDocumentsDatasAddResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderOfDocumentsDatasAddResult"
})
@XmlRootElement(name = "OrderOfDocumentsDatasAddResponse")
public class OrderOfDocumentsDatasAddResponse {

    @XmlElement(name = "OrderOfDocumentsDatasAddResult")
    protected String orderOfDocumentsDatasAddResult;

    /**
     * Gets the value of the orderOfDocumentsDatasAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentsDatasAddResult() {
        return orderOfDocumentsDatasAddResult;
    }

    /**
     * Sets the value of the orderOfDocumentsDatasAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentsDatasAddResult(String value) {
        this.orderOfDocumentsDatasAddResult = value;
    }

}
