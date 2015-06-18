
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
 *         &lt;element name="Id_UniversityOrderRequests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityOrderRequestsStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityOrderRequestsStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idUniversityOrderRequests",
    "idUniversityOrderRequestsStatusType",
    "universityOrderRequestsStatusDescription"
})
@XmlRootElement(name = "UniversityOrderRequestsStatusChange")
public class UniversityOrderRequestsStatusChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_UniversityOrderRequests")
    protected int idUniversityOrderRequests;
    @XmlElement(name = "Id_UniversityOrderRequestsStatusType")
    protected int idUniversityOrderRequestsStatusType;
    @XmlElement(name = "UniversityOrderRequestsStatusDescription")
    protected String universityOrderRequestsStatusDescription;

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
     * Gets the value of the universityOrderRequestsStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityOrderRequestsStatusDescription() {
        return universityOrderRequestsStatusDescription;
    }

    /**
     * Sets the value of the universityOrderRequestsStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityOrderRequestsStatusDescription(String value) {
        this.universityOrderRequestsStatusDescription = value;
    }

}
