
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
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ActualDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacultetGetMode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityFacultetTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsAvailableForReceiptOfRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsAvailableForBindStudentPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityFacultet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsAvailableForBindStaffPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityKode",
    "universityFacultetKode",
    "idLanguage",
    "actualDate",
    "facultetGetMode",
    "idUniversityFacultetTypes",
    "isAvailableForReceiptOfRequest",
    "isAvailableForBindStudentPersons",
    "idUniversityFacultet",
    "isAvailableForBindStaffPersons"
})
@XmlRootElement(name = "UniversityFacultetsGet2")
public class UniversityFacultetsGet2 {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "ActualDate")
    protected String actualDate;
    @XmlElement(name = "FacultetGetMode")
    protected int facultetGetMode;
    @XmlElement(name = "Id_UniversityFacultetTypes")
    protected String idUniversityFacultetTypes;
    @XmlElement(name = "IsAvailableForReceiptOfRequest")
    protected int isAvailableForReceiptOfRequest;
    @XmlElement(name = "IsAvailableForBindStudentPersons")
    protected int isAvailableForBindStudentPersons;
    @XmlElement(name = "Id_UniversityFacultet")
    protected int idUniversityFacultet;
    @XmlElement(name = "IsAvailableForBindStaffPersons")
    protected int isAvailableForBindStaffPersons;

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
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the universityFacultetKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKode() {
        return universityFacultetKode;
    }

    /**
     * Sets the value of the universityFacultetKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKode(String value) {
        this.universityFacultetKode = value;
    }

    /**
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
    }

    /**
     * Gets the value of the actualDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualDate() {
        return actualDate;
    }

    /**
     * Sets the value of the actualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDate(String value) {
        this.actualDate = value;
    }

    /**
     * Gets the value of the facultetGetMode property.
     * 
     */
    public int getFacultetGetMode() {
        return facultetGetMode;
    }

    /**
     * Sets the value of the facultetGetMode property.
     * 
     */
    public void setFacultetGetMode(int value) {
        this.facultetGetMode = value;
    }

    /**
     * Gets the value of the idUniversityFacultetTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUniversityFacultetTypes() {
        return idUniversityFacultetTypes;
    }

    /**
     * Sets the value of the idUniversityFacultetTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUniversityFacultetTypes(String value) {
        this.idUniversityFacultetTypes = value;
    }

    /**
     * Gets the value of the isAvailableForReceiptOfRequest property.
     * 
     */
    public int getIsAvailableForReceiptOfRequest() {
        return isAvailableForReceiptOfRequest;
    }

    /**
     * Sets the value of the isAvailableForReceiptOfRequest property.
     * 
     */
    public void setIsAvailableForReceiptOfRequest(int value) {
        this.isAvailableForReceiptOfRequest = value;
    }

    /**
     * Gets the value of the isAvailableForBindStudentPersons property.
     * 
     */
    public int getIsAvailableForBindStudentPersons() {
        return isAvailableForBindStudentPersons;
    }

    /**
     * Sets the value of the isAvailableForBindStudentPersons property.
     * 
     */
    public void setIsAvailableForBindStudentPersons(int value) {
        this.isAvailableForBindStudentPersons = value;
    }

    /**
     * Gets the value of the idUniversityFacultet property.
     * 
     */
    public int getIdUniversityFacultet() {
        return idUniversityFacultet;
    }

    /**
     * Sets the value of the idUniversityFacultet property.
     * 
     */
    public void setIdUniversityFacultet(int value) {
        this.idUniversityFacultet = value;
    }

    /**
     * Gets the value of the isAvailableForBindStaffPersons property.
     * 
     */
    public int getIsAvailableForBindStaffPersons() {
        return isAvailableForBindStaffPersons;
    }

    /**
     * Sets the value of the isAvailableForBindStaffPersons property.
     * 
     */
    public void setIsAvailableForBindStaffPersons(int value) {
        this.isAvailableForBindStaffPersons = value;
    }

}
