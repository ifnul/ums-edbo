
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
 *         &lt;element name="UniversityLicensesDataPtnzDetailedSubTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesDataPtnzDetailedSubTypes" minOccurs="0"/>
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
    "universityLicensesDataPtnzDetailedSubTypesGetResult"
})
@XmlRootElement(name = "UniversityLicensesDataPtnzDetailedSubTypesGetResponse")
public class UniversityLicensesDataPtnzDetailedSubTypesGetResponse {

    @XmlElement(name = "UniversityLicensesDataPtnzDetailedSubTypesGetResult")
    protected ArrayOfDUniversityLicensesDataPtnzDetailedSubTypes universityLicensesDataPtnzDetailedSubTypesGetResult;

    /**
     * Gets the value of the universityLicensesDataPtnzDetailedSubTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesDataPtnzDetailedSubTypes }
     *     
     */
    public ArrayOfDUniversityLicensesDataPtnzDetailedSubTypes getUniversityLicensesDataPtnzDetailedSubTypesGetResult() {
        return universityLicensesDataPtnzDetailedSubTypesGetResult;
    }

    /**
     * Sets the value of the universityLicensesDataPtnzDetailedSubTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesDataPtnzDetailedSubTypes }
     *     
     */
    public void setUniversityLicensesDataPtnzDetailedSubTypesGetResult(ArrayOfDUniversityLicensesDataPtnzDetailedSubTypes value) {
        this.universityLicensesDataPtnzDetailedSubTypesGetResult = value;
    }

}
