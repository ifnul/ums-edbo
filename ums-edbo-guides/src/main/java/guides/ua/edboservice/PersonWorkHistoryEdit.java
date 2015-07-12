
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
 *         &lt;element name="Id_PersonWorkHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkHistoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkHistoryUniversityOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkHistoryUniversityOrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWorkCancelationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonWorkCancelationOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPersonWorkHistory",
    "personWorkHistoryDescription",
    "personWorkHistoryUniversityOrderNumber",
    "personWorkHistoryUniversityOrderDate",
    "idPersonWorkCancelationType",
    "personWorkCancelationOther"
})
@XmlRootElement(name = "PersonWorkHistoryEdit")
public class PersonWorkHistoryEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonWorkHistory")
    protected int idPersonWorkHistory;
    @XmlElement(name = "PersonWorkHistoryDescription")
    protected String personWorkHistoryDescription;
    @XmlElement(name = "PersonWorkHistoryUniversityOrderNumber")
    protected String personWorkHistoryUniversityOrderNumber;
    @XmlElement(name = "PersonWorkHistoryUniversityOrderDate")
    protected String personWorkHistoryUniversityOrderDate;
    @XmlElement(name = "Id_PersonWorkCancelationType")
    protected int idPersonWorkCancelationType;
    @XmlElement(name = "PersonWorkCancelationOther")
    protected String personWorkCancelationOther;

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
     * Gets the value of the idPersonWorkHistory property.
     * 
     */
    public int getIdPersonWorkHistory() {
        return idPersonWorkHistory;
    }

    /**
     * Sets the value of the idPersonWorkHistory property.
     * 
     */
    public void setIdPersonWorkHistory(int value) {
        this.idPersonWorkHistory = value;
    }

    /**
     * Gets the value of the personWorkHistoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkHistoryDescription() {
        return personWorkHistoryDescription;
    }

    /**
     * Sets the value of the personWorkHistoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkHistoryDescription(String value) {
        this.personWorkHistoryDescription = value;
    }

    /**
     * Gets the value of the personWorkHistoryUniversityOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkHistoryUniversityOrderNumber() {
        return personWorkHistoryUniversityOrderNumber;
    }

    /**
     * Sets the value of the personWorkHistoryUniversityOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkHistoryUniversityOrderNumber(String value) {
        this.personWorkHistoryUniversityOrderNumber = value;
    }

    /**
     * Gets the value of the personWorkHistoryUniversityOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkHistoryUniversityOrderDate() {
        return personWorkHistoryUniversityOrderDate;
    }

    /**
     * Sets the value of the personWorkHistoryUniversityOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkHistoryUniversityOrderDate(String value) {
        this.personWorkHistoryUniversityOrderDate = value;
    }

    /**
     * Gets the value of the idPersonWorkCancelationType property.
     * 
     */
    public int getIdPersonWorkCancelationType() {
        return idPersonWorkCancelationType;
    }

    /**
     * Sets the value of the idPersonWorkCancelationType property.
     * 
     */
    public void setIdPersonWorkCancelationType(int value) {
        this.idPersonWorkCancelationType = value;
    }

    /**
     * Gets the value of the personWorkCancelationOther property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkCancelationOther() {
        return personWorkCancelationOther;
    }

    /**
     * Sets the value of the personWorkCancelationOther property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkCancelationOther(String value) {
        this.personWorkCancelationOther = value;
    }

}
