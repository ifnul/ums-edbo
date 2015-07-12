
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
 *         &lt;element name="Id_EducationalCyclesDisciplinesPeriods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationProgressControlCapasity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCyclesDisciplinesPeriodsValueType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idEducationalCyclesDisciplinesPeriods",
    "idPersonEducationProgressControlCapasity",
    "idEducationalCyclesDisciplinesPeriodsValueType",
    "universityFacultetKode",
    "value"
})
@XmlRootElement(name = "EducationalCyclesDisciplinesPeriodsEdit")
public class EducationalCyclesDisciplinesPeriodsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_EducationalCyclesDisciplinesPeriods")
    protected int idEducationalCyclesDisciplinesPeriods;
    @XmlElement(name = "Id_PersonEducationProgressControlCapasity")
    protected int idPersonEducationProgressControlCapasity;
    @XmlElement(name = "Id_EducationalCyclesDisciplinesPeriodsValueType")
    protected int idEducationalCyclesDisciplinesPeriodsValueType;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "Value")
    protected String value;

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

}
