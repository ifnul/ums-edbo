
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityBuildingDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityBuildingDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityBuildingDocuments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityBuilding" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityBuildingDocumentsSubtypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityBuildingDocumentsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityBuildingDocumentsSubtypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBuildingDocumentsTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDateGet" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DocumentDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsExistStateRegistration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsExistNotarization" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserEdit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ExistScan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityBuildingDocuments", propOrder = {
    "idUniversityBuildingDocuments",
    "idUniversityBuilding",
    "idUniversityBuildingDocumentsSubtypes",
    "idUniversityBuildingDocumentsTypes",
    "universityBuildingDocumentsSubtypesName",
    "universityBuildingDocumentsTypeName",
    "documentName",
    "organizationFullName",
    "documentSeries",
    "documentNumber",
    "documentDateGet",
    "documentDateBegin",
    "documentDateEnd",
    "isExistStateRegistration",
    "isExistNotarization",
    "idUserAdd",
    "idUserEdit",
    "dateCreate",
    "dateLastChange",
    "existScan"
})
public class DUniversityBuildingDocuments {

    @XmlElement(name = "Id_UniversityBuildingDocuments")
    protected int idUniversityBuildingDocuments;
    @XmlElement(name = "Id_UniversityBuilding")
    protected int idUniversityBuilding;
    @XmlElement(name = "Id_UniversityBuildingDocumentsSubtypes")
    protected int idUniversityBuildingDocumentsSubtypes;
    @XmlElement(name = "Id_UniversityBuildingDocumentsTypes")
    protected int idUniversityBuildingDocumentsTypes;
    @XmlElement(name = "UniversityBuildingDocumentsSubtypesName")
    protected String universityBuildingDocumentsSubtypesName;
    @XmlElement(name = "UniversityBuildingDocumentsTypeName")
    protected String universityBuildingDocumentsTypeName;
    @XmlElement(name = "DocumentName")
    protected String documentName;
    @XmlElement(name = "OrganizationFullName")
    protected String organizationFullName;
    @XmlElement(name = "DocumentSeries")
    protected String documentSeries;
    @XmlElement(name = "DocumentNumber")
    protected String documentNumber;
    @XmlElement(name = "DocumentDateGet", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDateGet;
    @XmlElement(name = "DocumentDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDateBegin;
    @XmlElement(name = "DocumentDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDateEnd;
    @XmlElement(name = "IsExistStateRegistration")
    protected int isExistStateRegistration;
    @XmlElement(name = "IsExistNotarization")
    protected int isExistNotarization;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "Id_UserEdit")
    protected int idUserEdit;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "ExistScan")
    protected int existScan;

    /**
     * Gets the value of the idUniversityBuildingDocuments property.
     * 
     */
    public int getIdUniversityBuildingDocuments() {
        return idUniversityBuildingDocuments;
    }

    /**
     * Sets the value of the idUniversityBuildingDocuments property.
     * 
     */
    public void setIdUniversityBuildingDocuments(int value) {
        this.idUniversityBuildingDocuments = value;
    }

    /**
     * Gets the value of the idUniversityBuilding property.
     * 
     */
    public int getIdUniversityBuilding() {
        return idUniversityBuilding;
    }

    /**
     * Sets the value of the idUniversityBuilding property.
     * 
     */
    public void setIdUniversityBuilding(int value) {
        this.idUniversityBuilding = value;
    }

    /**
     * Gets the value of the idUniversityBuildingDocumentsSubtypes property.
     * 
     */
    public int getIdUniversityBuildingDocumentsSubtypes() {
        return idUniversityBuildingDocumentsSubtypes;
    }

    /**
     * Sets the value of the idUniversityBuildingDocumentsSubtypes property.
     * 
     */
    public void setIdUniversityBuildingDocumentsSubtypes(int value) {
        this.idUniversityBuildingDocumentsSubtypes = value;
    }

    /**
     * Gets the value of the idUniversityBuildingDocumentsTypes property.
     * 
     */
    public int getIdUniversityBuildingDocumentsTypes() {
        return idUniversityBuildingDocumentsTypes;
    }

    /**
     * Sets the value of the idUniversityBuildingDocumentsTypes property.
     * 
     */
    public void setIdUniversityBuildingDocumentsTypes(int value) {
        this.idUniversityBuildingDocumentsTypes = value;
    }

    /**
     * Gets the value of the universityBuildingDocumentsSubtypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBuildingDocumentsSubtypesName() {
        return universityBuildingDocumentsSubtypesName;
    }

    /**
     * Sets the value of the universityBuildingDocumentsSubtypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBuildingDocumentsSubtypesName(String value) {
        this.universityBuildingDocumentsSubtypesName = value;
    }

    /**
     * Gets the value of the universityBuildingDocumentsTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBuildingDocumentsTypeName() {
        return universityBuildingDocumentsTypeName;
    }

    /**
     * Sets the value of the universityBuildingDocumentsTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBuildingDocumentsTypeName(String value) {
        this.universityBuildingDocumentsTypeName = value;
    }

    /**
     * Gets the value of the documentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * Sets the value of the documentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentName(String value) {
        this.documentName = value;
    }

    /**
     * Gets the value of the organizationFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationFullName() {
        return organizationFullName;
    }

    /**
     * Sets the value of the organizationFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationFullName(String value) {
        this.organizationFullName = value;
    }

    /**
     * Gets the value of the documentSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentSeries() {
        return documentSeries;
    }

    /**
     * Sets the value of the documentSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentSeries(String value) {
        this.documentSeries = value;
    }

    /**
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentDateGet property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDateGet() {
        return documentDateGet;
    }

    /**
     * Sets the value of the documentDateGet property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDateGet(XMLGregorianCalendar value) {
        this.documentDateGet = value;
    }

    /**
     * Gets the value of the documentDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDateBegin() {
        return documentDateBegin;
    }

    /**
     * Sets the value of the documentDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDateBegin(XMLGregorianCalendar value) {
        this.documentDateBegin = value;
    }

    /**
     * Gets the value of the documentDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDateEnd() {
        return documentDateEnd;
    }

    /**
     * Sets the value of the documentDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDateEnd(XMLGregorianCalendar value) {
        this.documentDateEnd = value;
    }

    /**
     * Gets the value of the isExistStateRegistration property.
     * 
     */
    public int getIsExistStateRegistration() {
        return isExistStateRegistration;
    }

    /**
     * Sets the value of the isExistStateRegistration property.
     * 
     */
    public void setIsExistStateRegistration(int value) {
        this.isExistStateRegistration = value;
    }

    /**
     * Gets the value of the isExistNotarization property.
     * 
     */
    public int getIsExistNotarization() {
        return isExistNotarization;
    }

    /**
     * Sets the value of the isExistNotarization property.
     * 
     */
    public void setIsExistNotarization(int value) {
        this.isExistNotarization = value;
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
     * Gets the value of the existScan property.
     * 
     */
    public int getExistScan() {
        return existScan;
    }

    /**
     * Sets the value of the existScan property.
     * 
     */
    public void setExistScan(int value) {
        this.existScan = value;
    }

}
