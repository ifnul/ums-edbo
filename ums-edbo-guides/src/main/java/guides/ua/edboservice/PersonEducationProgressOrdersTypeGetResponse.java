
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
 *         &lt;element name="PersonEducationProgressOrdersTypeGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationProgressOrdersType" minOccurs="0"/>
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
    "personEducationProgressOrdersTypeGetResult"
})
@XmlRootElement(name = "PersonEducationProgressOrdersTypeGetResponse")
public class PersonEducationProgressOrdersTypeGetResponse {

    @XmlElement(name = "PersonEducationProgressOrdersTypeGetResult")
    protected ArrayOfDPersonEducationProgressOrdersType personEducationProgressOrdersTypeGetResult;

    /**
     * Gets the value of the personEducationProgressOrdersTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationProgressOrdersType }
     *     
     */
    public ArrayOfDPersonEducationProgressOrdersType getPersonEducationProgressOrdersTypeGetResult() {
        return personEducationProgressOrdersTypeGetResult;
    }

    /**
     * Sets the value of the personEducationProgressOrdersTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationProgressOrdersType }
     *     
     */
    public void setPersonEducationProgressOrdersTypeGetResult(ArrayOfDPersonEducationProgressOrdersType value) {
        this.personEducationProgressOrdersTypeGetResult = value;
    }

}
