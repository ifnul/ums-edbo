
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityMemorandums complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityMemorandums">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityMemorandum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityMemorandumDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityMemorandumDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityMemorandumDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityMemorandums", propOrder = {
    "idUniversityMemorandum",
    "universityKode",
    "universityMemorandumDateBegin",
    "universityMemorandumDateEnd",
    "universityMemorandumDateLastChange"
})
public class DUniversityMemorandums {

    @XmlElement(name = "Id_UniversityMemorandum")
    protected String idUniversityMemorandum;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityMemorandumDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityMemorandumDateBegin;
    @XmlElement(name = "UniversityMemorandumDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityMemorandumDateEnd;
    @XmlElement(name = "UniversityMemorandumDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityMemorandumDateLastChange;

    /**
     * Gets the value of the idUniversityMemorandum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUniversityMemorandum() {
        return idUniversityMemorandum;
    }

    /**
     * Sets the value of the idUniversityMemorandum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUniversityMemorandum(String value) {
        this.idUniversityMemorandum = value;
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
     * Gets the value of the universityMemorandumDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityMemorandumDateBegin() {
        return universityMemorandumDateBegin;
    }

    /**
     * Sets the value of the universityMemorandumDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityMemorandumDateBegin(XMLGregorianCalendar value) {
        this.universityMemorandumDateBegin = value;
    }

    /**
     * Gets the value of the universityMemorandumDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityMemorandumDateEnd() {
        return universityMemorandumDateEnd;
    }

    /**
     * Sets the value of the universityMemorandumDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityMemorandumDateEnd(XMLGregorianCalendar value) {
        this.universityMemorandumDateEnd = value;
    }

    /**
     * Gets the value of the universityMemorandumDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityMemorandumDateLastChange() {
        return universityMemorandumDateLastChange;
    }

    /**
     * Sets the value of the universityMemorandumDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityMemorandumDateLastChange(XMLGregorianCalendar value) {
        this.universityMemorandumDateLastChange = value;
    }

}
