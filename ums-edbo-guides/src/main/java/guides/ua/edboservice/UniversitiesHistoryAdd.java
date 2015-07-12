
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
 *         &lt;element name="Id_EducationType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityHistoryDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDRPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityGovernanceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityTypeOfFinfnsing" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KOATUUCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostIndexU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossMidleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StreetType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HouceNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityAdressU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StreetTypeU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HouceNumU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityJuristicalType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityBossOperatedType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BossPost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WarrantDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "idEducationType",
    "universityKode",
    "universityHistoryDateEnd",
    "edrpo",
    "postIndex",
    "koatuuCode",
    "universityPhone",
    "universityEMail",
    "website",
    "universityBossEMail",
    "universityBossPhone",
    "idUniversityGovernanceType",
    "idUniversityTypeOfFinfnsing",
    "koatuuCodeU",
    "postIndexU",
    "universityFullName",
    "universityShortName",
    "universityAdress",
    "universityBossLastName",
    "universityBossFirstName",
    "universityBossMidleName",
    "idStreetType",
    "houceNum",
    "universityAdressU",
    "idStreetTypeU",
    "houceNumU",
    "idUniversityJuristicalType",
    "idUniversityBossOperatedType",
    "bossPost",
    "warrantNumber",
    "warrantDate",
    "universityFullNameEn",
    "universityShortNameEn"
})
@XmlRootElement(name = "UniversitiesHistoryAdd")
public class UniversitiesHistoryAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_EducationType")
    protected int idEducationType;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityHistoryDateEnd")
    protected String universityHistoryDateEnd;
    @XmlElement(name = "EDRPO")
    protected String edrpo;
    @XmlElement(name = "PostIndex")
    protected String postIndex;
    @XmlElement(name = "KOATUUCode")
    protected String koatuuCode;
    @XmlElement(name = "UniversityPhone")
    protected String universityPhone;
    @XmlElement(name = "UniversityEMail")
    protected String universityEMail;
    @XmlElement(name = "Website")
    protected String website;
    @XmlElement(name = "UniversityBossEMail")
    protected String universityBossEMail;
    @XmlElement(name = "UniversityBossPhone")
    protected String universityBossPhone;
    @XmlElement(name = "Id_UniversityGovernanceType")
    protected int idUniversityGovernanceType;
    @XmlElement(name = "Id_UniversityTypeOfFinfnsing")
    protected int idUniversityTypeOfFinfnsing;
    @XmlElement(name = "KOATUUCodeU")
    protected String koatuuCodeU;
    @XmlElement(name = "PostIndexU")
    protected String postIndexU;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "UniversityShortName")
    protected String universityShortName;
    @XmlElement(name = "UniversityAdress")
    protected String universityAdress;
    @XmlElement(name = "UniversityBossLastName")
    protected String universityBossLastName;
    @XmlElement(name = "UniversityBossFirstName")
    protected String universityBossFirstName;
    @XmlElement(name = "UniversityBossMidleName")
    protected String universityBossMidleName;
    @XmlElement(name = "Id_StreetType")
    protected int idStreetType;
    @XmlElement(name = "HouceNum")
    protected String houceNum;
    @XmlElement(name = "UniversityAdressU")
    protected String universityAdressU;
    @XmlElement(name = "Id_StreetTypeU")
    protected int idStreetTypeU;
    @XmlElement(name = "HouceNumU")
    protected String houceNumU;
    @XmlElement(name = "Id_UniversityJuristicalType")
    protected int idUniversityJuristicalType;
    @XmlElement(name = "Id_UniversityBossOperatedType")
    protected int idUniversityBossOperatedType;
    @XmlElement(name = "BossPost")
    protected String bossPost;
    @XmlElement(name = "WarrantNumber")
    protected String warrantNumber;
    @XmlElement(name = "WarrantDate")
    protected String warrantDate;
    @XmlElement(name = "UniversityFullNameEn")
    protected String universityFullNameEn;
    @XmlElement(name = "UniversityShortNameEn")
    protected String universityShortNameEn;

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
     *     {@link String }
     *     
     */
    public String getUniversityHistoryDateEnd() {
        return universityHistoryDateEnd;
    }

    /**
     * Sets the value of the universityHistoryDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityHistoryDateEnd(String value) {
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
     *     {@link String }
     *     
     */
    public String getWarrantDate() {
        return warrantDate;
    }

    /**
     * Sets the value of the warrantDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantDate(String value) {
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
