
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
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityRegistration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityRegistrationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityRegistrationDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityRegistrationDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityRegistrationusersCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sessionGUID",
    "idUniversityRegistration",
    "idUniversityRegistrationType",
    "idRegulationDocument",
    "universityRegistrationDateBegin",
    "universityRegistrationDateEnd",
    "universityRegistrationusersCount"
})
@XmlRootElement(name = "UniversityRegistrationsEdit")
public class UniversityRegistrationsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityRegistration")
    protected int idUniversityRegistration;
    @XmlElement(name = "Id_UniversityRegistrationType")
    protected int idUniversityRegistrationType;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "UniversityRegistrationDateBegin")
    protected String universityRegistrationDateBegin;
    @XmlElement(name = "UniversityRegistrationDateEnd")
    protected String universityRegistrationDateEnd;
    @XmlElement(name = "UniversityRegistrationusersCount")
    protected int universityRegistrationusersCount;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the idUniversityRegistration property.
     * 
     */
    public int getIdUniversityRegistration() {
        return idUniversityRegistration;
    }

    /**
     * Sets the value of the idUniversityRegistration property.
     * 
     */
    public void setIdUniversityRegistration(int value) {
        this.idUniversityRegistration = value;
    }

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
     * Gets the value of the idRegulationDocument property.
     * 
     */
    public int getIdRegulationDocument() {
        return idRegulationDocument;
    }

    /**
     * Sets the value of the idRegulationDocument property.
     * 
     */
    public void setIdRegulationDocument(int value) {
        this.idRegulationDocument = value;
    }

    /**
     * Gets the value of the universityRegistrationDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityRegistrationDateBegin() {
        return universityRegistrationDateBegin;
    }

    /**
     * Sets the value of the universityRegistrationDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityRegistrationDateBegin(String value) {
        this.universityRegistrationDateBegin = value;
    }

    /**
     * Gets the value of the universityRegistrationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityRegistrationDateEnd() {
        return universityRegistrationDateEnd;
    }

    /**
     * Sets the value of the universityRegistrationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityRegistrationDateEnd(String value) {
        this.universityRegistrationDateEnd = value;
    }

    /**
     * Gets the value of the universityRegistrationusersCount property.
     * 
     */
    public int getUniversityRegistrationusersCount() {
        return universityRegistrationusersCount;
    }

    /**
     * Sets the value of the universityRegistrationusersCount property.
     * 
     */
    public void setUniversityRegistrationusersCount(int value) {
        this.universityRegistrationusersCount = value;
    }

}
