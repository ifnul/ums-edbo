
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dOrdersOfEnrollmentsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrdersOfEnrollmentsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfEnrollmentData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityGroupFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BudjetYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationPaymentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationPaymentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OrdersOfEnrollmentsAdditionalOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SkipCheckEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrdersOfEnrollmentsData", propOrder = {
    "idPersonRequest",
    "idPerson",
    "personCodeU",
    "codeOfBusiness",
    "dateCreate",
    "fio",
    "idAcademicYear",
    "idPersonEducation",
    "idOrderOfEnrollmentData",
    "courseName",
    "personEducationHistoryTypeName",
    "idUniversityGroup",
    "universityGroupFullName",
    "universityGroupShortName",
    "idCourse",
    "budjetYear",
    "idPersonEducationPaymentType",
    "personEducationPaymentTypeName",
    "idOrdersOfEnrollmentsAdditionalOrders",
    "ordersOfEnrollmentsAdditionalOrdersNumber",
    "ordersOfEnrollmentsAdditionalOrdersDate",
    "skipCheckEducationForm"
})
public class DOrdersOfEnrollmentsData {

    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "CodeOfBusiness")
    protected String codeOfBusiness;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "Id_PersonEducation")
    protected int idPersonEducation;
    @XmlElement(name = "Id_OrderOfEnrollmentData")
    protected int idOrderOfEnrollmentData;
    @XmlElement(name = "CourseName")
    protected String courseName;
    @XmlElement(name = "PersonEducationHistoryTypeName")
    protected String personEducationHistoryTypeName;
    @XmlElement(name = "Id_UniversityGroup")
    protected int idUniversityGroup;
    @XmlElement(name = "UniversityGroupFullName")
    protected String universityGroupFullName;
    @XmlElement(name = "UniversityGroupShortName")
    protected String universityGroupShortName;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "BudjetYear")
    protected int budjetYear;
    @XmlElement(name = "Id_PersonEducationPaymentType")
    protected int idPersonEducationPaymentType;
    @XmlElement(name = "PersonEducationPaymentTypeName")
    protected String personEducationPaymentTypeName;
    @XmlElement(name = "Id_OrdersOfEnrollmentsAdditionalOrders")
    protected int idOrdersOfEnrollmentsAdditionalOrders;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersNumber")
    protected String ordersOfEnrollmentsAdditionalOrdersNumber;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordersOfEnrollmentsAdditionalOrdersDate;
    @XmlElement(name = "SkipCheckEducationForm")
    protected int skipCheckEducationForm;

    /**
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
    }

    /**
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
    }

    /**
     * Gets the value of the codeOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeOfBusiness() {
        return codeOfBusiness;
    }

    /**
     * Sets the value of the codeOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeOfBusiness(String value) {
        this.codeOfBusiness = value;
    }

    /**
     * Gets the value of the dateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreate() {
        return dateCreate;
    }

    /**
     * Sets the value of the dateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreate(XMLGregorianCalendar value) {
        this.dateCreate = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the idAcademicYear property.
     * 
     */
    public int getIdAcademicYear() {
        return idAcademicYear;
    }

    /**
     * Sets the value of the idAcademicYear property.
     * 
     */
    public void setIdAcademicYear(int value) {
        this.idAcademicYear = value;
    }

    /**
     * Gets the value of the idPersonEducation property.
     * 
     */
    public int getIdPersonEducation() {
        return idPersonEducation;
    }

    /**
     * Sets the value of the idPersonEducation property.
     * 
     */
    public void setIdPersonEducation(int value) {
        this.idPersonEducation = value;
    }

    /**
     * Gets the value of the idOrderOfEnrollmentData property.
     * 
     */
    public int getIdOrderOfEnrollmentData() {
        return idOrderOfEnrollmentData;
    }

    /**
     * Sets the value of the idOrderOfEnrollmentData property.
     * 
     */
    public void setIdOrderOfEnrollmentData(int value) {
        this.idOrderOfEnrollmentData = value;
    }

    /**
     * Gets the value of the courseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the value of the courseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseName(String value) {
        this.courseName = value;
    }

    /**
     * Gets the value of the personEducationHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryTypeName() {
        return personEducationHistoryTypeName;
    }

    /**
     * Sets the value of the personEducationHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryTypeName(String value) {
        this.personEducationHistoryTypeName = value;
    }

    /**
     * Gets the value of the idUniversityGroup property.
     * 
     */
    public int getIdUniversityGroup() {
        return idUniversityGroup;
    }

    /**
     * Sets the value of the idUniversityGroup property.
     * 
     */
    public void setIdUniversityGroup(int value) {
        this.idUniversityGroup = value;
    }

    /**
     * Gets the value of the universityGroupFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupFullName() {
        return universityGroupFullName;
    }

    /**
     * Sets the value of the universityGroupFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupFullName(String value) {
        this.universityGroupFullName = value;
    }

    /**
     * Gets the value of the universityGroupShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupShortName() {
        return universityGroupShortName;
    }

    /**
     * Sets the value of the universityGroupShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupShortName(String value) {
        this.universityGroupShortName = value;
    }

    /**
     * Gets the value of the idCourse property.
     * 
     */
    public int getIdCourse() {
        return idCourse;
    }

    /**
     * Sets the value of the idCourse property.
     * 
     */
    public void setIdCourse(int value) {
        this.idCourse = value;
    }

    /**
     * Gets the value of the budjetYear property.
     * 
     */
    public int getBudjetYear() {
        return budjetYear;
    }

    /**
     * Sets the value of the budjetYear property.
     * 
     */
    public void setBudjetYear(int value) {
        this.budjetYear = value;
    }

    /**
     * Gets the value of the idPersonEducationPaymentType property.
     * 
     */
    public int getIdPersonEducationPaymentType() {
        return idPersonEducationPaymentType;
    }

    /**
     * Sets the value of the idPersonEducationPaymentType property.
     * 
     */
    public void setIdPersonEducationPaymentType(int value) {
        this.idPersonEducationPaymentType = value;
    }

    /**
     * Gets the value of the personEducationPaymentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationPaymentTypeName() {
        return personEducationPaymentTypeName;
    }

    /**
     * Sets the value of the personEducationPaymentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationPaymentTypeName(String value) {
        this.personEducationPaymentTypeName = value;
    }

    /**
     * Gets the value of the idOrdersOfEnrollmentsAdditionalOrders property.
     * 
     */
    public int getIdOrdersOfEnrollmentsAdditionalOrders() {
        return idOrdersOfEnrollmentsAdditionalOrders;
    }

    /**
     * Sets the value of the idOrdersOfEnrollmentsAdditionalOrders property.
     * 
     */
    public void setIdOrdersOfEnrollmentsAdditionalOrders(int value) {
        this.idOrdersOfEnrollmentsAdditionalOrders = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersOfEnrollmentsAdditionalOrdersNumber() {
        return ordersOfEnrollmentsAdditionalOrdersNumber;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersNumber(String value) {
        this.ordersOfEnrollmentsAdditionalOrdersNumber = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdersOfEnrollmentsAdditionalOrdersDate() {
        return ordersOfEnrollmentsAdditionalOrdersDate;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersDate(XMLGregorianCalendar value) {
        this.ordersOfEnrollmentsAdditionalOrdersDate = value;
    }

    /**
     * Gets the value of the skipCheckEducationForm property.
     * 
     */
    public int getSkipCheckEducationForm() {
        return skipCheckEducationForm;
    }

    /**
     * Sets the value of the skipCheckEducationForm property.
     * 
     */
    public void setSkipCheckEducationForm(int value) {
        this.skipCheckEducationForm = value;
    }

}
