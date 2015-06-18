
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicReports7AData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicReports7AData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicReports7AData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicReports7A" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zvit_PrevYearDenna_Chiselnist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_PrevYearZaoch_Chiselnist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_PrevYearDenna_Priyom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_PrevYearZaoch_Priyom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_PrevYearDenna_Vipusk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_PrevYearZaoch_Vipusk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Plan_CurYearDenna_Chiselnist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Plan_CurYearZaoch_Chiselnist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Plan_CurYearDenna_Priyom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Plan_CurYearZaoch_Priyom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Plan_CurYearDenna_Vipusk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Plan_CurYearZaoch_Vipusk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Prognoz_NextYearDenna_Chiselnist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Prognoz_NextYearZaoch_Chiselnist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Prognoz_NextYearDenna_Priyom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Prognoz_NextYearZaoch_Priyom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Prognoz_NextYearDenna_Vipusk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Prognoz_NextYearZaoch_Vipusk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicReports7AData", propOrder = {
    "idAcademicReports7AData",
    "idAcademicReports7A",
    "scienceSpecialityCode",
    "scienceSpecialityClasifierCode",
    "scienceSpecialityName",
    "zvitPrevYearDennaChiselnist",
    "zvitPrevYearZaochChiselnist",
    "zvitPrevYearDennaPriyom",
    "zvitPrevYearZaochPriyom",
    "zvitPrevYearDennaVipusk",
    "zvitPrevYearZaochVipusk",
    "zvitPlanCurYearDennaChiselnist",
    "zvitPlanCurYearZaochChiselnist",
    "zvitPlanCurYearDennaPriyom",
    "zvitPlanCurYearZaochPriyom",
    "zvitPlanCurYearDennaVipusk",
    "zvitPlanCurYearZaochVipusk",
    "zvitPrognozNextYearDennaChiselnist",
    "zvitPrognozNextYearZaochChiselnist",
    "zvitPrognozNextYearDennaPriyom",
    "zvitPrognozNextYearZaochPriyom",
    "zvitPrognozNextYearDennaVipusk",
    "zvitPrognozNextYearZaochVipusk"
})
public class DAcademicReports7AData {

