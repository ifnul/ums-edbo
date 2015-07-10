
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
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityAcreditatinType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateBeginAccreditation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateEndAccreditation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idLanguage",
    "universityKode",
    "idUniversityAcreditatinType",
    "dateBeginAccreditation",
    "dateEndAccreditation"
})
@XmlRootElement(name = "UniversityAccreditationAdd")
public class UniversityAccreditationAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_UniversityAcreditatinType")
    protected int idUniversityAcreditatinType;
    @XmlElement(name = "DateBeginAccreditation")
    protected String dateBeginAccreditation;
    @XmlElement(name = "DateEndAccreditation")
    protected String dateEndAccreditation;

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
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
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
     * Gets the value of the idUniversityAcreditatinType property.
     * 
     */
    public int getIdUniversityAcreditatinType() {
        return idUniversityAcreditatinType;
    }

    /**
     * Sets the value of the idUniversityAcreditatinType property.
     * 
     */
    public void setIdUniversityAcreditatinType(int value) {
        this.idUniversityAcreditatinType = value;
    }

    /**
     * Gets the value of the dateBeginAccreditation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateBeginAccreditation() {
        return dateBeginAccreditation;
    }

    /**
     * Sets the value of the dateBeginAccreditation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateBeginAccreditation(String value) {
        this.dateBeginAccreditation = value;
    }

    /**
     * Gets the value of the dateEndAccreditation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateEndAccreditation() {
        return dateEndAccreditation;
    }

    /**
     * Sets the value of the dateEndAccreditation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateEndAccreditation(String value) {
        this.dateEndAccreditation = value;
    }

}
