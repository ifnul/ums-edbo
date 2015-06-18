
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dGraduatesDataDisciplines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dGraduatesDataDisciplines">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_GraduatesDataDiscipline" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_GraduatesData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCyclesDiscipline" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GraduatesDataDisciplineDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ECSTCredit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Marks" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Id_GraduatesDataDisciplinesNationalGradesType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GraduatesDataDisciplinesNationalGradesTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GraduatesDataDisciplinesNationalGradesECTSRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversitiesDisciplines" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiesDisciplinesFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesDisciplinesFullNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_EducationalCyclesDisciplinesGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCyclesDisciplinesGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearBegin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YearEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCyclesDisciplinesTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCyclesDisciplinesTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disciplines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GradesTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dGraduatesDataDisciplines", propOrder = {
    "idGraduatesDataDiscipline",
    "idGraduatesData",
    "idEducationalCyclesDiscipline",
    "graduatesDataDisciplineDateLastChange",
    "ecstCredit",
    "marks",
    "idGraduatesDataDisciplinesNationalGradesType",
    "graduatesDataDisciplinesNationalGradesTypeName",
    "graduatesDataDisciplinesNationalGradesECTSRank",
    "idUniversitiesDisciplines",
    "universitiesDisciplinesFullName",
    "universitiesDisciplinesFullNameEn",
    "idEducationalCyclesDisciplinesGroup",
    "educationalCyclesDisciplinesGroupName",
    "yearBegin",
    "yearEnd",
    "idEducationalCyclesDisciplinesTypes",
    "educationalCyclesDisciplinesTypeName",
    "disciplines",
    "gradesTypes"
})
public class DGraduatesDataDisciplines {

