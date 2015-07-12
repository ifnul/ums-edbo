
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityOrderRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityOrderRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityOrderRequests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityOrderRequestsStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityOrderRequestsStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateRegistration" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TimeBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TimeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityOrderRequestsDescryption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcreditationNZCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcreditationCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttestationNZCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AttestationCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateАdmission" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TimeBeginАdmission" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TimeEndАdmission" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserEdit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsVSP" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AdressFak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityOrderRequestsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityOrderRequestsDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityChildKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityOrderRequestsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityOrderRequestsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullNameVSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityOrderRequestsCategories" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityOrderRequestsCategories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityOrderRequests", propOrder = {
    "idUniversityOrderRequests",
    "idUniversityOrderRequestsStatusType",
    "universityOrderRequestsStatusTypeName",
    "dataCreate",
    "dateRegistration",
    "timeBegin",
    "timeEnd",
    "lastName",
    "firstName",
    "middleName",
    "phone",
    "email",
    "universityOrderRequestsDescryption",
    "licenseCount",
    "acreditationNZCount",
    "acreditationCount",
    "attestationNZCount",
    "attestationCount",
    "date\u0410dmission",
    "timeBegin\u0410dmission",
    "timeEnd\u0410dmission",
    "idUserAdd",
    "idUserEdit",
    "dateLastChange",
    "universityKode",
    "allCount",
    "idUniversity",
    "universityFullName",
    "isVSP",
    "adressFak",
    "universityOrderRequestsNumber",
    "universityOrderRequestsDate",
    "universityChildKode",
    "idUniversityOrderRequestsType",
    "universityOrderRequestsType",
    "universityFullNameVSP",
    "idUniversityOrderRequestsCategories",
    "universityOrderRequestsCategories"
})
public class DUniversityOrderRequests {

