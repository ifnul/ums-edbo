
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
 *         &lt;element name="Id_EducationalCycles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationalCyclesPattern" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YearShift" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idEducationalCycles",
    "idEducationalCyclesPattern",
    "yearShift"
})
@XmlRootElement(name = "EducationalCyclesDisciplinesFillFromPattern")
public class EducationalCyclesDisciplinesFillFromPattern {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_EducationalCycles")
    protected int idEducationalCycles;
    @XmlElement(name = "Id_EducationalCyclesPattern")
    protected int idEducationalCyclesPattern;
    @XmlElement(name = "YearShift")
    protected int yearShift;

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
     * Gets the value of the idEducationalCyclesPattern property.
     * 
     */
    public int getIdEducationalCyclesPattern() {
        return idEducationalCyclesPattern;
    }

    /**
     * Sets the value of the idEducationalCyclesPattern property.
     * 
     */
    public void setIdEducationalCyclesPattern(int value) {
        this.idEducationalCyclesPattern = value;
    }

    /**
     * Gets the value of the yearShift property.
     * 
     */
    public int getYearShift() {
        return yearShift;
    }

    /**
     * Sets the value of the yearShift property.
     * 
     */
    public void setYearShift(int value) {
        this.yearShift = value;
    }

}
