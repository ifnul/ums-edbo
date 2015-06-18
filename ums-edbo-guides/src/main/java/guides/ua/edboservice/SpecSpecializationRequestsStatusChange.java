
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
 *         &lt;element name="Id_SpecScecializationRequests" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecScecializationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cancel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BindTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idSpecScecializationRequests",
    "specScecializationCode",
    "cancel",
    "bindTypeDescription"
})
@XmlRootElement(name = "SpecSpecializationRequestsStatusChange")
public class SpecSpecializationRequestsStatusChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_SpecScecializationRequests")
    protected int idSpecScecializationRequests;
    @XmlElement(name = "SpecScecializationCode")
    protected String specScecializationCode;
    @XmlElement(name = "Cancel")
    protected int cancel;
    @XmlElement(name = "BindTypeDescription")
    protected String bindTypeDescription;

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
     * Gets the value of the idSpecScecializationRequests property.
     * 
     */
    public int getIdSpecScecializationRequests() {
        return idSpecScecializationRequests;
    }

    /**
     * Sets the value of the idSpecScecializationRequests property.
     * 
     */
    public void setIdSpecScecializationRequests(int value) {
        this.idSpecScecializationRequests = value;
    }

    /**
     * Gets the value of the specScecializationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationCode() {
        return specScecializationCode;
    }

    /**
     * Sets the value of the specScecializationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationCode(String value) {
        this.specScecializationCode = value;
    }

    /**
     * Gets the value of the cancel property.
     * 
     */
    public int getCancel() {
        return cancel;
    }

    /**
     * Sets the value of the cancel property.
     * 
     */
    public void setCancel(int value) {
        this.cancel = value;
    }

    /**
     * Gets the value of the bindTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindTypeDescription() {
        return bindTypeDescription;
    }

    /**
     * Sets the value of the bindTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindTypeDescription(String value) {
        this.bindTypeDescription = value;
    }

}
