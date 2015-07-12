
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dOrdersOfEnrollmentsAdditionalOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrdersOfEnrollmentsAdditionalOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_OrdersOfEnrollmentsAdditionalOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_OrderOfEnrollment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfEnrollmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OrdersOfEnrollmentsAdditionalOrdersTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrdersOfEnrollmentsAdditionalOrders", propOrder = {
    "idOrdersOfEnrollmentsAdditionalOrders",
    "ordersOfEnrollmentsAdditionalOrdersNumber",
    "ordersOfEnrollmentsAdditionalOrdersDate",
    "ordersOfEnrollmentsAdditionalOrdersDateLastChange",
    "idOrderOfEnrollment",
    "orderOfEnrollmentNumber",
    "idOrdersOfEnrollmentsAdditionalOrdersTypes",
    "universityKode",
    "ordersOfEnrollmentsAdditionalOrdersTypesName",
    "idRegulationDocument",
    "isVerified",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "isExistFile"
})
public class DOrdersOfEnrollmentsAdditionalOrders {

    @XmlElement(name = "Id_OrdersOfEnrollmentsAdditionalOrders")
    protected int idOrdersOfEnrollmentsAdditionalOrders;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersNumber")
    protected String ordersOfEnrollmentsAdditionalOrdersNumber;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordersOfEnrollmentsAdditionalOrdersDate;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordersOfEnrollmentsAdditionalOrdersDateLastChange;
    @XmlElement(name = "Id_OrderOfEnrollment")
    protected int idOrderOfEnrollment;
    @XmlElement(name = "OrderOfEnrollmentNumber")
    protected String orderOfEnrollmentNumber;
    @XmlElement(name = "Id_OrdersOfEnrollmentsAdditionalOrdersTypes")
    protected int idOrdersOfEnrollmentsAdditionalOrdersTypes;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersTypesName")
    protected String ordersOfEnrollmentsAdditionalOrdersTypesName;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "IsVerified")
    protected int isVerified;
    @XmlElement(name = "Id_RegulationDocumentVerificationHistoryType")
    protected int idRegulationDocumentVerificationHistoryType;
    @XmlElement(name = "RegulationDocumentVerificationHistoryTypeName")
    protected String regulationDocumentVerificationHistoryTypeName;
    @XmlElement(name = "IsExistFile")
    protected int isExistFile;

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
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdersOfEnrollmentsAdditionalOrdersDateLastChange() {
        return ordersOfEnrollmentsAdditionalOrdersDateLastChange;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersDateLastChange(XMLGregorianCalendar value) {
        this.ordersOfEnrollmentsAdditionalOrdersDateLastChange = value;
    }

    /**
     * Gets the value of the idOrderOfEnrollment property.
     * 
     */
    public int getIdOrderOfEnrollment() {
        return idOrderOfEnrollment;
    }

    /**
     * Sets the value of the idOrderOfEnrollment property.
     * 
     */
    public void setIdOrderOfEnrollment(int value) {
        this.idOrderOfEnrollment = value;
    }

    /**
     * Gets the value of the orderOfEnrollmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfEnrollmentNumber() {
        return orderOfEnrollmentNumber;
    }

    /**
     * Sets the value of the orderOfEnrollmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfEnrollmentNumber(String value) {
        this.orderOfEnrollmentNumber = value;
    }

    /**
     * Gets the value of the idOrdersOfEnrollmentsAdditionalOrdersTypes property.
     * 
     */
    public int getIdOrdersOfEnrollmentsAdditionalOrdersTypes() {
        return idOrdersOfEnrollmentsAdditionalOrdersTypes;
    }

    /**
     * Sets the value of the idOrdersOfEnrollmentsAdditionalOrdersTypes property.
     * 
     */
    public void setIdOrdersOfEnrollmentsAdditionalOrdersTypes(int value) {
        this.idOrdersOfEnrollmentsAdditionalOrdersTypes = value;
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
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersOfEnrollmentsAdditionalOrdersTypesName() {
        return ordersOfEnrollmentsAdditionalOrdersTypesName;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersTypesName(String value) {
        this.ordersOfEnrollmentsAdditionalOrdersTypesName = value;
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
     * Gets the value of the isVerified property.
     * 
     */
    public int getIsVerified() {
        return isVerified;
    }

    /**
     * Sets the value of the isVerified property.
     * 
     */
    public void setIsVerified(int value) {
        this.isVerified = value;
    }

    /**
     * Gets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public int getIdRegulationDocumentVerificationHistoryType() {
        return idRegulationDocumentVerificationHistoryType;
    }

    /**
     * Sets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public void setIdRegulationDocumentVerificationHistoryType(int value) {
        this.idRegulationDocumentVerificationHistoryType = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentVerificationHistoryTypeName() {
        return regulationDocumentVerificationHistoryTypeName;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentVerificationHistoryTypeName(String value) {
        this.regulationDocumentVerificationHistoryTypeName = value;
    }

    /**
     * Gets the value of the isExistFile property.
     * 
     */
    public int getIsExistFile() {
        return isExistFile;
    }

    /**
     * Sets the value of the isExistFile property.
     * 
     */
    public void setIsExistFile(int value) {
        this.isExistFile = value;
    }

}
