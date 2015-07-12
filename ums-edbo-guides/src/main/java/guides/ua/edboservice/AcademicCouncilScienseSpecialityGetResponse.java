
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
 *         &lt;element name="AcademicCouncilScienseSpecialityGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicCouncilScienseSpeciality" minOccurs="0"/>
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
    "academicCouncilScienseSpecialityGetResult"
})
@XmlRootElement(name = "AcademicCouncilScienseSpecialityGetResponse")
public class AcademicCouncilScienseSpecialityGetResponse {

    @XmlElement(name = "AcademicCouncilScienseSpecialityGetResult")
    protected ArrayOfDAcademicCouncilScienseSpeciality academicCouncilScienseSpecialityGetResult;

    /**
     * Gets the value of the academicCouncilScienseSpecialityGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicCouncilScienseSpeciality }
     *     
     */
    public ArrayOfDAcademicCouncilScienseSpeciality getAcademicCouncilScienseSpecialityGetResult() {
        return academicCouncilScienseSpecialityGetResult;
    }

    /**
     * Sets the value of the academicCouncilScienseSpecialityGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicCouncilScienseSpeciality }
     *     
     */
    public void setAcademicCouncilScienseSpecialityGetResult(ArrayOfDAcademicCouncilScienseSpeciality value) {
        this.academicCouncilScienseSpecialityGetResult = value;
    }

}
