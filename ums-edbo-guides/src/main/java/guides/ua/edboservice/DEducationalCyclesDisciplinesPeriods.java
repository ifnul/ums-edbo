
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dEducationalCyclesDisciplinesPeriods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEducationalCyclesDisciplinesPeriods">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_EducationalCyclesDisciplinesPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCyclesDiscipline" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationProgressPeriodsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationProgressControlCapasity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationProgressControlCapasityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_EducationalCyclesDisciplinesPeriodsValueType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCyclesDisciplinesPeriodsValueTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UserEdit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationProgressPeriodType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationProgressPeriodTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEducationalCyclesDisciplinesPeriods", propOrder = {
    "idEducationalCyclesDisciplinesPeriods",
    "idEducationalCyclesDiscipline",
    "idPersonEducationProgressPeriods",
    "personEducationProgressPeriodsName",
    "idPersonEducationProgressControlCapasity",
    "personEducationProgressControlCapasityName",
    "idEducationalCyclesDisciplinesPeriodsValueType",
    "educationalCyclesDisciplinesPeriodsValueTypeName",
    "value",
    "dateCreate",
    "dateLastChange",
    "idUserAdd",
    "idUserEdit",
    "universityFacultetKode",
    "universityFacultetFullName",
    "idPersonEducationProgressPeriodType",
    "personEducationProgressPeriodTypeName"
})
public class DEducationalCyclesDisciplinesPeriods {

    @XmlElement(name = "Id_EducationalCyclesDisciplinesPeriods")
    protected int idEducationalCyclesDisciplinesPeriods;
    @XmlElement(name = "Id_EducationalCyclesDiscipline")
    protected int idEducationalCyclesDiscipline;
    @XmlElement(name = "Id_PersonEducationProgressPeriods")
    protected int idPersonEducationProgressPeriods;
    @XmlElement(name = "PersonEducationProgressPeriodsName")
    protected String personEducationProgressPeriodsName;
    @XmlElement(name = "Id_PersonEducationProgressControlCapasity")
    protected int idPersonEducationProgressControlCapasity;
    @XmlElement(name = "PersonEducationProgressControlCapasityName")
    protected String personEducationProgressControlCapasityName;
    @XmlElement(name = "Id_EducationalCyclesDisciplinesPeriodsValueType")
    protected int idEducationalCyclesDisciplinesPeriodsValueType;
    @XmlElement(name = "EducationalCyclesDisciplinesPeriodsValueTypeName")
    protected String educationalCyclesDisciplinesPeriodsValueTypeName;
    @XmlElement(name = "Value", required = true)
    protected BigDecimal value;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "Id_UserEdit")
    protected int idUserEdit;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "Id_PersonEducationProgressPeriodType")
    protected int idPersonEducationProgressPeriodType;
    @XmlElement(name = "PersonEducationProgressPeriodTypeName")
    protected String personEducationProgressPeriodTypeName;

    /**
     * Gets the value of the idEducationalCyclesDisciplinesPeriods property.
     * 
     */
    public int getIdEducationalCyclesDisciplinesPeriods() {
        return idEducationalCyclesDisciplinesPeriods;
    }

    /**
     * Sets the value of the idEducationalCyclesDisciplinesPeriods property.
     * 
     */
    public void setIdEducationalCyclesDisciplinesPeriods(int value) {
        this.idEducationalCyclesDisciplinesPeriods = value;
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
     * Gets the value of the idPersonEducationProgressPeriods property.
     * 
     */
    public int getIdPersonEducationProgressPeriods() {
        return idPersonEducationProgressPeriods;
    }

    /**
     * Sets the value of the idPersonEducationProgressPeriods property.
     * 
     */
    public void setIdPersonEducationProgressPeriods(int value) {
        this.idPersonEducationProgressPeriods = value;
    }

    /**
     * Gets the value of the personEducationProgressPeriodsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressPeriodsName() {
        return personEducationProgressPeriodsName;
    }

    /**
     * Sets the value of the personEducationProgressPeriodsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressPeriodsName(String value) {
        this.personEducationProgressPeriodsName = value;
    }

    /**
     * Gets the value of the idPersonEducationProgressControlCapasity property.
     * 
     */
    public int getIdPersonEducationProgressControlCapasity() {
        return idPersonEducationProgressControlCapasity;
    }

    /**
     * Sets the value of the idPersonEducationProgressControlCapasity property.
     * 
     */
    public void setIdPersonEducationProgressControlCapasity(int value) {
        this.idPersonEducationProgressControlCapasity = value;
    }

    /**
     * Gets the value of the personEducationProgressControlCapasityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressControlCapasityName() {
        return personEducationProgressControlCapasityName;
    }

    /**
     * Sets the value of the personEducationProgressControlCapasityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressControlCapasityName(String value) {
        this.personEducationProgressControlCapasityName = value;
    }

    /**
     * Gets the value of the idEducationalCyclesDisciplinesPeriodsValueType property.
     * 
     */
    public int getIdEducationalCyclesDisciplinesPeriodsValueType() {
        return idEducationalCyclesDisciplinesPeriodsValueType;
    }

    /**
     * Sets the value of the idEducationalCyclesDisciplinesPeriodsValueType property.
     * 
     */
    public void setIdEducationalCyclesDisciplinesPeriodsValueType(int value) {
        this.idEducationalCyclesDisciplinesPeriodsValueType = value;
    }

    /**
     * Gets the value of the educationalCyclesDisciplinesPeriodsValueTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesDisciplinesPeriodsValueTypeName() {
        return educationalCyclesDisciplinesPeriodsValueTypeName;
    }

    /**
     * Sets the value of the educationalCyclesDisciplinesPeriodsValueTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesDisciplinesPeriodsValueTypeName(String value) {
        this.educationalCyclesDisciplinesPeriodsValueTypeName = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
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
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
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
     * Gets the value of the idPersonEducationProgressPeriodType property.
     * 
     */
    public int getIdPersonEducationProgressPeriodType() {
        return idPersonEducationProgressPeriodType;
    }

    /**
     * Sets the value of the idPersonEducationProgressPeriodType property.
     * 
     */
    public void setIdPersonEducationProgressPeriodType(int value) {
        this.idPersonEducationProgressPeriodType = value;
    }

    /**
     * Gets the value of the personEducationProgressPeriodTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressPeriodTypeName() {
        return personEducationProgressPeriodTypeName;
    }

    /**
     * Sets the value of the personEducationProgressPeriodTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressPeriodTypeName(String value) {
        this.personEducationProgressPeriodTypeName = value;
    }

}
