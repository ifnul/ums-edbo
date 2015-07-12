
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
 *         &lt;element name="UniversityOperatorStateOrdersGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityOperatorStateOrders" minOccurs="0"/>
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
    "universityOperatorStateOrdersGetResult"
})
@XmlRootElement(name = "UniversityOperatorStateOrdersGetResponse")
public class UniversityOperatorStateOrdersGetResponse {

    @XmlElement(name = "UniversityOperatorStateOrdersGetResult")
    protected ArrayOfDUniversityOperatorStateOrders universityOperatorStateOrdersGetResult;

    /**
     * Gets the value of the universityOperatorStateOrdersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityOperatorStateOrders }
     *     
     */
    public ArrayOfDUniversityOperatorStateOrders getUniversityOperatorStateOrdersGetResult() {
        return universityOperatorStateOrdersGetResult;
    }

    /**
     * Sets the value of the universityOperatorStateOrdersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityOperatorStateOrders }
     *     
     */
    public void setUniversityOperatorStateOrdersGetResult(ArrayOfDUniversityOperatorStateOrders value) {
        this.universityOperatorStateOrdersGetResult = value;
    }

}
