
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
 *         &lt;element name="Id_EducationalCyclesPatternDisciplinesGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationalCyclesPatternDisciplinesGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_EducationalCyclesPatternDisciplinesGroupOld" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idEducationalCyclesPatternDisciplinesGroup",
    "educationalCyclesPatternDisciplinesGroupName",
    "idEducationalCyclesPatternDisciplinesGroupOld"
})
@XmlRootElement(name = "EducationalCyclesPatternDisciplinesGroupsEdit")
public class EducationalCyclesPatternDisciplinesGroupsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_EducationalCyclesPatternDisciplinesGroup")
    protected int idEducationalCyclesPatternDisciplinesGroup;
    @XmlElement(name = "EducationalCyclesPatternDisciplinesGroupName")
    protected String educationalCyclesPatternDisciplinesGroupName;
    @XmlElement(name = "Id_EducationalCyclesPatternDisciplinesGroupOld")
    protected int idEducationalCyclesPatternDisciplinesGroupOld;

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
     * Gets the value of the idEducationalCyclesPatternDisciplinesGroup property.
     * 
     */
    public int getIdEducationalCyclesPatternDisciplinesGroup() {
        return idEducationalCyclesPatternDisciplinesGroup;
    }

    /**
     * Sets the value of the idEducationalCyclesPatternDisciplinesGroup property.
     * 
     */
    public void setIdEducationalCyclesPatternDisciplinesGroup(int value) {
        this.idEducationalCyclesPatternDisciplinesGroup = value;
    }

    /**
     * Gets the value of the educationalCyclesPatternDisciplinesGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalCyclesPatternDisciplinesGroupName() {
        return educationalCyclesPatternDisciplinesGroupName;
    }

    /**
     * Sets the value of the educationalCyclesPatternDisciplinesGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalCyclesPatternDisciplinesGroupName(String value) {
        this.educationalCyclesPatternDisciplinesGroupName = value;
    }

    /**
     * Gets the value of the idEducationalCyclesPatternDisciplinesGroupOld property.
     * 
     */
    public int getIdEducationalCyclesPatternDisciplinesGroupOld() {
        return idEducationalCyclesPatternDisciplinesGroupOld;
    }

    /**
     * Sets the value of the idEducationalCyclesPatternDisciplinesGroupOld property.
     * 
     */
    public void setIdEducationalCyclesPatternDisciplinesGroupOld(int value) {
        this.idEducationalCyclesPatternDisciplinesGroupOld = value;
    }

}
