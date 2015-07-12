
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
 *         &lt;element name="Id_GraduatesData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GraduatesDatas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qalification_Prev_UK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Qalification_Prev_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speciality_Prev_UK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Speciality_Prev_EN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idGraduatesData",
    "graduatesDatas",
    "qalificationPrevUK",
    "qalificationPrevEN",
    "specialityPrevUK",
    "specialityPrevEN"
})
@XmlRootElement(name = "GraduatesDataDisciplinesEdit")
public class GraduatesDataDisciplinesEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_GraduatesData")
    protected int idGraduatesData;
    @XmlElement(name = "GraduatesDatas")
    protected String graduatesDatas;
    @XmlElement(name = "Qalification_Prev_UK")
    protected String qalificationPrevUK;
    @XmlElement(name = "Qalification_Prev_EN")
    protected String qalificationPrevEN;
    @XmlElement(name = "Speciality_Prev_UK")
    protected String specialityPrevUK;
    @XmlElement(name = "Speciality_Prev_EN")
    protected String specialityPrevEN;

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
     * Gets the value of the graduatesDatas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduatesDatas() {
        return graduatesDatas;
    }

    /**
     * Sets the value of the graduatesDatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduatesDatas(String value) {
        this.graduatesDatas = value;
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

}
