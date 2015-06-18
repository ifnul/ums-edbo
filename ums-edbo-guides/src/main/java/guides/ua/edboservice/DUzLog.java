
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUzLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUzLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UzLog" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UzRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UzResponce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateBeginRequest" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DateEndRequest" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DurMs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUzLog", propOrder = {
    "idUzLog",
    "uzRequest",
    "uzResponce",
    "dateBeginRequest",
    "dateEndRequest",
    "durMs"
})
public class DUzLog {

    @XmlElement(name = "Id_UzLog")
    protected int idUzLog;
    @XmlElement(name = "UzRequest")
    protected String uzRequest;
    @XmlElement(name = "UzResponce")
    protected String uzResponce;
    @XmlElement(name = "DateBeginRequest", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBeginRequest;
    @XmlElement(name = "DateEndRequest", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEndRequest;
    @XmlElement(name = "DurMs")
    protected int durMs;

    /**
     * Gets the value of the idUzLog property.
     * 
     */
    public int getIdUzLog() {
        return idUzLog;
    }

    /**
     * Sets the value of the idUzLog property.
     * 
     */
    public void setIdUzLog(int value) {
        this.idUzLog = value;
    }

    /**
     * Gets the value of the uzRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUzRequest() {
        return uzRequest;
    }

    /**
     * Sets the value of the uzRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUzRequest(String value) {
        this.uzRequest = value;
    }

    /**
     * Gets the value of the uzResponce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUzResponce() {
        return uzResponce;
    }

    /**
     * Sets the value of the uzResponce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUzResponce(String value) {
        this.uzResponce = value;
    }

    /**
     * Gets the value of the dateBeginRequest property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBeginRequest() {
        return dateBeginRequest;
    }

    /**
     * Sets the value of the dateBeginRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBeginRequest(XMLGregorianCalendar value) {
        this.dateBeginRequest = value;
    }

    /**
     * Gets the value of the dateEndRequest property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEndRequest() {
        return dateEndRequest;
    }

    /**
     * Sets the value of the dateEndRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEndRequest(XMLGregorianCalendar value) {
        this.dateEndRequest = value;
    }

    /**
     * Gets the value of the durMs property.
     * 
     */
    public int getDurMs() {
        return durMs;
    }

    /**
     * Sets the value of the durMs property.
     * 
     */
    public void setDurMs(int value) {
        this.durMs = value;
    }

}
