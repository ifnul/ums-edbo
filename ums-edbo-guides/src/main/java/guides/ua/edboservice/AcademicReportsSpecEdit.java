
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
 *         &lt;element name="Id_AcademicReportsSpec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicReportsSpecData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idAcademicReportsSpec",
    "idAcademicEducationForm",
    "year",
    "academicReportsSpecData"
})
@XmlRootElement(name = "AcademicReportsSpecEdit")
public class AcademicReportsSpecEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_AcademicReportsSpec")
    protected int idAcademicReportsSpec;
    @XmlElement(name = "Id_AcademicEducationForm")
    protected int idAcademicEducationForm;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "AcademicReportsSpecData")
    protected String academicReportsSpecData;

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
     * Gets the value of the idAcademicReportsSpec property.
     * 
     */
    public int getIdAcademicReportsSpec() {
        return idAcademicReportsSpec;
    }

    /**
     * Sets the value of the idAcademicReportsSpec property.
     * 
     */
    public void setIdAcademicReportsSpec(int value) {
        this.idAcademicReportsSpec = value;
    }

    /**
     * Gets the value of the idAcademicEducationForm property.
     * 
     */
    public int getIdAcademicEducationForm() {
        return idAcademicEducationForm;
    }

    /**
     * Sets the value of the idAcademicEducationForm property.
     * 
     */
    public void setIdAcademicEducationForm(int value) {
        this.idAcademicEducationForm = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the academicReportsSpecData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicReportsSpecData() {
        return academicReportsSpecData;
    }

    /**
     * Sets the value of the academicReportsSpecData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicReportsSpecData(String value) {
        this.academicReportsSpecData = value;
    }

}