    @XmlElement(name = "Id_GraduatesDataDiscipline")
    protected int idGraduatesDataDiscipline;
    @XmlElement(name = "Id_GraduatesData")
    protected int idGraduatesData;
    @XmlElement(name = "Id_EducationalCyclesDiscipline")
    protected int idEducationalCyclesDiscipline;
    @XmlElement(name = "GraduatesDataDisciplineDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar graduatesDataDisciplineDateLastChange;
    @XmlElement(name = "ECSTCredit", required = true)
    protected BigDecimal ecstCredit;
    @XmlElement(name = "Marks", required = true)
    protected BigDecimal marks;
    @XmlElement(name = "Id_GraduatesDataDisciplinesNationalGradesType")
    protected int idGraduatesDataDisciplinesNationalGradesType;
    @XmlElement(name = "GraduatesDataDisciplinesNationalGradesTypeName")
    protected String graduatesDataDisciplinesNationalGradesTypeName;
    @XmlElement(name = "GraduatesDataDisciplinesNationalGradesECTSRank")
    protected String graduatesDataDisciplinesNationalGradesECTSRank;
    @XmlElement(name = "Id_UniversitiesDisciplines")
    protected int idUniversitiesDisciplines;
    @XmlElement(name = "UniversitiesDisciplinesFullName")
    protected String universitiesDisciplinesFullName;
    @XmlElement(name = "UniversitiesDisciplinesFullNameEn")
    protected String universitiesDisciplinesFullNameEn;
    @XmlElement(name = "Id_EducationalCyclesDisciplinesGroup")
    protected int idEducationalCyclesDisciplinesGroup;
    @XmlElement(name = "EducationalCyclesDisciplinesGroupName")
    protected String educationalCyclesDisciplinesGroupName;
    @XmlElement(name = "YearBegin")
    protected int yearBegin;
    @XmlElement(name = "YearEnd")
    protected int yearEnd;
    @XmlElement(name = "Id_EducationalCyclesDisciplinesTypes")
    protected int idEducationalCyclesDisciplinesTypes;
    @XmlElement(name = "EducationalCyclesDisciplinesTypeName")
    protected String educationalCyclesDisciplinesTypeName;
    @XmlElement(name = "Disciplines")
    protected String disciplines;
    @XmlElement(name = "GradesTypes")
    protected String gradesTypes;

    /**
     * Gets the value of the idGraduatesDataDiscipline property.
     * 
     */
    public int getIdGraduatesDataDiscipline() {
        return idGraduatesDataDiscipline;
    }

    /**
     * Sets the value of the idGraduatesDataDiscipline property.
     * 
     */
    public void setIdGraduatesDataDiscipline(int value) {
        this.idGraduatesDataDiscipline = value;
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
     * Gets the value of the idEducationalCyclesDiscipline property.
     * 
     */
    public int getIdEducationalCyclesDiscipline() {
        return idEducationalCyclesDiscipline;
    }

    /**
     * Sets the value of the idEducationalCyclesDiscipline property.
     * 
     */
    public void setIdEducationalCyclesDiscipline(int value) {
        this.idEducationalCyclesDiscipline = value;
    }

    /**
     * Gets the value of the graduatesDataDisciplineDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGraduatesDataDisciplineDateLastChange() {
        return graduatesDataDisciplineDateLastChange;
    }

    /**
     * Sets the value of the graduatesDataDisciplineDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGraduatesDataDisciplineDateLastChange(XMLGregorianCalendar value) {
        this.graduatesDataDisciplineDateLastChange = value;
    }

    /**
     * Gets the value of the ecstCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getECSTCredit() {
        return ecstCredit;
    }

    /**
     * Sets the value of the ecstCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setECSTCredit(BigDecimal value) {
        this.ecstCredit = value;
    }

    /**
     * Gets the value of the marks property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMarks() {
        return marks;
    }

    /**
     * Sets the value of the marks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMarks(BigDecimal value) {
        this.marks = value;
    }

    /**
     * Gets the value of the idGraduatesDataDisciplinesNationalGradesType property.
     * 
     */
    public int getIdGraduatesDataDisciplinesNationalGradesType() {
        return idGraduatesDataDisciplinesNationalGradesType;
    }

    /**
     * Sets the value of the idGraduatesDataDisciplinesNationalGradesType property.
     * 
     */
    public void setIdGraduatesDataDisciplinesNationalGradesType(int value) {
        this.idGraduatesDataDisciplinesNationalGradesType = value;
    }

    /**
     * Gets the value of the graduatesDataDisciplinesNationalGradesTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduatesDataDisciplinesNationalGradesTypeName() {
        return graduatesDataDisciplinesNationalGradesTypeName;
    }

    /**
     * Sets the value of the graduatesDataDisciplinesNationalGradesTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduatesDataDisciplinesNationalGradesTypeName(String value) {
        this.graduatesDataDisciplinesNationalGradesTypeName = value;
    }

    /**
     * Gets the value of the graduatesDataDisciplinesNationalGradesECTSRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduatesDataDisciplinesNationalGradesECTSRank() {
        return graduatesDataDisciplinesNationalGradesECTSRank;
    }

    /**
     * Sets the value of the graduatesDataDisciplinesNationalGradesECTSRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduatesDataDisciplinesNationalGradesECTSRank(String value) {
        this.graduatesDataDisciplinesNationalGradesECTSRank = value;
    }

    /**
     * Gets the value of the idUniversitiesDisciplines property.
     * 
     */
    public int getIdUniversitiesDisciplines() {
        return idUniversitiesDisciplines;
    }

    /**
     * Sets the value of the idUniversitiesDisciplines property.
     * 
     */
    public void setIdUniversitiesDisciplines(int value) {
        this.idUniversitiesDisciplines = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesFullName() {
        return universitiesDisciplinesFullName;
    }

    /**
     * Sets the value of the universitiesDisciplinesFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesFullName(String value) {
        this.universitiesDisciplinesFullName = value;
    }

    /**
     * Gets the value of the universitiesDisciplinesFullNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesDisciplinesFullNameEn() {
        return universitiesDisciplinesFullNameEn;
    }

    /**
     * Sets the value of the universitiesDisciplinesFullNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesDisciplinesFullNameEn(String value) {
        this.universitiesDisciplinesFullNameEn = value;
    }

    /**
     * Gets the value of the idEducationalCyclesDisciplinesGroup property.
     * 
     */
    public int getIdEducationalCyclesDisciplinesGroup() {
        return idEducationalCyclesDisciplinesGroup;
    }

    /**
     * Sets the value of the idEducationalCyclesDisciplinesGroup property.
     * 
     */
    public void setIdEducationalCyclesDisciplinesGroup(int value) {
        this.idEducationalCyclesDisciplinesGroup = value;
    }

    /**
     * Gets the value of the educationalCyclesDisciplinesGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesDisciplinesGroupName() {
        return educationalCyclesDisciplinesGroupName;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesDisciplinesGroupName(String value) {
        this.educationalCyclesDisciplinesGroupName = value;
    }

    /**
     * Gets the value of the yearBegin property.
     * 
     */
    public int getYearBegin() {
        return yearBegin;
    }

    /**
     * Sets the value of the yearBegin property.
     * 
     */
    public void setYearBegin(int value) {
        this.yearBegin = value;
    }

    /**
     * Gets the value of the yearEnd property.
     * 
     */
    public int getYearEnd() {
        return yearEnd;
    }

    /**
     * Sets the value of the yearEnd property.
     * 
     */
    public void setYearEnd(int value) {
        this.yearEnd = value;
    }

    /**
     * Gets the value of the idEducationalCyclesDisciplinesTypes property.
     * 
     */
    public int getIdEducationalCyclesDisciplinesTypes() {
        return idEducationalCyclesDisciplinesTypes;
    }

    /**
     * Sets the value of the idEducationalCyclesDisciplinesTypes property.
     * 
     */
    public void setIdEducationalCyclesDisciplinesTypes(int value) {
        this.idEducationalCyclesDisciplinesTypes = value;
    }

    /**
     * Gets the value of the educationalCyclesDisciplinesTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesDisciplinesTypeName() {
        return educationalCyclesDisciplinesTypeName;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesDisciplinesTypeName(String value) {
        this.educationalCyclesDisciplinesTypeName = value;
    }

    /**
     * Gets the value of the disciplines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplines() {
        return disciplines;
    }

    /**
     * Sets the value of the disciplines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplines(String value) {
        this.disciplines = value;
    }

    /**
     * Gets the value of the gradesTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradesTypes() {
        return gradesTypes;
    }

    /**
     * Sets the value of the gradesTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradesTypes(String value) {
        this.gradesTypes = value;
    }

}
