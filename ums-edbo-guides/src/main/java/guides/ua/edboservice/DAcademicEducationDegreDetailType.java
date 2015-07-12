
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicEducationDegreDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicEducationDegreDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicEducationDegreDetailType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicEducationDegreDetailFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicEducationDegreDetailShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicEducationDegreType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicEducationDegreDetailType", propOrder = {
    "idAcademicEducationDegreDetailType",
    "academicEducationDegreDetailFullName",
    "academicEducationDegreDetailShortName",
    "scienceIndustryCode",
    "scienceIndustryClasifierCode",
    "idAcademicEducationDegreType"
})
public class DAcademicEducationDegreDetailType {

    @XmlElement(name = "Id_AcademicEducationDegreDetailType")
    protected int idAcademicEducationDegreDetailType;
    @XmlElement(name = "AcademicEducationDegreDetailFullName")
    protected String academicEducationDegreDetailFullName;
    @XmlElement(name = "AcademicEducationDegreDetailShortName")
    protected String academicEducationDegreDetailShortName;
    @XmlElement(name = "ScienceIndustryCode")
    protected String scienceIndustryCode;
    @XmlElement(name = "ScienceIndustryClasifierCode")
    protected String scienceIndustryClasifierCode;
    @XmlElement(name = "Id_AcademicEducationDegreType")
    protected int idAcademicEducationDegreType;

    /**
     * Gets the value of the idAcademicEducationDegreDetailType property.
     * 
     */
    public int getIdAcademicEducationDegreDetailType() {
        return idAcademicEducationDegreDetailType;
    }

    /**
     * Sets the value of the idAcademicEducationDegreDetailType property.
     * 
     */
    public void setIdAcademicEducationDegreDetailType(int value) {
        this.idAcademicEducationDegreDetailType = value;
    }

    /**
     * Gets the value of the academicEducationDegreDetailFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationDegreDetailFullName() {
        return academicEducationDegreDetailFullName;
    }

    /**
     * Sets the value of the academicEducationDegreDetailFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationDegreDetailFullName(String value) {
        this.academicEducationDegreDetailFullName = value;
    }

    /**
     * Gets the value of the academicEducationDegreDetailShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicEducationDegreDetailShortName() {
        return academicEducationDegreDetailShortName;
    }

    /**
     * Sets the value of the academicEducationDegreDetailShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicEducationDegreDetailShortName(String value) {
        this.academicEducationDegreDetailShortName = value;
    }

    /**
     * Gets the value of the scienceIndustryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceIndustryCode() {
        return scienceIndustryCode;
    }

    /**
     * Sets the value of the scienceIndustryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceIndustryCode(String value) {
        this.scienceIndustryCode = value;
    }

    /**
     * Gets the value of the scienceIndustryClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceIndustryClasifierCode() {
        return scienceIndustryClasifierCode;
    }

    /**
     * Sets the value of the scienceIndustryClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceIndustryClasifierCode(String value) {
        this.scienceIndustryClasifierCode = value;
    }

    /**
     * Gets the value of the idAcademicEducationDegreType property.
     * 
     */
    public int getIdAcademicEducationDegreType() {
        return idAcademicEducationDegreType;
    }

    /**
     * Sets the value of the idAcademicEducationDegreType property.
     * 
     */
    public void setIdAcademicEducationDegreType(int value) {
        this.idAcademicEducationDegreType = value;
    }

}
