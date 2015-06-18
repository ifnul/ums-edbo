
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dBenefits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dBenefits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Benefit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_BenefitGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BenefitDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BenefitDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_BenefitName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BenefitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BenefitsGroupsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dBenefits", propOrder = {
    "idBenefit",
    "idBenefitGroup",
    "key",
    "dateLastChange",
    "benefitDateBegin",
    "benefitDateEnd",
    "idBenefitName",
    "benefitName",
    "benefitsGroupsName",
    "idLanguage"
})
public class DBenefits {

    @XmlElement(name = "Id_Benefit")
    protected int idBenefit;
    @XmlElement(name = "Id_BenefitGroup")
    protected int idBenefitGroup;
    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "BenefitDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar benefitDateBegin;
    @XmlElement(name = "BenefitDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar benefitDateEnd;
    @XmlElement(name = "Id_BenefitName")
    protected int idBenefitName;
    @XmlElement(name = "BenefitName")
    protected String benefitName;
    @XmlElement(name = "BenefitsGroupsName")
    protected String benefitsGroupsName;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;

    /**
     * Gets the value of the idBenefit property.
     * 
     */
    public int getIdBenefit() {
        return idBenefit;
    }

    /**
     * Sets the value of the idBenefit property.
     * 
     */
    public void setIdBenefit(int value) {
        this.idBenefit = value;
    }

    /**
     * Gets the value of the idBenefitGroup property.
     * 
     */
    public int getIdBenefitGroup() {
        return idBenefitGroup;
    }

    /**
     * Sets the value of the idBenefitGroup property.
     * 
     */
    public void setIdBenefitGroup(int value) {
        this.idBenefitGroup = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
    }

    /**
     * Gets the value of the benefitDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBenefitDateBegin() {
        return benefitDateBegin;
    }

    /**
     * Sets the value of the benefitDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBenefitDateBegin(XMLGregorianCalendar value) {
        this.benefitDateBegin = value;
    }

    /**
     * Gets the value of the benefitDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBenefitDateEnd() {
        return benefitDateEnd;
    }

    /**
     * Sets the value of the benefitDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBenefitDateEnd(XMLGregorianCalendar value) {
        this.benefitDateEnd = value;
    }

    /**
     * Gets the value of the idBenefitName property.
     * 
     */
    public int getIdBenefitName() {
        return idBenefitName;
    }

    /**
     * Sets the value of the idBenefitName property.
     * 
     */
    public void setIdBenefitName(int value) {
        this.idBenefitName = value;
    }

    /**
     * Gets the value of the benefitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitName() {
        return benefitName;
    }

    /**
     * Sets the value of the benefitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitName(String value) {
        this.benefitName = value;
    }

    /**
     * Gets the value of the benefitsGroupsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitsGroupsName() {
        return benefitsGroupsName;
    }

    /**
     * Sets the value of the benefitsGroupsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitsGroupsName(String value) {
        this.benefitsGroupsName = value;
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

}
