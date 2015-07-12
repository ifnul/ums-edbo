
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityLicensesFind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicensesFind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicenseSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicenseDecision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicenseDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityLicenseDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityLicenseIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicensesActivities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicenseForNoResident" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullNameP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityLicensesFind", propOrder = {
    "idUniversityLicense",
    "universityKode",
    "universityLicenseSeries",
    "universityLicenseNumber",
    "universityLicenseDecision",
    "universityLicenseDateGet",
    "universityLicenseDateLastChange",
    "universityLicenseIsActive",
    "universityFullName",
    "universityLicensesActivities",
    "universityLicenseForNoResident",
    "idUniversityP",
    "universityFullNameP"
})
public class DUniversityLicensesFind {

    @XmlElement(name = "Id_UniversityLicense")
    protected int idUniversityLicense;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityLicenseSeries")
    protected String universityLicenseSeries;
    @XmlElement(name = "UniversityLicenseNumber")
    protected String universityLicenseNumber;
    @XmlElement(name = "UniversityLicenseDecision")
    protected String universityLicenseDecision;
    @XmlElement(name = "UniversityLicenseDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityLicenseDateGet;
    @XmlElement(name = "UniversityLicenseDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityLicenseDateLastChange;
    @XmlElement(name = "UniversityLicenseIsActive")
    protected int universityLicenseIsActive;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityLicensesActivities")
    protected String universityLicensesActivities;
    @XmlElement(name = "UniversityLicenseForNoResident")
    protected int universityLicenseForNoResident;
    @XmlElement(name = "Id_UniversityP")
    protected int idUniversityP;
    @XmlElement(name = "UniversityFullNameP")
    protected String universityFullNameP;

    /**
     * Gets the value of the idUniversityLicense property.
     * 
     */
    public int getIdUniversityLicense() {
        return idUniversityLicense;
    }

    /**
     * Sets the value of the idUniversityLicense property.
     * 
     */
    public void setIdUniversityLicense(int value) {
        this.idUniversityLicense = value;
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
     * Gets the value of the universityLicenseSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicenseSeries() {
        return universityLicenseSeries;
    }

    /**
     * Sets the value of the universityLicenseSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicenseSeries(String value) {
        this.universityLicenseSeries = value;
    }

    /**
     * Gets the value of the universityLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicenseNumber() {
        return universityLicenseNumber;
    }

    /**
     * Sets the value of the universityLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicenseNumber(String value) {
        this.universityLicenseNumber = value;
    }

    /**
     * Gets the value of the universityLicenseDecision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicenseDecision() {
        return universityLicenseDecision;
    }

    /**
     * Sets the value of the universityLicenseDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicenseDecision(String value) {
        this.universityLicenseDecision = value;
    }

    /**
     * Gets the value of the universityLicenseDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityLicenseDateGet() {
        return universityLicenseDateGet;
    }

    /**
     * Sets the value of the universityLicenseDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityLicenseDateGet(XMLGregorianCalendar value) {
        this.universityLicenseDateGet = value;
    }

    /**
     * Gets the value of the universityLicenseDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityLicenseDateLastChange() {
        return universityLicenseDateLastChange;
    }

    /**
     * Sets the value of the universityLicenseDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityLicenseDateLastChange(XMLGregorianCalendar value) {
        this.universityLicenseDateLastChange = value;
    }

    /**
     * Gets the value of the universityLicenseIsActive property.
     * 
     */
    public int getUniversityLicenseIsActive() {
        return universityLicenseIsActive;
    }

    /**
     * Sets the value of the universityLicenseIsActive property.
     * 
     */
    public void setUniversityLicenseIsActive(int value) {
        this.universityLicenseIsActive = value;
    }

    /**
     * Gets the value of the universityFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullName() {
        return universityFullName;
    }

    /**
     * Sets the value of the universityFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullName(String value) {
        this.universityFullName = value;
    }

    /**
     * Gets the value of the universityLicensesActivities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesActivities() {
        return universityLicensesActivities;
    }

    /**
     * Sets the value of the universityLicensesActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesActivities(String value) {
        this.universityLicensesActivities = value;
    }

    /**
     * Gets the value of the universityLicenseForNoResident property.
     * 
     */
    public int getUniversityLicenseForNoResident() {
        return universityLicenseForNoResident;
    }

    /**
     * Sets the value of the universityLicenseForNoResident property.
     * 
     */
    public void setUniversityLicenseForNoResident(int value) {
        this.universityLicenseForNoResident = value;
    }

    /**
     * Gets the value of the idUniversityP property.
     * 
     */
    public int getIdUniversityP() {
        return idUniversityP;
    }

    /**
     * Sets the value of the idUniversityP property.
     * 
     */
    public void setIdUniversityP(int value) {
        this.idUniversityP = value;
    }

    /**
     * Gets the value of the universityFullNameP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullNameP() {
        return universityFullNameP;
    }

    /**
     * Sets the value of the universityFullNameP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullNameP(String value) {
        this.universityFullNameP = value;
    }

}
