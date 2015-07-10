
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityCoursesStudents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityCoursesStudents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityCoursesStudent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCoursesStudentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserEdit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateEdit" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StudentsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestSeasonsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityCourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Subject1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Subject2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Subject3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityCoursesStudents", propOrder = {
    "idUniversityCoursesStudent",
    "universityKode",
    "universityCourseCode",
    "idPersonRequestSeasons",
    "universityCoursesStudentName",
    "idUserAdd",
    "idUserEdit",
    "dateCreate",
    "dateEdit",
    "studentsCount",
    "requestSeasonsName",
    "universityCourseName",
    "subjectName",
    "idRegulationDocument",
    "isVerified",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "isExistFile",
    "idSubject1",
    "subjectName1",
    "idSubject2",
    "subjectName2",
    "idSubject3",
    "subjectName3"
})
public class DUniversityCoursesStudents {

    @XmlElement(name = "Id_UniversityCoursesStudent")
    protected int idUniversityCoursesStudent;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityCourseCode")
    protected String universityCourseCode;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "UniversityCoursesStudentName")
    protected String universityCoursesStudentName;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "Id_UserEdit")
    protected int idUserEdit;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DateEdit", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEdit;
    @XmlElement(name = "StudentsCount")
    protected int studentsCount;
    @XmlElement(name = "RequestSeasonsName")
    protected String requestSeasonsName;
    @XmlElement(name = "UniversityCourseName")
    protected String universityCourseName;
    @XmlElement(name = "SubjectName")
    protected String subjectName;
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
    @XmlElement(name = "Id_Subject1")
    protected int idSubject1;
    @XmlElement(name = "SubjectName1")
    protected String subjectName1;
    @XmlElement(name = "Id_Subject2")
    protected int idSubject2;
    @XmlElement(name = "SubjectName2")
    protected String subjectName2;
    @XmlElement(name = "Id_Subject3")
    protected int idSubject3;
    @XmlElement(name = "SubjectName3")
    protected String subjectName3;

    /**
     * Gets the value of the idUniversityCoursesStudent property.
     * 
     */
    public int getIdUniversityCoursesStudent() {
        return idUniversityCoursesStudent;
    }

    /**
     * Sets the value of the idUniversityCoursesStudent property.
     * 
     */
    public void setIdUniversityCoursesStudent(int value) {
        this.idUniversityCoursesStudent = value;
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
     * Gets the value of the universityCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCourseCode() {
        return universityCourseCode;
    }

    /**
     * Sets the value of the universityCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCourseCode(String value) {
        this.universityCourseCode = value;
    }

    /**
     * Gets the value of the idPersonRequestSeasons property.
     * 
     */
    public int getIdPersonRequestSeasons() {
        return idPersonRequestSeasons;
    }

    /**
     * Sets the value of the idPersonRequestSeasons property.
     * 
     */
    public void setIdPersonRequestSeasons(int value) {
        this.idPersonRequestSeasons = value;
    }

    /**
     * Gets the value of the universityCoursesStudentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCoursesStudentName() {
        return universityCoursesStudentName;
    }

    /**
     * Sets the value of the universityCoursesStudentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCoursesStudentName(String value) {
        this.universityCoursesStudentName = value;
    }

    /**
     * Gets the value of the idUserAdd property.
     * 
     */
    public int getIdUserAdd() {
        return idUserAdd;
    }

    /**
     * Sets the value of the idUserAdd property.
     * 
     */
    public void setIdUserAdd(int value) {
        this.idUserAdd = value;
    }

    /**
     * Gets the value of the idUserEdit property.
     * 
     */
    public int getIdUserEdit() {
        return idUserEdit;
    }

    /**
     * Sets the value of the idUserEdit property.
     * 
     */
    public void setIdUserEdit(int value) {
        this.idUserEdit = value;
    }

    /**
     * Gets the value of the dateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreate() {
        return dateCreate;
    }

    /**
     * Sets the value of the dateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreate(XMLGregorianCalendar value) {
        this.dateCreate = value;
    }

    /**
     * Gets the value of the dateEdit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEdit() {
        return dateEdit;
    }

    /**
     * Sets the value of the dateEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEdit(XMLGregorianCalendar value) {
        this.dateEdit = value;
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

    /**
     * Gets the value of the requestSeasonsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestSeasonsName() {
        return requestSeasonsName;
    }

    /**
     * Sets the value of the requestSeasonsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestSeasonsName(String value) {
        this.requestSeasonsName = value;
    }

    /**
     * Gets the value of the universityCourseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCourseName() {
        return universityCourseName;
    }

    /**
     * Sets the value of the universityCourseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCourseName(String value) {
        this.universityCourseName = value;
    }

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
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
     * Gets the value of the idSubject1 property.
     * 
     */
    public int getIdSubject1() {
        return idSubject1;
    }

    /**
     * Sets the value of the idSubject1 property.
     * 
     */
    public void setIdSubject1(int value) {
        this.idSubject1 = value;
    }

    /**
     * Gets the value of the subjectName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName1() {
        return subjectName1;
    }

    /**
     * Sets the value of the subjectName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName1(String value) {
        this.subjectName1 = value;
    }

    /**
     * Gets the value of the idSubject2 property.
     * 
     */
    public int getIdSubject2() {
        return idSubject2;
    }

    /**
     * Sets the value of the idSubject2 property.
     * 
     */
    public void setIdSubject2(int value) {
        this.idSubject2 = value;
    }

    /**
     * Gets the value of the subjectName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName2() {
        return subjectName2;
    }

    /**
     * Sets the value of the subjectName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName2(String value) {
        this.subjectName2 = value;
    }

    /**
     * Gets the value of the idSubject3 property.
     * 
     */
    public int getIdSubject3() {
        return idSubject3;
    }

    /**
     * Sets the value of the idSubject3 property.
     * 
     */
    public void setIdSubject3(int value) {
        this.idSubject3 = value;
    }

    /**
     * Gets the value of the subjectName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName3() {
        return subjectName3;
    }

    /**
     * Sets the value of the subjectName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName3(String value) {
        this.subjectName3 = value;
    }

}
