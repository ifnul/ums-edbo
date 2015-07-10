
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
 *         &lt;element name="Id_EducationalCyclesDiscipline" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressControlCapasity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCyclesDisciplinesPeriodsValueType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonEducationProgressPeriodType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idEducationalCyclesDiscipline",
    "idPersonEducationProgressPeriods",
    "idPersonEducationProgressControlCapasity",
    "idEducationalCyclesDisciplinesPeriodsValueType",
    "universityFacultetKode",
    "value",
    "idPersonEducationProgressPeriodType"
})
@XmlRootElement(name = "EducationalCyclesDisciplinesPeriodsAdd")
public class EducationalCyclesDisciplinesPeriodsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_EducationalCyclesDiscipline")
    protected int idEducationalCyclesDiscipline;
    @XmlElement(name = "Id_PersonEducationProgressPeriods")
    protected int idPersonEducationProgressPeriods;
    @XmlElement(name = "Id_PersonEducationProgressControlCapasity")
    protected int idPersonEducationProgressControlCapasity;
    @XmlElement(name = "Id_EducationalCyclesDisciplinesPeriodsValueType")
    protected int idEducationalCyclesDisciplinesPeriodsValueType;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Id_PersonEducationProgressPeriodType")
    protected int idPersonEducationProgressPeriodType;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
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

}
