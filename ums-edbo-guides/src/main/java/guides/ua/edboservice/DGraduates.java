
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dGraduates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dGraduates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Graduate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GraduateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GraduateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GraduateDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_AcademicYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicYearName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Qualification" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYearBegin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicYearNameBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicYearEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicYearNameEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_CourseBegin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CourseNameBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_CourseEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CourseNameEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EducationDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EducationDuration" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SpecComplexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GraduatesQualificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GraduatesQualificationNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentDateGive" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Qalification_Prev_UK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qalification_Prev_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speciality_Prev_UK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speciality_Prev_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalIInfoSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalIInfoEnSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dGraduates", propOrder = {
    "idGraduate",
    "idEducationalCycles",
    "universityKode",
    "graduateDate",
    "graduateNumber",
    "graduateDateLastChange",
    "idAcademicYear",
    "academicYearName",
    "idCourse",
    "courseName",
    "docState",
    "universityFacultetKode",
    "universityFacultetFullName",
    "idQualification",
    "qualificationName",
    "idPersonEducationForm",
    "personEducationFormName",
    "specCode",
    "specDirectionsCode",
    "specClasifierCode",
    "specDirectionName",
    "specSpecialityCode",
    "specSpecialityClasifierCode",
    "specSpecialityName",
    "specScecializationCode",
    "specScecializationName",
    "idAcademicYearBegin",
    "academicYearNameBegin",
    "idAcademicYearEnd",
    "academicYearNameEnd",
    "idCourseBegin",
    "courseNameBegin",
    "idCourseEnd",
    "courseNameEnd",
    "educationDateBegin",
    "educationDateEnd",
    "educationDuration",
    "specComplexName",
    "graduatesQualificationName",
    "graduatesQualificationNameEn",
    "documentDateGive",
    "qalificationPrevUK",
    "qalificationPrevEN",
    "specialityPrevUK",
    "specialityPrevEN",
    "idUniversity",
    "universityFullName",
    "region",
    "additionalIInfoSmall",
    "additionalIInfoEnSmall"
})
public class DGraduates {

