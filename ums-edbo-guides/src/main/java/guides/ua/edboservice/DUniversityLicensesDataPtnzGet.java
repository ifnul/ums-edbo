
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityLicensesDataPtnzGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicensesDataPtnzGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicenseData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicenseDataDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SpecProfessionCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ptnz_Id_UniversityLicensesSubTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicensesSubTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ptnz_LicenseValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecProfessionClassifierCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionClassifierCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionClassifierCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionClassifierCode4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionClassifierCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionName4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionName5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionClassifierCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfessionComplexNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKodeChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityChild" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullNameChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_SpecProfessions1RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecProfessions2RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecProfessions3RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecProfessions4RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_SpecProfessions5RangType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecProfession1_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession2_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession3_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession4_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecProfession5_Rang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_GlobalRishen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberRishen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateRishen" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityLicensesDataPtnzGet", propOrder = {
    "idUniversityLicenseData",
    "idUniversityLicense",
    "universityLicenseDataDateEnd",
    "specProfessionCode1",
    "specProfessionCode2",
    "specProfessionCode3",
    "specProfessionCode4",
    "specProfessionCode5",
    "ptnzIdUniversityLicensesSubTypes",
    "universityLicensesSubTypesName",
    "ptnzLicenseValue",
    "specProfessionClassifierCode1",
    "specProfessionClassifierCode2",
    "specProfessionClassifierCode3",
    "specProfessionClassifierCode4",
    "specProfessionClassifierCode5",
    "specProfessionName1",
    "specProfessionName2",
    "specProfessionName3",
    "specProfessionName4",
    "specProfessionName5",
    "specProfessionClassifierCodes",
    "specProfessionNames",
    "specProfessionComplexNames",
    "universityKodeChild",
    "idUniversityChild",
    "universityFullNameChild",
    "idSpecProfessions1RangType",
    "idSpecProfessions2RangType",
    "idSpecProfessions3RangType",
    "idSpecProfessions4RangType",
    "idSpecProfessions5RangType",
    "specProfession1Rang",
    "specProfession2Rang",
    "specProfession3Rang",
    "specProfession4Rang",
    "specProfession5Rang",
    "idGlobalRishen",
    "numberRishen",
    "dateRishen"
})
public class DUniversityLicensesDataPtnzGet {

