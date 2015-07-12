
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dAcademicCouncilPersons complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicCouncilPersons">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicCouncilPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicCouncil" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicCouncilPersonType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicCouncilPersonDateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UserAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicCouncilPersonTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicCouncilPersons", propOrder = {
    "idAcademicCouncilPerson",
    "idAcademicCouncil",
    "idAcademicCouncilPersonType",
    "personCodeU",
    "idPersonName",
    "academicCouncilPersonDateCreate",
    "idUserAdd",
    "academicCouncilPersonTypeName",
    "fio"
})
public class DAcademicCouncilPersons {

    @XmlElement(name = "Id_AcademicCouncilPerson")
    protected int idAcademicCouncilPerson;
    @XmlElement(name = "Id_AcademicCouncil")
    protected int idAcademicCouncil;
    @XmlElement(name = "Id_AcademicCouncilPersonType")
    protected int idAcademicCouncilPersonType;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_PersonName")
    protected int idPersonName;
    @XmlElement(name = "AcademicCouncilPersonDateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicCouncilPersonDateCreate;
    @XmlElement(name = "Id_UserAdd")
    protected int idUserAdd;
    @XmlElement(name = "AcademicCouncilPersonTypeName")
    protected String academicCouncilPersonTypeName;
    @XmlElement(name = "FIO")
    protected String fio;

    /**
     * Gets the value of the idAcademicCouncilPerson property.
     * 
     */
    public int getIdAcademicCouncilPerson() {
        return idAcademicCouncilPerson;
    }

    /**
     * Sets the value of the idAcademicCouncilPerson property.
     * 
     */
    public void setIdAcademicCouncilPerson(int value) {
        this.idAcademicCouncilPerson = value;
    }

    /**
     * Gets the value of the idAcademicCouncil property.
     * 
     */
    public int getIdAcademicCouncil() {
        return idAcademicCouncil;
    }

    /**
     * Sets the value of the idAcademicCouncil property.
     * 
     */
    public void setIdAcademicCouncil(int value) {
        this.idAcademicCouncil = value;
    }

    /**
     * Gets the value of the idAcademicCouncilPersonType property.
     * 
     */
    public int getIdAcademicCouncilPersonType() {
        return idAcademicCouncilPersonType;
    }

    /**
     * Sets the value of the idAcademicCouncilPersonType property.
     * 
     */
    public void setIdAcademicCouncilPersonType(int value) {
        this.idAcademicCouncilPersonType = value;
    }

    /**
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
    }

    /**
     * Gets the value of the idPersonName property.
     * 
     */
    public int getIdPersonName() {
        return idPersonName;
    }

    /**
     * Sets the value of the idPersonName property.
     * 
     */
    public void setIdPersonName(int value) {
        this.idPersonName = value;
    }

    /**
     * Gets the value of the academicCouncilPersonDateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicCouncilPersonDateCreate() {
        return academicCouncilPersonDateCreate;
    }

    /**
     * Sets the value of the academicCouncilPersonDateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicCouncilPersonDateCreate(XMLGregorianCalendar value) {
        this.academicCouncilPersonDateCreate = value;
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
     * Gets the value of the academicCouncilPersonTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicCouncilPersonTypeName() {
        return academicCouncilPersonTypeName;
    }

    /**
     * Sets the value of the academicCouncilPersonTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicCouncilPersonTypeName(String value) {
        this.academicCouncilPersonTypeName = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
    }

}
