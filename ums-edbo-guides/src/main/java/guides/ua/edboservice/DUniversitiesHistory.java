
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversitiesHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversitiesHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_EducationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EducationOrganizationFullTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityHistoryDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EDRPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityBossEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityGovernanceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityGovernanceTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityTypeOfFinfnsing" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityTypeOfFinfnsingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StreetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StreetTypeShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouceNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossMidleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostIndexU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUFullNameU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StreetTypeU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StreetTypeShortNameU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdressU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouceNumU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityJuristicalType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityJuristicalTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityBossOperatedType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityBossOperatedTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BossPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityFullNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityShortNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversitiesHistory", propOrder = {
    "idUniversityHistory",
    "idEducationType",
    "educationOrganizationFullTypeName",
    "universityKode",
    "universityHistoryDateEnd",
    "edrpo",
    "universityPhone",
    "universityEMail",
    "website",
    "dateLastChange",
    "universityBossEMail",
    "universityBossPhone",
    "idUniversityGovernanceType",
    "universityGovernanceTypeName",
    "idUniversityTypeOfFinfnsing",
    "universityTypeOfFinfnsingName",
    "universityFullName",
    "universityShortName",
    "postIndex",
    "koatuuCode",
    "koatuuFullName",
    "idStreetType",
    "streetTypeShortName",
    "universityAdress",
    "houceNum",
    "universityBossLastName",
    "universityBossFirstName",
    "universityBossMidleName",
    "koatuuCodeU",
    "postIndexU",
    "koatuuFullNameU",
    "idStreetTypeU",
    "streetTypeShortNameU",
    "universityAdressU",
    "houceNumU",
    "idUniversityJuristicalType",
    "universityJuristicalTypeName",
    "idUniversityBossOperatedType",
    "universityBossOperatedTypeName",
    "bossPost",
    "warrantNumber",
    "warrantDate",
    "universityFullNameEn",
    "universityShortNameEn"
})
public class DUniversitiesHistory {

