
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dGraduatesData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dGraduatesData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Graduate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_GraduatesData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GraduatesDataDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UniversityGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityGroupFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EduCycleDisciplines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GraduatesDataDisciplines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qalification_Prev_UK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qalification_Prev_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speciality_Prev_UK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speciality_Prev_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalIInfoSmall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalIInfoSmallEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dGraduatesData", propOrder = {
    "idGraduate",
    "idGraduatesData",
    "graduatesDataDateLastChange",
    "idUniversityGroup",
    "universityGroupFullName",
    "idPerson",
    "personCodeU",
    "idPersonEducation",
    "birthday",
    "fio",
    "eduCycleDisciplines",
    "graduatesDataDisciplines",
    "qalificationPrevUK",
    "qalificationPrevEN",
    "specialityPrevUK",
    "specialityPrevEN",
    "additionalIInfoSmall",
    "additionalIInfoSmallEn"
})
public class DGraduatesData {

    @XmlElement(name = "Id_Graduate")
    protected int idGraduate;
    @XmlElement(name = "Id_GraduatesData")
    protected int idGraduatesData;
    @XmlElement(name = "GraduatesDataDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar graduatesDataDateLastChange;
    @XmlElement(name = "Id_UniversityGroup")
    protected int idUniversityGroup;
    @XmlElement(name = "UniversityGroupFullName")
    protected String universityGroupFullName;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_PersonEducation")
    protected int idPersonEducation;
    @XmlElement(name = "Birthday", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "EduCycleDisciplines")
    protected String eduCycleDisciplines;
    @XmlElement(name = "GraduatesDataDisciplines")
    protected String graduatesDataDisciplines;
    @XmlElement(name = "Qalification_Prev_UK")
    protected String qalificationPrevUK;
    @XmlElement(name = "Qalification_Prev_EN")
    protected String qalificationPrevEN;
    @XmlElement(name = "Speciality_Prev_UK")
    protected String specialityPrevUK;
    @XmlElement(name = "Speciality_Prev_EN")
    protected String specialityPrevEN;
    @XmlElement(name = "AdditionalIInfoSmall")
    protected String additionalIInfoSmall;
    @XmlElement(name = "AdditionalIInfoSmallEn")
    protected String additionalIInfoSmallEn;

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
     * Gets the value of the idGraduatesData property.
     * 
     */
    public int getIdGraduatesData() {
        return idGraduatesData;
    }

    /**
     * Sets the value of the idGraduatesData property.
     * 
     */
    public void setIdGraduatesData(int value) {
        this.idGraduatesData = value;
    }

    /**
     * Gets the value of the graduatesDataDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGraduatesDataDateLastChange() {
        return graduatesDataDateLastChange;
    }

    /**
     * Sets the value of the graduatesDataDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGraduatesDataDateLastChange(XMLGregorianCalendar value) {
        this.graduatesDataDateLastChange = value;
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
     * Gets the value of the idPersonEducation property.
     * 
     */
    public int getIdPersonEducation() {
        return idPersonEducation;
    }

    /**
     * Sets the value of the idPersonEducation property.
     * 
     */
    public void setIdPersonEducation(int value) {
        this.idPersonEducation = value;
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
     * Gets the value of the eduCycleDisciplines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEduCycleDisciplines() {
        return eduCycleDisciplines;
    }

    /**
     * Sets the value of the eduCycleDisciplines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEduCycleDisciplines(String value) {
        this.eduCycleDisciplines = value;
    }

    /**
     * Gets the value of the graduatesDataDisciplines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduatesDataDisciplines() {
        return graduatesDataDisciplines;
    }

    /**
     * Sets the value of the graduatesDataDisciplines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduatesDataDisciplines(String value) {
        this.graduatesDataDisciplines = value;
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
     * Gets the value of the additionalIInfoSmallEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalIInfoSmallEn() {
        return additionalIInfoSmallEn;
    }

    /**
     * Sets the value of the additionalIInfoSmallEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalIInfoSmallEn(String value) {
        this.additionalIInfoSmallEn = value;
    }

}
