
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dDeliveryOfDocumentsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dDeliveryOfDocumentsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_DeliveryOfDocumentsData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DeliveryOfDocuments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeliveryDocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsError" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_PersonEducationHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JournalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentsAwardType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DeliveryOfDocumentsDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DeliveryOfDocumentsDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dDeliveryOfDocumentsData", propOrder = {
    "idDeliveryOfDocumentsData",
    "idDeliveryOfDocuments",
    "idPersonEducation",
    "deliveryDocumentSeries",
    "deliveryDocumentNumber",
    "isError",
    "description",
    "fio",
    "birthday",
    "idPersonEducationHistory",
    "educationInfo",
    "personCodeU",
    "journalNumber",
    "existDocument",
    "idPersonDocumentsAwardType",
    "value",
    "deliveryOfDocumentsDateBegin",
    "deliveryOfDocumentsDateEnd"
})
public class DDeliveryOfDocumentsData {

    @XmlElement(name = "Id_DeliveryOfDocumentsData")
    protected int idDeliveryOfDocumentsData;
    @XmlElement(name = "Id_DeliveryOfDocuments")
    protected int idDeliveryOfDocuments;
    @XmlElement(name = "Id_PersonEducation")
    protected int idPersonEducation;
    @XmlElement(name = "DeliveryDocumentSeries")
    protected String deliveryDocumentSeries;
    @XmlElement(name = "DeliveryDocumentNumber")
    protected String deliveryDocumentNumber;
    @XmlElement(name = "IsError")
    protected int isError;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "Id_PersonEducationHistory")
    protected int idPersonEducationHistory;
    @XmlElement(name = "EducationInfo")
    protected String educationInfo;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "JournalNumber")
    protected String journalNumber;
    @XmlElement(name = "ExistDocument")
    protected int existDocument;
    @XmlElement(name = "Id_PersonDocumentsAwardType")
    protected int idPersonDocumentsAwardType;
    @XmlElement(name = "Value", required = true)
    protected BigDecimal value;
    @XmlElement(name = "DeliveryOfDocumentsDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryOfDocumentsDateBegin;
    @XmlElement(name = "DeliveryOfDocumentsDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryOfDocumentsDateEnd;

    /**
     * Gets the value of the idDeliveryOfDocumentsData property.
     * 
     */
    public int getIdDeliveryOfDocumentsData() {
        return idDeliveryOfDocumentsData;
    }

    /**
     * Sets the value of the idDeliveryOfDocumentsData property.
     * 
     */
    public void setIdDeliveryOfDocumentsData(int value) {
        this.idDeliveryOfDocumentsData = value;
    }

    /**
     * Gets the value of the idDeliveryOfDocuments property.
     * 
     */
    public int getIdDeliveryOfDocuments() {
        return idDeliveryOfDocuments;
    }

    /**
     * Sets the value of the idDeliveryOfDocuments property.
     * 
     */
    public void setIdDeliveryOfDocuments(int value) {
        this.idDeliveryOfDocuments = value;
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
     * Gets the value of the deliveryDocumentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDocumentSeries() {
        return deliveryDocumentSeries;
    }

    /**
     * Sets the value of the deliveryDocumentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDocumentSeries(String value) {
        this.deliveryDocumentSeries = value;
    }

    /**
     * Gets the value of the deliveryDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryDocumentNumber() {
        return deliveryDocumentNumber;
    }

    /**
     * Sets the value of the deliveryDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryDocumentNumber(String value) {
        this.deliveryDocumentNumber = value;
    }

    /**
     * Gets the value of the isError property.
     * 
     */
    public int getIsError() {
        return isError;
    }

    /**
     * Sets the value of the isError property.
     * 
     */
    public void setIsError(int value) {
        this.isError = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the idPersonEducationHistory property.
     * 
     */
    public int getIdPersonEducationHistory() {
        return idPersonEducationHistory;
    }

    /**
     * Sets the value of the idPersonEducationHistory property.
     * 
     */
    public void setIdPersonEducationHistory(int value) {
        this.idPersonEducationHistory = value;
    }

    /**
     * Gets the value of the educationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationInfo() {
        return educationInfo;
    }

    /**
     * Sets the value of the educationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationInfo(String value) {
        this.educationInfo = value;
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
     * Gets the value of the journalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalNumber() {
        return journalNumber;
    }

    /**
     * Sets the value of the journalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalNumber(String value) {
        this.journalNumber = value;
    }

    /**
     * Gets the value of the existDocument property.
     * 
     */
    public int getExistDocument() {
        return existDocument;
    }

    /**
     * Sets the value of the existDocument property.
     * 
     */
    public void setExistDocument(int value) {
        this.existDocument = value;
    }

    /**
     * Gets the value of the idPersonDocumentsAwardType property.
     * 
     */
    public int getIdPersonDocumentsAwardType() {
        return idPersonDocumentsAwardType;
    }

    /**
     * Sets the value of the idPersonDocumentsAwardType property.
     * 
     */
    public void setIdPersonDocumentsAwardType(int value) {
        this.idPersonDocumentsAwardType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the deliveryOfDocumentsDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryOfDocumentsDateBegin() {
        return deliveryOfDocumentsDateBegin;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryOfDocumentsDateBegin(XMLGregorianCalendar value) {
        this.deliveryOfDocumentsDateBegin = value;
    }

    /**
     * Gets the value of the deliveryOfDocumentsDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryOfDocumentsDateEnd() {
        return deliveryOfDocumentsDateEnd;
    }

    /**
     * Sets the value of the deliveryOfDocumentsDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryOfDocumentsDateEnd(XMLGregorianCalendar value) {
        this.deliveryOfDocumentsDateEnd = value;
    }

}
