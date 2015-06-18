
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dOlympiadsAwards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOlympiadsAwards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Olimpiad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestSeasons" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OlimpiadName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateLastChangeOlimpiad" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_OlympiadAward" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OlympiadAwardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OlympiadAwardBonus" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DateLastChangeOlympiadAward" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOlympiadsAwards", propOrder = {
    "idOlimpiad",
    "idPersonRequestSeasons",
    "olimpiadName",
    "dateLastChangeOlimpiad",
    "idOlympiadAward",
    "olympiadAwardName",
    "olympiadAwardBonus",
    "dateLastChangeOlympiadAward"
})
public class DOlympiadsAwards {

    @XmlElement(name = "Id_Olimpiad")
    protected int idOlimpiad;
    @XmlElement(name = "Id_PersonRequestSeasons")
    protected int idPersonRequestSeasons;
    @XmlElement(name = "OlimpiadName")
    protected String olimpiadName;
    @XmlElement(name = "DateLastChangeOlimpiad", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChangeOlimpiad;
    @XmlElement(name = "Id_OlympiadAward")
    protected int idOlympiadAward;
    @XmlElement(name = "OlympiadAwardName")
    protected String olympiadAwardName;
    @XmlElement(name = "OlympiadAwardBonus")
    protected double olympiadAwardBonus;
    @XmlElement(name = "DateLastChangeOlympiadAward", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChangeOlympiadAward;

    /**
     * Gets the value of the idOlimpiad property.
     * 
     */
    public int getIdOlimpiad() {
        return idOlimpiad;
    }

    /**
     * Sets the value of the idOlimpiad property.
     * 
     */
    public void setIdOlimpiad(int value) {
        this.idOlimpiad = value;
    }

    /**
     * Gets the value of the idPersonRequestSeasons property.
     * 
     */
    public int getIdPersonRequestSeasons() {
        return idPersonRequestSeasons;
    }

    /**
     * Sets the value of the idPersonRequestSeasons property.
     * 
     */
    public void setIdPersonRequestSeasons(int value) {
        this.idPersonRequestSeasons = value;
    }

    /**
     * Gets the value of the olimpiadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOlimpiadName() {
        return olimpiadName;
    }

    /**
     * Sets the value of the olimpiadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOlimpiadName(String value) {
        this.olimpiadName = value;
    }

    /**
     * Gets the value of the dateLastChangeOlimpiad property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChangeOlimpiad() {
        return dateLastChangeOlimpiad;
    }

    /**
     * Sets the value of the dateLastChangeOlimpiad property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChangeOlimpiad(XMLGregorianCalendar value) {
        this.dateLastChangeOlimpiad = value;
    }

    /**
     * Gets the value of the idOlympiadAward property.
     * 
     */
    public int getIdOlympiadAward() {
        return idOlympiadAward;
    }

    /**
     * Sets the value of the idOlympiadAward property.
     * 
     */
    public void setIdOlympiadAward(int value) {
        this.idOlympiadAward = value;
    }

    /**
     * Gets the value of the olympiadAwardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOlympiadAwardName() {
        return olympiadAwardName;
    }

    /**
     * Sets the value of the olympiadAwardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOlympiadAwardName(String value) {
        this.olympiadAwardName = value;
    }

    /**
     * Gets the value of the olympiadAwardBonus property.
     * 
     */
    public double getOlympiadAwardBonus() {
        return olympiadAwardBonus;
    }

    /**
     * Sets the value of the olympiadAwardBonus property.
     * 
     */
    public void setOlympiadAwardBonus(double value) {
        this.olympiadAwardBonus = value;
    }

    /**
     * Gets the value of the dateLastChangeOlympiadAward property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChangeOlympiadAward() {
        return dateLastChangeOlympiadAward;
    }

    /**
     * Sets the value of the dateLastChangeOlympiadAward property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChangeOlympiadAward(XMLGregorianCalendar value) {
        this.dateLastChangeOlympiadAward = value;
    }

}
