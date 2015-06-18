
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
 *         &lt;element name="UniversitySpecialitiesKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesLicenseCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesContractCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesOldBudjetCountCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DurationEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesLicenseCountOld" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsSecondEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitySpecialitiesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsRefill" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universitySpecialitiesKode",
    "universitySpecialitiesLicenseCount",
    "universitySpecialitiesContractCount",
    "universityFacultetKode",
    "universitySpecialitiesOldBudjetCountCount",
    "idCourse",
    "durationEducation",
    "universitySpecialitiesLicenseCountOld",
    "educationDateBegin",
    "educationDateEnd",
    "isSecondEducation",
    "universitySpecialitiesName",
    "isRefill"
})
@XmlRootElement(name = "UniversityFacultetSpecialityValueChange")
public class UniversityFacultetSpecialityValueChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversitySpecialitiesKode")
    protected String universitySpecialitiesKode;
    @XmlElement(name = "UniversitySpecialitiesLicenseCount")
    protected int universitySpecialitiesLicenseCount;
    @XmlElement(name = "UniversitySpecialitiesContractCount")
    protected int universitySpecialitiesContractCount;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
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
    @XmlElement(name = "UniversitySpecialitiesName")
    protected String universitySpecialitiesName;
    @XmlElement(name = "IsRefill")
    protected int isRefill;

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

    /**
     * Gets the value of the universitySpecialitiesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitySpecialitiesName() {
        return universitySpecialitiesName;
    }

    /**
     * Sets the value of the universitySpecialitiesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitySpecialitiesName(String value) {
        this.universitySpecialitiesName = value;
    }

    /**
     * Gets the value of the isRefill property.
     * 
     */
    public int getIsRefill() {
        return isRefill;
    }

    /**
     * Sets the value of the isRefill property.
     * 
     */
    public void setIsRefill(int value) {
        this.isRefill = value;
    }

}
