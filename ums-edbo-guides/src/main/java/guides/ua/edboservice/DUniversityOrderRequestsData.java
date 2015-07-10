
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityOrderRequestsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityOrderRequestsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityOrderRequestsData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityOrderRequests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityOrderRequestsDataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityOrderRequestsDataTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityOrderRequestsDataStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityOrderRequestsDataStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SourceOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DataDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityOrderRequestsData", propOrder = {
    "idUniversityOrderRequestsData",
    "idUniversityOrderRequests",
    "idUniversityOrderRequestsDataType",
    "universityOrderRequestsDataTypeName",
    "idUniversityOrderRequestsDataStatusType",
    "universityOrderRequestsDataStatusTypeName",
    "idSourceOrder",
    "dateCreate",
    "dataDescription"
})
public class DUniversityOrderRequestsData {

    @XmlElement(name = "Id_UniversityOrderRequestsData")
    protected int idUniversityOrderRequestsData;
    @XmlElement(name = "Id_UniversityOrderRequests")
    protected int idUniversityOrderRequests;
    @XmlElement(name = "Id_UniversityOrderRequestsDataType")
    protected int idUniversityOrderRequestsDataType;
    @XmlElement(name = "UniversityOrderRequestsDataTypeName")
    protected String universityOrderRequestsDataTypeName;
    @XmlElement(name = "Id_UniversityOrderRequestsDataStatusType")
    protected int idUniversityOrderRequestsDataStatusType;
    @XmlElement(name = "UniversityOrderRequestsDataStatusTypeName")
    protected String universityOrderRequestsDataStatusTypeName;
    @XmlElement(name = "Id_SourceOrder")
    protected int idSourceOrder;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DataDescription")
    protected String dataDescription;

    /**
     * Gets the value of the idUniversityOrderRequestsData property.
     * 
     */
    public int getIdUniversityOrderRequestsData() {
        return idUniversityOrderRequestsData;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsData property.
     * 
     */
    public void setIdUniversityOrderRequestsData(int value) {
        this.idUniversityOrderRequestsData = value;
    }

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
     * Gets the value of the idUniversityOrderRequestsDataType property.
     * 
     */
    public int getIdUniversityOrderRequestsDataType() {
        return idUniversityOrderRequestsDataType;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsDataType property.
     * 
     */
    public void setIdUniversityOrderRequestsDataType(int value) {
        this.idUniversityOrderRequestsDataType = value;
    }

    /**
     * Gets the value of the universityOrderRequestsDataTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsDataTypeName() {
        return universityOrderRequestsDataTypeName;
    }

    /**
     * Sets the value of the universityOrderRequestsDataTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsDataTypeName(String value) {
        this.universityOrderRequestsDataTypeName = value;
    }

    /**
     * Gets the value of the idUniversityOrderRequestsDataStatusType property.
     * 
     */
    public int getIdUniversityOrderRequestsDataStatusType() {
        return idUniversityOrderRequestsDataStatusType;
    }

    /**
     * Sets the value of the idUniversityOrderRequestsDataStatusType property.
     * 
     */
    public void setIdUniversityOrderRequestsDataStatusType(int value) {
        this.idUniversityOrderRequestsDataStatusType = value;
    }

    /**
     * Gets the value of the universityOrderRequestsDataStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsDataStatusTypeName() {
        return universityOrderRequestsDataStatusTypeName;
    }

    /**
     * Sets the value of the universityOrderRequestsDataStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsDataStatusTypeName(String value) {
        this.universityOrderRequestsDataStatusTypeName = value;
    }

    /**
     * Gets the value of the idSourceOrder property.
     * 
     */
    public int getIdSourceOrder() {
        return idSourceOrder;
    }

    /**
     * Sets the value of the idSourceOrder property.
     * 
     */
    public void setIdSourceOrder(int value) {
        this.idSourceOrder = value;
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
     * Gets the value of the dataDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDescription() {
        return dataDescription;
    }

    /**
     * Sets the value of the dataDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDescription(String value) {
        this.dataDescription = value;
    }

}
