
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityStateOrders complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityStateOrders">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityStateOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_StateOrdersTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StateOrderDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StateOrderIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrdersTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityStateOrdersType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityStateOrdersTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FIOVikonavca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Variant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityStateOrders", propOrder = {
    "idUniversityStateOrder",
    "idStateOrdersTypes",
    "stateOrderDateLastChange",
    "stateOrderIsActive",
    "year",
    "idUser",
    "universityKode",
    "stateOrdersTypeName",
    "fio",
    "idUniversityStateOrdersType",
    "universityStateOrdersTypeName",
    "dateCreate",
    "docStatus",
    "docStatusName",
    "dataCount",
    "idRegulationDocument",
    "isVerified",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "isExistFile",
    "regulationDocumentVerificationHistoryDateLastChange",
    "fioVikonavca",
    "regulationDocumentVerificationHistoryDescription",
    "isActive",
    "variant",
    "orderType",
    "idUniversity",
    "universityFullName",
    "region"
})
public class DUniversityStateOrders {

    @XmlElement(name = "Id_UniversityStateOrder")
    protected int idUniversityStateOrder;
    @XmlElement(name = "Id_StateOrdersTypes")
    protected int idStateOrdersTypes;
    @XmlElement(name = "StateOrderDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stateOrderDateLastChange;
    @XmlElement(name = "StateOrderIsActive")
    protected int stateOrderIsActive;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "StateOrdersTypeName")
    protected String stateOrdersTypeName;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Id_UniversityStateOrdersType")
    protected int idUniversityStateOrdersType;
    @XmlElement(name = "UniversityStateOrdersTypeName")
    protected String universityStateOrdersTypeName;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DocStatus")
    protected int docStatus;
    @XmlElement(name = "DocStatusName")
    protected String docStatusName;
    @XmlElement(name = "DataCount")
    protected int dataCount;
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
    @XmlElement(name = "RegulationDocumentVerificationHistoryDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regulationDocumentVerificationHistoryDateLastChange;
    @XmlElement(name = "FIOVikonavca")
    protected String fioVikonavca;
    @XmlElement(name = "RegulationDocumentVerificationHistoryDescription")
    protected String regulationDocumentVerificationHistoryDescription;
    @XmlElement(name = "IsActive")
    protected int isActive;
    @XmlElement(name = "Variant")
    protected String variant;
    @XmlElement(name = "OrderType")
    protected String orderType;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Region")
    protected String region;

    /**
     * Gets the value of the idUniversityStateOrder property.
     * 
     */
    public int getIdUniversityStateOrder() {
        return idUniversityStateOrder;
    }

    /**
     * Sets the value of the idUniversityStateOrder property.
     * 
     */
    public void setIdUniversityStateOrder(int value) {
        this.idUniversityStateOrder = value;
    }

    /**
     * Gets the value of the idStateOrdersTypes property.
     * 
     */
    public int getIdStateOrdersTypes() {
        return idStateOrdersTypes;
    }

    /**
     * Sets the value of the idStateOrdersTypes property.
     * 
     */
    public void setIdStateOrdersTypes(int value) {
        this.idStateOrdersTypes = value;
    }

    /**
     * Gets the value of the stateOrderDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStateOrderDateLastChange() {
        return stateOrderDateLastChange;
    }

    /**
     * Sets the value of the stateOrderDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStateOrderDateLastChange(XMLGregorianCalendar value) {
        this.stateOrderDateLastChange = value;
    }

    /**
     * Gets the value of the stateOrderIsActive property.
     * 
     */
    public int getStateOrderIsActive() {
        return stateOrderIsActive;
    }

    /**
     * Sets the value of the stateOrderIsActive property.
     * 
     */
    public void setStateOrderIsActive(int value) {
        this.stateOrderIsActive = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
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
     * Gets the value of the stateOrdersTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrdersTypeName() {
        return stateOrdersTypeName;
    }

    /**
     * Sets the value of the stateOrdersTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrdersTypeName(String value) {
        this.stateOrdersTypeName = value;
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
     * Gets the value of the idUniversityStateOrdersType property.
     * 
     */
    public int getIdUniversityStateOrdersType() {
        return idUniversityStateOrdersType;
    }

    /**
     * Sets the value of the idUniversityStateOrdersType property.
     * 
     */
    public void setIdUniversityStateOrdersType(int value) {
        this.idUniversityStateOrdersType = value;
    }

    /**
     * Gets the value of the universityStateOrdersTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityStateOrdersTypeName() {
        return universityStateOrdersTypeName;
    }

    /**
     * Sets the value of the universityStateOrdersTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityStateOrdersTypeName(String value) {
        this.universityStateOrdersTypeName = value;
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
     * Gets the value of the docStatus property.
     * 
     */
    public int getDocStatus() {
        return docStatus;
    }

    /**
     * Sets the value of the docStatus property.
     * 
     */
    public void setDocStatus(int value) {
        this.docStatus = value;
    }

    /**
     * Gets the value of the docStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocStatusName() {
        return docStatusName;
    }

    /**
     * Sets the value of the docStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocStatusName(String value) {
        this.docStatusName = value;
    }

    /**
     * Gets the value of the dataCount property.
     * 
     */
    public int getDataCount() {
        return dataCount;
    }

    /**
     * Sets the value of the dataCount property.
     * 
     */
    public void setDataCount(int value) {
        this.dataCount = value;
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

    /**
     * Gets the value of the regulationDocumentVerificationHistoryDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegulationDocumentVerificationHistoryDateLastChange() {
        return regulationDocumentVerificationHistoryDateLastChange;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegulationDocumentVerificationHistoryDateLastChange(XMLGregorianCalendar value) {
        this.regulationDocumentVerificationHistoryDateLastChange = value;
    }

    /**
     * Gets the value of the fioVikonavca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIOVikonavca() {
        return fioVikonavca;
    }

    /**
     * Sets the value of the fioVikonavca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIOVikonavca(String value) {
        this.fioVikonavca = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentVerificationHistoryDescription() {
        return regulationDocumentVerificationHistoryDescription;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentVerificationHistoryDescription(String value) {
        this.regulationDocumentVerificationHistoryDescription = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public int getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(int value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariant(String value) {
        this.variant = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
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
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

}
