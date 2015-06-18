
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dAcademicReports8DData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicReports8DData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicReports8DData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicReports8D" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ScienceSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zvit_PrevYearDenna_Chiselnist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_PrevYearDenna_Priyom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_PrevYearDenna_Vipusk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Plan_CurYearDenna_Chiselnist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Plan_CurYearDenna_Priyom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Plan_CurYearDenna_Vipusk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Prognoz_NextYearDenna_Chiselnist" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Prognoz_NextYearDenna_Priyom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Zvit_Prognoz_NextYearDenna_Vipusk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicReports8DData", propOrder = {
    "idAcademicReports8DData",
    "idAcademicReports8D",
    "scienceSpecialityCode",
    "scienceSpecialityClasifierCode",
    "scienceSpecialityName",
    "zvitPrevYearDennaChiselnist",
    "zvitPrevYearDennaPriyom",
    "zvitPrevYearDennaVipusk",
    "zvitPlanCurYearDennaChiselnist",
    "zvitPlanCurYearDennaPriyom",
    "zvitPlanCurYearDennaVipusk",
    "zvitPrognozNextYearDennaChiselnist",
    "zvitPrognozNextYearDennaPriyom",
    "zvitPrognozNextYearDennaVipusk"
})
public class DAcademicReports8DData {

    @XmlElement(name = "Id_AcademicReports8DData")
    protected int idAcademicReports8DData;
    @XmlElement(name = "Id_AcademicReports8D")
    protected int idAcademicReports8D;
    @XmlElement(name = "ScienceSpecialityCode")
    protected String scienceSpecialityCode;
    @XmlElement(name = "ScienceSpecialityClasifierCode")
    protected String scienceSpecialityClasifierCode;
    @XmlElement(name = "ScienceSpecialityName")
    protected String scienceSpecialityName;
    @XmlElement(name = "Zvit_PrevYearDenna_Chiselnist")
    protected int zvitPrevYearDennaChiselnist;
    @XmlElement(name = "Zvit_PrevYearDenna_Priyom")
    protected int zvitPrevYearDennaPriyom;
    @XmlElement(name = "Zvit_PrevYearDenna_Vipusk")
    protected int zvitPrevYearDennaVipusk;
    @XmlElement(name = "Zvit_Plan_CurYearDenna_Chiselnist")
    protected int zvitPlanCurYearDennaChiselnist;
    @XmlElement(name = "Zvit_Plan_CurYearDenna_Priyom")
    protected int zvitPlanCurYearDennaPriyom;
    @XmlElement(name = "Zvit_Plan_CurYearDenna_Vipusk")
    protected int zvitPlanCurYearDennaVipusk;
    @XmlElement(name = "Zvit_Prognoz_NextYearDenna_Chiselnist")
    protected int zvitPrognozNextYearDennaChiselnist;
    @XmlElement(name = "Zvit_Prognoz_NextYearDenna_Priyom")
    protected int zvitPrognozNextYearDennaPriyom;
    @XmlElement(name = "Zvit_Prognoz_NextYearDenna_Vipusk")
    protected int zvitPrognozNextYearDennaVipusk;

    /**
     * Gets the value of the idAcademicReports8DData property.
     * 
     */
    public int getIdAcademicReports8DData() {
        return idAcademicReports8DData;
    }

    /**
     * Sets the value of the idAcademicReports8DData property.
     * 
     */
    public void setIdAcademicReports8DData(int value) {
        this.idAcademicReports8DData = value;
    }

    /**
     * Gets the value of the idAcademicReports8D property.
     * 
     */
    public int getIdAcademicReports8D() {
        return idAcademicReports8D;
    }

    /**
     * Sets the value of the idAcademicReports8D property.
     * 
     */
    public void setIdAcademicReports8D(int value) {
        this.idAcademicReports8D = value;
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

}
