
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dProfessionUps complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dProfessionUps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationHistoryOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationHistoryOrdersNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryOrdersDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonEducationHistoryOrdersDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationHistoryTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationHistoryOrderStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationHistoryOrderStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicYearName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatorFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_Qualification_prof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm_prof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Course_prof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecProfessionCode_prof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession_CurRang_prof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession_NextRang_prof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecProfessionsRangType_prof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode_prof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityGroup_prof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityGroupShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionsRangTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionClassifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecProfessionsRangType_Next_prof" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecProfessionsRangTypeName_Next" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StudentsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dProfessionUps", propOrder = {
    "idPersonEducationHistoryOrders",
    "personEducationHistoryOrdersNumber",
    "personEducationHistoryOrdersDate",
    "personEducationHistoryOrdersDateLastChange",
    "universityKode",
    "idPersonEducationHistoryType",
    "personEducationHistoryTypeName",
    "personEducationHistoryTypeDescription",
    "idPersonEducationHistoryOrderStatus",
    "personEducationHistoryOrderStatusName",
    "idRegulationDocument",
    "isVerified",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "isExistFile",
    "academicYearName",
    "operatorFIO",
    "idAcademicYear",
    "idUser",
    "regulationDocumentVerificationHistoryDateLastChange",
    "idQualificationProf",
    "idPersonEducationFormProf",
    "idCourseProf",
    "specProfessionCodeProf",
    "specProfessionCurRangProf",
    "specProfessionNextRangProf",
    "idSpecProfessionsRangTypeProf",
    "universityFacultetKodeProf",
    "idUniversityGroupProf",
    "universityFacultetFullName",
    "universityGroupFullName",
    "universityGroupShortName",
    "specProfessionsRangTypeName",
    "specProfessionClassifierCode",
    "specProfessionName",
    "courseName",
    "personEducationFormName",
    "qualificationName",
    "idSpecProfessionsRangTypeNextProf",
    "specProfessionsRangTypeNameNext",
    "studentsCount"
})
public class DProfessionUps {

