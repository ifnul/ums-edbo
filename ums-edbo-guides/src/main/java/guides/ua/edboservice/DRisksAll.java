
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dRisksAll complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRisksAll">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Risk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RiskType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RiskTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskData" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityGoverning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RiskData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityBoss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityTypeOfFinfnsing" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityTypeOfFinfnsingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_7" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="f2_8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f2_15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f3_7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f3_8" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="f3_9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f3_10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f3_11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f3_12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="f3_13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskDataDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ConfirmetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Corrected" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_University_Parent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastCheck" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Descriptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRisksAll", propOrder = {
    "idRisk",
    "idRiskType",
    "riskTypeName",
    "riskData",
    "universityGoverning",
    "idRiskData",
    "idUniversity",
    "universityKode",
    "universityName",
    "universityDate",
    "universityBoss",
    "idUniversityTypeOfFinfnsing",
    "universityTypeOfFinfnsingName",
    "universityAdress",
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
    "riskDataDateLastChange",
    "confirmetType",
    "corrected",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "regulationDocumentVerificationHistoryDescription",
    "idUniversityParent",
    "idRegulationDocument",
    "dateLastCheck",
    "descriptions"
})
public class DRisksAll {

    @XmlElement(name = "Id_Risk")
    protected int idRisk;
    @XmlElement(name = "Id_RiskType")
    protected int idRiskType;
    @XmlElement(name = "RiskTypeName")
    protected String riskTypeName;
    @XmlElement(name = "RiskData", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar riskData;
    @XmlElement(name = "UniversityGoverning")
    protected String universityGoverning;
    @XmlElement(name = "Id_RiskData")
    protected int idRiskData;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityName")
    protected String universityName;
    @XmlElement(name = "UniversityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityDate;
    @XmlElement(name = "UniversityBoss")
    protected String universityBoss;
    @XmlElement(name = "Id_UniversityTypeOfFinfnsing")
    protected int idUniversityTypeOfFinfnsing;
    @XmlElement(name = "UniversityTypeOfFinfnsingName")
    protected String universityTypeOfFinfnsingName;
    @XmlElement(name = "UniversityAdress")
    protected String universityAdress;
    @XmlElement(name = "f2_7", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar f27;
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
    @XmlElement(name = "f3_8", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar f38;
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
    @XmlElement(name = "RiskDataDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar riskDataDateLastChange;
    @XmlElement(name = "ConfirmetType")
    protected int confirmetType;
    @XmlElement(name = "Corrected")
    protected int corrected;
    @XmlElement(name = "Id_RegulationDocumentVerificationHistoryType")
    protected int idRegulationDocumentVerificationHistoryType;
    @XmlElement(name = "RegulationDocumentVerificationHistoryTypeName")
    protected String regulationDocumentVerificationHistoryTypeName;
    @XmlElement(name = "RegulationDocumentVerificationHistoryDescription")
    protected String regulationDocumentVerificationHistoryDescription;
    @XmlElement(name = "Id_University_Parent")
    protected int idUniversityParent;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "DateLastCheck", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastCheck;
    @XmlElement(name = "Descriptions")
    protected String descriptions;

    /**
     * Gets the value of the idRisk property.
     * 
     */
    public int getIdRisk() {
        return idRisk;
    }

    /**
     * Sets the value of the idRisk property.
     * 
     */
    public void setIdRisk(int value) {
        this.idRisk = value;
    }

    /**
     * Gets the value of the idRiskType property.
     * 
     */
    public int getIdRiskType() {
        return idRiskType;
    }

    /**
     * Sets the value of the idRiskType property.
     * 
     */
    public void setIdRiskType(int value) {
        this.idRiskType = value;
    }

    /**
     * Gets the value of the riskTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskTypeName() {
        return riskTypeName;
    }

    /**
     * Sets the value of the riskTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskTypeName(String value) {
        this.riskTypeName = value;
    }

    /**
     * Gets the value of the riskData property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRiskData() {
        return riskData;
    }

    /**
     * Sets the value of the riskData property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRiskData(XMLGregorianCalendar value) {
        this.riskData = value;
    }

    /**
     * Gets the value of the universityGoverning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGoverning() {
        return universityGoverning;
    }

    /**
     * Sets the value of the universityGoverning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGoverning(String value) {
        this.universityGoverning = value;
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
     * Gets the value of the universityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * Sets the value of the universityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityName(String value) {
        this.universityName = value;
    }

    /**
     * Gets the value of the universityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityDate() {
        return universityDate;
    }

    /**
     * Sets the value of the universityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityDate(XMLGregorianCalendar value) {
        this.universityDate = value;
    }

    /**
     * Gets the value of the universityBoss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBoss() {
        return universityBoss;
    }

    /**
     * Sets the value of the universityBoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBoss(String value) {
        this.universityBoss = value;
    }

    /**
     * Gets the value of the idUniversityTypeOfFinfnsing property.
     * 
     */
    public int getIdUniversityTypeOfFinfnsing() {
        return idUniversityTypeOfFinfnsing;
    }

    /**
     * Sets the value of the idUniversityTypeOfFinfnsing property.
     * 
     */
    public void setIdUniversityTypeOfFinfnsing(int value) {
        this.idUniversityTypeOfFinfnsing = value;
    }

    /**
     * Gets the value of the universityTypeOfFinfnsingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityTypeOfFinfnsingName() {
        return universityTypeOfFinfnsingName;
    }

    /**
     * Sets the value of the universityTypeOfFinfnsingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityTypeOfFinfnsingName(String value) {
        this.universityTypeOfFinfnsingName = value;
    }

    /**
     * Gets the value of the universityAdress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdress() {
        return universityAdress;
    }

    /**
     * Sets the value of the universityAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdress(String value) {
        this.universityAdress = value;
    }

    /**
     * Gets the value of the f27 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getF27() {
        return f27;
    }

    /**
     * Sets the value of the f27 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setF27(XMLGregorianCalendar value) {
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getF38() {
        return f38;
    }

    /**
     * Sets the value of the f38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setF38(XMLGregorianCalendar value) {
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
     * Gets the value of the riskDataDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRiskDataDateLastChange() {
        return riskDataDateLastChange;
    }

    /**
     * Sets the value of the riskDataDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRiskDataDateLastChange(XMLGregorianCalendar value) {
        this.riskDataDateLastChange = value;
    }

    /**
     * Gets the value of the confirmetType property.
     * 
     */
    public int getConfirmetType() {
        return confirmetType;
    }

    /**
     * Sets the value of the confirmetType property.
     * 
     */
    public void setConfirmetType(int value) {
        this.confirmetType = value;
    }

    /**
     * Gets the value of the corrected property.
     * 
     */
    public int getCorrected() {
        return corrected;
    }

    /**
     * Sets the value of the corrected property.
     * 
     */
    public void setCorrected(int value) {
        this.corrected = value;
    }

    /**
     * Gets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public int getIdRegulationDocumentVerificationHistoryType() {
        return idRegulationDocumentVerificationHistoryType;
    }

    /**
     * Sets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public void setIdRegulationDocumentVerificationHistoryType(int value) {
        this.idRegulationDocumentVerificationHistoryType = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentVerificationHistoryTypeName() {
        return regulationDocumentVerificationHistoryTypeName;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentVerificationHistoryTypeName(String value) {
        this.regulationDocumentVerificationHistoryTypeName = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentVerificationHistoryDescription() {
        return regulationDocumentVerificationHistoryDescription;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentVerificationHistoryDescription(String value) {
        this.regulationDocumentVerificationHistoryDescription = value;
    }

    /**
     * Gets the value of the idUniversityParent property.
     * 
     */
    public int getIdUniversityParent() {
        return idUniversityParent;
    }

    /**
     * Sets the value of the idUniversityParent property.
     * 
     */
    public void setIdUniversityParent(int value) {
        this.idUniversityParent = value;
    }

    /**
     * Gets the value of the idRegulationDocument property.
     * 
     */
    public int getIdRegulationDocument() {
        return idRegulationDocument;
    }

    /**
     * Sets the value of the idRegulationDocument property.
     * 
     */
    public void setIdRegulationDocument(int value) {
        this.idRegulationDocument = value;
    }

    /**
     * Gets the value of the dateLastCheck property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastCheck() {
        return dateLastCheck;
    }

    /**
     * Sets the value of the dateLastCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastCheck(XMLGregorianCalendar value) {
        this.dateLastCheck = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptions(String value) {
        this.descriptions = value;
    }

}
