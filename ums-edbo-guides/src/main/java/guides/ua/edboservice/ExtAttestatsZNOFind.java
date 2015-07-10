
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
 *         &lt;element name="ASeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ANumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "aSeries",
    "aNumber",
    "zYear",
    "zNumber"
})
@XmlRootElement(name = "ExtAttestatsZNOFind")
public class ExtAttestatsZNOFind {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "ASeries")
    protected String aSeries;
    @XmlElement(name = "ANumber")
    protected String aNumber;
    @XmlElement(name = "ZYear")
    protected String zYear;
    @XmlElement(name = "ZNumber")
    protected String zNumber;

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
     * Gets the value of the aSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASeries() {
        return aSeries;
    }

    /**
     * Sets the value of the aSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASeries(String value) {
        this.aSeries = value;
    }

    /**
     * Gets the value of the aNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANumber() {
        return aNumber;
    }

    /**
     * Sets the value of the aNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANumber(String value) {
        this.aNumber = value;
    }

    /**
     * Gets the value of the zYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZYear() {
        return zYear;
    }

    /**
     * Sets the value of the zYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZYear(String value) {
        this.zYear = value;
    }

    /**
     * Gets the value of the zNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZNumber() {
        return zNumber;
    }

    /**
     * Sets the value of the zNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZNumber(String value) {
        this.zNumber = value;
    }

}
