
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dReceptionConditionAdditionsTableData234 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReceptionConditionAdditionsTableData234">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData234" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReceptionConditionAddition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfDirSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfDirSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfDirName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfessionalTextName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CourseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EducationDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractEducationCount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BudjetEducationCount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ProfessionsSpecialitiesDirections" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalSpecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentKoeficient" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="SpecScecializationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecScecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReceptionConditionAdditionsTableData234", propOrder = {
    "idReceptionConditionAdditionsTableData234",
    "idReceptionConditionAddition",
    "idPersonEducationForm",
    "personEducationFormName",
    "specProfDirSpecialityCode",
    "specProfDirSpecialityClasifierCode",
    "specProfDirName",
    "professionalTextName",
    "idCourse",
    "courseName",
    "educationDuration",
    "contractEducationCount",
    "budjetEducationCount",
    "professionsSpecialitiesDirections",
    "universityFacultetKode",
    "universityFacultetFullName",
    "additionalSpecName",
    "documentKoeficient",
    "specScecializationCode",
    "specScecializationName"
})
public class DReceptionConditionAdditionsTableData234 {

    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData234")
    protected int idReceptionConditionAdditionsTableData234;
    @XmlElement(name = "Id_ReceptionConditionAddition")
    protected int idReceptionConditionAddition;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "PersonEducationFormName")
    protected String personEducationFormName;
    @XmlElement(name = "SpecProfDirSpecialityCode")
    protected String specProfDirSpecialityCode;
    @XmlElement(name = "SpecProfDirSpecialityClasifierCode")
    protected String specProfDirSpecialityClasifierCode;
    @XmlElement(name = "SpecProfDirName")
    protected String specProfDirName;
    @XmlElement(name = "ProfessionalTextName")
    protected String professionalTextName;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "CourseName")
    protected String courseName;
    @XmlElement(name = "EducationDuration")
    protected String educationDuration;
    @XmlElement(name = "ContractEducationCount", required = true)
    protected BigDecimal contractEducationCount;
    @XmlElement(name = "BudjetEducationCount", required = true)
    protected BigDecimal budjetEducationCount;
    @XmlElement(name = "ProfessionsSpecialitiesDirections")
    protected String professionsSpecialitiesDirections;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "AdditionalSpecName")
    protected String additionalSpecName;
    @XmlElement(name = "DocumentKoeficient", required = true)
    protected BigDecimal documentKoeficient;
    @XmlElement(name = "SpecScecializationCode")
    protected String specScecializationCode;
    @XmlElement(name = "SpecScecializationName")
    protected String specScecializationName;

    /**
     * Gets the value of the idReceptionConditionAdditionsTableData234 property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData234() {
        return idReceptionConditionAdditionsTableData234;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData234 property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData234(int value) {
        this.idReceptionConditionAdditionsTableData234 = value;
    }

    /**
     * Gets the value of the idReceptionConditionAddition property.
     * 
     */
    public int getIdReceptionConditionAddition() {
        return idReceptionConditionAddition;
    }

    /**
     * Sets the value of the idReceptionConditionAddition property.
     * 
     */
    public void setIdReceptionConditionAddition(int value) {
        this.idReceptionConditionAddition = value;
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
     * Gets the value of the specProfDirSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfDirSpecialityCode() {
        return specProfDirSpecialityCode;
    }

    /**
     * Sets the value of the specProfDirSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfDirSpecialityCode(String value) {
        this.specProfDirSpecialityCode = value;
    }

    /**
     * Gets the value of the specProfDirSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfDirSpecialityClasifierCode() {
        return specProfDirSpecialityClasifierCode;
    }

    /**
     * Sets the value of the specProfDirSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfDirSpecialityClasifierCode(String value) {
        this.specProfDirSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the specProfDirName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfDirName() {
        return specProfDirName;
    }

    /**
     * Sets the value of the specProfDirName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfDirName(String value) {
        this.specProfDirName = value;
    }

    /**
     * Gets the value of the professionalTextName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionalTextName() {
        return professionalTextName;
    }

    /**
     * Sets the value of the professionalTextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionalTextName(String value) {
        this.professionalTextName = value;
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
     * Gets the value of the educationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationDuration() {
        return educationDuration;
    }

    /**
     * Sets the value of the educationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationDuration(String value) {
        this.educationDuration = value;
    }

    /**
     * Gets the value of the contractEducationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getContractEducationCount() {
        return contractEducationCount;
    }

    /**
     * Sets the value of the contractEducationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setContractEducationCount(BigDecimal value) {
        this.contractEducationCount = value;
    }

    /**
     * Gets the value of the budjetEducationCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBudjetEducationCount() {
        return budjetEducationCount;
    }

    /**
     * Sets the value of the budjetEducationCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBudjetEducationCount(BigDecimal value) {
        this.budjetEducationCount = value;
    }

    /**
     * Gets the value of the professionsSpecialitiesDirections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionsSpecialitiesDirections() {
        return professionsSpecialitiesDirections;
    }

    /**
     * Sets the value of the professionsSpecialitiesDirections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionsSpecialitiesDirections(String value) {
        this.professionsSpecialitiesDirections = value;
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
     * Gets the value of the additionalSpecName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalSpecName() {
        return additionalSpecName;
    }

    /**
     * Sets the value of the additionalSpecName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalSpecName(String value) {
        this.additionalSpecName = value;
    }

    /**
     * Gets the value of the documentKoeficient property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDocumentKoeficient() {
        return documentKoeficient;
    }

    /**
     * Sets the value of the documentKoeficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDocumentKoeficient(BigDecimal value) {
        this.documentKoeficient = value;
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

}
