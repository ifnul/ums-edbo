
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
 *         &lt;element name="ActualDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KOATUUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hundred" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NameMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullNameMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WitchRegions" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "actualDate",
    "idLanguage",
    "koatuuCode",
    "hundred",
    "nameMask",
    "fullNameMask",
    "witchRegions"
})
@XmlRootElement(name = "KOATUUGet")
public class KOATUUGet {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "ActualDate")
    protected String actualDate;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "KOATUUCode")
    protected String koatuuCode;
    @XmlElement(name = "Hundred")
    protected int hundred;
    @XmlElement(name = "NameMask")
    protected String nameMask;
    @XmlElement(name = "FullNameMask")
    protected String fullNameMask;
    @XmlElement(name = "WitchRegions")
    protected int witchRegions;

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
     * Gets the value of the actualDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualDate() {
        return actualDate;
    }

    /**
     * Sets the value of the actualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDate(String value) {
        this.actualDate = value;
    }

    /**
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
    }

    /**
     * Gets the value of the koatuuCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCode() {
        return koatuuCode;
    }

    /**
     * Sets the value of the koatuuCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCode(String value) {
        this.koatuuCode = value;
    }

    /**
     * Gets the value of the hundred property.
     * 
     */
    public int getHundred() {
        return hundred;
    }

    /**
     * Sets the value of the hundred property.
     * 
     */
    public void setHundred(int value) {
        this.hundred = value;
    }

    /**
     * Gets the value of the nameMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameMask() {
        return nameMask;
    }

    /**
     * Sets the value of the nameMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameMask(String value) {
        this.nameMask = value;
    }

    /**
     * Gets the value of the fullNameMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNameMask() {
        return fullNameMask;
    }

    /**
     * Sets the value of the fullNameMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNameMask(String value) {
        this.fullNameMask = value;
    }

    /**
     * Gets the value of the witchRegions property.
     * 
     */
    public int getWitchRegions() {
        return witchRegions;
    }

    /**
     * Sets the value of the witchRegions property.
     * 
     */
    public void setWitchRegions(int value) {
        this.witchRegions = value;
    }

}
