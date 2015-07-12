
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
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StateOrdersTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityStateOrdersType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityStateOrder_from" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityKode",
    "idStateOrdersTypes",
    "year",
    "idUniversityStateOrdersType",
    "idUniversityStateOrderFrom"
})
@XmlRootElement(name = "UniversityStateOrdersAdd")
public class UniversityStateOrdersAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_StateOrdersTypes")
    protected int idStateOrdersTypes;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Id_UniversityStateOrdersType")
    protected int idUniversityStateOrdersType;
    @XmlElement(name = "Id_UniversityStateOrder_from")
    protected int idUniversityStateOrderFrom;

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
     * Gets the value of the idStateOrdersTypes property.
     * 
     */
    public int getIdStateOrdersTypes() {
        return idStateOrdersTypes;
    }

    /**
     * Sets the value of the idStateOrdersTypes property.
     * 
     */
    public void setIdStateOrdersTypes(int value) {
        this.idStateOrdersTypes = value;
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
     * Gets the value of the idUniversityStateOrdersType property.
     * 
     */
    public int getIdUniversityStateOrdersType() {
        return idUniversityStateOrdersType;
    }

    /**
     * Sets the value of the idUniversityStateOrdersType property.
     * 
     */
    public void setIdUniversityStateOrdersType(int value) {
        this.idUniversityStateOrdersType = value;
    }

    /**
     * Gets the value of the idUniversityStateOrderFrom property.
     * 
     */
    public int getIdUniversityStateOrderFrom() {
        return idUniversityStateOrderFrom;
    }

    /**
     * Sets the value of the idUniversityStateOrderFrom property.
     * 
     */
    public void setIdUniversityStateOrderFrom(int value) {
        this.idUniversityStateOrderFrom = value;
    }

}
