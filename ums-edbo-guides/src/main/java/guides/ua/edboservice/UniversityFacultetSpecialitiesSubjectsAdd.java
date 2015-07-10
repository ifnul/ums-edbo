
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
 *         &lt;element name="UniversitySpecialitiesKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Subject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesSubjectsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesSubjectsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsProfiled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Koeficient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "universitySpecialitiesKode",
    "idSubject",
    "universitySpecialitiesSubjectsName",
    "universitySpecialitiesSubjectsDescription",
    "inGroup",
    "isProfiled",
    "koeficient"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesSubjectsAdd")
public class UniversityFacultetSpecialitiesSubjectsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "UniversitySpecialitiesKode")
    protected String universitySpecialitiesKode;
    @XmlElement(name = "Id_Subject")
    protected int idSubject;
    @XmlElement(name = "UniversitySpecialitiesSubjectsName")
    protected String universitySpecialitiesSubjectsName;
    @XmlElement(name = "UniversitySpecialitiesSubjectsDescription")
    protected String universitySpecialitiesSubjectsDescription;
    @XmlElement(name = "InGroup")
    protected int inGroup;
    @XmlElement(name = "IsProfiled")
    protected int isProfiled;
    @XmlElement(name = "Koeficient")
    protected String koeficient;

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
     * Gets the value of the universitySpecialitiesKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesKode() {
        return universitySpecialitiesKode;
    }

    /**
     * Sets the value of the universitySpecialitiesKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesKode(String value) {
        this.universitySpecialitiesKode = value;
    }

    /**
     * Gets the value of the idSubject property.
     * 
     */
    public int getIdSubject() {
        return idSubject;
    }

    /**
     * Sets the value of the idSubject property.
     * 
     */
    public void setIdSubject(int value) {
        this.idSubject = value;
    }

    /**
     * Gets the value of the universitySpecialitiesSubjectsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesSubjectsName() {
        return universitySpecialitiesSubjectsName;
    }

    /**
     * Sets the value of the universitySpecialitiesSubjectsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesSubjectsName(String value) {
        this.universitySpecialitiesSubjectsName = value;
    }

    /**
     * Gets the value of the universitySpecialitiesSubjectsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesSubjectsDescription() {
        return universitySpecialitiesSubjectsDescription;
    }

    /**
     * Sets the value of the universitySpecialitiesSubjectsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesSubjectsDescription(String value) {
        this.universitySpecialitiesSubjectsDescription = value;
    }

    /**
     * Gets the value of the inGroup property.
     * 
     */
    public int getInGroup() {
        return inGroup;
    }

    /**
     * Sets the value of the inGroup property.
     * 
     */
    public void setInGroup(int value) {
        this.inGroup = value;
    }

    /**
     * Gets the value of the isProfiled property.
     * 
     */
    public int getIsProfiled() {
        return isProfiled;
    }

    /**
     * Sets the value of the isProfiled property.
     * 
     */
    public void setIsProfiled(int value) {
        this.isProfiled = value;
    }

    /**
     * Gets the value of the koeficient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeficient() {
        return koeficient;
    }

    /**
     * Sets the value of the koeficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeficient(String value) {
        this.koeficient = value;
    }

}
