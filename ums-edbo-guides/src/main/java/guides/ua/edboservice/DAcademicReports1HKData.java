
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicReports1HKData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicReports1HKData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicReports1HKData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicReports1HK" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PriyomDennaBudjet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PriyomDennaKomerc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PriyomDennaInsha" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PriyomZaochBudjet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PriyomZaochKomerc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PriyomZaochInsha" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VipuskDennaBudjet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VipuskDennaKomerc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VipuskDennaInsha" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VipuskDennaDisert" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VipuskZaochBudjet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VipuskZaochKomerc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VipuskZaochInsha" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VipuskZaochDisert" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KinecRokuDennaBudjet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KinecRokuDennaKomerc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KinecRokuDennaInsha" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KinecRokuZaochBudjet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KinecRokuZaochKomerc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KinecRokuZaochInsha" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicReports1HKData", propOrder = {
    "idAcademicReports1HKData",
    "idAcademicReports1HK",
    "scienceSpecialityCode",
    "scienceSpecialityClasifierCode",
    "scienceSpecialityName",
    "priyomDennaBudjet",
    "priyomDennaKomerc",
    "priyomDennaInsha",
    "priyomZaochBudjet",
    "priyomZaochKomerc",
    "priyomZaochInsha",
    "vipuskDennaBudjet",
    "vipuskDennaKomerc",
    "vipuskDennaInsha",
    "vipuskDennaDisert",
    "vipuskZaochBudjet",
    "vipuskZaochKomerc",
    "vipuskZaochInsha",
    "vipuskZaochDisert",
    "kinecRokuDennaBudjet",
    "kinecRokuDennaKomerc",
    "kinecRokuDennaInsha",
    "kinecRokuZaochBudjet",
    "kinecRokuZaochKomerc",
    "kinecRokuZaochInsha"
})
public class DAcademicReports1HKData {

