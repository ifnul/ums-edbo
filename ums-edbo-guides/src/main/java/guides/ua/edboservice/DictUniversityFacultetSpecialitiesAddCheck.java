
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
 *         &lt;element name="UniversitySpecialitiesDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestSeasonDetails" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesLicenseCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesContractCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesOldBudjetCountCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DurationEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesLicenseCountOld" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSecondEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universitySpecialitiesDateBegin",
    "universitySpecialitiesDateEnd",
    "universityKode",
    "universityFacultetKode",
    "specCode",
    "idLanguage",
    "idPersonRequestSeasonDetails",
    "universitySpecialitiesLicenseCount",
    "universitySpecialitiesContractCount",
    "idQualification",
    "universitySpecialitiesOldBudjetCountCount",
    "idCourse",
    "durationEducation",
    "universitySpecialitiesLicenseCountOld",
    "educationDateBegin",
    "educationDateEnd",
    "isSecondEducation"
})
@XmlRootElement(name = "DictUniversityFacultetSpecialitiesAddCheck")
public class DictUniversityFacultetSpecialitiesAddCheck {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversitySpecialitiesDateBegin")
    protected String universitySpecialitiesDateBegin;
    @XmlElement(name = "UniversitySpecialitiesDateEnd")
    protected String universitySpecialitiesDateEnd;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Id_PersonRequestSeasonDetails")
    protected int idPersonRequestSeasonDetails;
    @XmlElement(name = "UniversitySpecialitiesLicenseCount")
    protected int universitySpecialitiesLicenseCount;
    @XmlElement(name = "UniversitySpecialitiesContractCount")
    protected int universitySpecialitiesContractCount;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "UniversitySpecialitiesOldBudjetCountCount")
    protected int universitySpecialitiesOldBudjetCountCount;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "DurationEducation")
    protected String durationEducation;
    @XmlElement(name = "UniversitySpecialitiesLicenseCountOld")
    protected int universitySpecialitiesLicenseCountOld;
    @XmlElement(name = "EducationDateBegin")
    protected String educationDateBegin;
    @XmlElement(name = "EducationDateEnd")
    protected String educationDateEnd;
    @XmlElement(name = "IsSecondEducation")
    protected int isSecondEducation;

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
     * Gets the value of the universitySpecialitiesDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesDateBegin() {
        return universitySpecialitiesDateBegin;
    }

    /**
     * Sets the value of the universitySpecialitiesDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesDateBegin(String value) {
        this.universitySpecialitiesDateBegin = value;
    }

    /**
     * Gets the value of the universitySpecialitiesDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesDateEnd() {
        return universitySpecialitiesDateEnd;
    }

    /**
     * Sets the value of the universitySpecialitiesDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesDateEnd(String value) {
        this.universitySpecialitiesDateEnd = value;
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
     * Gets the value of the universityFacultetKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKode() {
        return universityFacultetKode;
    }

    /**
     * Sets the value of the universityFacultetKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKode(String value) {
        this.universityFacultetKode = value;
    }

    /**
     * Gets the value of the specCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     * Sets the value of the specCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecCode(String value) {
        this.specCode = value;
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
     * Gets the value of the idPersonRequestSeasonDetails property.
     * 
     */
    public int getIdPersonRequestSeasonDetails() {
        return idPersonRequestSeasonDetails;
    }

    /**
     * Sets the value of the idPersonRequestSeasonDetails property.
     * 
     */
    public void setIdPersonRequestSeasonDetails(int value) {
        this.idPersonRequestSeasonDetails = value;
    }

    /**
     * Gets the value of the universitySpecialitiesLicenseCount property.
     * 
     */
    public int getUniversitySpecialitiesLicenseCount() {
        return universitySpecialitiesLicenseCount;
    }

    /**
     * Sets the value of the universitySpecialitiesLicenseCount property.
     * 
     */
    public void setUniversitySpecialitiesLicenseCount(int value) {
        this.universitySpecialitiesLicenseCount = value;
    }

    /**
     * Gets the value of the universitySpecialitiesContractCount property.
     * 
     */
    public int getUniversitySpecialitiesContractCount() {
        return universitySpecialitiesContractCount;
    }

    /**
     * Sets the value of the universitySpecialitiesContractCount property.
     * 
     */
    public void setUniversitySpecialitiesContractCount(int value) {
        this.universitySpecialitiesContractCount = value;
    }

    /**
     * Gets the value of the idQualification property.
     * 
     */
    public int getIdQualification() {
        return idQualification;
    }

    /**
     * Sets the value of the idQualification property.
     * 
     */
    public void setIdQualification(int value) {
        this.idQualification = value;
    }

    /**
     * Gets the value of the universitySpecialitiesOldBudjetCountCount property.
     * 
     */
    public int getUniversitySpecialitiesOldBudjetCountCount() {
        return universitySpecialitiesOldBudjetCountCount;
    }

    /**
     * Sets the value of the universitySpecialitiesOldBudjetCountCount property.
     * 
     */
    public void setUniversitySpecialitiesOldBudjetCountCount(int value) {
        this.universitySpecialitiesOldBudjetCountCount = value;
    }

    /**
     * Gets the value of the idCourse property.
     * 
     */
    public int getIdCourse() {
        return idCourse;
    }

    /**
     * Sets the value of the idCourse property.
     * 
     */
    public void setIdCourse(int value) {
        this.idCourse = value;
    }

    /**
     * Gets the value of the durationEducation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationEducation() {
        return durationEducation;
    }

    /**
     * Sets the value of the durationEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationEducation(String value) {
        this.durationEducation = value;
    }

    /**
     * Gets the value of the universitySpecialitiesLicenseCountOld property.
     * 
     */
    public int getUniversitySpecialitiesLicenseCountOld() {
        return universitySpecialitiesLicenseCountOld;
    }

    /**
     * Sets the value of the universitySpecialitiesLicenseCountOld property.
     * 
     */
    public void setUniversitySpecialitiesLicenseCountOld(int value) {
        this.universitySpecialitiesLicenseCountOld = value;
    }

    /**
     * Gets the value of the educationDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDateBegin() {
        return educationDateBegin;
    }

    /**
     * Sets the value of the educationDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDateBegin(String value) {
        this.educationDateBegin = value;
    }

    /**
     * Gets the value of the educationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDateEnd() {
        return educationDateEnd;
    }

    /**
     * Sets the value of the educationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDateEnd(String value) {
        this.educationDateEnd = value;
    }

    /**
     * Gets the value of the isSecondEducation property.
     * 
     */
    public int getIsSecondEducation() {
        return isSecondEducation;
    }

    /**
     * Sets the value of the isSecondEducation property.
     * 
     */
    public void setIsSecondEducation(int value) {
        this.isSecondEducation = value;
    }

}