    @XmlElement(name = "Id_PersonEducationHistoryOrders")
    protected int idPersonEducationHistoryOrders;
    @XmlElement(name = "PersonEducationHistoryOrdersNumber")
    protected String personEducationHistoryOrdersNumber;
    @XmlElement(name = "PersonEducationHistoryOrdersDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationHistoryOrdersDate;
    @XmlElement(name = "PersonEducationHistoryOrdersDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personEducationHistoryOrdersDateLastChange;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_PersonEducationHistoryType")
    protected int idPersonEducationHistoryType;
    @XmlElement(name = "PersonEducationHistoryTypeName")
    protected String personEducationHistoryTypeName;
    @XmlElement(name = "PersonEducationHistoryTypeDescription")
    protected String personEducationHistoryTypeDescription;
    @XmlElement(name = "Id_PersonEducationHistoryOrderStatus")
    protected int idPersonEducationHistoryOrderStatus;
    @XmlElement(name = "PersonEducationHistoryOrderStatusName")
    protected String personEducationHistoryOrderStatusName;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "IsVerified")
    protected int isVerified;
    @XmlElement(name = "Id_RegulationDocumentVerificationHistoryType")
    protected int idRegulationDocumentVerificationHistoryType;
    @XmlElement(name = "RegulationDocumentVerificationHistoryTypeName")
    protected String regulationDocumentVerificationHistoryTypeName;
    @XmlElement(name = "IsExistFile")
    protected int isExistFile;
    @XmlElement(name = "AcademicYearName")
    protected String academicYearName;
    @XmlElement(name = "OperatorFIO")
    protected String operatorFIO;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "RegulationDocumentVerificationHistoryDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regulationDocumentVerificationHistoryDateLastChange;
    @XmlElement(name = "Id_Qualification_prof")
    protected int idQualificationProf;
    @XmlElement(name = "Id_PersonEducationForm_prof")
    protected int idPersonEducationFormProf;
    @XmlElement(name = "Id_Course_prof")
    protected int idCourseProf;
    @XmlElement(name = "SpecProfessionCode_prof")
    protected String specProfessionCodeProf;
    @XmlElement(name = "SpecProfession_CurRang_prof")
    protected String specProfessionCurRangProf;
    @XmlElement(name = "SpecProfession_NextRang_prof")
    protected String specProfessionNextRangProf;
    @XmlElement(name = "Id_SpecProfessionsRangType_prof")
    protected int idSpecProfessionsRangTypeProf;
    @XmlElement(name = "UniversityFacultetKode_prof")
    protected String universityFacultetKodeProf;
    @XmlElement(name = "Id_UniversityGroup_prof")
    protected int idUniversityGroupProf;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "UniversityGroupFullName")
    protected String universityGroupFullName;
    @XmlElement(name = "UniversityGroupShortName")
    protected String universityGroupShortName;
    @XmlElement(name = "SpecProfessionsRangTypeName")
    protected String specProfessionsRangTypeName;
    @XmlElement(name = "SpecProfessionClassifierCode")
    protected String specProfessionClassifierCode;
    @XmlElement(name = "SpecProfessionName")
    protected String specProfessionName;
    @XmlElement(name = "CourseName")
    protected String courseName;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "Id_SpecProfessionsRangType_Next_prof")
    protected int idSpecProfessionsRangTypeNextProf;
    @XmlElement(name = "SpecProfessionsRangTypeName_Next")
    protected String specProfessionsRangTypeNameNext;
    @XmlElement(name = "StudentsCount")
    protected int studentsCount;

    /**
     * Gets the value of the idPersonEducationHistoryOrders property.
     * 
     */
    public int getIdPersonEducationHistoryOrders() {
        return idPersonEducationHistoryOrders;
    }

    /**
     * Sets the value of the idPersonEducationHistoryOrders property.
     * 
     */
    public void setIdPersonEducationHistoryOrders(int value) {
        this.idPersonEducationHistoryOrders = value;
    }

    /**
     * Gets the value of the personEducationHistoryOrdersNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryOrdersNumber() {
        return personEducationHistoryOrdersNumber;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryOrdersNumber(String value) {
        this.personEducationHistoryOrdersNumber = value;
    }

    /**
     * Gets the value of the personEducationHistoryOrdersDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonEducationHistoryOrdersDate() {
        return personEducationHistoryOrdersDate;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonEducationHistoryOrdersDate(XMLGregorianCalendar value) {
        this.personEducationHistoryOrdersDate = value;
    }

    /**
     * Gets the value of the personEducationHistoryOrdersDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonEducationHistoryOrdersDateLastChange() {
        return personEducationHistoryOrdersDateLastChange;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonEducationHistoryOrdersDateLastChange(XMLGregorianCalendar value) {
        this.personEducationHistoryOrdersDateLastChange = value;
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
     * Gets the value of the idPersonEducationHistoryType property.
     * 
     */
    public int getIdPersonEducationHistoryType() {
        return idPersonEducationHistoryType;
    }

    /**
     * Sets the value of the idPersonEducationHistoryType property.
     * 
     */
    public void setIdPersonEducationHistoryType(int value) {
        this.idPersonEducationHistoryType = value;
    }

    /**
     * Gets the value of the personEducationHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryTypeName() {
        return personEducationHistoryTypeName;
    }

    /**
     * Sets the value of the personEducationHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryTypeName(String value) {
        this.personEducationHistoryTypeName = value;
    }

    /**
     * Gets the value of the personEducationHistoryTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryTypeDescription() {
        return personEducationHistoryTypeDescription;
    }

    /**
     * Sets the value of the personEducationHistoryTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryTypeDescription(String value) {
        this.personEducationHistoryTypeDescription = value;
    }

    /**
     * Gets the value of the idPersonEducationHistoryOrderStatus property.
     * 
     */
    public int getIdPersonEducationHistoryOrderStatus() {
        return idPersonEducationHistoryOrderStatus;
    }

    /**
     * Sets the value of the idPersonEducationHistoryOrderStatus property.
     * 
     */
    public void setIdPersonEducationHistoryOrderStatus(int value) {
        this.idPersonEducationHistoryOrderStatus = value;
    }

    /**
     * Gets the value of the personEducationHistoryOrderStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryOrderStatusName() {
        return personEducationHistoryOrderStatusName;
    }

    /**
     * Sets the value of the personEducationHistoryOrderStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryOrderStatusName(String value) {
        this.personEducationHistoryOrderStatusName = value;
    }

    /**
     * Gets the value of the idRegulationDocument property.
     * 
     */
    public int getIdRegulationDocument() {
        return idRegulationDocument;
    }

    /**
     * Sets the value of the idRegulationDocument property.
     * 
     */
    public void setIdRegulationDocument(int value) {
        this.idRegulationDocument = value;
    }

    /**
     * Gets the value of the isVerified property.
     * 
     */
    public int getIsVerified() {
        return isVerified;
    }

    /**
     * Sets the value of the isVerified property.
     * 
     */
    public void setIsVerified(int value) {
        this.isVerified = value;
    }

    /**
     * Gets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public int getIdRegulationDocumentVerificationHistoryType() {
        return idRegulationDocumentVerificationHistoryType;
    }

    /**
     * Sets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public void setIdRegulationDocumentVerificationHistoryType(int value) {
        this.idRegulationDocumentVerificationHistoryType = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentVerificationHistoryTypeName() {
        return regulationDocumentVerificationHistoryTypeName;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentVerificationHistoryTypeName(String value) {
        this.regulationDocumentVerificationHistoryTypeName = value;
    }

    /**
     * Gets the value of the isExistFile property.
     * 
     */
    public int getIsExistFile() {
        return isExistFile;
    }

    /**
     * Sets the value of the isExistFile property.
     * 
     */
    public void setIsExistFile(int value) {
        this.isExistFile = value;
    }

    /**
     * Gets the value of the academicYearName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicYearName() {
        return academicYearName;
    }

    /**
     * Sets the value of the academicYearName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicYearName(String value) {
        this.academicYearName = value;
    }

    /**
     * Gets the value of the operatorFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorFIO() {
        return operatorFIO;
    }

    /**
     * Sets the value of the operatorFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorFIO(String value) {
        this.operatorFIO = value;
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
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegulationDocumentVerificationHistoryDateLastChange() {
        return regulationDocumentVerificationHistoryDateLastChange;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegulationDocumentVerificationHistoryDateLastChange(XMLGregorianCalendar value) {
        this.regulationDocumentVerificationHistoryDateLastChange = value;
    }

    /**
     * Gets the value of the idQualificationProf property.
     * 
     */
    public int getIdQualificationProf() {
        return idQualificationProf;
    }

    /**
     * Sets the value of the idQualificationProf property.
     * 
     */
    public void setIdQualificationProf(int value) {
        this.idQualificationProf = value;
    }

    /**
     * Gets the value of the idPersonEducationFormProf property.
     * 
     */
    public int getIdPersonEducationFormProf() {
        return idPersonEducationFormProf;
    }

    /**
     * Sets the value of the idPersonEducationFormProf property.
     * 
     */
    public void setIdPersonEducationFormProf(int value) {
        this.idPersonEducationFormProf = value;
    }

    /**
     * Gets the value of the idCourseProf property.
     * 
     */
    public int getIdCourseProf() {
        return idCourseProf;
    }

    /**
     * Sets the value of the idCourseProf property.
     * 
     */
    public void setIdCourseProf(int value) {
        this.idCourseProf = value;
    }

    /**
     * Gets the value of the specProfessionCodeProf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCodeProf() {
        return specProfessionCodeProf;
    }

    /**
     * Sets the value of the specProfessionCodeProf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCodeProf(String value) {
        this.specProfessionCodeProf = value;
    }

    /**
     * Gets the value of the specProfessionCurRangProf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCurRangProf() {
        return specProfessionCurRangProf;
    }

    /**
     * Sets the value of the specProfessionCurRangProf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCurRangProf(String value) {
        this.specProfessionCurRangProf = value;
    }

    /**
     * Gets the value of the specProfessionNextRangProf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionNextRangProf() {
        return specProfessionNextRangProf;
    }

    /**
     * Sets the value of the specProfessionNextRangProf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionNextRangProf(String value) {
        this.specProfessionNextRangProf = value;
    }

    /**
     * Gets the value of the idSpecProfessionsRangTypeProf property.
     * 
     */
    public int getIdSpecProfessionsRangTypeProf() {
        return idSpecProfessionsRangTypeProf;
    }

    /**
     * Sets the value of the idSpecProfessionsRangTypeProf property.
     * 
     */
    public void setIdSpecProfessionsRangTypeProf(int value) {
        this.idSpecProfessionsRangTypeProf = value;
    }

    /**
     * Gets the value of the universityFacultetKodeProf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKodeProf() {
        return universityFacultetKodeProf;
    }

    /**
     * Sets the value of the universityFacultetKodeProf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKodeProf(String value) {
        this.universityFacultetKodeProf = value;
    }

    /**
     * Gets the value of the idUniversityGroupProf property.
     * 
     */
    public int getIdUniversityGroupProf() {
        return idUniversityGroupProf;
    }

    /**
     * Sets the value of the idUniversityGroupProf property.
     * 
     */
    public void setIdUniversityGroupProf(int value) {
        this.idUniversityGroupProf = value;
    }

    /**
     * Gets the value of the universityFacultetFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetFullName() {
        return universityFacultetFullName;
    }

    /**
     * Sets the value of the universityFacultetFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetFullName(String value) {
        this.universityFacultetFullName = value;
    }

    /**
     * Gets the value of the universityGroupFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupFullName() {
        return universityGroupFullName;
    }

    /**
     * Sets the value of the universityGroupFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupFullName(String value) {
        this.universityGroupFullName = value;
    }

    /**
     * Gets the value of the universityGroupShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGroupShortName() {
        return universityGroupShortName;
    }

    /**
     * Sets the value of the universityGroupShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGroupShortName(String value) {
        this.universityGroupShortName = value;
    }

    /**
     * Gets the value of the specProfessionsRangTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionsRangTypeName() {
        return specProfessionsRangTypeName;
    }

    /**
     * Sets the value of the specProfessionsRangTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionsRangTypeName(String value) {
        this.specProfessionsRangTypeName = value;
    }

    /**
     * Gets the value of the specProfessionClassifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionClassifierCode() {
        return specProfessionClassifierCode;
    }

    /**
     * Sets the value of the specProfessionClassifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionClassifierCode(String value) {
        this.specProfessionClassifierCode = value;
    }

    /**
     * Gets the value of the specProfessionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionName() {
        return specProfessionName;
    }

    /**
     * Sets the value of the specProfessionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionName(String value) {
        this.specProfessionName = value;
    }

    /**
     * Gets the value of the courseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Sets the value of the courseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseName(String value) {
        this.courseName = value;
    }

    /**
     * Gets the value of the personEducationFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationFormName() {
        return personEducationFormName;
    }

    /**
     * Sets the value of the personEducationFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationFormName(String value) {
        this.personEducationFormName = value;
    }

    /**
     * Gets the value of the qualificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationName() {
        return qualificationName;
    }

    /**
     * Sets the value of the qualificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationName(String value) {
        this.qualificationName = value;
    }

    /**
     * Gets the value of the idSpecProfessionsRangTypeNextProf property.
     * 
     */
    public int getIdSpecProfessionsRangTypeNextProf() {
        return idSpecProfessionsRangTypeNextProf;
    }

    /**
     * Sets the value of the idSpecProfessionsRangTypeNextProf property.
     * 
     */
    public void setIdSpecProfessionsRangTypeNextProf(int value) {
        this.idSpecProfessionsRangTypeNextProf = value;
    }

    /**
     * Gets the value of the specProfessionsRangTypeNameNext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionsRangTypeNameNext() {
        return specProfessionsRangTypeNameNext;
    }

    /**
     * Sets the value of the specProfessionsRangTypeNameNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionsRangTypeNameNext(String value) {
        this.specProfessionsRangTypeNameNext = value;
    }

    /**
     * Gets the value of the studentsCount property.
     * 
     */
    public int getStudentsCount() {
        return studentsCount;
    }

    /**
     * Sets the value of the studentsCount property.
     * 
     */
    public void setStudentsCount(int value) {
        this.studentsCount = value;
    }

}
