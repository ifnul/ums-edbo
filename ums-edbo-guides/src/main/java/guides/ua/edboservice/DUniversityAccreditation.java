
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityAccreditation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityAccreditation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityAcreditatin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityAcreditatinType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateBeginAcreditation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateEndAcreditation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversitiyAcreditatinTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityAccreditation", propOrder = {
    "idUniversityAcreditatin",
    "idUniversityAcreditatinType",
    "dateBeginAcreditation",
    "dateEndAcreditation",
    "universitiyAcreditatinTypeCode"
})
public class DUniversityAccreditation {

    @XmlElement(name = "Id_UniversityAcreditatin")
    protected int idUniversityAcreditatin;
    @XmlElement(name = "Id_UniversityAcreditatinType")
    protected int idUniversityAcreditatinType;
    @XmlElement(name = "DateBeginAcreditation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBeginAcreditation;
    @XmlElement(name = "DateEndAcreditation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEndAcreditation;
    @XmlElement(name = "UniversitiyAcreditatinTypeCode")
    protected String universitiyAcreditatinTypeCode;

    /**
     * Gets the value of the idUniversityAcreditatin property.
     * 
     */
    public int getIdUniversityAcreditatin() {
        return idUniversityAcreditatin;
    }

    /**
     * Sets the value of the idUniversityAcreditatin property.
     * 
     */
    public void setIdUniversityAcreditatin(int value) {
        this.idUniversityAcreditatin = value;
    }

    /**
     * Gets the value of the idUniversityAcreditatinType property.
     * 
     */
    public int getIdUniversityAcreditatinType() {
        return idUniversityAcreditatinType;
    }

    /**
     * Sets the value of the idUniversityAcreditatinType property.
     * 
     */
    public void setIdUniversityAcreditatinType(int value) {
        this.idUniversityAcreditatinType = value;
    }

    /**
     * Gets the value of the dateBeginAcreditation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBeginAcreditation() {
        return dateBeginAcreditation;
    }

    /**
     * Sets the value of the dateBeginAcreditation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBeginAcreditation(XMLGregorianCalendar value) {
        this.dateBeginAcreditation = value;
    }

    /**
     * Gets the value of the dateEndAcreditation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEndAcreditation() {
        return dateEndAcreditation;
    }

    /**
     * Sets the value of the dateEndAcreditation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEndAcreditation(XMLGregorianCalendar value) {
        this.dateEndAcreditation = value;
    }

    /**
     * Gets the value of the universitiyAcreditatinTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiyAcreditatinTypeCode() {
        return universitiyAcreditatinTypeCode;
    }

    /**
     * Sets the value of the universitiyAcreditatinTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiyAcreditatinTypeCode(String value) {
        this.universitiyAcreditatinTypeCode = value;
    }

}
