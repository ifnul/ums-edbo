
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
 *         &lt;element name="UniversityLicensesPtnzSvidDetailedSubTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesPtnzSvidDetailedSubTypes" minOccurs="0"/>
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
    "universityLicensesPtnzSvidDetailedSubTypesGetResult"
})
@XmlRootElement(name = "UniversityLicensesPtnzSvidDetailedSubTypesGetResponse")
public class UniversityLicensesPtnzSvidDetailedSubTypesGetResponse {

    @XmlElement(name = "UniversityLicensesPtnzSvidDetailedSubTypesGetResult")
    protected ArrayOfDUniversityLicensesPtnzSvidDetailedSubTypes universityLicensesPtnzSvidDetailedSubTypesGetResult;

    /**
     * Gets the value of the universityLicensesPtnzSvidDetailedSubTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesPtnzSvidDetailedSubTypes }
     *     
     */
    public ArrayOfDUniversityLicensesPtnzSvidDetailedSubTypes getUniversityLicensesPtnzSvidDetailedSubTypesGetResult() {
        return universityLicensesPtnzSvidDetailedSubTypesGetResult;
    }

    /**
     * Sets the value of the universityLicensesPtnzSvidDetailedSubTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesPtnzSvidDetailedSubTypes }
     *     
     */
    public void setUniversityLicensesPtnzSvidDetailedSubTypesGetResult(ArrayOfDUniversityLicensesPtnzSvidDetailedSubTypes value) {
        this.universityLicensesPtnzSvidDetailedSubTypesGetResult = value;
    }

}
