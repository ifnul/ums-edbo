
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityLicensesPtnzSvidDataDetailedSubTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicensesPtnzSvidDataDetailedSubTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicensePtnzSvidDataDetailedSubTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicensesSubTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicensePtnzSvidData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicensesSubTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityLicensesPtnzSvidDataDetailedSubTypes", propOrder = {
    "idUniversityLicensePtnzSvidDataDetailedSubTypes",
    "idUniversityLicensesSubTypes",
    "idUniversityLicensePtnzSvidData",
    "universityLicensesSubTypesName"
})
public class DUniversityLicensesPtnzSvidDataDetailedSubTypes {

    @XmlElement(name = "Id_UniversityLicensePtnzSvidDataDetailedSubTypes")
    protected int idUniversityLicensePtnzSvidDataDetailedSubTypes;
    @XmlElement(name = "Id_UniversityLicensesSubTypes")
    protected int idUniversityLicensesSubTypes;
    @XmlElement(name = "Id_UniversityLicensePtnzSvidData")
    protected int idUniversityLicensePtnzSvidData;
    @XmlElement(name = "UniversityLicensesSubTypesName")
    protected String universityLicensesSubTypesName;

    /**
     * Gets the value of the idUniversityLicensePtnzSvidDataDetailedSubTypes property.
     * 
     */
    public int getIdUniversityLicensePtnzSvidDataDetailedSubTypes() {
        return idUniversityLicensePtnzSvidDataDetailedSubTypes;
    }

    /**
     * Sets the value of the idUniversityLicensePtnzSvidDataDetailedSubTypes property.
     * 
     */
    public void setIdUniversityLicensePtnzSvidDataDetailedSubTypes(int value) {
        this.idUniversityLicensePtnzSvidDataDetailedSubTypes = value;
    }

    /**
     * Gets the value of the idUniversityLicensesSubTypes property.
     * 
     */
    public int getIdUniversityLicensesSubTypes() {
        return idUniversityLicensesSubTypes;
    }

    /**
     * Sets the value of the idUniversityLicensesSubTypes property.
     * 
     */
    public void setIdUniversityLicensesSubTypes(int value) {
        this.idUniversityLicensesSubTypes = value;
    }

    /**
     * Gets the value of the idUniversityLicensePtnzSvidData property.
     * 
     */
    public int getIdUniversityLicensePtnzSvidData() {
        return idUniversityLicensePtnzSvidData;
    }

    /**
     * Sets the value of the idUniversityLicensePtnzSvidData property.
     * 
     */
    public void setIdUniversityLicensePtnzSvidData(int value) {
        this.idUniversityLicensePtnzSvidData = value;
    }

    /**
     * Gets the value of the universityLicensesSubTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesSubTypesName() {
        return universityLicensesSubTypesName;
    }

    /**
     * Sets the value of the universityLicensesSubTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesSubTypesName(String value) {
        this.universityLicensesSubTypesName = value;
    }

}