    @XmlElement(name = "Id_UniversityLicenseData")
    protected int idUniversityLicenseData;
    @XmlElement(name = "Id_UniversityLicense")
    protected int idUniversityLicense;
    @XmlElement(name = "UniversityLicenseDataDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityLicenseDataDateEnd;
    @XmlElement(name = "SpecProfessionCode1")
    protected String specProfessionCode1;
    @XmlElement(name = "SpecProfessionCode2")
    protected String specProfessionCode2;
    @XmlElement(name = "SpecProfessionCode3")
    protected String specProfessionCode3;
    @XmlElement(name = "SpecProfessionCode4")
    protected String specProfessionCode4;
    @XmlElement(name = "SpecProfessionCode5")
    protected String specProfessionCode5;
    @XmlElement(name = "Ptnz_Id_UniversityLicensesSubTypes")
    protected int ptnzIdUniversityLicensesSubTypes;
    @XmlElement(name = "UniversityLicensesSubTypesName")
    protected String universityLicensesSubTypesName;
    @XmlElement(name = "Ptnz_LicenseValue")
    protected int ptnzLicenseValue;
    @XmlElement(name = "SpecProfessionClassifierCode1")
    protected String specProfessionClassifierCode1;
    @XmlElement(name = "SpecProfessionClassifierCode2")
    protected String specProfessionClassifierCode2;
    @XmlElement(name = "SpecProfessionClassifierCode3")
    protected String specProfessionClassifierCode3;
    @XmlElement(name = "SpecProfessionClassifierCode4")
    protected String specProfessionClassifierCode4;
    @XmlElement(name = "SpecProfessionClassifierCode5")
    protected String specProfessionClassifierCode5;
    @XmlElement(name = "SpecProfessionName1")
    protected String specProfessionName1;
    @XmlElement(name = "SpecProfessionName2")
    protected String specProfessionName2;
    @XmlElement(name = "SpecProfessionName3")
    protected String specProfessionName3;
    @XmlElement(name = "SpecProfessionName4")
    protected String specProfessionName4;
    @XmlElement(name = "SpecProfessionName5")
    protected String specProfessionName5;
    @XmlElement(name = "SpecProfessionClassifierCodes")
    protected String specProfessionClassifierCodes;
    @XmlElement(name = "SpecProfessionNames")
    protected String specProfessionNames;
    @XmlElement(name = "SpecProfessionComplexNames")
    protected String specProfessionComplexNames;
    @XmlElement(name = "UniversityKodeChild")
    protected String universityKodeChild;
    @XmlElement(name = "Id_UniversityChild")
    protected int idUniversityChild;
    @XmlElement(name = "UniversityFullNameChild")
    protected String universityFullNameChild;
    @XmlElement(name = "Id_SpecProfessions1RangType")
    protected int idSpecProfessions1RangType;
    @XmlElement(name = "Id_SpecProfessions2RangType")
    protected int idSpecProfessions2RangType;
    @XmlElement(name = "Id_SpecProfessions3RangType")
    protected int idSpecProfessions3RangType;
    @XmlElement(name = "Id_SpecProfessions4RangType")
    protected int idSpecProfessions4RangType;
    @XmlElement(name = "Id_SpecProfessions5RangType")
    protected int idSpecProfessions5RangType;
    @XmlElement(name = "SpecProfession1_Rang")
    protected String specProfession1Rang;
    @XmlElement(name = "SpecProfession2_Rang")
    protected String specProfession2Rang;
    @XmlElement(name = "SpecProfession3_Rang")
    protected String specProfession3Rang;
    @XmlElement(name = "SpecProfession4_Rang")
    protected String specProfession4Rang;
    @XmlElement(name = "SpecProfession5_Rang")
    protected String specProfession5Rang;
    @XmlElement(name = "Id_GlobalRishen")
    protected int idGlobalRishen;
    @XmlElement(name = "NumberRishen")
    protected String numberRishen;
    @XmlElement(name = "DateRishen", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRishen;

    /**
     * Gets the value of the idUniversityLicenseData property.
     * 
     */
    public int getIdUniversityLicenseData() {
        return idUniversityLicenseData;
    }

    /**
     * Sets the value of the idUniversityLicenseData property.
     * 
     */
    public void setIdUniversityLicenseData(int value) {
        this.idUniversityLicenseData = value;
    }

    /**
     * Gets the value of the idUniversityLicense property.
     * 
     */
    public int getIdUniversityLicense() {
        return idUniversityLicense;
    }

    /**
     * Sets the value of the idUniversityLicense property.
     * 
     */
    public void setIdUniversityLicense(int value) {
        this.idUniversityLicense = value;
    }

    /**
     * Gets the value of the universityLicenseDataDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityLicenseDataDateEnd() {
        return universityLicenseDataDateEnd;
    }

    /**
     * Sets the value of the universityLicenseDataDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityLicenseDataDateEnd(XMLGregorianCalendar value) {
        this.universityLicenseDataDateEnd = value;
    }

    /**
     * Gets the value of the specProfessionCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCode1() {
        return specProfessionCode1;
    }

    /**
     * Sets the value of the specProfessionCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCode1(String value) {
        this.specProfessionCode1 = value;
    }

    /**
     * Gets the value of the specProfessionCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCode2() {
        return specProfessionCode2;
    }

    /**
     * Sets the value of the specProfessionCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCode2(String value) {
        this.specProfessionCode2 = value;
    }

    /**
     * Gets the value of the specProfessionCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCode3() {
        return specProfessionCode3;
    }

    /**
     * Sets the value of the specProfessionCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCode3(String value) {
        this.specProfessionCode3 = value;
    }

    /**
     * Gets the value of the specProfessionCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCode4() {
        return specProfessionCode4;
    }

    /**
     * Sets the value of the specProfessionCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCode4(String value) {
        this.specProfessionCode4 = value;
    }

    /**
     * Gets the value of the specProfessionCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionCode5() {
        return specProfessionCode5;
    }

    /**
     * Sets the value of the specProfessionCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionCode5(String value) {
        this.specProfessionCode5 = value;
    }

    /**
     * Gets the value of the ptnzIdUniversityLicensesSubTypes property.
     * 
     */
    public int getPtnzIdUniversityLicensesSubTypes() {
        return ptnzIdUniversityLicensesSubTypes;
    }

    /**
     * Sets the value of the ptnzIdUniversityLicensesSubTypes property.
     * 
     */
    public void setPtnzIdUniversityLicensesSubTypes(int value) {
        this.ptnzIdUniversityLicensesSubTypes = value;
    }

    /**
     * Gets the value of the universityLicensesSubTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesSubTypesName() {
        return universityLicensesSubTypesName;
    }

    /**
     * Sets the value of the universityLicensesSubTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesSubTypesName(String value) {
        this.universityLicensesSubTypesName = value;
    }

    /**
     * Gets the value of the ptnzLicenseValue property.
     * 
     */
    public int getPtnzLicenseValue() {
        return ptnzLicenseValue;
    }

    /**
     * Sets the value of the ptnzLicenseValue property.
     * 
     */
    public void setPtnzLicenseValue(int value) {
        this.ptnzLicenseValue = value;
    }

    /**
     * Gets the value of the specProfessionClassifierCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionClassifierCode1() {
        return specProfessionClassifierCode1;
    }

    /**
     * Sets the value of the specProfessionClassifierCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionClassifierCode1(String value) {
        this.specProfessionClassifierCode1 = value;
    }

    /**
     * Gets the value of the specProfessionClassifierCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionClassifierCode2() {
        return specProfessionClassifierCode2;
    }

    /**
     * Sets the value of the specProfessionClassifierCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionClassifierCode2(String value) {
        this.specProfessionClassifierCode2 = value;
    }

    /**
     * Gets the value of the specProfessionClassifierCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionClassifierCode3() {
        return specProfessionClassifierCode3;
    }

    /**
     * Sets the value of the specProfessionClassifierCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionClassifierCode3(String value) {
        this.specProfessionClassifierCode3 = value;
    }

    /**
     * Gets the value of the specProfessionClassifierCode4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionClassifierCode4() {
        return specProfessionClassifierCode4;
    }

    /**
     * Sets the value of the specProfessionClassifierCode4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionClassifierCode4(String value) {
        this.specProfessionClassifierCode4 = value;
    }

    /**
     * Gets the value of the specProfessionClassifierCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionClassifierCode5() {
        return specProfessionClassifierCode5;
    }

    /**
     * Sets the value of the specProfessionClassifierCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionClassifierCode5(String value) {
        this.specProfessionClassifierCode5 = value;
    }

    /**
     * Gets the value of the specProfessionName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionName1() {
        return specProfessionName1;
    }

    /**
     * Sets the value of the specProfessionName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionName1(String value) {
        this.specProfessionName1 = value;
    }

    /**
     * Gets the value of the specProfessionName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionName2() {
        return specProfessionName2;
    }

    /**
     * Sets the value of the specProfessionName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionName2(String value) {
        this.specProfessionName2 = value;
    }

    /**
     * Gets the value of the specProfessionName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionName3() {
        return specProfessionName3;
    }

    /**
     * Sets the value of the specProfessionName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionName3(String value) {
        this.specProfessionName3 = value;
    }

    /**
     * Gets the value of the specProfessionName4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionName4() {
        return specProfessionName4;
    }

    /**
     * Sets the value of the specProfessionName4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionName4(String value) {
        this.specProfessionName4 = value;
    }

    /**
     * Gets the value of the specProfessionName5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionName5() {
        return specProfessionName5;
    }

    /**
     * Sets the value of the specProfessionName5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionName5(String value) {
        this.specProfessionName5 = value;
    }

    /**
     * Gets the value of the specProfessionClassifierCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionClassifierCodes() {
        return specProfessionClassifierCodes;
    }

    /**
     * Sets the value of the specProfessionClassifierCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionClassifierCodes(String value) {
        this.specProfessionClassifierCodes = value;
    }

    /**
     * Gets the value of the specProfessionNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionNames() {
        return specProfessionNames;
    }

    /**
     * Sets the value of the specProfessionNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionNames(String value) {
        this.specProfessionNames = value;
    }

    /**
     * Gets the value of the specProfessionComplexNames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfessionComplexNames() {
        return specProfessionComplexNames;
    }

    /**
     * Sets the value of the specProfessionComplexNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfessionComplexNames(String value) {
        this.specProfessionComplexNames = value;
    }

    /**
     * Gets the value of the universityKodeChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKodeChild() {
        return universityKodeChild;
    }

    /**
     * Sets the value of the universityKodeChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKodeChild(String value) {
        this.universityKodeChild = value;
    }

    /**
     * Gets the value of the idUniversityChild property.
     * 
     */
    public int getIdUniversityChild() {
        return idUniversityChild;
    }

    /**
     * Sets the value of the idUniversityChild property.
     * 
     */
    public void setIdUniversityChild(int value) {
        this.idUniversityChild = value;
    }

    /**
     * Gets the value of the universityFullNameChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullNameChild() {
        return universityFullNameChild;
    }

    /**
     * Sets the value of the universityFullNameChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullNameChild(String value) {
        this.universityFullNameChild = value;
    }

    /**
     * Gets the value of the idSpecProfessions1RangType property.
     * 
     */
    public int getIdSpecProfessions1RangType() {
        return idSpecProfessions1RangType;
    }

    /**
     * Sets the value of the idSpecProfessions1RangType property.
     * 
     */
    public void setIdSpecProfessions1RangType(int value) {
        this.idSpecProfessions1RangType = value;
    }

    /**
     * Gets the value of the idSpecProfessions2RangType property.
     * 
     */
    public int getIdSpecProfessions2RangType() {
        return idSpecProfessions2RangType;
    }

    /**
     * Sets the value of the idSpecProfessions2RangType property.
     * 
     */
    public void setIdSpecProfessions2RangType(int value) {
        this.idSpecProfessions2RangType = value;
    }

    /**
     * Gets the value of the idSpecProfessions3RangType property.
     * 
     */
    public int getIdSpecProfessions3RangType() {
        return idSpecProfessions3RangType;
    }

    /**
     * Sets the value of the idSpecProfessions3RangType property.
     * 
     */
    public void setIdSpecProfessions3RangType(int value) {
        this.idSpecProfessions3RangType = value;
    }

    /**
     * Gets the value of the idSpecProfessions4RangType property.
     * 
     */
    public int getIdSpecProfessions4RangType() {
        return idSpecProfessions4RangType;
    }

    /**
     * Sets the value of the idSpecProfessions4RangType property.
     * 
     */
    public void setIdSpecProfessions4RangType(int value) {
        this.idSpecProfessions4RangType = value;
    }

    /**
     * Gets the value of the idSpecProfessions5RangType property.
     * 
     */
    public int getIdSpecProfessions5RangType() {
        return idSpecProfessions5RangType;
    }

    /**
     * Sets the value of the idSpecProfessions5RangType property.
     * 
     */
    public void setIdSpecProfessions5RangType(int value) {
        this.idSpecProfessions5RangType = value;
    }

    /**
     * Gets the value of the specProfession1Rang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession1Rang() {
        return specProfession1Rang;
    }

    /**
     * Sets the value of the specProfession1Rang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession1Rang(String value) {
        this.specProfession1Rang = value;
    }

    /**
     * Gets the value of the specProfession2Rang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession2Rang() {
        return specProfession2Rang;
    }

    /**
     * Sets the value of the specProfession2Rang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession2Rang(String value) {
        this.specProfession2Rang = value;
    }

    /**
     * Gets the value of the specProfession3Rang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession3Rang() {
        return specProfession3Rang;
    }

    /**
     * Sets the value of the specProfession3Rang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession3Rang(String value) {
        this.specProfession3Rang = value;
    }

    /**
     * Gets the value of the specProfession4Rang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession4Rang() {
        return specProfession4Rang;
    }

    /**
     * Sets the value of the specProfession4Rang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession4Rang(String value) {
        this.specProfession4Rang = value;
    }

    /**
     * Gets the value of the specProfession5Rang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecProfession5Rang() {
        return specProfession5Rang;
    }

    /**
     * Sets the value of the specProfession5Rang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecProfession5Rang(String value) {
        this.specProfession5Rang = value;
    }

    /**
     * Gets the value of the idGlobalRishen property.
     * 
     */
    public int getIdGlobalRishen() {
        return idGlobalRishen;
    }

    /**
     * Sets the value of the idGlobalRishen property.
     * 
     */
    public void setIdGlobalRishen(int value) {
        this.idGlobalRishen = value;
    }

    /**
     * Gets the value of the numberRishen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberRishen() {
        return numberRishen;
    }

    /**
     * Sets the value of the numberRishen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberRishen(String value) {
        this.numberRishen = value;
    }

    /**
     * Gets the value of the dateRishen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRishen() {
        return dateRishen;
    }

    /**
     * Sets the value of the dateRishen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRishen(XMLGregorianCalendar value) {
        this.dateRishen = value;
    }

}
