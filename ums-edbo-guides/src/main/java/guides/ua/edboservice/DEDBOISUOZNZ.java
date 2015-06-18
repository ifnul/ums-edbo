
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dEDBOISUOZNZ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEDBOISUOZNZ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_EDBO_ISUO_ZNZ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ISUO_ZNZ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="semester_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ownership_form_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="znz_level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locality_type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="authority_tree_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="language_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lang_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="must_rep_send_znz1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="must_rep_send_77rvk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="must_rep_send_83rvk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mark_max_value" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="info_regional_projects" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="info_international_projects" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="info_free_rooms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="info_paid_services" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="created_by" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updated_by" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geo_point" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geo_point_lat" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="geo_point_lng" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="regulatory_fullness" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="is_znz_and_dnz" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="is_spec_nvk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="subtype_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="is_overhaul" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="activity_is_stopped" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="is_not_work_other_reasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="is_type_school_internat_urc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="is_for_orphan_student" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="authorized_person" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDRPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postindex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="koatuu_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="full_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="short_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address_house_inf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEDBOISUOZNZ", propOrder = {
    "idEDBOISUOZNZ",
    "idISUOZNZ",
    "universityKode",
    "idUniversity",
    "semesterId",
    "ownershipFormId",
    "znzLevel",
    "localityType",
    "authorityTreeId",
    "languageId",
    "typeId",
    "langCode",
    "mustRepSendZnz1",
    "mustRepSend77Rvk",
    "mustRepSend83Rvk",
    "markMaxValue",
    "infoRegionalProjects",
    "infoInternationalProjects",
    "infoFreeRooms",
    "infoPaidServices",
    "createdAt",
    "updatedAt",
    "createdBy",
    "updatedBy",
    "geoPoint",
    "geoPointLat",
    "geoPointLng",
    "regulatoryFullness",
    "isZnzAndDnz",
    "isSpecNvk",
    "subtypeId",
    "isOverhaul",
    "activityIsStopped",
    "isNotWorkOtherReasons",
    "isTypeSchoolInternatUrc",
    "isForOrphanStudent",
    "authorizedPerson",
    "edrpo",
    "postindex",
    "koatuuId",
    "phone",
    "email",
    "site",
    "fullName",
    "shortName",
    "addressStreet",
    "addressHouseInf"
})
public class DEDBOISUOZNZ {

