
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversitiesActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversitiesActivity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversitiesActivity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitiesActivityTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiesActivityTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversitiesActivitySubTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiesActivitySubTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesActivityTypesCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversitiesActivitySubTypesCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversitiesActivity", propOrder = {
    "idUniversitiesActivity",
    "idUniversitiesActivityTypes",
    "universitiesActivityTypes",
    "idUniversitiesActivitySubTypes",
    "universitiesActivitySubTypes",
    "universityKode",
    "universitiesActivityTypesCode",
    "universitiesActivitySubTypesCode"
})
public class DUniversitiesActivity {

    @XmlElement(name = "Id_UniversitiesActivity")
    protected int idUniversitiesActivity;
    @XmlElement(name = "Id_UniversitiesActivityTypes")
    protected int idUniversitiesActivityTypes;
    @XmlElement(name = "UniversitiesActivityTypes")
    protected String universitiesActivityTypes;
    @XmlElement(name = "Id_UniversitiesActivitySubTypes")
    protected int idUniversitiesActivitySubTypes;
    @XmlElement(name = "UniversitiesActivitySubTypes")
    protected String universitiesActivitySubTypes;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversitiesActivityTypesCode")
    protected String universitiesActivityTypesCode;
    @XmlElement(name = "UniversitiesActivitySubTypesCode")
    protected String universitiesActivitySubTypesCode;

    /**
     * Gets the value of the idUniversitiesActivity property.
     * 
     */
    public int getIdUniversitiesActivity() {
        return idUniversitiesActivity;
    }

    /**
     * Sets the value of the idUniversitiesActivity property.
     * 
     */
    public void setIdUniversitiesActivity(int value) {
        this.idUniversitiesActivity = value;
    }

    /**
     * Gets the value of the idUniversitiesActivityTypes property.
     * 
     */
    public int getIdUniversitiesActivityTypes() {
        return idUniversitiesActivityTypes;
    }

    /**
     * Sets the value of the idUniversitiesActivityTypes property.
     * 
     */
    public void setIdUniversitiesActivityTypes(int value) {
        this.idUniversitiesActivityTypes = value;
    }

    /**
     * Gets the value of the universitiesActivityTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesActivityTypes() {
        return universitiesActivityTypes;
    }

    /**
     * Sets the value of the universitiesActivityTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesActivityTypes(String value) {
        this.universitiesActivityTypes = value;
    }

    /**
     * Gets the value of the idUniversitiesActivitySubTypes property.
     * 
     */
    public int getIdUniversitiesActivitySubTypes() {
        return idUniversitiesActivitySubTypes;
    }

    /**
     * Sets the value of the idUniversitiesActivitySubTypes property.
     * 
     */
    public void setIdUniversitiesActivitySubTypes(int value) {
        this.idUniversitiesActivitySubTypes = value;
    }

    /**
     * Gets the value of the universitiesActivitySubTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesActivitySubTypes() {
        return universitiesActivitySubTypes;
    }

    /**
     * Sets the value of the universitiesActivitySubTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesActivitySubTypes(String value) {
        this.universitiesActivitySubTypes = value;
    }

    /**
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the universitiesActivityTypesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesActivityTypesCode() {
        return universitiesActivityTypesCode;
    }

    /**
     * Sets the value of the universitiesActivityTypesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesActivityTypesCode(String value) {
        this.universitiesActivityTypesCode = value;
    }

    /**
     * Gets the value of the universitiesActivitySubTypesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesActivitySubTypesCode() {
        return universitiesActivitySubTypesCode;
    }

    /**
     * Sets the value of the universitiesActivitySubTypesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesActivitySubTypesCode(String value) {
        this.universitiesActivitySubTypesCode = value;
    }

}
