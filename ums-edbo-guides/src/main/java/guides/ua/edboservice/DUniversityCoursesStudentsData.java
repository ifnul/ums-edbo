
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityCoursesStudentsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityCoursesStudentsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityCoursesStudentsData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityCoursesStudent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCoursesValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Subject1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Subject2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Subject3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FDPSertificateSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FDPSertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityCoursesStudentsData", propOrder = {
    "idUniversityCoursesStudentsData",
    "idUniversityCoursesStudent",
    "personCodeU",
    "idPersonName",
    "universityCoursesValue",
    "fio",
    "birthday",
    "idPerson",
    "idSubject1",
    "subjectName1",
    "idSubject2",
    "subjectName2",
    "idSubject3",
    "subjectName3",
    "fdpSertificateSeries",
    "fdpSertificateNumber"
})
public class DUniversityCoursesStudentsData {

    @XmlElement(name = "Id_UniversityCoursesStudentsData")
    protected int idUniversityCoursesStudentsData;
    @XmlElement(name = "Id_UniversityCoursesStudent")
    protected int idUniversityCoursesStudent;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_PersonName")
    protected int idPersonName;
    @XmlElement(name = "UniversityCoursesValue", required = true)
    protected BigDecimal universityCoursesValue;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
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
    @XmlElement(name = "FDPSertificateSeries")
    protected String fdpSertificateSeries;
    @XmlElement(name = "FDPSertificateNumber")
    protected String fdpSertificateNumber;

    /**
     * Gets the value of the idUniversityCoursesStudentsData property.
     * 
     */
    public int getIdUniversityCoursesStudentsData() {
        return idUniversityCoursesStudentsData;
    }

    /**
     * Sets the value of the idUniversityCoursesStudentsData property.
     * 
     */
    public void setIdUniversityCoursesStudentsData(int value) {
        this.idUniversityCoursesStudentsData = value;
    }

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
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
    }

    /**
     * Gets the value of the idPersonName property.
     * 
     */
    public int getIdPersonName() {
        return idPersonName;
    }

    /**
     * Sets the value of the idPersonName property.
     * 
     */
    public void setIdPersonName(int value) {
        this.idPersonName = value;
    }

    /**
     * Gets the value of the universityCoursesValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUniversityCoursesValue() {
        return universityCoursesValue;
    }

    /**
     * Sets the value of the universityCoursesValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUniversityCoursesValue(BigDecimal value) {
        this.universityCoursesValue = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
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

    /**
     * Gets the value of the fdpSertificateSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDPSertificateSeries() {
        return fdpSertificateSeries;
    }

    /**
     * Sets the value of the fdpSertificateSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDPSertificateSeries(String value) {
        this.fdpSertificateSeries = value;
    }

    /**
     * Gets the value of the fdpSertificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDPSertificateNumber() {
        return fdpSertificateNumber;
    }

    /**
     * Sets the value of the fdpSertificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDPSertificateNumber(String value) {
        this.fdpSertificateNumber = value;
    }

}
