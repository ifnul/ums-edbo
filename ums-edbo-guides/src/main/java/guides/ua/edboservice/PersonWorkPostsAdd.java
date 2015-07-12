
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
 *         &lt;element name="PersonWorkPostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsWork" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsSciense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsBoss" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsBossSetExtOrg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitiesBossOrderOrganisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OtherUniversitiesBossOrderOrganisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personWorkPostName",
    "isWork",
    "isSciense",
    "isBoss",
    "isBossSetExtOrg",
    "idUniversitiesBossOrderOrganisation",
    "otherUniversitiesBossOrderOrganisation"
})
@XmlRootElement(name = "PersonWorkPostsAdd")
public class PersonWorkPostsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "PersonWorkPostName")
    protected String personWorkPostName;
    @XmlElement(name = "IsWork")
    protected int isWork;
    @XmlElement(name = "IsSciense")
    protected int isSciense;
    @XmlElement(name = "IsBoss")
    protected int isBoss;
    @XmlElement(name = "IsBossSetExtOrg")
    protected int isBossSetExtOrg;
    @XmlElement(name = "Id_UniversitiesBossOrderOrganisation")
    protected int idUniversitiesBossOrderOrganisation;
    @XmlElement(name = "OtherUniversitiesBossOrderOrganisation")
    protected String otherUniversitiesBossOrderOrganisation;

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
     * Gets the value of the personWorkPostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkPostName() {
        return personWorkPostName;
    }

    /**
     * Sets the value of the personWorkPostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkPostName(String value) {
        this.personWorkPostName = value;
    }

    /**
     * Gets the value of the isWork property.
     * 
     */
    public int getIsWork() {
        return isWork;
    }

    /**
     * Sets the value of the isWork property.
     * 
     */
    public void setIsWork(int value) {
        this.isWork = value;
    }

    /**
     * Gets the value of the isSciense property.
     * 
     */
    public int getIsSciense() {
        return isSciense;
    }

    /**
     * Sets the value of the isSciense property.
     * 
     */
    public void setIsSciense(int value) {
        this.isSciense = value;
    }

    /**
     * Gets the value of the isBoss property.
     * 
     */
    public int getIsBoss() {
        return isBoss;
    }

    /**
     * Sets the value of the isBoss property.
     * 
     */
    public void setIsBoss(int value) {
        this.isBoss = value;
    }

    /**
     * Gets the value of the isBossSetExtOrg property.
     * 
     */
    public int getIsBossSetExtOrg() {
        return isBossSetExtOrg;
    }

    /**
     * Sets the value of the isBossSetExtOrg property.
     * 
     */
    public void setIsBossSetExtOrg(int value) {
        this.isBossSetExtOrg = value;
    }

    /**
     * Gets the value of the idUniversitiesBossOrderOrganisation property.
     * 
     */
    public int getIdUniversitiesBossOrderOrganisation() {
        return idUniversitiesBossOrderOrganisation;
    }

    /**
     * Sets the value of the idUniversitiesBossOrderOrganisation property.
     * 
     */
    public void setIdUniversitiesBossOrderOrganisation(int value) {
        this.idUniversitiesBossOrderOrganisation = value;
    }

    /**
     * Gets the value of the otherUniversitiesBossOrderOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherUniversitiesBossOrderOrganisation() {
        return otherUniversitiesBossOrderOrganisation;
    }

    /**
     * Sets the value of the otherUniversitiesBossOrderOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherUniversitiesBossOrderOrganisation(String value) {
        this.otherUniversitiesBossOrderOrganisation = value;
    }

}