    @XmlElement(name = "Id_UniversityOrderRequests")
    protected int idUniversityOrderRequests;
    @XmlElement(name = "Id_UniversityOrderRequestsStatusType")
    protected int idUniversityOrderRequestsStatusType;
    @XmlElement(name = "UniversityOrderRequestsStatusTypeName")
    protected String universityOrderRequestsStatusTypeName;
    @XmlElement(name = "DataCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCreate;
    @XmlElement(name = "DateRegistration", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRegistration;
    @XmlElement(name = "TimeBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeBegin;
    @XmlElement(name = "TimeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeEnd;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "UniversityOrderRequestsDescryption")
    protected String universityOrderRequestsDescryption;
    @XmlElement(name = "LicenseCount")
    protected int licenseCount;
    @XmlElement(name = "AcreditationNZCount")
    protected int acreditationNZCount;
    @XmlElement(name = "AcreditationCount")
    protected int acreditationCount;
    @XmlElement(name = "AttestationNZCount")
    protected int attestationNZCount;
    @XmlElement(name = "AttestationCount")
    protected int attestationCount;
    @XmlElement(name = "Date\u0410dmission", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateАdmission;
    @XmlElement(name = "TimeBegin\u0410dmission", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeBeginАdmission;
    @XmlElement(name = "TimeEnd\u0410dmission", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeEndАdmission;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "Id_UserEdit")
    protected int idUserEdit;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "AllCount")
    protected int allCount;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "IsVSP")
    protected int isVSP;
    @XmlElement(name = "AdressFak")
    protected String adressFak;
    @XmlElement(name = "UniversityOrderRequestsNumber")
    protected String universityOrderRequestsNumber;
    @XmlElement(name = "UniversityOrderRequestsDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityOrderRequestsDate;
    @XmlElement(name = "UniversityChildKode")
    protected String universityChildKode;
    @XmlElement(name = "Id_UniversityOrderRequestsType")
    protected int idUniversityOrderRequestsType;
    @XmlElement(name = "UniversityOrderRequestsType")
    protected String universityOrderRequestsType;
    @XmlElement(name = "UniversityFullNameVSP")
    protected String universityFullNameVSP;
    @XmlElement(name = "Id_UniversityOrderRequestsCategories")
    protected int idUniversityOrderRequestsCategories;
    @XmlElement(name = "UniversityOrderRequestsCategories")
    protected String universityOrderRequestsCategories;

    /**
     * Gets the value of the idUniversityOrderRequests property.
     * 
     */
    public int getIdUniversityOrderRequests() {
        return idUniversityOrderRequests;
    }

    /**
     * Sets the value of the idUniversityOrderRequests property.
     * 
     */
    public void setIdUniversityOrderRequests(int value) {
        this.idUniversityOrderRequests = value;
    }

    /**
     * Gets the value of the idUniversityOrderRequestsStatusType property.
     * 
     */
    public int getIdUniversityOrderRequestsStatusType() {
        return idUniversityOrderRequestsStatusType;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsStatusType property.
     * 
     */
    public void setIdUniversityOrderRequestsStatusType(int value) {
        this.idUniversityOrderRequestsStatusType = value;
    }

    /**
     * Gets the value of the universityOrderRequestsStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsStatusTypeName() {
        return universityOrderRequestsStatusTypeName;
    }

    /**
     * Sets the value of the universityOrderRequestsStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsStatusTypeName(String value) {
        this.universityOrderRequestsStatusTypeName = value;
    }

    /**
     * Gets the value of the dataCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCreate() {
        return dataCreate;
    }

    /**
     * Sets the value of the dataCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCreate(XMLGregorianCalendar value) {
        this.dataCreate = value;
    }

    /**
     * Gets the value of the dateRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRegistration() {
        return dateRegistration;
    }

    /**
     * Sets the value of the dateRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRegistration(XMLGregorianCalendar value) {
        this.dateRegistration = value;
    }

    /**
     * Gets the value of the timeBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeBegin() {
        return timeBegin;
    }

    /**
     * Sets the value of the timeBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeBegin(XMLGregorianCalendar value) {
        this.timeBegin = value;
    }

    /**
     * Gets the value of the timeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeEnd() {
        return timeEnd;
    }

    /**
     * Sets the value of the timeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeEnd(XMLGregorianCalendar value) {
        this.timeEnd = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the universityOrderRequestsDescryption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsDescryption() {
        return universityOrderRequestsDescryption;
    }

    /**
     * Sets the value of the universityOrderRequestsDescryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsDescryption(String value) {
        this.universityOrderRequestsDescryption = value;
    }

    /**
     * Gets the value of the licenseCount property.
     * 
     */
    public int getLicenseCount() {
        return licenseCount;
    }

    /**
     * Sets the value of the licenseCount property.
     * 
     */
    public void setLicenseCount(int value) {
        this.licenseCount = value;
    }

    /**
     * Gets the value of the acreditationNZCount property.
     * 
     */
    public int getAcreditationNZCount() {
        return acreditationNZCount;
    }

    /**
     * Sets the value of the acreditationNZCount property.
     * 
     */
    public void setAcreditationNZCount(int value) {
        this.acreditationNZCount = value;
    }

    /**
     * Gets the value of the acreditationCount property.
     * 
     */
    public int getAcreditationCount() {
        return acreditationCount;
    }

    /**
     * Sets the value of the acreditationCount property.
     * 
     */
    public void setAcreditationCount(int value) {
        this.acreditationCount = value;
    }

    /**
     * Gets the value of the attestationNZCount property.
     * 
     */
    public int getAttestationNZCount() {
        return attestationNZCount;
    }

    /**
     * Sets the value of the attestationNZCount property.
     * 
     */
    public void setAttestationNZCount(int value) {
        this.attestationNZCount = value;
    }

    /**
     * Gets the value of the attestationCount property.
     * 
     */
    public int getAttestationCount() {
        return attestationCount;
    }

    /**
     * Sets the value of the attestationCount property.
     * 
     */
    public void setAttestationCount(int value) {
        this.attestationCount = value;
    }

    /**
     * Gets the value of the dateАdmission property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateАdmission() {
        return dateАdmission;
    }

    /**
     * Sets the value of the dateАdmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateАdmission(XMLGregorianCalendar value) {
        this.dateАdmission = value;
    }

    /**
     * Gets the value of the timeBeginАdmission property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeBeginАdmission() {
        return timeBeginАdmission;
    }

    /**
     * Sets the value of the timeBeginАdmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeBeginАdmission(XMLGregorianCalendar value) {
        this.timeBeginАdmission = value;
    }

    /**
     * Gets the value of the timeEndАdmission property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeEndАdmission() {
        return timeEndАdmission;
    }

    /**
     * Sets the value of the timeEndАdmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeEndАdmission(XMLGregorianCalendar value) {
        this.timeEndАdmission = value;
    }

    /**
     * Gets the value of the idUserAdd property.
     * 
     */
    public int getIdUserAdd() {
        return idUserAdd;
    }

    /**
     * Sets the value of the idUserAdd property.
     * 
     */
    public void setIdUserAdd(int value) {
        this.idUserAdd = value;
    }

    /**
     * Gets the value of the idUserEdit property.
     * 
     */
    public int getIdUserEdit() {
        return idUserEdit;
    }

    /**
     * Sets the value of the idUserEdit property.
     * 
     */
    public void setIdUserEdit(int value) {
        this.idUserEdit = value;
    }

    /**
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
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
     * Gets the value of the allCount property.
     * 
     */
    public int getAllCount() {
        return allCount;
    }

    /**
     * Sets the value of the allCount property.
     * 
     */
    public void setAllCount(int value) {
        this.allCount = value;
    }

    /**
     * Gets the value of the idUniversity property.
     * 
     */
    public int getIdUniversity() {
        return idUniversity;
    }

    /**
     * Sets the value of the idUniversity property.
     * 
     */
    public void setIdUniversity(int value) {
        this.idUniversity = value;
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
     * Gets the value of the isVSP property.
     * 
     */
    public int getIsVSP() {
        return isVSP;
    }

    /**
     * Sets the value of the isVSP property.
     * 
     */
    public void setIsVSP(int value) {
        this.isVSP = value;
    }

    /**
     * Gets the value of the adressFak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdressFak() {
        return adressFak;
    }

    /**
     * Sets the value of the adressFak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdressFak(String value) {
        this.adressFak = value;
    }

    /**
     * Gets the value of the universityOrderRequestsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsNumber() {
        return universityOrderRequestsNumber;
    }

    /**
     * Sets the value of the universityOrderRequestsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsNumber(String value) {
        this.universityOrderRequestsNumber = value;
    }

    /**
     * Gets the value of the universityOrderRequestsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityOrderRequestsDate() {
        return universityOrderRequestsDate;
    }

    /**
     * Sets the value of the universityOrderRequestsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityOrderRequestsDate(XMLGregorianCalendar value) {
        this.universityOrderRequestsDate = value;
    }

    /**
     * Gets the value of the universityChildKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityChildKode() {
        return universityChildKode;
    }

    /**
     * Sets the value of the universityChildKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityChildKode(String value) {
        this.universityChildKode = value;
    }

    /**
     * Gets the value of the idUniversityOrderRequestsType property.
     * 
     */
    public int getIdUniversityOrderRequestsType() {
        return idUniversityOrderRequestsType;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsType property.
     * 
     */
    public void setIdUniversityOrderRequestsType(int value) {
        this.idUniversityOrderRequestsType = value;
    }

    /**
     * Gets the value of the universityOrderRequestsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsType() {
        return universityOrderRequestsType;
    }

    /**
     * Sets the value of the universityOrderRequestsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsType(String value) {
        this.universityOrderRequestsType = value;
    }

    /**
     * Gets the value of the universityFullNameVSP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullNameVSP() {
        return universityFullNameVSP;
    }

    /**
     * Sets the value of the universityFullNameVSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullNameVSP(String value) {
        this.universityFullNameVSP = value;
    }

    /**
     * Gets the value of the idUniversityOrderRequestsCategories property.
     * 
     */
    public int getIdUniversityOrderRequestsCategories() {
        return idUniversityOrderRequestsCategories;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsCategories property.
     * 
     */
    public void setIdUniversityOrderRequestsCategories(int value) {
        this.idUniversityOrderRequestsCategories = value;
    }

    /**
     * Gets the value of the universityOrderRequestsCategories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsCategories() {
        return universityOrderRequestsCategories;
    }

    /**
     * Sets the value of the universityOrderRequestsCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsCategories(String value) {
        this.universityOrderRequestsCategories = value;
    }

}
