
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityStateOrdersData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityStateOrdersData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityStateOrdersData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityStateOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_StateOrdersOsnovaType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecIndastryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseDenna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LicenseZaoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VipuskDenna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VipuskZaoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PriyomDenna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PriyomZaoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VartDenna" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VartZaoch" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="PropDenna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PropZaoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PlanDenna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PlanZaoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FactDenna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FactZaoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecIndastryClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecIndastryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualificationGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateOrdersOsnovaTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ScienceIndustryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Specialization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityStateOrdersData", propOrder = {
    "idUniversityStateOrdersData",
    "idUniversityStateOrder",
    "idStateOrdersOsnovaType",
    "idQualificationGroup",
    "specDirectionsCode",
    "specSpecialityCode",
    "specIndastryCode",
    "licenseDenna",
    "licenseZaoch",
    "vipuskDenna",
    "vipuskZaoch",
    "priyomDenna",
    "priyomZaoch",
    "vartDenna",
    "vartZaoch",
    "propDenna",
    "propZaoch",
    "planDenna",
    "planZaoch",
    "factDenna",
    "factZaoch",
    "specClasifierCode",
    "specName",
    "specCode",
    "specIndastryClasifierCode",
    "specIndastryName",
    "qualificationGroupName",
    "stateOrdersOsnovaTypeName",
    "scienceIndustryCode",
    "scienceIndustryClasifierCode",
    "scienceIndustryName",
    "specialization"
})
public class DUniversityStateOrdersData {

