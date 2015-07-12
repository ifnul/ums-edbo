
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
 *         &lt;element name="OrdersOfEnrollmentsGet2Result" type="{http://edboservice.ua/}ArrayOfDOrdersOfEnrollments2" minOccurs="0"/>
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
    "ordersOfEnrollmentsGet2Result"
})
@XmlRootElement(name = "OrdersOfEnrollmentsGet2Response")
public class OrdersOfEnrollmentsGet2Response {

    @XmlElement(name = "OrdersOfEnrollmentsGet2Result")
    protected ArrayOfDOrdersOfEnrollments2 ordersOfEnrollmentsGet2Result;

    /**
     * Gets the value of the ordersOfEnrollmentsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrdersOfEnrollments2 }
     *     
     */
    public ArrayOfDOrdersOfEnrollments2 getOrdersOfEnrollmentsGet2Result() {
        return ordersOfEnrollmentsGet2Result;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrdersOfEnrollments2 }
     *     
     */
    public void setOrdersOfEnrollmentsGet2Result(ArrayOfDOrdersOfEnrollments2 value) {
        this.ordersOfEnrollmentsGet2Result = value;
    }

}
