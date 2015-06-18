
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityLicenseCertificateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicenseCertificateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicenseCertificateData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicenseCertificate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsPerepidgotovka" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsTeacher" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityLicenseCertificateData", propOrder = {
    "idUniversityLicenseCertificateData",
    "idUniversityLicenseCertificate",
    "idQualificationGroup",
    "qualificationGroupName",
    "specDirectionsCode",
    "specSpecialityCode",
    "specSpecializationName",
    "specDirCode",
    "specDirName",
    "isPerepidgotovka",
    "isTeacher"
})
public class DUniversityLicenseCertificateData {

    @XmlElement(name = "Id_UniversityLicenseCertificateData")
    protected int idUniversityLicenseCertificateData;
    @XmlElement(name = "Id_UniversityLicenseCertificate")
    protected int idUniversityLicenseCertificate;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;
    @XmlElement(name = "QualificationGroupName")
    protected String qualificationGroupName;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "SpecSpecializationName")
    protected String specSpecializationName;
    @XmlElement(name = "SpecDirCode")
    protected String specDirCode;
    @XmlElement(name = "SpecDirName")
    protected String specDirName;
    @XmlElement(name = "IsPerepidgotovka")
    protected int isPerepidgotovka;
    @XmlElement(name = "IsTeacher")
    protected int isTeacher;

    /**
     * Gets the value of the idUniversityLicenseCertificateData property.
     * 
     */
    public int getIdUniversityLicenseCertificateData() {
        return idUniversityLicenseCertificateData;
    }

    /**
     * Sets the value of the idUniversityLicenseCertificateData property.
     * 
     */
    public void setIdUniversityLicenseCertificateData(int value) {
        this.idUniversityLicenseCertificateData = value;
    }

    /**
     * Gets the value of the idUniversityLicenseCertificate property.
     * 
     */
    public int getIdUniversityLicenseCertificate() {
        return idUniversityLicenseCertificate;
    }

    /**
     * Sets the value of the idUniversityLicenseCertificate property.
     * 
     */
    public void setIdUniversityLicenseCertificate(int value) {
        this.idUniversityLicenseCertificate = value;
    }

    /**
     * Gets the value of the idQualificationGroup property.
     * 
     */
    public int getIdQualificationGroup() {
        return idQualificationGroup;
    }

    /**
     * Sets the value of the idQualificationGroup property.
     * 
     */
    public void setIdQualificationGroup(int value) {
        this.idQualificationGroup = value;
    }

    /**
     * Gets the value of the qualificationGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationGroupName() {
        return qualificationGroupName;
    }

    /**
     * Sets the value of the qualificationGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationGroupName(String value) {
        this.qualificationGroupName = value;
    }

    /**
     * Gets the value of the specDirectionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionsCode() {
        return specDirectionsCode;
    }

    /**
     * Sets the value of the specDirectionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionsCode(String value) {
        this.specDirectionsCode = value;
    }

    /**
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
    }

    /**
     * Gets the value of the specSpecializationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecializationName() {
        return specSpecializationName;
    }

    /**
     * Sets the value of the specSpecializationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecializationName(String value) {
        this.specSpecializationName = value;
    }

    /**
     * Gets the value of the specDirCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirCode() {
        return specDirCode;
    }

    /**
     * Sets the value of the specDirCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirCode(String value) {
        this.specDirCode = value;
    }

    /**
     * Gets the value of the specDirName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirName() {
        return specDirName;
    }

    /**
     * Sets the value of the specDirName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirName(String value) {
        this.specDirName = value;
    }

    /**
     * Gets the value of the isPerepidgotovka property.
     * 
     */
    public int getIsPerepidgotovka() {
        return isPerepidgotovka;
    }

    /**
     * Sets the value of the isPerepidgotovka property.
     * 
     */
    public void setIsPerepidgotovka(int value) {
        this.isPerepidgotovka = value;
    }

    /**
     * Gets the value of the isTeacher property.
     * 
     */
    public int getIsTeacher() {
        return isTeacher;
    }

    /**
     * Sets the value of the isTeacher property.
     * 
     */
    public void setIsTeacher(int value) {
        this.isTeacher = value;
    }

}
