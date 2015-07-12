
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
 *         &lt;element name="EducationTypesGetResult" type="{http://edboservice.ua/}ArrayOfDEducationTypes" minOccurs="0"/>
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
    "educationTypesGetResult"
})
@XmlRootElement(name = "EducationTypesGetResponse")
public class EducationTypesGetResponse {

    @XmlElement(name = "EducationTypesGetResult")
    protected ArrayOfDEducationTypes educationTypesGetResult;

    /**
     * Gets the value of the educationTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDEducationTypes }
     *     
     */
    public ArrayOfDEducationTypes getEducationTypesGetResult() {
        return educationTypesGetResult;
    }

    /**
     * Sets the value of the educationTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDEducationTypes }
     *     
     */
    public void setEducationTypesGetResult(ArrayOfDEducationTypes value) {
        this.educationTypesGetResult = value;
    }

}
