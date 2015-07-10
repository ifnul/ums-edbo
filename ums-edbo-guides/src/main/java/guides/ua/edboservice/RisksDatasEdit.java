
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
 *         &lt;element name="Id_RiskData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="f2_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f3_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f3_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f3_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f3_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f3_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f3_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f3_13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastCheck" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idRiskData",
    "idUniversity",
    "f27",
    "f28",
    "f29",
    "f210",
    "f211",
    "f212",
    "f213",
    "f214",
    "f215",
    "f37",
    "f38",
    "f39",
    "f310",
    "f311",
    "f312",
    "f313",
    "dateLastCheck"
})
@XmlRootElement(name = "RisksDatasEdit")
public class RisksDatasEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_RiskData")
    protected int idRiskData;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "f2_7")
    protected String f27;
    @XmlElement(name = "f2_8")
    protected String f28;
    @XmlElement(name = "f2_9")
    protected String f29;
    @XmlElement(name = "f2_10")
    protected String f210;
    @XmlElement(name = "f2_11")
    protected String f211;
    @XmlElement(name = "f2_12")
    protected String f212;
    @XmlElement(name = "f2_13")
    protected String f213;
    @XmlElement(name = "f2_14")
    protected String f214;
    @XmlElement(name = "f2_15")
    protected String f215;
    @XmlElement(name = "f3_7")
    protected String f37;
    @XmlElement(name = "f3_8")
    protected String f38;
    @XmlElement(name = "f3_9")
    protected String f39;
    @XmlElement(name = "f3_10")
    protected String f310;
    @XmlElement(name = "f3_11")
    protected String f311;
    @XmlElement(name = "f3_12")
    protected String f312;
    @XmlElement(name = "f3_13")
    protected String f313;
    @XmlElement(name = "DateLastCheck")
    protected String dateLastCheck;

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
     * Gets the value of the idRiskData property.
     * 
     */
    public int getIdRiskData() {
        return idRiskData;
    }

    /**
     * Sets the value of the idRiskData property.
     * 
     */
    public void setIdRiskData(int value) {
        this.idRiskData = value;
    }

    /**
     * Gets the value of the idUniversity property.
     * 
     */
    public int getIdUniversity() {
        return idUniversity;
    }

    /**
     * Sets the value of the idUniversity property.
     * 
     */
    public void setIdUniversity(int value) {
        this.idUniversity = value;
    }

    /**
     * Gets the value of the f27 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF27() {
        return f27;
    }

    /**
     * Sets the value of the f27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF27(String value) {
        this.f27 = value;
    }

    /**
     * Gets the value of the f28 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF28() {
        return f28;
    }

    /**
     * Sets the value of the f28 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF28(String value) {
        this.f28 = value;
    }

    /**
     * Gets the value of the f29 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF29() {
        return f29;
    }

    /**
     * Sets the value of the f29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF29(String value) {
        this.f29 = value;
    }

    /**
     * Gets the value of the f210 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF210() {
        return f210;
    }

    /**
     * Sets the value of the f210 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF210(String value) {
        this.f210 = value;
    }

    /**
     * Gets the value of the f211 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF211() {
        return f211;
    }

    /**
     * Sets the value of the f211 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF211(String value) {
        this.f211 = value;
    }

    /**
     * Gets the value of the f212 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF212() {
        return f212;
    }

    /**
     * Sets the value of the f212 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF212(String value) {
        this.f212 = value;
    }

    /**
     * Gets the value of the f213 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF213() {
        return f213;
    }

    /**
     * Sets the value of the f213 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF213(String value) {
        this.f213 = value;
    }

    /**
     * Gets the value of the f214 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF214() {
        return f214;
    }

    /**
     * Sets the value of the f214 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF214(String value) {
        this.f214 = value;
    }

    /**
     * Gets the value of the f215 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF215() {
        return f215;
    }

    /**
     * Sets the value of the f215 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF215(String value) {
        this.f215 = value;
    }

    /**
     * Gets the value of the f37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF37() {
        return f37;
    }

    /**
     * Sets the value of the f37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF37(String value) {
        this.f37 = value;
    }

    /**
     * Gets the value of the f38 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF38() {
        return f38;
    }

    /**
     * Sets the value of the f38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF38(String value) {
        this.f38 = value;
    }

    /**
     * Gets the value of the f39 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF39() {
        return f39;
    }

    /**
     * Sets the value of the f39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF39(String value) {
        this.f39 = value;
    }

    /**
     * Gets the value of the f310 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF310() {
        return f310;
    }

    /**
     * Sets the value of the f310 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF310(String value) {
        this.f310 = value;
    }

    /**
     * Gets the value of the f311 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF311() {
        return f311;
    }

    /**
     * Sets the value of the f311 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF311(String value) {
        this.f311 = value;
    }

    /**
     * Gets the value of the f312 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF312() {
        return f312;
    }

    /**
     * Sets the value of the f312 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF312(String value) {
        this.f312 = value;
    }

    /**
     * Gets the value of the f313 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF313() {
        return f313;
    }

    /**
     * Sets the value of the f313 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF313(String value) {
        this.f313 = value;
    }

    /**
     * Gets the value of the dateLastCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateLastCheck() {
        return dateLastCheck;
    }

    /**
     * Sets the value of the dateLastCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateLastCheck(String value) {
        this.dateLastCheck = value;
    }

}
