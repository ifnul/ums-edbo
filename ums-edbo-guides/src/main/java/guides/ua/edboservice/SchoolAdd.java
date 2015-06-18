
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
 *         &lt;element name="Id_EducationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KOATUUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StreetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouceNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolBossLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolBossFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolBossMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SchoolEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idEducationType",
    "koatuuCode",
    "idStreetType",
    "address",
    "houceNum",
    "schoolFullName",
    "schoolShortName",
    "schoolBossLastName",
    "schoolBossFirstName",
    "schoolBossMiddleName",
    "schoolPhone",
    "schoolMobile",
    "schoolEMail"
})
@XmlRootElement(name = "SchoolAdd")
public class SchoolAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Id_EducationType")
    protected int idEducationType;
    @XmlElement(name = "KOATUUCode")
    protected String koatuuCode;
    @XmlElement(name = "Id_StreetType")
    protected int idStreetType;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "HouceNum")
    protected String houceNum;
    @XmlElement(name = "SchoolFullName")
    protected String schoolFullName;
    @XmlElement(name = "SchoolShortName")
    protected String schoolShortName;
    @XmlElement(name = "SchoolBossLastName")
    protected String schoolBossLastName;
    @XmlElement(name = "SchoolBossFirstName")
    protected String schoolBossFirstName;
    @XmlElement(name = "SchoolBossMiddleName")
    protected String schoolBossMiddleName;
    @XmlElement(name = "SchoolPhone")
    protected String schoolPhone;
    @XmlElement(name = "SchoolMobile")
    protected String schoolMobile;
    @XmlElement(name = "SchoolEMail")
    protected String schoolEMail;

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
     * Gets the value of the idEducationType property.
     * 
     */
    public int getIdEducationType() {
        return idEducationType;
    }

    /**
     * Sets the value of the idEducationType property.
     * 
     */
    public void setIdEducationType(int value) {
        this.idEducationType = value;
    }

    /**
     * Gets the value of the koatuuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCode() {
        return koatuuCode;
    }

    /**
     * Sets the value of the koatuuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCode(String value) {
        this.koatuuCode = value;
    }

    /**
     * Gets the value of the idStreetType property.
     * 
     */
    public int getIdStreetType() {
        return idStreetType;
    }

    /**
     * Sets the value of the idStreetType property.
     * 
     */
    public void setIdStreetType(int value) {
        this.idStreetType = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the houceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouceNum() {
        return houceNum;
    }

    /**
     * Sets the value of the houceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouceNum(String value) {
        this.houceNum = value;
    }

    /**
     * Gets the value of the schoolFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolFullName() {
        return schoolFullName;
    }

    /**
     * Sets the value of the schoolFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolFullName(String value) {
        this.schoolFullName = value;
    }

    /**
     * Gets the value of the schoolShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolShortName() {
        return schoolShortName;
    }

    /**
     * Sets the value of the schoolShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolShortName(String value) {
        this.schoolShortName = value;
    }

    /**
     * Gets the value of the schoolBossLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolBossLastName() {
        return schoolBossLastName;
    }

    /**
     * Sets the value of the schoolBossLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolBossLastName(String value) {
        this.schoolBossLastName = value;
    }

    /**
     * Gets the value of the schoolBossFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolBossFirstName() {
        return schoolBossFirstName;
    }

    /**
     * Sets the value of the schoolBossFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolBossFirstName(String value) {
        this.schoolBossFirstName = value;
    }

    /**
     * Gets the value of the schoolBossMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolBossMiddleName() {
        return schoolBossMiddleName;
    }

    /**
     * Sets the value of the schoolBossMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolBossMiddleName(String value) {
        this.schoolBossMiddleName = value;
    }

    /**
     * Gets the value of the schoolPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolPhone() {
        return schoolPhone;
    }

    /**
     * Sets the value of the schoolPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolPhone(String value) {
        this.schoolPhone = value;
    }

    /**
     * Gets the value of the schoolMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolMobile() {
        return schoolMobile;
    }

    /**
     * Sets the value of the schoolMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolMobile(String value) {
        this.schoolMobile = value;
    }

    /**
     * Gets the value of the schoolEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolEMail() {
        return schoolEMail;
    }

    /**
     * Sets the value of the schoolEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolEMail(String value) {
        this.schoolEMail = value;
    }

}
