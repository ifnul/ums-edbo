
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityChanges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityChanges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityBossMidleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EDRPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Closed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_UniversityType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityChanges", propOrder = {
    "idUniversity",
    "universityKode",
    "universityName",
    "universityBossLastName",
    "universityBossFirstName",
    "universityBossMidleName",
    "edrpo",
    "closed",
    "dateLastChange",
    "idUniversityType"
})
public class DUniversityChanges {

    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityName")
    protected String universityName;
    @XmlElement(name = "UniversityBossLastName")
    protected String universityBossLastName;
    @XmlElement(name = "UniversityBossFirstName")
    protected String universityBossFirstName;
    @XmlElement(name = "UniversityBossMidleName")
    protected String universityBossMidleName;
    @XmlElement(name = "EDRPO")
    protected String edrpo;
    @XmlElement(name = "Closed")
    protected int closed;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "Id_UniversityType")
    protected int idUniversityType;

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
     * Gets the value of the universityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityName() {
        return universityName;
    }

    /**
     * Sets the value of the universityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityName(String value) {
        this.universityName = value;
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
     * Gets the value of the closed property.
     * 
     */
    public int getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     */
    public void setClosed(int value) {
        this.closed = value;
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
     * Gets the value of the idUniversityType property.
     * 
     */
    public int getIdUniversityType() {
        return idUniversityType;
    }

    /**
     * Sets the value of the idUniversityType property.
     * 
     */
    public void setIdUniversityType(int value) {
        this.idUniversityType = value;
    }

}
