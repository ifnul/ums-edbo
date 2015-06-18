
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
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityLicenseCertificateType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsActivee" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityKode",
    "idUniversityLicenseCertificateType",
    "isRequest",
    "isActivee"
})
@XmlRootElement(name = "UniversityLicenseCertificateGet")
public class UniversityLicenseCertificateGet {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_UniversityLicenseCertificateType")
    protected int idUniversityLicenseCertificateType;
    @XmlElement(name = "IsRequest")
    protected int isRequest;
    @XmlElement(name = "IsActivee")
    protected int isActivee;

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
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the idUniversityLicenseCertificateType property.
     * 
     */
    public int getIdUniversityLicenseCertificateType() {
        return idUniversityLicenseCertificateType;
    }

    /**
     * Sets the value of the idUniversityLicenseCertificateType property.
     * 
     */
    public void setIdUniversityLicenseCertificateType(int value) {
        this.idUniversityLicenseCertificateType = value;
    }

    /**
     * Gets the value of the isRequest property.
     * 
     */
    public int getIsRequest() {
        return isRequest;
    }

    /**
     * Sets the value of the isRequest property.
     * 
     */
    public void setIsRequest(int value) {
        this.isRequest = value;
    }

    /**
     * Gets the value of the isActivee property.
     * 
     */
    public int getIsActivee() {
        return isActivee;
    }

    /**
     * Sets the value of the isActivee property.
     * 
     */
    public void setIsActivee(int value) {
        this.isActivee = value;
    }

}