    @XmlElement(name = "Id_UniversityHistory")
    protected int idUniversityHistory;
    @XmlElement(name = "Id_EducationType")
    protected int idEducationType;
    @XmlElement(name = "EducationOrganizationFullTypeName")
    protected String educationOrganizationFullTypeName;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityHistoryDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityHistoryDateEnd;
    @XmlElement(name = "EDRPO")
    protected String edrpo;
    @XmlElement(name = "UniversityPhone")
    protected String universityPhone;
    @XmlElement(name = "UniversityEMail")
    protected String universityEMail;
    @XmlElement(name = "Website")
    protected String website;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "UniversityBossEMail")
    protected String universityBossEMail;
    @XmlElement(name = "UniversityBossPhone")
    protected String universityBossPhone;
    @XmlElement(name = "Id_UniversityGovernanceType")
    protected int idUniversityGovernanceType;
    @XmlElement(name = "UniversityGovernanceTypeName")
    protected String universityGovernanceTypeName;
    @XmlElement(name = "Id_UniversityTypeOfFinfnsing")
    protected int idUniversityTypeOfFinfnsing;
    @XmlElement(name = "UniversityTypeOfFinfnsingName")
    protected String universityTypeOfFinfnsingName;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityShortName")
    protected String universityShortName;
    @XmlElement(name = "PostIndex")
    protected String postIndex;
    @XmlElement(name = "KOATUUCode")
    protected String koatuuCode;
    @XmlElement(name = "KOATUUFullName")
    protected String koatuuFullName;
    @XmlElement(name = "Id_StreetType")
    protected int idStreetType;
    @XmlElement(name = "StreetTypeShortName")
    protected String streetTypeShortName;
    @XmlElement(name = "UniversityAdress")
    protected String universityAdress;
    @XmlElement(name = "HouceNum")
    protected String houceNum;
    @XmlElement(name = "UniversityBossLastName")
    protected String universityBossLastName;
    @XmlElement(name = "UniversityBossFirstName")
    protected String universityBossFirstName;
    @XmlElement(name = "UniversityBossMidleName")
    protected String universityBossMidleName;
    @XmlElement(name = "KOATUUCodeU")
    protected String koatuuCodeU;
    @XmlElement(name = "PostIndexU")
    protected String postIndexU;
    @XmlElement(name = "KOATUUFullNameU")
    protected String koatuuFullNameU;
    @XmlElement(name = "Id_StreetTypeU")
    protected int idStreetTypeU;
    @XmlElement(name = "StreetTypeShortNameU")
    protected String streetTypeShortNameU;
    @XmlElement(name = "UniversityAdressU")
    protected String universityAdressU;
    @XmlElement(name = "HouceNumU")
    protected String houceNumU;
    @XmlElement(name = "Id_UniversityJuristicalType")
    protected int idUniversityJuristicalType;
    @XmlElement(name = "UniversityJuristicalTypeName")
    protected String universityJuristicalTypeName;
    @XmlElement(name = "Id_UniversityBossOperatedType")
    protected int idUniversityBossOperatedType;
    @XmlElement(name = "UniversityBossOperatedTypeName")
    protected String universityBossOperatedTypeName;
    @XmlElement(name = "BossPost")
    protected String bossPost;
    @XmlElement(name = "WarrantNumber")
    protected String warrantNumber;
    @XmlElement(name = "WarrantDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar warrantDate;
    @XmlElement(name = "UniversityFullNameEn")
    protected String universityFullNameEn;
    @XmlElement(name = "UniversityShortNameEn")
    protected String universityShortNameEn;

    /**
     * Gets the value of the idUniversityHistory property.
     * 
     */
    public int getIdUniversityHistory() {
        return idUniversityHistory;
    }

    /**
     * Sets the value of the idUniversityHistory property.
     * 
     */
    public void setIdUniversityHistory(int value) {
        this.idUniversityHistory = value;
    }

    /**
     * Gets the value of the idEducationType property.
     * 
     */
    public int getIdEducationType() {
        return idEducationType;
    }

    /**
     * Sets the value of the idEducationType property.
     * 
     */
    public void setIdEducationType(int value) {
        this.idEducationType = value;
    }

    /**
     * Gets the value of the educationOrganizationFullTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationOrganizationFullTypeName() {
        return educationOrganizationFullTypeName;
    }

    /**
     * Sets the value of the educationOrganizationFullTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationOrganizationFullTypeName(String value) {
        this.educationOrganizationFullTypeName = value;
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
     * Gets the value of the universityHistoryDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityHistoryDateEnd() {
        return universityHistoryDateEnd;
    }

    /**
     * Sets the value of the universityHistoryDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityHistoryDateEnd(XMLGregorianCalendar value) {
        this.universityHistoryDateEnd = value;
    }

    /**
     * Gets the value of the edrpo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDRPO() {
        return edrpo;
    }

    /**
     * Sets the value of the edrpo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDRPO(String value) {
        this.edrpo = value;
    }

    /**
     * Gets the value of the universityPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityPhone() {
        return universityPhone;
    }

    /**
     * Sets the value of the universityPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityPhone(String value) {
        this.universityPhone = value;
    }

    /**
     * Gets the value of the universityEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityEMail() {
        return universityEMail;
    }

    /**
     * Sets the value of the universityEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityEMail(String value) {
        this.universityEMail = value;
    }

    /**
     * Gets the value of the website property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Sets the value of the website property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
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
     * Gets the value of the universityBossEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossEMail() {
        return universityBossEMail;
    }

    /**
     * Sets the value of the universityBossEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossEMail(String value) {
        this.universityBossEMail = value;
    }

    /**
     * Gets the value of the universityBossPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossPhone() {
        return universityBossPhone;
    }

    /**
     * Sets the value of the universityBossPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossPhone(String value) {
        this.universityBossPhone = value;
    }

    /**
     * Gets the value of the idUniversityGovernanceType property.
     * 
     */
    public int getIdUniversityGovernanceType() {
        return idUniversityGovernanceType;
    }

    /**
     * Sets the value of the idUniversityGovernanceType property.
     * 
     */
    public void setIdUniversityGovernanceType(int value) {
        this.idUniversityGovernanceType = value;
    }

    /**
     * Gets the value of the universityGovernanceTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityGovernanceTypeName() {
        return universityGovernanceTypeName;
    }

    /**
     * Sets the value of the universityGovernanceTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityGovernanceTypeName(String value) {
        this.universityGovernanceTypeName = value;
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
     * Gets the value of the universityFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullName() {
        return universityFullName;
    }

    /**
     * Sets the value of the universityFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullName(String value) {
        this.universityFullName = value;
    }

    /**
     * Gets the value of the universityShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityShortName() {
        return universityShortName;
    }

    /**
     * Sets the value of the universityShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityShortName(String value) {
        this.universityShortName = value;
    }

    /**
     * Gets the value of the postIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostIndex() {
        return postIndex;
    }

    /**
     * Sets the value of the postIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostIndex(String value) {
        this.postIndex = value;
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
     * Gets the value of the koatuuFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUFullName() {
        return koatuuFullName;
    }

    /**
     * Sets the value of the koatuuFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUFullName(String value) {
        this.koatuuFullName = value;
    }

    /**
     * Gets the value of the idStreetType property.
     * 
     */
    public int getIdStreetType() {
        return idStreetType;
    }

    /**
     * Sets the value of the idStreetType property.
     * 
     */
    public void setIdStreetType(int value) {
        this.idStreetType = value;
    }

    /**
     * Gets the value of the streetTypeShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetTypeShortName() {
        return streetTypeShortName;
    }

    /**
     * Sets the value of the streetTypeShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetTypeShortName(String value) {
        this.streetTypeShortName = value;
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
     * Gets the value of the houceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouceNum() {
        return houceNum;
    }

    /**
     * Sets the value of the houceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouceNum(String value) {
        this.houceNum = value;
    }

    /**
     * Gets the value of the universityBossLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossLastName() {
        return universityBossLastName;
    }

    /**
     * Sets the value of the universityBossLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossLastName(String value) {
        this.universityBossLastName = value;
    }

    /**
     * Gets the value of the universityBossFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossFirstName() {
        return universityBossFirstName;
    }

    /**
     * Sets the value of the universityBossFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossFirstName(String value) {
        this.universityBossFirstName = value;
    }

    /**
     * Gets the value of the universityBossMidleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossMidleName() {
        return universityBossMidleName;
    }

    /**
     * Sets the value of the universityBossMidleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossMidleName(String value) {
        this.universityBossMidleName = value;
    }

    /**
     * Gets the value of the koatuuCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCodeU() {
        return koatuuCodeU;
    }

    /**
     * Sets the value of the koatuuCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCodeU(String value) {
        this.koatuuCodeU = value;
    }

    /**
     * Gets the value of the postIndexU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostIndexU() {
        return postIndexU;
    }

    /**
     * Sets the value of the postIndexU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostIndexU(String value) {
        this.postIndexU = value;
    }

    /**
     * Gets the value of the koatuuFullNameU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUFullNameU() {
        return koatuuFullNameU;
    }

    /**
     * Sets the value of the koatuuFullNameU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUFullNameU(String value) {
        this.koatuuFullNameU = value;
    }

    /**
     * Gets the value of the idStreetTypeU property.
     * 
     */
    public int getIdStreetTypeU() {
        return idStreetTypeU;
    }

    /**
     * Sets the value of the idStreetTypeU property.
     * 
     */
    public void setIdStreetTypeU(int value) {
        this.idStreetTypeU = value;
    }

    /**
     * Gets the value of the streetTypeShortNameU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetTypeShortNameU() {
        return streetTypeShortNameU;
    }

    /**
     * Sets the value of the streetTypeShortNameU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetTypeShortNameU(String value) {
        this.streetTypeShortNameU = value;
    }

    /**
     * Gets the value of the universityAdressU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityAdressU() {
        return universityAdressU;
    }

    /**
     * Sets the value of the universityAdressU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityAdressU(String value) {
        this.universityAdressU = value;
    }

    /**
     * Gets the value of the houceNumU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouceNumU() {
        return houceNumU;
    }

    /**
     * Sets the value of the houceNumU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouceNumU(String value) {
        this.houceNumU = value;
    }

    /**
     * Gets the value of the idUniversityJuristicalType property.
     * 
     */
    public int getIdUniversityJuristicalType() {
        return idUniversityJuristicalType;
    }

    /**
     * Sets the value of the idUniversityJuristicalType property.
     * 
     */
    public void setIdUniversityJuristicalType(int value) {
        this.idUniversityJuristicalType = value;
    }

    /**
     * Gets the value of the universityJuristicalTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityJuristicalTypeName() {
        return universityJuristicalTypeName;
    }

    /**
     * Sets the value of the universityJuristicalTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityJuristicalTypeName(String value) {
        this.universityJuristicalTypeName = value;
    }

    /**
     * Gets the value of the idUniversityBossOperatedType property.
     * 
     */
    public int getIdUniversityBossOperatedType() {
        return idUniversityBossOperatedType;
    }

    /**
     * Sets the value of the idUniversityBossOperatedType property.
     * 
     */
    public void setIdUniversityBossOperatedType(int value) {
        this.idUniversityBossOperatedType = value;
    }

    /**
     * Gets the value of the universityBossOperatedTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossOperatedTypeName() {
        return universityBossOperatedTypeName;
    }

    /**
     * Sets the value of the universityBossOperatedTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossOperatedTypeName(String value) {
        this.universityBossOperatedTypeName = value;
    }

    /**
     * Gets the value of the bossPost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBossPost() {
        return bossPost;
    }

    /**
     * Sets the value of the bossPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBossPost(String value) {
        this.bossPost = value;
    }

    /**
     * Gets the value of the warrantNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantNumber() {
        return warrantNumber;
    }

    /**
     * Sets the value of the warrantNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantNumber(String value) {
        this.warrantNumber = value;
    }

    /**
     * Gets the value of the warrantDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWarrantDate() {
        return warrantDate;
    }

    /**
     * Sets the value of the warrantDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWarrantDate(XMLGregorianCalendar value) {
        this.warrantDate = value;
    }

    /**
     * Gets the value of the universityFullNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullNameEn() {
        return universityFullNameEn;
    }

    /**
     * Sets the value of the universityFullNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullNameEn(String value) {
        this.universityFullNameEn = value;
    }

    /**
     * Gets the value of the universityShortNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityShortNameEn() {
        return universityShortNameEn;
    }

    /**
     * Sets the value of the universityShortNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityShortNameEn(String value) {
        this.universityShortNameEn = value;
    }

}
