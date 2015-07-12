
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSpec">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Spec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SpecDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_SpecRedactions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecRedactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecRedactionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecIndastry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecIndastryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecIndastryDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SpecIndastryDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_SpecIndastryName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecIndastryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecDirections" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionsDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SpecDirectionsDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecSpeciality" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SpecSpecialityDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecSpecialization" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecSpecializationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecSpecializationName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecSpecializationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecCodeDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SpecIndastryClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSpec", propOrder = {
    "idSpec",
    "specCode",
    "specClasifierCode",
    "specDateBegin",
    "specDateEnd",
    "idSpecRedactions",
    "specRedactionCode",
    "specRedactionName",
    "idSpecIndastry",
    "specIndastryCode",
    "specIndastryDateBegin",
    "specIndastryDateEnd",
    "idSpecIndastryName",
    "specIndastryName",
    "idSpecDirections",
    "specDirectionsCode",
    "specDirectionsDateBegin",
    "specDirectionsDateEnd",
    "idSpecDirectionName",
    "specDirectionName",
    "idSpecSpeciality",
    "specSpecialityCode",
    "specSpecialityDateBegin",
    "specSpecialityDateEnd",
    "idSpecSpecialityName",
    "specSpecialityName",
    "idLanguage",
    "idSpecSpecialization",
    "specSpecializationCode",
    "idSpecSpecializationName",
    "specSpecializationName",
    "specCodeDateLastChange",
    "specIndastryClasifierCode",
    "specSpecialityClasifierCode"
})
public class DSpec {

