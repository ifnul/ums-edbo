
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
 *         &lt;element name="StateOrdersCategoriesGetResult" type="{http://edboservice.ua/}ArrayOfDStateOrdersCategories" minOccurs="0"/>
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
    "stateOrdersCategoriesGetResult"
})
@XmlRootElement(name = "StateOrdersCategoriesGetResponse")
public class StateOrdersCategoriesGetResponse {

    @XmlElement(name = "StateOrdersCategoriesGetResult")
    protected ArrayOfDStateOrdersCategories stateOrdersCategoriesGetResult;

    /**
     * Gets the value of the stateOrdersCategoriesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDStateOrdersCategories }
     *     
     */
    public ArrayOfDStateOrdersCategories getStateOrdersCategoriesGetResult() {
        return stateOrdersCategoriesGetResult;
    }

    /**
     * Sets the value of the stateOrdersCategoriesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDStateOrdersCategories }
     *     
     */
    public void setStateOrdersCategoriesGetResult(ArrayOfDStateOrdersCategories value) {
        this.stateOrdersCategoriesGetResult = value;
    }

}