    @XmlElement(name = "Id_UniversityStateOrdersData")
    protected int idUniversityStateOrdersData;
    @XmlElement(name = "Id_UniversityStateOrder")
    protected int idUniversityStateOrder;
    @XmlElement(name = "Id_StateOrdersOsnovaType")
    protected int idStateOrdersOsnovaType;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "SpecIndastryCode")
    protected String specIndastryCode;
    @XmlElement(name = "LicenseDenna")
    protected int licenseDenna;
    @XmlElement(name = "LicenseZaoch")
    protected int licenseZaoch;
    @XmlElement(name = "VipuskDenna")
    protected int vipuskDenna;
    @XmlElement(name = "VipuskZaoch")
    protected int vipuskZaoch;
    @XmlElement(name = "PriyomDenna")
    protected int priyomDenna;
    @XmlElement(name = "PriyomZaoch")
    protected int priyomZaoch;
    @XmlElement(name = "VartDenna")
    protected double vartDenna;
    @XmlElement(name = "VartZaoch")
    protected double vartZaoch;
    @XmlElement(name = "PropDenna")
    protected int propDenna;
    @XmlElement(name = "PropZaoch")
    protected int propZaoch;
    @XmlElement(name = "PlanDenna")
    protected int planDenna;
    @XmlElement(name = "PlanZaoch")
    protected int planZaoch;
    @XmlElement(name = "FactDenna")
    protected int factDenna;
    @XmlElement(name = "FactZaoch")
    protected int factZaoch;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "SpecName")
    protected String specName;
    @XmlElement(name = "SpecCode")
    protected String specCode;
    @XmlElement(name = "SpecIndastryClasifierCode")
    protected String specIndastryClasifierCode;
    @XmlElement(name = "SpecIndastryName")
    protected String specIndastryName;
    @XmlElement(name = "QualificationGroupName")
    protected String qualificationGroupName;
    @XmlElement(name = "StateOrdersOsnovaTypeName")
    protected String stateOrdersOsnovaTypeName;
    @XmlElement(name = "ScienceIndustryCode")
    protected String scienceIndustryCode;
    @XmlElement(name = "ScienceIndustryClasifierCode")
    protected String scienceIndustryClasifierCode;
    @XmlElement(name = "ScienceIndustryName")
    protected String scienceIndustryName;
    @XmlElement(name = "Specialization")
    protected String specialization;

    /**
     * Gets the value of the idUniversityStateOrdersData property.
     * 
     */
    public int getIdUniversityStateOrdersData() {
        return idUniversityStateOrdersData;
    }

    /**
     * Sets the value of the idUniversityStateOrdersData property.
     * 
     */
    public void setIdUniversityStateOrdersData(int value) {
        this.idUniversityStateOrdersData = value;
    }

    /**
     * Gets the value of the idUniversityStateOrder property.
     * 
     */
    public int getIdUniversityStateOrder() {
        return idUniversityStateOrder;
    }

    /**
     * Sets the value of the idUniversityStateOrder property.
     * 
     */
    public void setIdUniversityStateOrder(int value) {
        this.idUniversityStateOrder = value;
    }

    /**
     * Gets the value of the idStateOrdersOsnovaType property.
     * 
     */
    public int getIdStateOrdersOsnovaType() {
        return idStateOrdersOsnovaType;
    }

    /**
     * Sets the value of the idStateOrdersOsnovaType property.
     * 
     */
    public void setIdStateOrdersOsnovaType(int value) {
        this.idStateOrdersOsnovaType = value;
    }

    /**
     * Gets the value of the idQualificationGroup property.
     * 
     */
    public int getIdQualificationGroup() {
        return idQualificationGroup;
    }

    /**
     * Sets the value of the idQualificationGroup property.
     * 
     */
    public void setIdQualificationGroup(int value) {
        this.idQualificationGroup = value;
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
     * Gets the value of the licenseDenna property.
     * 
     */
    public int getLicenseDenna() {
        return licenseDenna;
    }

    /**
     * Sets the value of the licenseDenna property.
     * 
     */
    public void setLicenseDenna(int value) {
        this.licenseDenna = value;
    }

    /**
     * Gets the value of the licenseZaoch property.
     * 
     */
    public int getLicenseZaoch() {
        return licenseZaoch;
    }

    /**
     * Sets the value of the licenseZaoch property.
     * 
     */
    public void setLicenseZaoch(int value) {
        this.licenseZaoch = value;
    }

    /**
     * Gets the value of the vipuskDenna property.
     * 
     */
    public int getVipuskDenna() {
        return vipuskDenna;
    }

    /**
     * Sets the value of the vipuskDenna property.
     * 
     */
    public void setVipuskDenna(int value) {
        this.vipuskDenna = value;
    }

    /**
     * Gets the value of the vipuskZaoch property.
     * 
     */
    public int getVipuskZaoch() {
        return vipuskZaoch;
    }

    /**
     * Sets the value of the vipuskZaoch property.
     * 
     */
    public void setVipuskZaoch(int value) {
        this.vipuskZaoch = value;
    }

    /**
     * Gets the value of the priyomDenna property.
     * 
     */
    public int getPriyomDenna() {
        return priyomDenna;
    }

    /**
     * Sets the value of the priyomDenna property.
     * 
     */
    public void setPriyomDenna(int value) {
        this.priyomDenna = value;
    }

    /**
     * Gets the value of the priyomZaoch property.
     * 
     */
    public int getPriyomZaoch() {
        return priyomZaoch;
    }

    /**
     * Sets the value of the priyomZaoch property.
     * 
     */
    public void setPriyomZaoch(int value) {
        this.priyomZaoch = value;
    }

    /**
     * Gets the value of the vartDenna property.
     * 
     */
    public double getVartDenna() {
        return vartDenna;
    }

    /**
     * Sets the value of the vartDenna property.
     * 
     */
    public void setVartDenna(double value) {
        this.vartDenna = value;
    }

    /**
     * Gets the value of the vartZaoch property.
     * 
     */
    public double getVartZaoch() {
        return vartZaoch;
    }

    /**
     * Sets the value of the vartZaoch property.
     * 
     */
    public void setVartZaoch(double value) {
        this.vartZaoch = value;
    }

    /**
     * Gets the value of the propDenna property.
     * 
     */
    public int getPropDenna() {
        return propDenna;
    }

    /**
     * Sets the value of the propDenna property.
     * 
     */
    public void setPropDenna(int value) {
        this.propDenna = value;
    }

    /**
     * Gets the value of the propZaoch property.
     * 
     */
    public int getPropZaoch() {
        return propZaoch;
    }

    /**
     * Sets the value of the propZaoch property.
     * 
     */
    public void setPropZaoch(int value) {
        this.propZaoch = value;
    }

    /**
     * Gets the value of the planDenna property.
     * 
     */
    public int getPlanDenna() {
        return planDenna;
    }

    /**
     * Sets the value of the planDenna property.
     * 
     */
    public void setPlanDenna(int value) {
        this.planDenna = value;
    }

    /**
     * Gets the value of the planZaoch property.
     * 
     */
    public int getPlanZaoch() {
        return planZaoch;
    }

    /**
     * Sets the value of the planZaoch property.
     * 
     */
    public void setPlanZaoch(int value) {
        this.planZaoch = value;
    }

    /**
     * Gets the value of the factDenna property.
     * 
     */
    public int getFactDenna() {
        return factDenna;
    }

    /**
     * Sets the value of the factDenna property.
     * 
     */
    public void setFactDenna(int value) {
        this.factDenna = value;
    }

    /**
     * Gets the value of the factZaoch property.
     * 
     */
    public int getFactZaoch() {
        return factZaoch;
    }

    /**
     * Sets the value of the factZaoch property.
     * 
     */
    public void setFactZaoch(int value) {
        this.factZaoch = value;
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
     * Gets the value of the specName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecName() {
        return specName;
    }

    /**
     * Sets the value of the specName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecName(String value) {
        this.specName = value;
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
     * Gets the value of the qualificationGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationGroupName() {
        return qualificationGroupName;
    }

    /**
     * Sets the value of the qualificationGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationGroupName(String value) {
        this.qualificationGroupName = value;
    }

    /**
     * Gets the value of the stateOrdersOsnovaTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrdersOsnovaTypeName() {
        return stateOrdersOsnovaTypeName;
    }

    /**
     * Sets the value of the stateOrdersOsnovaTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrdersOsnovaTypeName(String value) {
        this.stateOrdersOsnovaTypeName = value;
    }

    /**
     * Gets the value of the scienceIndustryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceIndustryCode() {
        return scienceIndustryCode;
    }

    /**
     * Sets the value of the scienceIndustryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceIndustryCode(String value) {
        this.scienceIndustryCode = value;
    }

    /**
     * Gets the value of the scienceIndustryClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceIndustryClasifierCode() {
        return scienceIndustryClasifierCode;
    }

    /**
     * Sets the value of the scienceIndustryClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceIndustryClasifierCode(String value) {
        this.scienceIndustryClasifierCode = value;
    }

    /**
     * Gets the value of the scienceIndustryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScienceIndustryName() {
        return scienceIndustryName;
    }

    /**
     * Sets the value of the scienceIndustryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScienceIndustryName(String value) {
        this.scienceIndustryName = value;
    }

    /**
     * Gets the value of the specialization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Sets the value of the specialization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialization(String value) {
        this.specialization = value;
    }

}
