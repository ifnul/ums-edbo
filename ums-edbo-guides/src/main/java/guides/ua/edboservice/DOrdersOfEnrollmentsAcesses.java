
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dOrdersOfEnrollmentsAcesses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrdersOfEnrollmentsAcesses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_OrdersOfEnrollmentsAcess" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfEnrollment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrdersOfEnrollmentsAcessDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrdersOfEnrollmentsAcessDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrdersOfEnrollmentsAcessDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fdel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descriptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrdersOfEnrollmentsAcesses", propOrder = {
    "idOrdersOfEnrollmentsAcess",
    "idOrderOfEnrollment",
    "ordersOfEnrollmentsAcessDateBegin",
    "ordersOfEnrollmentsAcessDateEnd",
    "ordersOfEnrollmentsAcessDateLastChange",
    "idUser",
    "fdel",
    "fio",
    "descriptions"
})
public class DOrdersOfEnrollmentsAcesses {

    @XmlElement(name = "Id_OrdersOfEnrollmentsAcess")
    protected int idOrdersOfEnrollmentsAcess;
    @XmlElement(name = "Id_OrderOfEnrollment")
    protected int idOrderOfEnrollment;
    @XmlElement(name = "OrdersOfEnrollmentsAcessDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordersOfEnrollmentsAcessDateBegin;
    @XmlElement(name = "OrdersOfEnrollmentsAcessDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordersOfEnrollmentsAcessDateEnd;
    @XmlElement(name = "OrdersOfEnrollmentsAcessDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordersOfEnrollmentsAcessDateLastChange;
    @XmlElement(name = "Id_User")
    protected int idUser;
    protected int fdel;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Descriptions")
    protected String descriptions;

    /**
     * Gets the value of the idOrdersOfEnrollmentsAcess property.
     * 
     */
    public int getIdOrdersOfEnrollmentsAcess() {
        return idOrdersOfEnrollmentsAcess;
    }

    /**
     * Sets the value of the idOrdersOfEnrollmentsAcess property.
     * 
     */
    public void setIdOrdersOfEnrollmentsAcess(int value) {
        this.idOrdersOfEnrollmentsAcess = value;
    }

    /**
     * Gets the value of the idOrderOfEnrollment property.
     * 
     */
    public int getIdOrderOfEnrollment() {
        return idOrderOfEnrollment;
    }

    /**
     * Sets the value of the idOrderOfEnrollment property.
     * 
     */
    public void setIdOrderOfEnrollment(int value) {
        this.idOrderOfEnrollment = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsAcessDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdersOfEnrollmentsAcessDateBegin() {
        return ordersOfEnrollmentsAcessDateBegin;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAcessDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdersOfEnrollmentsAcessDateBegin(XMLGregorianCalendar value) {
        this.ordersOfEnrollmentsAcessDateBegin = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsAcessDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdersOfEnrollmentsAcessDateEnd() {
        return ordersOfEnrollmentsAcessDateEnd;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAcessDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdersOfEnrollmentsAcessDateEnd(XMLGregorianCalendar value) {
        this.ordersOfEnrollmentsAcessDateEnd = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsAcessDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdersOfEnrollmentsAcessDateLastChange() {
        return ordersOfEnrollmentsAcessDateLastChange;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAcessDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdersOfEnrollmentsAcessDateLastChange(XMLGregorianCalendar value) {
        this.ordersOfEnrollmentsAcessDateLastChange = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the fdel property.
     * 
     */
    public int getFdel() {
        return fdel;
    }

    /**
     * Sets the value of the fdel property.
     * 
     */
    public void setFdel(int value) {
        this.fdel = value;
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

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptions(String value) {
        this.descriptions = value;
    }

}
