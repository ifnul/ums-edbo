
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrdersOfEnrollmentsAdditionalOrdersDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_OrderOfEnrollment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrdersOfEnrollmentsAdditionalOrdersTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "ordersOfEnrollmentsAdditionalOrdersNumber",
    "ordersOfEnrollmentsAdditionalOrdersDate",
    "idOrderOfEnrollment",
    "idOrdersOfEnrollmentsAdditionalOrdersTypes",
    "universityKode"
})
@XmlRootElement(name = "OrdersOfEnrollmentsAdditionalOrdersAdd")
public class OrdersOfEnrollmentsAdditionalOrdersAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersNumber")
    protected String ordersOfEnrollmentsAdditionalOrdersNumber;
    @XmlElement(name = "OrdersOfEnrollmentsAdditionalOrdersDate")
    protected String ordersOfEnrollmentsAdditionalOrdersDate;
    @XmlElement(name = "Id_OrderOfEnrollment")
    protected int idOrderOfEnrollment;
    @XmlElement(name = "Id_OrdersOfEnrollmentsAdditionalOrdersTypes")
    protected int idOrdersOfEnrollmentsAdditionalOrdersTypes;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersOfEnrollmentsAdditionalOrdersNumber() {
        return ordersOfEnrollmentsAdditionalOrdersNumber;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersNumber(String value) {
        this.ordersOfEnrollmentsAdditionalOrdersNumber = value;
    }

    /**
     * Gets the value of the ordersOfEnrollmentsAdditionalOrdersDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdersOfEnrollmentsAdditionalOrdersDate() {
        return ordersOfEnrollmentsAdditionalOrdersDate;
    }

    /**
     * Sets the value of the ordersOfEnrollmentsAdditionalOrdersDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdersOfEnrollmentsAdditionalOrdersDate(String value) {
        this.ordersOfEnrollmentsAdditionalOrdersDate = value;
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
     * Gets the value of the idOrdersOfEnrollmentsAdditionalOrdersTypes property.
     * 
     */
    public int getIdOrdersOfEnrollmentsAdditionalOrdersTypes() {
        return idOrdersOfEnrollmentsAdditionalOrdersTypes;
    }

    /**
     * Sets the value of the idOrdersOfEnrollmentsAdditionalOrdersTypes property.
     * 
     */
    public void setIdOrdersOfEnrollmentsAdditionalOrdersTypes(int value) {
        this.idOrdersOfEnrollmentsAdditionalOrdersTypes = value;
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

}