    @XmlElement(name = "Id_EDBO_ISUO_ZNZ")
    protected int idEDBOISUOZNZ;
    @XmlElement(name = "Id_ISUO_ZNZ")
    protected int idISUOZNZ;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "semester_id")
    protected int semesterId;
    @XmlElement(name = "ownership_form_id")
    protected int ownershipFormId;
    @XmlElement(name = "znz_level")
    protected String znzLevel;
    @XmlElement(name = "locality_type")
    protected int localityType;
    @XmlElement(name = "authority_tree_id")
    protected int authorityTreeId;
    @XmlElement(name = "language_id")
    protected String languageId;
    @XmlElement(name = "type_id")
    protected int typeId;
    @XmlElement(name = "lang_code")
    protected String langCode;
    @XmlElement(name = "must_rep_send_znz1")
    protected int mustRepSendZnz1;
    @XmlElement(name = "must_rep_send_77rvk")
    protected int mustRepSend77Rvk;
    @XmlElement(name = "must_rep_send_83rvk")
    protected int mustRepSend83Rvk;
    @XmlElement(name = "mark_max_value")
    protected int markMaxValue;
    @XmlElement(name = "info_regional_projects")
    protected String infoRegionalProjects;
    @XmlElement(name = "info_international_projects")
    protected String infoInternationalProjects;
    @XmlElement(name = "info_free_rooms")
    protected String infoFreeRooms;
    @XmlElement(name = "info_paid_services")
    protected String infoPaidServices;
    @XmlElement(name = "created_at", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "updated_at", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    @XmlElement(name = "created_by")
    protected String createdBy;
    @XmlElement(name = "updated_by")
    protected String updatedBy;
    @XmlElement(name = "geo_point")
    protected String geoPoint;
    @XmlElement(name = "geo_point_lat", required = true)
    protected BigDecimal geoPointLat;
    @XmlElement(name = "geo_point_lng", required = true)
    protected BigDecimal geoPointLng;
    @XmlElement(name = "regulatory_fullness")
    protected int regulatoryFullness;
    @XmlElement(name = "is_znz_and_dnz")
    protected int isZnzAndDnz;
    @XmlElement(name = "is_spec_nvk")
    protected int isSpecNvk;
    @XmlElement(name = "subtype_id")
    protected int subtypeId;
    @XmlElement(name = "is_overhaul")
    protected int isOverhaul;
    @XmlElement(name = "activity_is_stopped")
    protected int activityIsStopped;
    @XmlElement(name = "is_not_work_other_reasons")
    protected int isNotWorkOtherReasons;
    @XmlElement(name = "is_type_school_internat_urc")
    protected int isTypeSchoolInternatUrc;
    @XmlElement(name = "is_for_orphan_student")
    protected int isForOrphanStudent;
    @XmlElement(name = "authorized_person")
    protected String authorizedPerson;
    @XmlElement(name = "EDRPO")
    protected String edrpo;
    protected String postindex;
    @XmlElement(name = "koatuu_id")
    protected String koatuuId;
    protected String phone;
    protected String email;
    protected String site;
    @XmlElement(name = "full_name")
    protected String fullName;
    @XmlElement(name = "short_name")
    protected String shortName;
    @XmlElement(name = "address_street")
    protected String addressStreet;
    @XmlElement(name = "address_house_inf")
    protected String addressHouseInf;

    /**
     * Gets the value of the idEDBOISUOZNZ property.
     * 
     */
    public int getIdEDBOISUOZNZ() {
        return idEDBOISUOZNZ;
    }

    /**
     * Sets the value of the idEDBOISUOZNZ property.
     * 
     */
    public void setIdEDBOISUOZNZ(int value) {
        this.idEDBOISUOZNZ = value;
    }

    /**
     * Gets the value of the idISUOZNZ property.
     * 
     */
    public int getIdISUOZNZ() {
        return idISUOZNZ;
    }

    /**
     * Sets the value of the idISUOZNZ property.
     * 
     */
    public void setIdISUOZNZ(int value) {
        this.idISUOZNZ = value;
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
     * Gets the value of the semesterId property.
     * 
     */
    public int getSemesterId() {
        return semesterId;
    }

    /**
     * Sets the value of the semesterId property.
     * 
     */
    public void setSemesterId(int value) {
        this.semesterId = value;
    }

    /**
     * Gets the value of the ownershipFormId property.
     * 
     */
    public int getOwnershipFormId() {
        return ownershipFormId;
    }

    /**
     * Sets the value of the ownershipFormId property.
     * 
     */
    public void setOwnershipFormId(int value) {
        this.ownershipFormId = value;
    }

    /**
     * Gets the value of the znzLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZnzLevel() {
        return znzLevel;
    }

    /**
     * Sets the value of the znzLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZnzLevel(String value) {
        this.znzLevel = value;
    }

    /**
     * Gets the value of the localityType property.
     * 
     */
    public int getLocalityType() {
        return localityType;
    }

    /**
     * Sets the value of the localityType property.
     * 
     */
    public void setLocalityType(int value) {
        this.localityType = value;
    }

    /**
     * Gets the value of the authorityTreeId property.
     * 
     */
    public int getAuthorityTreeId() {
        return authorityTreeId;
    }

    /**
     * Sets the value of the authorityTreeId property.
     * 
     */
    public void setAuthorityTreeId(int value) {
        this.authorityTreeId = value;
    }

    /**
     * Gets the value of the languageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageId() {
        return languageId;
    }

    /**
     * Sets the value of the languageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageId(String value) {
        this.languageId = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     */
    public int getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(int value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the langCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * Sets the value of the langCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCode(String value) {
        this.langCode = value;
    }

    /**
     * Gets the value of the mustRepSendZnz1 property.
     * 
     */
    public int getMustRepSendZnz1() {
        return mustRepSendZnz1;
    }

    /**
     * Sets the value of the mustRepSendZnz1 property.
     * 
     */
    public void setMustRepSendZnz1(int value) {
        this.mustRepSendZnz1 = value;
    }

    /**
     * Gets the value of the mustRepSend77Rvk property.
     * 
     */
    public int getMustRepSend77Rvk() {
        return mustRepSend77Rvk;
    }

    /**
     * Sets the value of the mustRepSend77Rvk property.
     * 
     */
    public void setMustRepSend77Rvk(int value) {
        this.mustRepSend77Rvk = value;
    }

    /**
     * Gets the value of the mustRepSend83Rvk property.
     * 
     */
    public int getMustRepSend83Rvk() {
        return mustRepSend83Rvk;
    }

    /**
     * Sets the value of the mustRepSend83Rvk property.
     * 
     */
    public void setMustRepSend83Rvk(int value) {
        this.mustRepSend83Rvk = value;
    }

    /**
     * Gets the value of the markMaxValue property.
     * 
     */
    public int getMarkMaxValue() {
        return markMaxValue;
    }

    /**
     * Sets the value of the markMaxValue property.
     * 
     */
    public void setMarkMaxValue(int value) {
        this.markMaxValue = value;
    }

    /**
     * Gets the value of the infoRegionalProjects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoRegionalProjects() {
        return infoRegionalProjects;
    }

    /**
     * Sets the value of the infoRegionalProjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoRegionalProjects(String value) {
        this.infoRegionalProjects = value;
    }

    /**
     * Gets the value of the infoInternationalProjects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoInternationalProjects() {
        return infoInternationalProjects;
    }

    /**
     * Sets the value of the infoInternationalProjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoInternationalProjects(String value) {
        this.infoInternationalProjects = value;
    }

    /**
     * Gets the value of the infoFreeRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoFreeRooms() {
        return infoFreeRooms;
    }

    /**
     * Sets the value of the infoFreeRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoFreeRooms(String value) {
        this.infoFreeRooms = value;
    }

    /**
     * Gets the value of the infoPaidServices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoPaidServices() {
        return infoPaidServices;
    }

    /**
     * Sets the value of the infoPaidServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoPaidServices(String value) {
        this.infoPaidServices = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedAt(XMLGregorianCalendar value) {
        this.updatedAt = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * Gets the value of the geoPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoPoint() {
        return geoPoint;
    }

    /**
     * Sets the value of the geoPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoPoint(String value) {
        this.geoPoint = value;
    }

    /**
     * Gets the value of the geoPointLat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGeoPointLat() {
        return geoPointLat;
    }

    /**
     * Sets the value of the geoPointLat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGeoPointLat(BigDecimal value) {
        this.geoPointLat = value;
    }

    /**
     * Gets the value of the geoPointLng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGeoPointLng() {
        return geoPointLng;
    }

    /**
     * Sets the value of the geoPointLng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGeoPointLng(BigDecimal value) {
        this.geoPointLng = value;
    }

    /**
     * Gets the value of the regulatoryFullness property.
     * 
     */
    public int getRegulatoryFullness() {
        return regulatoryFullness;
    }

    /**
     * Sets the value of the regulatoryFullness property.
     * 
     */
    public void setRegulatoryFullness(int value) {
        this.regulatoryFullness = value;
    }

    /**
     * Gets the value of the isZnzAndDnz property.
     * 
     */
    public int getIsZnzAndDnz() {
        return isZnzAndDnz;
    }

    /**
     * Sets the value of the isZnzAndDnz property.
     * 
     */
    public void setIsZnzAndDnz(int value) {
        this.isZnzAndDnz = value;
    }

    /**
     * Gets the value of the isSpecNvk property.
     * 
     */
    public int getIsSpecNvk() {
        return isSpecNvk;
    }

    /**
     * Sets the value of the isSpecNvk property.
     * 
     */
    public void setIsSpecNvk(int value) {
        this.isSpecNvk = value;
    }

    /**
     * Gets the value of the subtypeId property.
     * 
     */
    public int getSubtypeId() {
        return subtypeId;
    }

    /**
     * Sets the value of the subtypeId property.
     * 
     */
    public void setSubtypeId(int value) {
        this.subtypeId = value;
    }

    /**
     * Gets the value of the isOverhaul property.
     * 
     */
    public int getIsOverhaul() {
        return isOverhaul;
    }

    /**
     * Sets the value of the isOverhaul property.
     * 
     */
    public void setIsOverhaul(int value) {
        this.isOverhaul = value;
    }

    /**
     * Gets the value of the activityIsStopped property.
     * 
     */
    public int getActivityIsStopped() {
        return activityIsStopped;
    }

    /**
     * Sets the value of the activityIsStopped property.
     * 
     */
    public void setActivityIsStopped(int value) {
        this.activityIsStopped = value;
    }

    /**
     * Gets the value of the isNotWorkOtherReasons property.
     * 
     */
    public int getIsNotWorkOtherReasons() {
        return isNotWorkOtherReasons;
    }

    /**
     * Sets the value of the isNotWorkOtherReasons property.
     * 
     */
    public void setIsNotWorkOtherReasons(int value) {
        this.isNotWorkOtherReasons = value;
    }

    /**
     * Gets the value of the isTypeSchoolInternatUrc property.
     * 
     */
    public int getIsTypeSchoolInternatUrc() {
        return isTypeSchoolInternatUrc;
    }

    /**
     * Sets the value of the isTypeSchoolInternatUrc property.
     * 
     */
    public void setIsTypeSchoolInternatUrc(int value) {
        this.isTypeSchoolInternatUrc = value;
    }

    /**
     * Gets the value of the isForOrphanStudent property.
     * 
     */
    public int getIsForOrphanStudent() {
        return isForOrphanStudent;
    }

    /**
     * Sets the value of the isForOrphanStudent property.
     * 
     */
    public void setIsForOrphanStudent(int value) {
        this.isForOrphanStudent = value;
    }

    /**
     * Gets the value of the authorizedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizedPerson() {
        return authorizedPerson;
    }

    /**
     * Sets the value of the authorizedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizedPerson(String value) {
        this.authorizedPerson = value;
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
     * Gets the value of the postindex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostindex() {
        return postindex;
    }

    /**
     * Sets the value of the postindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostindex(String value) {
        this.postindex = value;
    }

    /**
     * Gets the value of the koatuuId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoatuuId() {
        return koatuuId;
    }

    /**
     * Sets the value of the koatuuId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoatuuId(String value) {
        this.koatuuId = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the addressStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreet() {
        return addressStreet;
    }

    /**
     * Sets the value of the addressStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreet(String value) {
        this.addressStreet = value;
    }

    /**
     * Gets the value of the addressHouseInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressHouseInf() {
        return addressHouseInf;
    }

    /**
     * Sets the value of the addressHouseInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressHouseInf(String value) {
        this.addressHouseInf = value;
    }

}