    @XmlElement(name = "Id_AcademicReports1HKData")
    protected int idAcademicReports1HKData;
    @XmlElement(name = "Id_AcademicReports1HK")
    protected int idAcademicReports1HK;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "ScienceSpecialityClasifierCode")
    protected String scienceSpecialityClasifierCode;
    @XmlElement(name = "ScienceSpecialityName")
    protected String scienceSpecialityName;
    @XmlElement(name = "PriyomDennaBudjet")
    protected int priyomDennaBudjet;
    @XmlElement(name = "PriyomDennaKomerc")
    protected int priyomDennaKomerc;
    @XmlElement(name = "PriyomDennaInsha")
    protected int priyomDennaInsha;
    @XmlElement(name = "PriyomZaochBudjet")
    protected int priyomZaochBudjet;
    @XmlElement(name = "PriyomZaochKomerc")
    protected int priyomZaochKomerc;
    @XmlElement(name = "PriyomZaochInsha")
    protected int priyomZaochInsha;
    @XmlElement(name = "VipuskDennaBudjet")
    protected int vipuskDennaBudjet;
    @XmlElement(name = "VipuskDennaKomerc")
    protected int vipuskDennaKomerc;
    @XmlElement(name = "VipuskDennaInsha")
    protected int vipuskDennaInsha;
    @XmlElement(name = "VipuskDennaDisert")
    protected int vipuskDennaDisert;
    @XmlElement(name = "VipuskZaochBudjet")
    protected int vipuskZaochBudjet;
    @XmlElement(name = "VipuskZaochKomerc")
    protected int vipuskZaochKomerc;
    @XmlElement(name = "VipuskZaochInsha")
    protected int vipuskZaochInsha;
    @XmlElement(name = "VipuskZaochDisert")
    protected int vipuskZaochDisert;
    @XmlElement(name = "KinecRokuDennaBudjet")
    protected int kinecRokuDennaBudjet;
    @XmlElement(name = "KinecRokuDennaKomerc")
    protected int kinecRokuDennaKomerc;
    @XmlElement(name = "KinecRokuDennaInsha")
    protected int kinecRokuDennaInsha;
    @XmlElement(name = "KinecRokuZaochBudjet")
    protected int kinecRokuZaochBudjet;
    @XmlElement(name = "KinecRokuZaochKomerc")
    protected int kinecRokuZaochKomerc;
    @XmlElement(name = "KinecRokuZaochInsha")
    protected int kinecRokuZaochInsha;

    /**
     * Gets the value of the idAcademicReports1HKData property.
     * 
     */
    public int getIdAcademicReports1HKData() {
        return idAcademicReports1HKData;
    }

    /**
     * Sets the value of the idAcademicReports1HKData property.
     * 
     */
    public void setIdAcademicReports1HKData(int value) {
        this.idAcademicReports1HKData = value;
    }

    /**
     * Gets the value of the idAcademicReports1HK property.
     * 
     */
    public int getIdAcademicReports1HK() {
        return idAcademicReports1HK;
    }

    /**
     * Sets the value of the idAcademicReports1HK property.
     * 
     */
    public void setIdAcademicReports1HK(int value) {
        this.idAcademicReports1HK = value;
    }

    /**
     * Gets the value of the scienceSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityCode() {
        return scienceSpecialityCode;
    }

    /**
     * Sets the value of the scienceSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityCode(String value) {
        this.scienceSpecialityCode = value;
    }

    /**
     * Gets the value of the scienceSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityClasifierCode() {
        return scienceSpecialityClasifierCode;
    }

    /**
     * Sets the value of the scienceSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityClasifierCode(String value) {
        this.scienceSpecialityClasifierCode = value;
    }

    /**
     * Gets the value of the scienceSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceSpecialityName() {
        return scienceSpecialityName;
    }

    /**
     * Sets the value of the scienceSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceSpecialityName(String value) {
        this.scienceSpecialityName = value;
    }

    /**
     * Gets the value of the priyomDennaBudjet property.
     * 
     */
    public int getPriyomDennaBudjet() {
        return priyomDennaBudjet;
    }

    /**
     * Sets the value of the priyomDennaBudjet property.
     * 
     */
    public void setPriyomDennaBudjet(int value) {
        this.priyomDennaBudjet = value;
    }

    /**
     * Gets the value of the priyomDennaKomerc property.
     * 
     */
    public int getPriyomDennaKomerc() {
        return priyomDennaKomerc;
    }

    /**
     * Sets the value of the priyomDennaKomerc property.
     * 
     */
    public void setPriyomDennaKomerc(int value) {
        this.priyomDennaKomerc = value;
    }

    /**
     * Gets the value of the priyomDennaInsha property.
     * 
     */
    public int getPriyomDennaInsha() {
        return priyomDennaInsha;
    }

    /**
     * Sets the value of the priyomDennaInsha property.
     * 
     */
    public void setPriyomDennaInsha(int value) {
        this.priyomDennaInsha = value;
    }

    /**
     * Gets the value of the priyomZaochBudjet property.
     * 
     */
    public int getPriyomZaochBudjet() {
        return priyomZaochBudjet;
    }

    /**
     * Sets the value of the priyomZaochBudjet property.
     * 
     */
    public void setPriyomZaochBudjet(int value) {
        this.priyomZaochBudjet = value;
    }

    /**
     * Gets the value of the priyomZaochKomerc property.
     * 
     */
    public int getPriyomZaochKomerc() {
        return priyomZaochKomerc;
    }

    /**
     * Sets the value of the priyomZaochKomerc property.
     * 
     */
    public void setPriyomZaochKomerc(int value) {
        this.priyomZaochKomerc = value;
    }

    /**
     * Gets the value of the priyomZaochInsha property.
     * 
     */
    public int getPriyomZaochInsha() {
        return priyomZaochInsha;
    }

    /**
     * Sets the value of the priyomZaochInsha property.
     * 
     */
    public void setPriyomZaochInsha(int value) {
        this.priyomZaochInsha = value;
    }

    /**
     * Gets the value of the vipuskDennaBudjet property.
     * 
     */
    public int getVipuskDennaBudjet() {
        return vipuskDennaBudjet;
    }

    /**
     * Sets the value of the vipuskDennaBudjet property.
     * 
     */
    public void setVipuskDennaBudjet(int value) {
        this.vipuskDennaBudjet = value;
    }

    /**
     * Gets the value of the vipuskDennaKomerc property.
     * 
     */
    public int getVipuskDennaKomerc() {
        return vipuskDennaKomerc;
    }

    /**
     * Sets the value of the vipuskDennaKomerc property.
     * 
     */
    public void setVipuskDennaKomerc(int value) {
        this.vipuskDennaKomerc = value;
    }

    /**
     * Gets the value of the vipuskDennaInsha property.
     * 
     */
    public int getVipuskDennaInsha() {
        return vipuskDennaInsha;
    }

    /**
     * Sets the value of the vipuskDennaInsha property.
     * 
     */
    public void setVipuskDennaInsha(int value) {
        this.vipuskDennaInsha = value;
    }

    /**
     * Gets the value of the vipuskDennaDisert property.
     * 
     */
    public int getVipuskDennaDisert() {
        return vipuskDennaDisert;
    }

    /**
     * Sets the value of the vipuskDennaDisert property.
     * 
     */
    public void setVipuskDennaDisert(int value) {
        this.vipuskDennaDisert = value;
    }

    /**
     * Gets the value of the vipuskZaochBudjet property.
     * 
     */
    public int getVipuskZaochBudjet() {
        return vipuskZaochBudjet;
    }

    /**
     * Sets the value of the vipuskZaochBudjet property.
     * 
     */
    public void setVipuskZaochBudjet(int value) {
        this.vipuskZaochBudjet = value;
    }

    /**
     * Gets the value of the vipuskZaochKomerc property.
     * 
     */
    public int getVipuskZaochKomerc() {
        return vipuskZaochKomerc;
    }

    /**
     * Sets the value of the vipuskZaochKomerc property.
     * 
     */
    public void setVipuskZaochKomerc(int value) {
        this.vipuskZaochKomerc = value;
    }

    /**
     * Gets the value of the vipuskZaochInsha property.
     * 
     */
    public int getVipuskZaochInsha() {
        return vipuskZaochInsha;
    }

    /**
     * Sets the value of the vipuskZaochInsha property.
     * 
     */
    public void setVipuskZaochInsha(int value) {
        this.vipuskZaochInsha = value;
    }

    /**
     * Gets the value of the vipuskZaochDisert property.
     * 
     */
    public int getVipuskZaochDisert() {
        return vipuskZaochDisert;
    }

    /**
     * Sets the value of the vipuskZaochDisert property.
     * 
     */
    public void setVipuskZaochDisert(int value) {
        this.vipuskZaochDisert = value;
    }

    /**
     * Gets the value of the kinecRokuDennaBudjet property.
     * 
     */
    public int getKinecRokuDennaBudjet() {
        return kinecRokuDennaBudjet;
    }

    /**
     * Sets the value of the kinecRokuDennaBudjet property.
     * 
     */
    public void setKinecRokuDennaBudjet(int value) {
        this.kinecRokuDennaBudjet = value;
    }

    /**
     * Gets the value of the kinecRokuDennaKomerc property.
     * 
     */
    public int getKinecRokuDennaKomerc() {
        return kinecRokuDennaKomerc;
    }

    /**
     * Sets the value of the kinecRokuDennaKomerc property.
     * 
     */
    public void setKinecRokuDennaKomerc(int value) {
        this.kinecRokuDennaKomerc = value;
    }

    /**
     * Gets the value of the kinecRokuDennaInsha property.
     * 
     */
    public int getKinecRokuDennaInsha() {
        return kinecRokuDennaInsha;
    }

    /**
     * Sets the value of the kinecRokuDennaInsha property.
     * 
     */
    public void setKinecRokuDennaInsha(int value) {
        this.kinecRokuDennaInsha = value;
    }

    /**
     * Gets the value of the kinecRokuZaochBudjet property.
     * 
     */
    public int getKinecRokuZaochBudjet() {
        return kinecRokuZaochBudjet;
    }

    /**
     * Sets the value of the kinecRokuZaochBudjet property.
     * 
     */
    public void setKinecRokuZaochBudjet(int value) {
        this.kinecRokuZaochBudjet = value;
    }

    /**
     * Gets the value of the kinecRokuZaochKomerc property.
     * 
     */
    public int getKinecRokuZaochKomerc() {
        return kinecRokuZaochKomerc;
    }

    /**
     * Sets the value of the kinecRokuZaochKomerc property.
     * 
     */
    public void setKinecRokuZaochKomerc(int value) {
        this.kinecRokuZaochKomerc = value;
    }

    /**
     * Gets the value of the kinecRokuZaochInsha property.
     * 
     */
    public int getKinecRokuZaochInsha() {
        return kinecRokuZaochInsha;
    }

    /**
     * Sets the value of the kinecRokuZaochInsha property.
     * 
     */
    public void setKinecRokuZaochInsha(int value) {
        this.kinecRokuZaochInsha = value;
    }

}
