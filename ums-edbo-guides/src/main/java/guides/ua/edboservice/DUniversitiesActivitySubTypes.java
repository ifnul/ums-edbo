
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversitiesActivitySubTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversitiesActivitySubTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversitiesActivitySubTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiesActivitySubTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dUniversitiesActivitySubTypes", propOrder = {
    "idUniversitiesActivitySubTypes",
    "universitiesActivitySubTypes",
    "universitiesActivitySubTypesCode"
})
public class DUniversitiesActivitySubTypes {

    @XmlElement(name = "Id_UniversitiesActivitySubTypes")
    protected int idUniversitiesActivitySubTypes;
    @XmlElement(name = "UniversitiesActivitySubTypes")
    protected String universitiesActivitySubTypes;
    @XmlElement(name = "UniversitiesActivitySubTypesCode")
    protected String universitiesActivitySubTypesCode;

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