    @XmlElement(name = "Id_Spec")
    protected int idSpec;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "SpecDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specDateBegin;
    @XmlElement(name = "SpecDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specDateEnd;
    @XmlElement(name = "Id_SpecRedactions")
    protected int idSpecRedactions;
    @XmlElement(name = "SpecRedactionCode")
    protected String specRedactionCode;
    @XmlElement(name = "SpecRedactionName")
    protected String specRedactionName;
    @XmlElement(name = "Id_SpecIndastry")
    protected int idSpecIndastry;
    @XmlElement(name = "SpecIndastryCode")
    protected String specIndastryCode;
    @XmlElement(name = "SpecIndastryDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specIndastryDateBegin;
    @XmlElement(name = "SpecIndastryDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specIndastryDateEnd;
    @XmlElement(name = "Id_SpecIndastryName")
    protected int idSpecIndastryName;
    @XmlElement(name = "SpecIndastryName")
    protected String specIndastryName;
    @XmlElement(name = "Id_SpecDirections")
    protected int idSpecDirections;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecDirectionsDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specDirectionsDateBegin;
    @XmlElement(name = "SpecDirectionsDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specDirectionsDateEnd;
    @XmlElement(name = "Id_SpecDirectionName")
    protected int idSpecDirectionName;
    @XmlElement(name = "SpecDirectionName")
    protected String specDirectionName;
    @XmlElement(name = "Id_SpecSpeciality")
    protected int idSpecSpeciality;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "SpecSpecialityDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specSpecialityDateBegin;
    @XmlElement(name = "SpecSpecialityDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specSpecialityDateEnd;
    @XmlElement(name = "Id_SpecSpecialityName")
    protected int idSpecSpecialityName;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Id_SpecSpecialization")
    protected int idSpecSpecialization;
    @XmlElement(name = "SpecSpecializationCode")
    protected String specSpecializationCode;
    @XmlElement(name = "Id_SpecSpecializationName")
    protected int idSpecSpecializationName;
    @XmlElement(name = "SpecSpecializationName")
    protected String specSpecializationName;
    @XmlElement(name = "SpecCodeDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar specCodeDateLastChange;
    @XmlElement(name = "SpecIndastryClasifierCode")
    protected String specIndastryClasifierCode;
    @XmlElement(name = "SpecSpecialityClasifierCode")
    protected String specSpecialityClasifierCode;

    /**
     * Gets the value of the idSpec property.
     * 
     */
    public int getIdSpec() {
        return idSpec;
    }

    /**
     * Sets the value of the idSpec property.
     * 
     */
    public void setIdSpec(int value) {
        this.idSpec = value;
    }

    /**
     * Gets the value of the specCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecCode() {
        return specCode;
    }

    /**
     * Sets the value of the specCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecCode(String value) {
        this.specCode = value;
    }

    /**
     * Gets the value of the specClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecClasifierCode() {
        return specClasifierCode;
    }

    /**
     * Sets the value of the specClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecClasifierCode(String value) {
        this.specClasifierCode = value;
    }

    /**
     * Gets the value of the specDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecDateBegin() {
        return specDateBegin;
    }

    /**
     * Sets the value of the specDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecDateBegin(XMLGregorianCalendar value) {
        this.specDateBegin = value;
    }

    /**
     * Gets the value of the specDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecDateEnd() {
        return specDateEnd;
    }

    /**
     * Sets the value of the specDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecDateEnd(XMLGregorianCalendar value) {
        this.specDateEnd = value;
    }

    /**
     * Gets the value of the idSpecRedactions property.
     * 
     */
    public int getIdSpecRedactions() {
        return idSpecRedactions;
    }

    /**
     * Sets the value of the idSpecRedactions property.
     * 
     */
    public void setIdSpecRedactions(int value) {
        this.idSpecRedactions = value;
    }

    /**
     * Gets the value of the specRedactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecRedactionCode() {
        return specRedactionCode;
    }

    /**
     * Sets the value of the specRedactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecRedactionCode(String value) {
        this.specRedactionCode = value;
    }

    /**
     * Gets the value of the specRedactionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecRedactionName() {
        return specRedactionName;
    }

    /**
     * Sets the value of the specRedactionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecRedactionName(String value) {
        this.specRedactionName = value;
    }

    /**
     * Gets the value of the idSpecIndastry property.
     * 
     */
    public int getIdSpecIndastry() {
        return idSpecIndastry;
    }

    /**
     * Sets the value of the idSpecIndastry property.
     * 
     */
    public void setIdSpecIndastry(int value) {
        this.idSpecIndastry = value;
    }

    /**
     * Gets the value of the specIndastryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryCode() {
        return specIndastryCode;
    }

    /**
     * Sets the value of the specIndastryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryCode(String value) {
        this.specIndastryCode = value;
    }

    /**
     * Gets the value of the specIndastryDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecIndastryDateBegin() {
        return specIndastryDateBegin;
    }

    /**
     * Sets the value of the specIndastryDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecIndastryDateBegin(XMLGregorianCalendar value) {
        this.specIndastryDateBegin = value;
    }

    /**
     * Gets the value of the specIndastryDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecIndastryDateEnd() {
        return specIndastryDateEnd;
    }

    /**
     * Sets the value of the specIndastryDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecIndastryDateEnd(XMLGregorianCalendar value) {
        this.specIndastryDateEnd = value;
    }

    /**
     * Gets the value of the idSpecIndastryName property.
     * 
     */
    public int getIdSpecIndastryName() {
        return idSpecIndastryName;
    }

    /**
     * Sets the value of the idSpecIndastryName property.
     * 
     */
    public void setIdSpecIndastryName(int value) {
        this.idSpecIndastryName = value;
    }

    /**
     * Gets the value of the specIndastryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryName() {
        return specIndastryName;
    }

    /**
     * Sets the value of the specIndastryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryName(String value) {
        this.specIndastryName = value;
    }

    /**
     * Gets the value of the idSpecDirections property.
     * 
     */
    public int getIdSpecDirections() {
        return idSpecDirections;
    }

    /**
     * Sets the value of the idSpecDirections property.
     * 
     */
    public void setIdSpecDirections(int value) {
        this.idSpecDirections = value;
    }

    /**
     * Gets the value of the specDirectionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionsCode() {
        return specDirectionsCode;
    }

    /**
     * Sets the value of the specDirectionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionsCode(String value) {
        this.specDirectionsCode = value;
    }

    /**
     * Gets the value of the specDirectionsDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecDirectionsDateBegin() {
        return specDirectionsDateBegin;
    }

    /**
     * Sets the value of the specDirectionsDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecDirectionsDateBegin(XMLGregorianCalendar value) {
        this.specDirectionsDateBegin = value;
    }

    /**
     * Gets the value of the specDirectionsDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecDirectionsDateEnd() {
        return specDirectionsDateEnd;
    }

    /**
     * Sets the value of the specDirectionsDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecDirectionsDateEnd(XMLGregorianCalendar value) {
        this.specDirectionsDateEnd = value;
    }

    /**
     * Gets the value of the idSpecDirectionName property.
     * 
     */
    public int getIdSpecDirectionName() {
        return idSpecDirectionName;
    }

    /**
     * Sets the value of the idSpecDirectionName property.
     * 
     */
    public void setIdSpecDirectionName(int value) {
        this.idSpecDirectionName = value;
    }

    /**
     * Gets the value of the specDirectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionName() {
        return specDirectionName;
    }

    /**
     * Sets the value of the specDirectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionName(String value) {
        this.specDirectionName = value;
    }

    /**
     * Gets the value of the idSpecSpeciality property.
     * 
     */
    public int getIdSpecSpeciality() {
        return idSpecSpeciality;
    }

    /**
     * Sets the value of the idSpecSpeciality property.
     * 
     */
    public void setIdSpecSpeciality(int value) {
        this.idSpecSpeciality = value;
    }

    /**
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
    }

    /**
     * Gets the value of the specSpecialityDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecSpecialityDateBegin() {
        return specSpecialityDateBegin;
    }

    /**
     * Sets the value of the specSpecialityDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecSpecialityDateBegin(XMLGregorianCalendar value) {
        this.specSpecialityDateBegin = value;
    }

    /**
     * Gets the value of the specSpecialityDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecSpecialityDateEnd() {
        return specSpecialityDateEnd;
    }

    /**
     * Sets the value of the specSpecialityDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecSpecialityDateEnd(XMLGregorianCalendar value) {
        this.specSpecialityDateEnd = value;
    }

    /**
     * Gets the value of the idSpecSpecialityName property.
     * 
     */
    public int getIdSpecSpecialityName() {
        return idSpecSpecialityName;
    }

    /**
     * Sets the value of the idSpecSpecialityName property.
     * 
     */
    public void setIdSpecSpecialityName(int value) {
        this.idSpecSpecialityName = value;
    }

    /**
     * Gets the value of the specSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityName() {
        return specSpecialityName;
    }

    /**
     * Sets the value of the specSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityName(String value) {
        this.specSpecialityName = value;
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
     * Gets the value of the idSpecSpecialization property.
     * 
     */
    public int getIdSpecSpecialization() {
        return idSpecSpecialization;
    }

    /**
     * Sets the value of the idSpecSpecialization property.
     * 
     */
    public void setIdSpecSpecialization(int value) {
        this.idSpecSpecialization = value;
    }

    /**
     * Gets the value of the specSpecializationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecializationCode() {
        return specSpecializationCode;
    }

    /**
     * Sets the value of the specSpecializationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecializationCode(String value) {
        this.specSpecializationCode = value;
    }

    /**
     * Gets the value of the idSpecSpecializationName property.
     * 
     */
    public int getIdSpecSpecializationName() {
        return idSpecSpecializationName;
    }

    /**
     * Sets the value of the idSpecSpecializationName property.
     * 
     */
    public void setIdSpecSpecializationName(int value) {
        this.idSpecSpecializationName = value;
    }

    /**
     * Gets the value of the specSpecializationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecializationName() {
        return specSpecializationName;
    }

    /**
     * Sets the value of the specSpecializationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecializationName(String value) {
        this.specSpecializationName = value;
    }

    /**
     * Gets the value of the specCodeDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSpecCodeDateLastChange() {
        return specCodeDateLastChange;
    }

    /**
     * Sets the value of the specCodeDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSpecCodeDateLastChange(XMLGregorianCalendar value) {
        this.specCodeDateLastChange = value;
    }

    /**
     * Gets the value of the specIndastryClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecIndastryClasifierCode() {
        return specIndastryClasifierCode;
    }

    /**
     * Sets the value of the specIndastryClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecIndastryClasifierCode(String value) {
        this.specIndastryClasifierCode = value;
    }

    /**
     * Gets the value of the specSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityClasifierCode() {
        return specSpecialityClasifierCode;
    }

    /**
     * Sets the value of the specSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityClasifierCode(String value) {
        this.specSpecialityClasifierCode = value;
    }

}
