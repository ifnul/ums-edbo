
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
 *         &lt;element name="AlertsClientTextGetResult" type="{http://edboservice.ua/}ArrayOfDAlertsClientText" minOccurs="0"/>
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
    "alertsClientTextGetResult"
})
@XmlRootElement(name = "AlertsClientTextGetResponse")
public class AlertsClientTextGetResponse {

    @XmlElement(name = "AlertsClientTextGetResult")
    protected ArrayOfDAlertsClientText alertsClientTextGetResult;

    /**
     * Gets the value of the alertsClientTextGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAlertsClientText }
     *     
     */
    public ArrayOfDAlertsClientText getAlertsClientTextGetResult() {
        return alertsClientTextGetResult;
    }

    /**
     * Sets the value of the alertsClientTextGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAlertsClientText }
     *     
     */
    public void setAlertsClientTextGetResult(ArrayOfDAlertsClientText value) {
        this.alertsClientTextGetResult = value;
    }

}
