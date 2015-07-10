
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityLicensesDataPtnzDetailedSubTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicensesDataPtnzDetailedSubTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicenseDataDetailedSubTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicensesSubTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicenseData" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "dUniversityLicensesDataPtnzDetailedSubTypes", propOrder = {
    "idUniversityLicenseDataDetailedSubTypes",
    "idUniversityLicensesSubTypes",
    "idUniversityLicenseData",
    "universityLicensesSubTypesName"
})
public class DUniversityLicensesDataPtnzDetailedSubTypes {

    @XmlElement(name = "Id_UniversityLicenseDataDetailedSubTypes")
    protected int idUniversityLicenseDataDetailedSubTypes;
    @XmlElement(name = "Id_UniversityLicensesSubTypes")
    protected int idUniversityLicensesSubTypes;
    @XmlElement(name = "Id_UniversityLicenseData")
    protected int idUniversityLicenseData;
    @XmlElement(name = "UniversityLicensesSubTypesName")
    protected String universityLicensesSubTypesName;

    /**
     * Gets the value of the idUniversityLicenseDataDetailedSubTypes property.
     * 
     */
    public int getIdUniversityLicenseDataDetailedSubTypes() {
        return idUniversityLicenseDataDetailedSubTypes;
    }

    /**
     * Sets the value of the idUniversityLicenseDataDetailedSubTypes property.
     * 
     */
    public void setIdUniversityLicenseDataDetailedSubTypes(int value) {
        this.idUniversityLicenseDataDetailedSubTypes = value;
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
     * Gets the value of the idUniversityLicenseData property.
     * 
     */
    public int getIdUniversityLicenseData() {
        return idUniversityLicenseData;
    }

    /**
     * Sets the value of the idUniversityLicenseData property.
     * 
     */
    public void setIdUniversityLicenseData(int value) {
        this.idUniversityLicenseData = value;
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
