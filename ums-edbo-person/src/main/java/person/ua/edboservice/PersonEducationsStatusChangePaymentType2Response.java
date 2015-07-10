
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
 *         &lt;element name="PersonEducationsStatusChangePaymentType2Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChangePaymentType2Result"
})
@XmlRootElement(name = "PersonEducationsStatusChangePaymentType2Response")
public class PersonEducationsStatusChangePaymentType2Response {

    @XmlElement(name = "PersonEducationsStatusChangePaymentType2Result")
    protected String personEducationsStatusChangePaymentType2Result;

    /**
     * Gets the value of the personEducationsStatusChangePaymentType2Result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangePaymentType2Result() {
        return personEducationsStatusChangePaymentType2Result;
    }

    /**
     * Sets the value of the personEducationsStatusChangePaymentType2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangePaymentType2Result(String value) {
        this.personEducationsStatusChangePaymentType2Result = value;
    }

}
