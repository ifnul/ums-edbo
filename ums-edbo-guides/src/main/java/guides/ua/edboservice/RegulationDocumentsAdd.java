
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
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentFormat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentAuthor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingPosition1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingFIO1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingPosition2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingFIO2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingPosition3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingFIO3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingPosition4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentSingFIO4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rows" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocumentDataTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentBase64String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idLanguage",
    "idRegulationDocumentType",
    "idRegulationDocumentFormat",
    "regulationDocumentName",
    "regulationDocumentData",
    "regulationDocumentNumber",
    "regulationDocumentAuthor",
    "regulationDocumentSingPosition1",
    "regulationDocumentSingFIO1",
    "regulationDocumentSingPosition2",
    "regulationDocumentSingFIO2",
    "regulationDocumentSingPosition3",
    "regulationDocumentSingFIO3",
    "regulationDocumentSingPosition4",
    "regulationDocumentSingFIO4",
    "universityKode",
    "regulationDocumentDateBegin",
    "regulationDocumentDateEnd",
    "rows",
    "idRegulationDocumentDataTypes",
    "regulationDocumentBase64String"
})
@XmlRootElement(name = "RegulationDocumentsAdd")
public class RegulationDocumentsAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Id_RegulationDocumentType")
    protected int idRegulationDocumentType;
    @XmlElement(name = "Id_RegulationDocumentFormat")
    protected int idRegulationDocumentFormat;
    @XmlElement(name = "RegulationDocumentName")
    protected String regulationDocumentName;
    @XmlElement(name = "RegulationDocumentData")
    protected String regulationDocumentData;
    @XmlElement(name = "RegulationDocumentNumber")
    protected String regulationDocumentNumber;
    @XmlElement(name = "RegulationDocumentAuthor")
    protected String regulationDocumentAuthor;
    @XmlElement(name = "RegulationDocumentSingPosition1")
    protected String regulationDocumentSingPosition1;
    @XmlElement(name = "RegulationDocumentSingFIO1")
    protected String regulationDocumentSingFIO1;
    @XmlElement(name = "RegulationDocumentSingPosition2")
    protected String regulationDocumentSingPosition2;
    @XmlElement(name = "RegulationDocumentSingFIO2")
    protected String regulationDocumentSingFIO2;
    @XmlElement(name = "RegulationDocumentSingPosition3")
    protected String regulationDocumentSingPosition3;
    @XmlElement(name = "RegulationDocumentSingFIO3")
    protected String regulationDocumentSingFIO3;
    @XmlElement(name = "RegulationDocumentSingPosition4")
    protected String regulationDocumentSingPosition4;
    @XmlElement(name = "RegulationDocumentSingFIO4")
    protected String regulationDocumentSingFIO4;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "RegulationDocumentDateBegin")
    protected String regulationDocumentDateBegin;
    @XmlElement(name = "RegulationDocumentDateEnd")
    protected String regulationDocumentDateEnd;
    @XmlElement(name = "Rows")
    protected String rows;
    @XmlElement(name = "Id_RegulationDocumentDataTypes")
    protected int idRegulationDocumentDataTypes;
    @XmlElement(name = "RegulationDocumentBase64String")
    protected String regulationDocumentBase64String;

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
     * Gets the value of the idRegulationDocumentType property.
     * 
     */
    public int getIdRegulationDocumentType() {
        return idRegulationDocumentType;
    }

    /**
     * Sets the value of the idRegulationDocumentType property.
     * 
     */
    public void setIdRegulationDocumentType(int value) {
        this.idRegulationDocumentType = value;
    }

    /**
     * Gets the value of the idRegulationDocumentFormat property.
     * 
     */
    public int getIdRegulationDocumentFormat() {
        return idRegulationDocumentFormat;
    }

    /**
     * Sets the value of the idRegulationDocumentFormat property.
     * 
     */
    public void setIdRegulationDocumentFormat(int value) {
        this.idRegulationDocumentFormat = value;
    }

    /**
     * Gets the value of the regulationDocumentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentName() {
        return regulationDocumentName;
    }

    /**
     * Sets the value of the regulationDocumentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentName(String value) {
        this.regulationDocumentName = value;
    }

    /**
     * Gets the value of the regulationDocumentData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentData() {
        return regulationDocumentData;
    }

    /**
     * Sets the value of the regulationDocumentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentData(String value) {
        this.regulationDocumentData = value;
    }

    /**
     * Gets the value of the regulationDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentNumber() {
        return regulationDocumentNumber;
    }

    /**
     * Sets the value of the regulationDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentNumber(String value) {
        this.regulationDocumentNumber = value;
    }

    /**
     * Gets the value of the regulationDocumentAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentAuthor() {
        return regulationDocumentAuthor;
    }

    /**
     * Sets the value of the regulationDocumentAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentAuthor(String value) {
        this.regulationDocumentAuthor = value;
    }

    /**
     * Gets the value of the regulationDocumentSingPosition1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingPosition1() {
        return regulationDocumentSingPosition1;
    }

    /**
     * Sets the value of the regulationDocumentSingPosition1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingPosition1(String value) {
        this.regulationDocumentSingPosition1 = value;
    }

    /**
     * Gets the value of the regulationDocumentSingFIO1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingFIO1() {
        return regulationDocumentSingFIO1;
    }

    /**
     * Sets the value of the regulationDocumentSingFIO1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingFIO1(String value) {
        this.regulationDocumentSingFIO1 = value;
    }

    /**
     * Gets the value of the regulationDocumentSingPosition2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingPosition2() {
        return regulationDocumentSingPosition2;
    }

    /**
     * Sets the value of the regulationDocumentSingPosition2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingPosition2(String value) {
        this.regulationDocumentSingPosition2 = value;
    }

    /**
     * Gets the value of the regulationDocumentSingFIO2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingFIO2() {
        return regulationDocumentSingFIO2;
    }

    /**
     * Sets the value of the regulationDocumentSingFIO2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingFIO2(String value) {
        this.regulationDocumentSingFIO2 = value;
    }

    /**
     * Gets the value of the regulationDocumentSingPosition3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingPosition3() {
        return regulationDocumentSingPosition3;
    }

    /**
     * Sets the value of the regulationDocumentSingPosition3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingPosition3(String value) {
        this.regulationDocumentSingPosition3 = value;
    }

    /**
     * Gets the value of the regulationDocumentSingFIO3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingFIO3() {
        return regulationDocumentSingFIO3;
    }

    /**
     * Sets the value of the regulationDocumentSingFIO3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingFIO3(String value) {
        this.regulationDocumentSingFIO3 = value;
    }

    /**
     * Gets the value of the regulationDocumentSingPosition4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingPosition4() {
        return regulationDocumentSingPosition4;
    }

    /**
     * Sets the value of the regulationDocumentSingPosition4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingPosition4(String value) {
        this.regulationDocumentSingPosition4 = value;
    }

    /**
     * Gets the value of the regulationDocumentSingFIO4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentSingFIO4() {
        return regulationDocumentSingFIO4;
    }

    /**
     * Sets the value of the regulationDocumentSingFIO4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentSingFIO4(String value) {
        this.regulationDocumentSingFIO4 = value;
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
     * Gets the value of the regulationDocumentDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentDateBegin() {
        return regulationDocumentDateBegin;
    }

    /**
     * Sets the value of the regulationDocumentDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentDateBegin(String value) {
        this.regulationDocumentDateBegin = value;
    }

    /**
     * Gets the value of the regulationDocumentDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentDateEnd() {
        return regulationDocumentDateEnd;
    }

    /**
     * Sets the value of the regulationDocumentDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentDateEnd(String value) {
        this.regulationDocumentDateEnd = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRows(String value) {
        this.rows = value;
    }

    /**
     * Gets the value of the idRegulationDocumentDataTypes property.
     * 
     */
    public int getIdRegulationDocumentDataTypes() {
        return idRegulationDocumentDataTypes;
    }

    /**
     * Sets the value of the idRegulationDocumentDataTypes property.
     * 
     */
    public void setIdRegulationDocumentDataTypes(int value) {
        this.idRegulationDocumentDataTypes = value;
    }

    /**
     * Gets the value of the regulationDocumentBase64String property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentBase64String() {
        return regulationDocumentBase64String;
    }

    /**
     * Sets the value of the regulationDocumentBase64String property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentBase64String(String value) {
        this.regulationDocumentBase64String = value;
    }

}
