
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dWebPersonsStatusHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dWebPersonsStatusHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_WebPersonsStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_WebPersons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_WebPersonsStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebPersonsStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebPersonsStatusIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebPersonsStatusDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebPersonsStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="User_FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dWebPersonsStatusHistory", propOrder = {
    "idWebPersonsStatus",
    "idWebPersons",
    "idWebPersonsStatusType",
    "webPersonsStatusTypeName",
    "webPersonsStatusIsActive",
    "webPersonsStatusDateLastChange",
    "idUser",
    "webPersonsStatusDescription",
    "userFIO"
})
public class DWebPersonsStatusHistory {

    @XmlElement(name = "Id_WebPersonsStatus")
    protected int idWebPersonsStatus;
    @XmlElement(name = "Id_WebPersons")
    protected int idWebPersons;
    @XmlElement(name = "Id_WebPersonsStatusType")
    protected int idWebPersonsStatusType;
    @XmlElement(name = "WebPersonsStatusTypeName")
    protected String webPersonsStatusTypeName;
    @XmlElement(name = "WebPersonsStatusIsActive")
    protected int webPersonsStatusIsActive;
    @XmlElement(name = "WebPersonsStatusDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar webPersonsStatusDateLastChange;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "WebPersonsStatusDescription")
    protected String webPersonsStatusDescription;
    @XmlElement(name = "User_FIO")
    protected String userFIO;

    /**
     * Gets the value of the idWebPersonsStatus property.
     * 
     */
    public int getIdWebPersonsStatus() {
        return idWebPersonsStatus;
    }

    /**
     * Sets the value of the idWebPersonsStatus property.
     * 
     */
    public void setIdWebPersonsStatus(int value) {
        this.idWebPersonsStatus = value;
    }

    /**
     * Gets the value of the idWebPersons property.
     * 
     */
    public int getIdWebPersons() {
        return idWebPersons;
    }

    /**
     * Sets the value of the idWebPersons property.
     * 
     */
    public void setIdWebPersons(int value) {
        this.idWebPersons = value;
    }

    /**
     * Gets the value of the idWebPersonsStatusType property.
     * 
     */
    public int getIdWebPersonsStatusType() {
        return idWebPersonsStatusType;
    }

    /**
     * Sets the value of the idWebPersonsStatusType property.
     * 
     */
    public void setIdWebPersonsStatusType(int value) {
        this.idWebPersonsStatusType = value;
    }

    /**
     * Gets the value of the webPersonsStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPersonsStatusTypeName() {
        return webPersonsStatusTypeName;
    }

    /**
     * Sets the value of the webPersonsStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPersonsStatusTypeName(String value) {
        this.webPersonsStatusTypeName = value;
    }

    /**
     * Gets the value of the webPersonsStatusIsActive property.
     * 
     */
    public int getWebPersonsStatusIsActive() {
        return webPersonsStatusIsActive;
    }

    /**
     * Sets the value of the webPersonsStatusIsActive property.
     * 
     */
    public void setWebPersonsStatusIsActive(int value) {
        this.webPersonsStatusIsActive = value;
    }

    /**
     * Gets the value of the webPersonsStatusDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWebPersonsStatusDateLastChange() {
        return webPersonsStatusDateLastChange;
    }

    /**
     * Sets the value of the webPersonsStatusDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWebPersonsStatusDateLastChange(XMLGregorianCalendar value) {
        this.webPersonsStatusDateLastChange = value;
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
     * Gets the value of the webPersonsStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPersonsStatusDescription() {
        return webPersonsStatusDescription;
    }

    /**
     * Sets the value of the webPersonsStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPersonsStatusDescription(String value) {
        this.webPersonsStatusDescription = value;
    }

    /**
     * Gets the value of the userFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFIO() {
        return userFIO;
    }

    /**
     * Sets the value of the userFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFIO(String value) {
        this.userFIO = value;
    }

}
