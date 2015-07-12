
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dMinisters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dMinisters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Ministers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MinistersFullFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinistersSmallFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinistersDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MinistersDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dMinisters", propOrder = {
    "idMinisters",
    "ministersFullFIO",
    "ministersSmallFIO",
    "ministersDateBegin",
    "ministersDateEnd"
})
public class DMinisters {

    @XmlElement(name = "Id_Ministers")
    protected int idMinisters;
    @XmlElement(name = "MinistersFullFIO")
    protected String ministersFullFIO;
    @XmlElement(name = "MinistersSmallFIO")
    protected String ministersSmallFIO;
    @XmlElement(name = "MinistersDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ministersDateBegin;
    @XmlElement(name = "MinistersDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ministersDateEnd;

    /**
     * Gets the value of the idMinisters property.
     * 
     */
    public int getIdMinisters() {
        return idMinisters;
    }

    /**
     * Sets the value of the idMinisters property.
     * 
     */
    public void setIdMinisters(int value) {
        this.idMinisters = value;
    }

    /**
     * Gets the value of the ministersFullFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinistersFullFIO() {
        return ministersFullFIO;
    }

    /**
     * Sets the value of the ministersFullFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinistersFullFIO(String value) {
        this.ministersFullFIO = value;
    }

    /**
     * Gets the value of the ministersSmallFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinistersSmallFIO() {
        return ministersSmallFIO;
    }

    /**
     * Sets the value of the ministersSmallFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinistersSmallFIO(String value) {
        this.ministersSmallFIO = value;
    }

    /**
     * Gets the value of the ministersDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinistersDateBegin() {
        return ministersDateBegin;
    }

    /**
     * Sets the value of the ministersDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinistersDateBegin(XMLGregorianCalendar value) {
        this.ministersDateBegin = value;
    }

    /**
     * Gets the value of the ministersDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMinistersDateEnd() {
        return ministersDateEnd;
    }

    /**
     * Sets the value of the ministersDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMinistersDateEnd(XMLGregorianCalendar value) {
        this.ministersDateEnd = value;
    }

}
