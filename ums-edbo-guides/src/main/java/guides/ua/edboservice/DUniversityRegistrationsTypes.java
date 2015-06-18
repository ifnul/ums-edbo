
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityRegistrationsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityRegistrationsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityRegistrationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityRegistrationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityRegistrationsTypes", propOrder = {
    "idUniversityRegistrationType",
    "universityRegistrationTypeName"
})
public class DUniversityRegistrationsTypes {

    @XmlElement(name = "Id_UniversityRegistrationType")
    protected int idUniversityRegistrationType;
    @XmlElement(name = "UniversityRegistrationTypeName")
    protected String universityRegistrationTypeName;

    /**
     * Gets the value of the idUniversityRegistrationType property.
     * 
     */
    public int getIdUniversityRegistrationType() {
        return idUniversityRegistrationType;
    }

    /**
     * Sets the value of the idUniversityRegistrationType property.
     * 
     */
    public void setIdUniversityRegistrationType(int value) {
        this.idUniversityRegistrationType = value;
    }

    /**
     * Gets the value of the universityRegistrationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityRegistrationTypeName() {
        return universityRegistrationTypeName;
    }

    /**
     * Sets the value of the universityRegistrationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityRegistrationTypeName(String value) {
        this.universityRegistrationTypeName = value;
    }

}
