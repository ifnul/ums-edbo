
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
 *         &lt;element name="UniversityLicensesPtnzSvidDataDetailedSubTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesPtnzSvidDataDetailedSubTypes" minOccurs="0"/>
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
    "universityLicensesPtnzSvidDataDetailedSubTypesGetResult"
})
@XmlRootElement(name = "UniversityLicensesPtnzSvidDataDetailedSubTypesGetResponse")
public class UniversityLicensesPtnzSvidDataDetailedSubTypesGetResponse {

    @XmlElement(name = "UniversityLicensesPtnzSvidDataDetailedSubTypesGetResult")
    protected ArrayOfDUniversityLicensesPtnzSvidDataDetailedSubTypes universityLicensesPtnzSvidDataDetailedSubTypesGetResult;

    /**
     * Gets the value of the universityLicensesPtnzSvidDataDetailedSubTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesPtnzSvidDataDetailedSubTypes }
     *     
     */
    public ArrayOfDUniversityLicensesPtnzSvidDataDetailedSubTypes getUniversityLicensesPtnzSvidDataDetailedSubTypesGetResult() {
        return universityLicensesPtnzSvidDataDetailedSubTypesGetResult;
    }

    /**
     * Sets the value of the universityLicensesPtnzSvidDataDetailedSubTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesPtnzSvidDataDetailedSubTypes }
     *     
     */
    public void setUniversityLicensesPtnzSvidDataDetailedSubTypesGetResult(ArrayOfDUniversityLicensesPtnzSvidDataDetailedSubTypes value) {
        this.universityLicensesPtnzSvidDataDetailedSubTypesGetResult = value;
    }

}
