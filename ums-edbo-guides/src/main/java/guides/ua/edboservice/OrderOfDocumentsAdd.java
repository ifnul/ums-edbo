
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
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfDocumentDataGive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfDocumentDataExpires" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfDocumenDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OrderOfDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequests" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitySpecialitiesKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfDocumentDataEndEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualificationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBenefits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfDocumentRenewType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Bank" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DocumentChipSeriesType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DocumentsBlnakTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_DocumentsPaymentSystemType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecProfessionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecProfessionsRangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationLevelEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "universityFacultetKode",
    "idUniversityGroup",
    "idPersonDocumentType",
    "idPersonEducationForm",
    "orderOfDocumentDataGive",
    "orderOfDocumentDataExpires",
    "orderOfDocumenDescription",
    "universityKode",
    "idOrderOfDocumentType",
    "idPersonRequests",
    "universitySpecialitiesKode",
    "idCourse",
    "specDirectionsCode",
    "specSpecialityCode",
    "orderOfDocumentDataEndEducation",
    "idPersonEducations",
    "qualificationLevel",
    "isBenefits",
    "idAcademicYear",
    "idOrderOfDocumentRenewType",
    "idBank",
    "idDocumentChipSeriesType",
    "idDocumentsBlnakTypes",
    "idDocumentsPaymentSystemType",
    "specProfessionCode",
    "idRang",
    "idSpecProfessionsRangType",
    "qualificationLevelEn"
})
@XmlRootElement(name = "OrderOfDocumentsAdd")
public class OrderOfDocumentsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Id_UniversityGroup")
    protected int idUniversityGroup;
    @XmlElement(name = "Id_PersonDocumentType")
    protected int idPersonDocumentType;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "OrderOfDocumentDataGive")
    protected String orderOfDocumentDataGive;
    @XmlElement(name = "OrderOfDocumentDataExpires")
    protected String orderOfDocumentDataExpires;
    @XmlElement(name = "OrderOfDocumenDescription")
    protected String orderOfDocumenDescription;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_OrderOfDocumentType")
    protected int idOrderOfDocumentType;
    @XmlElement(name = "Id_PersonRequests")
    protected String idPersonRequests;
    @XmlElement(name = "UniversitySpecialitiesKode")
    protected String universitySpecialitiesKode;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "OrderOfDocumentDataEndEducation")
    protected String orderOfDocumentDataEndEducation;
    @XmlElement(name = "Id_PersonEducations")
    protected String idPersonEducations;
    @XmlElement(name = "QualificationLevel")
    protected String qualificationLevel;
    @XmlElement(name = "IsBenefits")
    protected int isBenefits;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "Id_OrderOfDocumentRenewType")
    protected int idOrderOfDocumentRenewType;
    @XmlElement(name = "Id_Bank")
    protected int idBank;
    @XmlElement(name = "Id_DocumentChipSeriesType")
    protected int idDocumentChipSeriesType;
    @XmlElement(name = "Id_DocumentsBlnakTypes")
    protected int idDocumentsBlnakTypes;
    @XmlElement(name = "Id_DocumentsPaymentSystemType")
    protected int idDocumentsPaymentSystemType;
    @XmlElement(name = "SpecProfessionCode")
    protected String specProfessionCode;
    @XmlElement(name = "Id_Rang")
    protected String idRang;
    @XmlElement(name = "Id_SpecProfessionsRangType")
    protected int idSpecProfessionsRangType;
    @XmlElement(name = "QualificationLevelEn")
    protected String qualificationLevelEn;

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
     * Gets the value of the idUniversityGroup property.
     * 
     */
    public int getIdUniversityGroup() {
        return idUniversityGroup;
    }

    /**
     * Sets the value of the idUniversityGroup property.
     * 
     */
    public void setIdUniversityGroup(int value) {
        this.idUniversityGroup = value;
    }

    /**
     * Gets the value of the idPersonDocumentType property.
     * 
     */
    public int getIdPersonDocumentType() {
        return idPersonDocumentType;
    }

    /**
     * Sets the value of the idPersonDocumentType property.
     * 
     */
    public void setIdPersonDocumentType(int value) {
        this.idPersonDocumentType = value;
    }

    /**
     * Gets the value of the idPersonEducationForm property.
     * 
     */
    public int getIdPersonEducationForm() {
        return idPersonEducationForm;
    }

    /**
     * Sets the value of the idPersonEducationForm property.
     * 
     */
    public void setIdPersonEducationForm(int value) {
        this.idPersonEducationForm = value;
    }

    /**
     * Gets the value of the orderOfDocumentDataGive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentDataGive() {
        return orderOfDocumentDataGive;
    }

    /**
     * Sets the value of the orderOfDocumentDataGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentDataGive(String value) {
        this.orderOfDocumentDataGive = value;
    }

    /**
     * Gets the value of the orderOfDocumentDataExpires property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentDataExpires() {
        return orderOfDocumentDataExpires;
    }

    /**
     * Sets the value of the orderOfDocumentDataExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentDataExpires(String value) {
        this.orderOfDocumentDataExpires = value;
    }

    /**
     * Gets the value of the orderOfDocumenDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumenDescription() {
        return orderOfDocumenDescription;
    }

    /**
     * Sets the value of the orderOfDocumenDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumenDescription(String value) {
        this.orderOfDocumenDescription = value;
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
     * Gets the value of the idOrderOfDocumentType property.
     * 
     */
    public int getIdOrderOfDocumentType() {
        return idOrderOfDocumentType;
    }

    /**
     * Sets the value of the idOrderOfDocumentType property.
     * 
     */
    public void setIdOrderOfDocumentType(int value) {
        this.idOrderOfDocumentType = value;
    }

    /**
     * Gets the value of the idPersonRequests property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPersonRequests() {
        return idPersonRequests;
    }

    /**
     * Sets the value of the idPersonRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPersonRequests(String value) {
        this.idPersonRequests = value;
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
     * Gets the value of the orderOfDocumentDataEndEducation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentDataEndEducation() {
        return orderOfDocumentDataEndEducation;
    }

    /**
     * Sets the value of the orderOfDocumentDataEndEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentDataEndEducation(String value) {
        this.orderOfDocumentDataEndEducation = value;
    }

    /**
     * Gets the value of the idPersonEducations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPersonEducations() {
        return idPersonEducations;
    }

    /**
     * Sets the value of the idPersonEducations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPersonEducations(String value) {
        this.idPersonEducations = value;
    }

    /**
     * Gets the value of the qualificationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationLevel() {
        return qualificationLevel;
    }

    /**
     * Sets the value of the qualificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationLevel(String value) {
        this.qualificationLevel = value;
    }

    /**
     * Gets the value of the isBenefits property.
     * 
     */
    public int getIsBenefits() {
        return isBenefits;
    }

    /**
     * Sets the value of the isBenefits property.
     * 
     */
    public void setIsBenefits(int value) {
        this.isBenefits = value;
    }

    /**
     * Gets the value of the idAcademicYear property.
     * 
     */
    public int getIdAcademicYear() {
        return idAcademicYear;
    }

    /**
     * Sets the value of the idAcademicYear property.
     * 
     */
    public void setIdAcademicYear(int value) {
        this.idAcademicYear = value;
    }

    /**
     * Gets the value of the idOrderOfDocumentRenewType property.
     * 
     */
    public int getIdOrderOfDocumentRenewType() {
        return idOrderOfDocumentRenewType;
    }

    /**
     * Sets the value of the idOrderOfDocumentRenewType property.
     * 
     */
    public void setIdOrderOfDocumentRenewType(int value) {
        this.idOrderOfDocumentRenewType = value;
    }

    /**
     * Gets the value of the idBank property.
     * 
     */
    public int getIdBank() {
        return idBank;
    }

    /**
     * Sets the value of the idBank property.
     * 
     */
    public void setIdBank(int value) {
        this.idBank = value;
    }

    /**
     * Gets the value of the idDocumentChipSeriesType property.
     * 
     */
    public int getIdDocumentChipSeriesType() {
        return idDocumentChipSeriesType;
    }

    /**
     * Sets the value of the idDocumentChipSeriesType property.
     * 
     */
    public void setIdDocumentChipSeriesType(int value) {
        this.idDocumentChipSeriesType = value;
    }

    /**
     * Gets the value of the idDocumentsBlnakTypes property.
     * 
     */
    public int getIdDocumentsBlnakTypes() {
        return idDocumentsBlnakTypes;
    }

    /**
     * Sets the value of the idDocumentsBlnakTypes property.
     * 
     */
    public void setIdDocumentsBlnakTypes(int value) {
        this.idDocumentsBlnakTypes = value;
    }

    /**
     * Gets the value of the idDocumentsPaymentSystemType property.
     * 
     */
    public int getIdDocumentsPaymentSystemType() {
        return idDocumentsPaymentSystemType;
    }

    /**
     * Sets the value of the idDocumentsPaymentSystemType property.
     * 
     */
    public void setIdDocumentsPaymentSystemType(int value) {
        this.idDocumentsPaymentSystemType = value;
    }

    /**
     * Gets the value of the specProfessionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCode() {
        return specProfessionCode;
    }

    /**
     * Sets the value of the specProfessionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCode(String value) {
        this.specProfessionCode = value;
    }

    /**
     * Gets the value of the idRang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRang() {
        return idRang;
    }

    /**
     * Sets the value of the idRang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRang(String value) {
        this.idRang = value;
    }

    /**
     * Gets the value of the idSpecProfessionsRangType property.
     * 
     */
    public int getIdSpecProfessionsRangType() {
        return idSpecProfessionsRangType;
    }

    /**
     * Sets the value of the idSpecProfessionsRangType property.
     * 
     */
    public void setIdSpecProfessionsRangType(int value) {
        this.idSpecProfessionsRangType = value;
    }

    /**
     * Gets the value of the qualificationLevelEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationLevelEn() {
        return qualificationLevelEn;
    }

    /**
     * Sets the value of the qualificationLevelEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationLevelEn(String value) {
        this.qualificationLevelEn = value;
    }

}