    @XmlElement(name = "Id_Graduate")
    protected int idGraduate;
    @XmlElement(name = "Id_EducationalCycles")
    protected int idEducationalCycles;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "GraduateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar graduateDate;
    @XmlElement(name = "GraduateNumber")
    protected String graduateNumber;
    @XmlElement(name = "GraduateDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar graduateDateLastChange;
    @XmlElement(name = "Id_AcademicYear")
    protected int idAcademicYear;
    @XmlElement(name = "AcademicYearName")
    protected String academicYearName;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "CourseName")
    protected String courseName;
    @XmlElement(name = "DocState")
    protected int docState;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "Id_Qualification")
    protected int idQualification;
    @XmlElement(name = "QualificationName")
    protected String qualificationName;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "SpecDirectionName")
    protected String specDirectionName;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "SpecSpecialityClasifierCode")
    protected String specSpecialityClasifierCode;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "SpecScecializationCode")
    protected String specScecializationCode;
    @XmlElement(name = "SpecScecializationName")
    protected String specScecializationName;
    @XmlElement(name = "Id_AcademicYearBegin")
    protected int idAcademicYearBegin;
    @XmlElement(name = "AcademicYearNameBegin")
    protected String academicYearNameBegin;
    @XmlElement(name = "Id_AcademicYearEnd")
    protected int idAcademicYearEnd;
    @XmlElement(name = "AcademicYearNameEnd")
    protected String academicYearNameEnd;
    @XmlElement(name = "Id_CourseBegin")
    protected int idCourseBegin;
    @XmlElement(name = "CourseNameBegin")
    protected String courseNameBegin;
    @XmlElement(name = "Id_CourseEnd")
    protected int idCourseEnd;
    @XmlElement(name = "CourseNameEnd")
    protected String courseNameEnd;
    @XmlElement(name = "EducationDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationDateBegin;
    @XmlElement(name = "EducationDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar educationDateEnd;
    @XmlElement(name = "EducationDuration", required = true)
    protected BigDecimal educationDuration;
    @XmlElement(name = "SpecComplexName")
    protected String specComplexName;
    @XmlElement(name = "GraduatesQualificationName")
    protected String graduatesQualificationName;
    @XmlElement(name = "GraduatesQualificationNameEn")
    protected String graduatesQualificationNameEn;
    @XmlElement(name = "DocumentDateGive", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar documentDateGive;
    @XmlElement(name = "Qalification_Prev_UK")
    protected String qalificationPrevUK;
    @XmlElement(name = "Qalification_Prev_EN")
    protected String qalificationPrevEN;
    @XmlElement(name = "Speciality_Prev_UK")
    protected String specialityPrevUK;
    @XmlElement(name = "Speciality_Prev_EN")
    protected String specialityPrevEN;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Region")
    protected String region;
    @XmlElement(name = "AdditionalIInfoSmall")
    protected String additionalIInfoSmall;
    @XmlElement(name = "AdditionalIInfoEnSmall")
    protected String additionalIInfoEnSmall;

    /**
     * Gets the value of the idGraduate property.
     * 
     */
    public int getIdGraduate() {
        return idGraduate;
    }

    /**
     * Sets the value of the idGraduate property.
     * 
     */
    public void setIdGraduate(int value) {
        this.idGraduate = value;
    }

    /**
     * Gets the value of the idEducationalCycles property.
     * 
     */
    public int getIdEducationalCycles() {
        return idEducationalCycles;
    }

    /**
     * Sets the value of the idEducationalCycles property.
     * 
     */
    public void setIdEducationalCycles(int value) {
        this.idEducationalCycles = value;
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
     * Gets the value of the graduateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGraduateDate() {
        return graduateDate;
    }

    /**
     * Sets the value of the graduateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGraduateDate(XMLGregorianCalendar value) {
        this.graduateDate = value;
    }

    /**
     * Gets the value of the graduateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduateNumber() {
        return graduateNumber;
    }

    /**
     * Sets the value of the graduateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduateNumber(String value) {
        this.graduateNumber = value;
    }

    /**
     * Gets the value of the graduateDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGraduateDateLastChange() {
        return graduateDateLastChange;
    }

    /**
     * Sets the value of the graduateDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGraduateDateLastChange(XMLGregorianCalendar value) {
        this.graduateDateLastChange = value;
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
     * Gets the value of the docState property.
     * 
     */
    public int getDocState() {
        return docState;
    }

    /**
     * Sets the value of the docState property.
     * 
     */
    public void setDocState(int value) {
        this.docState = value;
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
     * Gets the value of the specClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecClasifierCode() {
        return specClasifierCode;
    }

    /**
     * Sets the value of the specClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecClasifierCode(String value) {
        this.specClasifierCode = value;
    }

    /**
     * Gets the value of the specDirectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionName() {
        return specDirectionName;
    }

    /**
     * Sets the value of the specDirectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionName(String value) {
        this.specDirectionName = value;
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
     * Gets the value of the specSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityClasifierCode() {
        return specSpecialityClasifierCode;
    }

    /**
     * Sets the value of the specSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityClasifierCode(String value) {
        this.specSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the specSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityName() {
        return specSpecialityName;
    }

    /**
     * Sets the value of the specSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityName(String value) {
        this.specSpecialityName = value;
    }

    /**
     * Gets the value of the specScecializationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationCode() {
        return specScecializationCode;
    }

    /**
     * Sets the value of the specScecializationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationCode(String value) {
        this.specScecializationCode = value;
    }

    /**
     * Gets the value of the specScecializationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecScecializationName() {
        return specScecializationName;
    }

    /**
     * Sets the value of the specScecializationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecScecializationName(String value) {
        this.specScecializationName = value;
    }

    /**
     * Gets the value of the idAcademicYearBegin property.
     * 
     */
    public int getIdAcademicYearBegin() {
        return idAcademicYearBegin;
    }

    /**
     * Sets the value of the idAcademicYearBegin property.
     * 
     */
    public void setIdAcademicYearBegin(int value) {
        this.idAcademicYearBegin = value;
    }

    /**
     * Gets the value of the academicYearNameBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicYearNameBegin() {
        return academicYearNameBegin;
    }

    /**
     * Sets the value of the academicYearNameBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicYearNameBegin(String value) {
        this.academicYearNameBegin = value;
    }

    /**
     * Gets the value of the idAcademicYearEnd property.
     * 
     */
    public int getIdAcademicYearEnd() {
        return idAcademicYearEnd;
    }

    /**
     * Sets the value of the idAcademicYearEnd property.
     * 
     */
    public void setIdAcademicYearEnd(int value) {
        this.idAcademicYearEnd = value;
    }

    /**
     * Gets the value of the academicYearNameEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicYearNameEnd() {
        return academicYearNameEnd;
    }

    /**
     * Sets the value of the academicYearNameEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicYearNameEnd(String value) {
        this.academicYearNameEnd = value;
    }

    /**
     * Gets the value of the idCourseBegin property.
     * 
     */
    public int getIdCourseBegin() {
        return idCourseBegin;
    }

    /**
     * Sets the value of the idCourseBegin property.
     * 
     */
    public void setIdCourseBegin(int value) {
        this.idCourseBegin = value;
    }

    /**
     * Gets the value of the courseNameBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseNameBegin() {
        return courseNameBegin;
    }

    /**
     * Sets the value of the courseNameBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseNameBegin(String value) {
        this.courseNameBegin = value;
    }

    /**
     * Gets the value of the idCourseEnd property.
     * 
     */
    public int getIdCourseEnd() {
        return idCourseEnd;
    }

    /**
     * Sets the value of the idCourseEnd property.
     * 
     */
    public void setIdCourseEnd(int value) {
        this.idCourseEnd = value;
    }

    /**
     * Gets the value of the courseNameEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseNameEnd() {
        return courseNameEnd;
    }

    /**
     * Sets the value of the courseNameEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseNameEnd(String value) {
        this.courseNameEnd = value;
    }

    /**
     * Gets the value of the educationDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationDateBegin() {
        return educationDateBegin;
    }

    /**
     * Sets the value of the educationDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationDateBegin(XMLGregorianCalendar value) {
        this.educationDateBegin = value;
    }

    /**
     * Gets the value of the educationDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEducationDateEnd() {
        return educationDateEnd;
    }

    /**
     * Sets the value of the educationDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEducationDateEnd(XMLGregorianCalendar value) {
        this.educationDateEnd = value;
    }

    /**
     * Gets the value of the educationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEducationDuration() {
        return educationDuration;
    }

    /**
     * Sets the value of the educationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEducationDuration(BigDecimal value) {
        this.educationDuration = value;
    }

    /**
     * Gets the value of the specComplexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecComplexName() {
        return specComplexName;
    }

    /**
     * Sets the value of the specComplexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecComplexName(String value) {
        this.specComplexName = value;
    }

    /**
     * Gets the value of the graduatesQualificationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduatesQualificationName() {
        return graduatesQualificationName;
    }

    /**
     * Sets the value of the graduatesQualificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduatesQualificationName(String value) {
        this.graduatesQualificationName = value;
    }

    /**
     * Gets the value of the graduatesQualificationNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduatesQualificationNameEn() {
        return graduatesQualificationNameEn;
    }

    /**
     * Sets the value of the graduatesQualificationNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduatesQualificationNameEn(String value) {
        this.graduatesQualificationNameEn = value;
    }

    /**
     * Gets the value of the documentDateGive property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocumentDateGive() {
        return documentDateGive;
    }

    /**
     * Sets the value of the documentDateGive property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocumentDateGive(XMLGregorianCalendar value) {
        this.documentDateGive = value;
    }

    /**
     * Gets the value of the qalificationPrevUK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQalificationPrevUK() {
        return qalificationPrevUK;
    }

    /**
     * Sets the value of the qalificationPrevUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQalificationPrevUK(String value) {
        this.qalificationPrevUK = value;
    }

    /**
     * Gets the value of the qalificationPrevEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQalificationPrevEN() {
        return qalificationPrevEN;
    }

    /**
     * Sets the value of the qalificationPrevEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQalificationPrevEN(String value) {
        this.qalificationPrevEN = value;
    }

    /**
     * Gets the value of the specialityPrevUK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialityPrevUK() {
        return specialityPrevUK;
    }

    /**
     * Sets the value of the specialityPrevUK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialityPrevUK(String value) {
        this.specialityPrevUK = value;
    }

    /**
     * Gets the value of the specialityPrevEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialityPrevEN() {
        return specialityPrevEN;
    }

    /**
     * Sets the value of the specialityPrevEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialityPrevEN(String value) {
        this.specialityPrevEN = value;
    }

    /**
     * Gets the value of the idUniversity property.
     * 
     */
    public int getIdUniversity() {
        return idUniversity;
    }

    /**
     * Sets the value of the idUniversity property.
     * 
     */
    public void setIdUniversity(int value) {
        this.idUniversity = value;
    }

    /**
     * Gets the value of the universityFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullName() {
        return universityFullName;
    }

    /**
     * Sets the value of the universityFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullName(String value) {
        this.universityFullName = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the additionalIInfoSmall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalIInfoSmall() {
        return additionalIInfoSmall;
    }

    /**
     * Sets the value of the additionalIInfoSmall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalIInfoSmall(String value) {
        this.additionalIInfoSmall = value;
    }

    /**
     * Gets the value of the additionalIInfoEnSmall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalIInfoEnSmall() {
        return additionalIInfoEnSmall;
    }

    /**
     * Sets the value of the additionalIInfoEnSmall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalIInfoEnSmall(String value) {
        this.additionalIInfoEnSmall = value;
    }

}
