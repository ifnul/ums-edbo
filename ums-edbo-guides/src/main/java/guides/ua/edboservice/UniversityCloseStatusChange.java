
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
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Closed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityCloseStatusTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CloseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idUniversity",
    "closed",
    "universityDateEnd",
    "idUniversityCloseStatusTypes",
    "closeReason"
})
@XmlRootElement(name = "UniversityCloseStatusChange")
public class UniversityCloseStatusChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "Closed")
    protected int closed;
    @XmlElement(name = "UniversityDateEnd")
    protected String universityDateEnd;
    @XmlElement(name = "Id_UniversityCloseStatusTypes")
    protected int idUniversityCloseStatusTypes;
    @XmlElement(name = "CloseReason")
    protected String closeReason;

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
     * Gets the value of the closed property.
     * 
     */
    public int getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     */
    public void setClosed(int value) {
        this.closed = value;
    }

    /**
     * Gets the value of the universityDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityDateEnd() {
        return universityDateEnd;
    }

    /**
     * Sets the value of the universityDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityDateEnd(String value) {
        this.universityDateEnd = value;
    }

    /**
     * Gets the value of the idUniversityCloseStatusTypes property.
     * 
     */
    public int getIdUniversityCloseStatusTypes() {
        return idUniversityCloseStatusTypes;
    }

    /**
     * Sets the value of the idUniversityCloseStatusTypes property.
     * 
     */
    public void setIdUniversityCloseStatusTypes(int value) {
        this.idUniversityCloseStatusTypes = value;
    }

    /**
     * Gets the value of the closeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseReason() {
        return closeReason;
    }

    /**
     * Sets the value of the closeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseReason(String value) {
        this.closeReason = value;
    }

}
