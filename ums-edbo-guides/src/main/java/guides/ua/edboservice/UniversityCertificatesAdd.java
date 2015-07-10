
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
 *         &lt;element name="UniversityCertificatesFileBase64String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityCertificatesPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityCertificatesFilePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityCertificatesFilePasswordSendType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCertificatesBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityCertificatesExpiredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityCertificatesImageScanBase64String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityRegistration" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityCertificatesFileBase64String",
    "universityCertificatesPassword",
    "universityCertificatesFilePassword",
    "universityCertificatesFilePasswordSendType",
    "universityCertificatesBeginDate",
    "universityCertificatesExpiredDate",
    "universityCertificatesImageScanBase64String",
    "number",
    "idUniversityRegistration"
})
@XmlRootElement(name = "UniversityCertificatesAdd")
public class UniversityCertificatesAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityCertificatesFileBase64String")
    protected String universityCertificatesFileBase64String;
    @XmlElement(name = "UniversityCertificatesPassword")
    protected String universityCertificatesPassword;
    @XmlElement(name = "UniversityCertificatesFilePassword")
    protected String universityCertificatesFilePassword;
    @XmlElement(name = "UniversityCertificatesFilePasswordSendType")
    protected int universityCertificatesFilePasswordSendType;
    @XmlElement(name = "UniversityCertificatesBeginDate")
    protected String universityCertificatesBeginDate;
    @XmlElement(name = "UniversityCertificatesExpiredDate")
    protected String universityCertificatesExpiredDate;
    @XmlElement(name = "UniversityCertificatesImageScanBase64String")
    protected String universityCertificatesImageScanBase64String;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "Id_UniversityRegistration")
    protected int idUniversityRegistration;

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
     * Gets the value of the universityCertificatesFileBase64String property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCertificatesFileBase64String() {
        return universityCertificatesFileBase64String;
    }

    /**
     * Sets the value of the universityCertificatesFileBase64String property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCertificatesFileBase64String(String value) {
        this.universityCertificatesFileBase64String = value;
    }

    /**
     * Gets the value of the universityCertificatesPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCertificatesPassword() {
        return universityCertificatesPassword;
    }

    /**
     * Sets the value of the universityCertificatesPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCertificatesPassword(String value) {
        this.universityCertificatesPassword = value;
    }

    /**
     * Gets the value of the universityCertificatesFilePassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCertificatesFilePassword() {
        return universityCertificatesFilePassword;
    }

    /**
     * Sets the value of the universityCertificatesFilePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCertificatesFilePassword(String value) {
        this.universityCertificatesFilePassword = value;
    }

    /**
     * Gets the value of the universityCertificatesFilePasswordSendType property.
     * 
     */
    public int getUniversityCertificatesFilePasswordSendType() {
        return universityCertificatesFilePasswordSendType;
    }

    /**
     * Sets the value of the universityCertificatesFilePasswordSendType property.
     * 
     */
    public void setUniversityCertificatesFilePasswordSendType(int value) {
        this.universityCertificatesFilePasswordSendType = value;
    }

    /**
     * Gets the value of the universityCertificatesBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCertificatesBeginDate() {
        return universityCertificatesBeginDate;
    }

    /**
     * Sets the value of the universityCertificatesBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCertificatesBeginDate(String value) {
        this.universityCertificatesBeginDate = value;
    }

    /**
     * Gets the value of the universityCertificatesExpiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCertificatesExpiredDate() {
        return universityCertificatesExpiredDate;
    }

    /**
     * Sets the value of the universityCertificatesExpiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCertificatesExpiredDate(String value) {
        this.universityCertificatesExpiredDate = value;
    }

    /**
     * Gets the value of the universityCertificatesImageScanBase64String property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCertificatesImageScanBase64String() {
        return universityCertificatesImageScanBase64String;
    }

    /**
     * Sets the value of the universityCertificatesImageScanBase64String property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCertificatesImageScanBase64String(String value) {
        this.universityCertificatesImageScanBase64String = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the idUniversityRegistration property.
     * 
     */
    public int getIdUniversityRegistration() {
        return idUniversityRegistration;
    }

    /**
     * Sets the value of the idUniversityRegistration property.
     * 
     */
    public void setIdUniversityRegistration(int value) {
        this.idUniversityRegistration = value;
    }

}
