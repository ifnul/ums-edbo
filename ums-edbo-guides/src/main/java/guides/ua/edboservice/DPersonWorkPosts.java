
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonWorkPosts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonWorkPosts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonWorkPost" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonWorkPostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserAddFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UserEdit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UserEditFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IsWork" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsSciense" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsBoss" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsBossSetExtOrg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversitiesBossOrderOrganisation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiesBossOrderOrganisationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherUniversitiesBossOrderOrganisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonWorkPosts", propOrder = {
    "idPersonWorkPost",
    "universityKode",
    "personWorkPostName",
    "dateCreate",
    "idUserAdd",
    "userAddFIO",
    "idUserEdit",
    "userEditFIO",
    "dateLastChange",
    "isWork",
    "isSciense",
    "isBoss",
    "isBossSetExtOrg",
    "idUniversitiesBossOrderOrganisation",
    "universitiesBossOrderOrganisationName",
    "otherUniversitiesBossOrderOrganisation"
})
public class DPersonWorkPosts {

    @XmlElement(name = "Id_PersonWorkPost")
    protected int idPersonWorkPost;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "PersonWorkPostName")
    protected String personWorkPostName;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "UserAddFIO")
    protected String userAddFIO;
    @XmlElement(name = "Id_UserEdit")
    protected int idUserEdit;
    @XmlElement(name = "UserEditFIO")
    protected String userEditFIO;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "IsWork")
    protected int isWork;
    @XmlElement(name = "IsSciense")
    protected int isSciense;
    @XmlElement(name = "IsBoss")
    protected int isBoss;
    @XmlElement(name = "IsBossSetExtOrg")
    protected int isBossSetExtOrg;
    @XmlElement(name = "Id_UniversitiesBossOrderOrganisation")
    protected int idUniversitiesBossOrderOrganisation;
    @XmlElement(name = "UniversitiesBossOrderOrganisationName")
    protected String universitiesBossOrderOrganisationName;
    @XmlElement(name = "OtherUniversitiesBossOrderOrganisation")
    protected String otherUniversitiesBossOrderOrganisation;

    /**
     * Gets the value of the idPersonWorkPost property.
     * 
     */
    public int getIdPersonWorkPost() {
        return idPersonWorkPost;
    }

    /**
     * Sets the value of the idPersonWorkPost property.
     * 
     */
    public void setIdPersonWorkPost(int value) {
        this.idPersonWorkPost = value;
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
     * Gets the value of the personWorkPostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonWorkPostName() {
        return personWorkPostName;
    }

    /**
     * Sets the value of the personWorkPostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonWorkPostName(String value) {
        this.personWorkPostName = value;
    }

    /**
     * Gets the value of the dateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreate() {
        return dateCreate;
    }

    /**
     * Sets the value of the dateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreate(XMLGregorianCalendar value) {
        this.dateCreate = value;
    }

    /**
     * Gets the value of the idUserAdd property.
     * 
     */
    public int getIdUserAdd() {
        return idUserAdd;
    }

    /**
     * Sets the value of the idUserAdd property.
     * 
     */
    public void setIdUserAdd(int value) {
        this.idUserAdd = value;
    }

    /**
     * Gets the value of the userAddFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAddFIO() {
        return userAddFIO;
    }

    /**
     * Sets the value of the userAddFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAddFIO(String value) {
        this.userAddFIO = value;
    }

    /**
     * Gets the value of the idUserEdit property.
     * 
     */
    public int getIdUserEdit() {
        return idUserEdit;
    }

    /**
     * Sets the value of the idUserEdit property.
     * 
     */
    public void setIdUserEdit(int value) {
        this.idUserEdit = value;
    }

    /**
     * Gets the value of the userEditFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEditFIO() {
        return userEditFIO;
    }

    /**
     * Sets the value of the userEditFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEditFIO(String value) {
        this.userEditFIO = value;
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
     * Gets the value of the isWork property.
     * 
     */
    public int getIsWork() {
        return isWork;
    }

    /**
     * Sets the value of the isWork property.
     * 
     */
    public void setIsWork(int value) {
        this.isWork = value;
    }

    /**
     * Gets the value of the isSciense property.
     * 
     */
    public int getIsSciense() {
        return isSciense;
    }

    /**
     * Sets the value of the isSciense property.
     * 
     */
    public void setIsSciense(int value) {
        this.isSciense = value;
    }

    /**
     * Gets the value of the isBoss property.
     * 
     */
    public int getIsBoss() {
        return isBoss;
    }

    /**
     * Sets the value of the isBoss property.
     * 
     */
    public void setIsBoss(int value) {
        this.isBoss = value;
    }

    /**
     * Gets the value of the isBossSetExtOrg property.
     * 
     */
    public int getIsBossSetExtOrg() {
        return isBossSetExtOrg;
    }

    /**
     * Sets the value of the isBossSetExtOrg property.
     * 
     */
    public void setIsBossSetExtOrg(int value) {
        this.isBossSetExtOrg = value;
    }

    /**
     * Gets the value of the idUniversitiesBossOrderOrganisation property.
     * 
     */
    public int getIdUniversitiesBossOrderOrganisation() {
        return idUniversitiesBossOrderOrganisation;
    }

    /**
     * Sets the value of the idUniversitiesBossOrderOrganisation property.
     * 
     */
    public void setIdUniversitiesBossOrderOrganisation(int value) {
        this.idUniversitiesBossOrderOrganisation = value;
    }

    /**
     * Gets the value of the universitiesBossOrderOrganisationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiesBossOrderOrganisationName() {
        return universitiesBossOrderOrganisationName;
    }

    /**
     * Sets the value of the universitiesBossOrderOrganisationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiesBossOrderOrganisationName(String value) {
        this.universitiesBossOrderOrganisationName = value;
    }

    /**
     * Gets the value of the otherUniversitiesBossOrderOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherUniversitiesBossOrderOrganisation() {
        return otherUniversitiesBossOrderOrganisation;
    }

    /**
     * Sets the value of the otherUniversitiesBossOrderOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherUniversitiesBossOrderOrganisation(String value) {
        this.otherUniversitiesBossOrderOrganisation = value;
    }

}