    @XmlElement(name = "Id_AcademicReports7AData")
    protected int idAcademicReports7AData;
    @XmlElement(name = "Id_AcademicReports7A")
    protected int idAcademicReports7A;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "ScienceSpecialityClasifierCode")
    protected String scienceSpecialityClasifierCode;
    @XmlElement(name = "ScienceSpecialityName")
    protected String scienceSpecialityName;
    @XmlElement(name = "Zvit_PrevYearDenna_Chiselnist")
    protected int zvitPrevYearDennaChiselnist;
    @XmlElement(name = "Zvit_PrevYearZaoch_Chiselnist")
    protected int zvitPrevYearZaochChiselnist;
    @XmlElement(name = "Zvit_PrevYearDenna_Priyom")
    protected int zvitPrevYearDennaPriyom;
    @XmlElement(name = "Zvit_PrevYearZaoch_Priyom")
    protected int zvitPrevYearZaochPriyom;
    @XmlElement(name = "Zvit_PrevYearDenna_Vipusk")
    protected int zvitPrevYearDennaVipusk;
    @XmlElement(name = "Zvit_PrevYearZaoch_Vipusk")
    protected int zvitPrevYearZaochVipusk;
    @XmlElement(name = "Zvit_Plan_CurYearDenna_Chiselnist")
    protected int zvitPlanCurYearDennaChiselnist;
    @XmlElement(name = "Zvit_Plan_CurYearZaoch_Chiselnist")
    protected int zvitPlanCurYearZaochChiselnist;
    @XmlElement(name = "Zvit_Plan_CurYearDenna_Priyom")
    protected int zvitPlanCurYearDennaPriyom;
    @XmlElement(name = "Zvit_Plan_CurYearZaoch_Priyom")
    protected int zvitPlanCurYearZaochPriyom;
    @XmlElement(name = "Zvit_Plan_CurYearDenna_Vipusk")
    protected int zvitPlanCurYearDennaVipusk;
    @XmlElement(name = "Zvit_Plan_CurYearZaoch_Vipusk")
    protected int zvitPlanCurYearZaochVipusk;
    @XmlElement(name = "Zvit_Prognoz_NextYearDenna_Chiselnist")
    protected int zvitPrognozNextYearDennaChiselnist;
    @XmlElement(name = "Zvit_Prognoz_NextYearZaoch_Chiselnist")
    protected int zvitPrognozNextYearZaochChiselnist;
    @XmlElement(name = "Zvit_Prognoz_NextYearDenna_Priyom")
    protected int zvitPrognozNextYearDennaPriyom;
    @XmlElement(name = "Zvit_Prognoz_NextYearZaoch_Priyom")
    protected int zvitPrognozNextYearZaochPriyom;
    @XmlElement(name = "Zvit_Prognoz_NextYearDenna_Vipusk")
    protected int zvitPrognozNextYearDennaVipusk;
    @XmlElement(name = "Zvit_Prognoz_NextYearZaoch_Vipusk")
    protected int zvitPrognozNextYearZaochVipusk;

    /**
     * Gets the value of the idAcademicReports7AData property.
     * 
     */
    public int getIdAcademicReports7AData() {
        return idAcademicReports7AData;
    }

    /**
     * Sets the value of the idAcademicReports7AData property.
     * 
     */
    public void setIdAcademicReports7AData(int value) {
        this.idAcademicReports7AData = value;
    }

    /**
     * Gets the value of the idAcademicReports7A property.
     * 
     */
    public int getIdAcademicReports7A() {
        return idAcademicReports7A;
    }

    /**
     * Sets the value of the idAcademicReports7A property.
     * 
     */
    public void setIdAcademicReports7A(int value) {
        this.idAcademicReports7A = value;
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
     * Gets the value of the zvitPrevYearDennaChiselnist property.
     * 
     */
    public int getZvitPrevYearDennaChiselnist() {
        return zvitPrevYearDennaChiselnist;
    }

    /**
     * Sets the value of the zvitPrevYearDennaChiselnist property.
     * 
     */
    public void setZvitPrevYearDennaChiselnist(int value) {
        this.zvitPrevYearDennaChiselnist = value;
    }

    /**
     * Gets the value of the zvitPrevYearZaochChiselnist property.
     * 
     */
    public int getZvitPrevYearZaochChiselnist() {
        return zvitPrevYearZaochChiselnist;
    }

    /**
     * Sets the value of the zvitPrevYearZaochChiselnist property.
     * 
     */
    public void setZvitPrevYearZaochChiselnist(int value) {
        this.zvitPrevYearZaochChiselnist = value;
    }

    /**
     * Gets the value of the zvitPrevYearDennaPriyom property.
     * 
     */
    public int getZvitPrevYearDennaPriyom() {
        return zvitPrevYearDennaPriyom;
    }

    /**
     * Sets the value of the zvitPrevYearDennaPriyom property.
     * 
     */
    public void setZvitPrevYearDennaPriyom(int value) {
        this.zvitPrevYearDennaPriyom = value;
    }

    /**
     * Gets the value of the zvitPrevYearZaochPriyom property.
     * 
     */
    public int getZvitPrevYearZaochPriyom() {
        return zvitPrevYearZaochPriyom;
    }

    /**
     * Sets the value of the zvitPrevYearZaochPriyom property.
     * 
     */
    public void setZvitPrevYearZaochPriyom(int value) {
        this.zvitPrevYearZaochPriyom = value;
    }

    /**
     * Gets the value of the zvitPrevYearDennaVipusk property.
     * 
     */
    public int getZvitPrevYearDennaVipusk() {
        return zvitPrevYearDennaVipusk;
    }

    /**
     * Sets the value of the zvitPrevYearDennaVipusk property.
     * 
     */
    public void setZvitPrevYearDennaVipusk(int value) {
        this.zvitPrevYearDennaVipusk = value;
    }

    /**
     * Gets the value of the zvitPrevYearZaochVipusk property.
     * 
     */
    public int getZvitPrevYearZaochVipusk() {
        return zvitPrevYearZaochVipusk;
    }

    /**
     * Sets the value of the zvitPrevYearZaochVipusk property.
     * 
     */
    public void setZvitPrevYearZaochVipusk(int value) {
        this.zvitPrevYearZaochVipusk = value;
    }

    /**
     * Gets the value of the zvitPlanCurYearDennaChiselnist property.
     * 
     */
    public int getZvitPlanCurYearDennaChiselnist() {
        return zvitPlanCurYearDennaChiselnist;
    }

    /**
     * Sets the value of the zvitPlanCurYearDennaChiselnist property.
     * 
     */
    public void setZvitPlanCurYearDennaChiselnist(int value) {
        this.zvitPlanCurYearDennaChiselnist = value;
    }

    /**
     * Gets the value of the zvitPlanCurYearZaochChiselnist property.
     * 
     */
    public int getZvitPlanCurYearZaochChiselnist() {
        return zvitPlanCurYearZaochChiselnist;
    }

    /**
     * Sets the value of the zvitPlanCurYearZaochChiselnist property.
     * 
     */
    public void setZvitPlanCurYearZaochChiselnist(int value) {
        this.zvitPlanCurYearZaochChiselnist = value;
    }

    /**
     * Gets the value of the zvitPlanCurYearDennaPriyom property.
     * 
     */
    public int getZvitPlanCurYearDennaPriyom() {
        return zvitPlanCurYearDennaPriyom;
    }

    /**
     * Sets the value of the zvitPlanCurYearDennaPriyom property.
     * 
     */
    public void setZvitPlanCurYearDennaPriyom(int value) {
        this.zvitPlanCurYearDennaPriyom = value;
    }

    /**
     * Gets the value of the zvitPlanCurYearZaochPriyom property.
     * 
     */
    public int getZvitPlanCurYearZaochPriyom() {
        return zvitPlanCurYearZaochPriyom;
    }

    /**
     * Sets the value of the zvitPlanCurYearZaochPriyom property.
     * 
     */
    public void setZvitPlanCurYearZaochPriyom(int value) {
        this.zvitPlanCurYearZaochPriyom = value;
    }

    /**
     * Gets the value of the zvitPlanCurYearDennaVipusk property.
     * 
     */
    public int getZvitPlanCurYearDennaVipusk() {
        return zvitPlanCurYearDennaVipusk;
    }

    /**
     * Sets the value of the zvitPlanCurYearDennaVipusk property.
     * 
     */
    public void setZvitPlanCurYearDennaVipusk(int value) {
        this.zvitPlanCurYearDennaVipusk = value;
    }

    /**
     * Gets the value of the zvitPlanCurYearZaochVipusk property.
     * 
     */
    public int getZvitPlanCurYearZaochVipusk() {
        return zvitPlanCurYearZaochVipusk;
    }

    /**
     * Sets the value of the zvitPlanCurYearZaochVipusk property.
     * 
     */
    public void setZvitPlanCurYearZaochVipusk(int value) {
        this.zvitPlanCurYearZaochVipusk = value;
    }

    /**
     * Gets the value of the zvitPrognozNextYearDennaChiselnist property.
     * 
     */
    public int getZvitPrognozNextYearDennaChiselnist() {
        return zvitPrognozNextYearDennaChiselnist;
    }

    /**
     * Sets the value of the zvitPrognozNextYearDennaChiselnist property.
     * 
     */
    public void setZvitPrognozNextYearDennaChiselnist(int value) {
        this.zvitPrognozNextYearDennaChiselnist = value;
    }

    /**
     * Gets the value of the zvitPrognozNextYearZaochChiselnist property.
     * 
     */
    public int getZvitPrognozNextYearZaochChiselnist() {
        return zvitPrognozNextYearZaochChiselnist;
    }

    /**
     * Sets the value of the zvitPrognozNextYearZaochChiselnist property.
     * 
     */
    public void setZvitPrognozNextYearZaochChiselnist(int value) {
        this.zvitPrognozNextYearZaochChiselnist = value;
    }

    /**
     * Gets the value of the zvitPrognozNextYearDennaPriyom property.
     * 
     */
    public int getZvitPrognozNextYearDennaPriyom() {
        return zvitPrognozNextYearDennaPriyom;
    }

    /**
     * Sets the value of the zvitPrognozNextYearDennaPriyom property.
     * 
     */
    public void setZvitPrognozNextYearDennaPriyom(int value) {
        this.zvitPrognozNextYearDennaPriyom = value;
    }

    /**
     * Gets the value of the zvitPrognozNextYearZaochPriyom property.
     * 
     */
    public int getZvitPrognozNextYearZaochPriyom() {
        return zvitPrognozNextYearZaochPriyom;
    }

    /**
     * Sets the value of the zvitPrognozNextYearZaochPriyom property.
     * 
     */
    public void setZvitPrognozNextYearZaochPriyom(int value) {
        this.zvitPrognozNextYearZaochPriyom = value;
    }

    /**
     * Gets the value of the zvitPrognozNextYearDennaVipusk property.
     * 
     */
    public int getZvitPrognozNextYearDennaVipusk() {
        return zvitPrognozNextYearDennaVipusk;
    }

    /**
     * Sets the value of the zvitPrognozNextYearDennaVipusk property.
     * 
     */
    public void setZvitPrognozNextYearDennaVipusk(int value) {
        this.zvitPrognozNextYearDennaVipusk = value;
    }

    /**
     * Gets the value of the zvitPrognozNextYearZaochVipusk property.
     * 
     */
    public int getZvitPrognozNextYearZaochVipusk() {
        return zvitPrognozNextYearZaochVipusk;
    }

    /**
     * Sets the value of the zvitPrognozNextYearZaochVipusk property.
     * 
     */
    public void setZvitPrognozNextYearZaochVipusk(int value) {
        this.zvitPrognozNextYearZaochVipusk = value;
    }

}
