
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
 *         &lt;element name="Id_StateOrdersTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_StateOrdersCategorie" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StateOrdersDatas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idStateOrdersTypes",
    "idStateOrdersCategorie",
    "year",
    "stateOrdersDatas"
})
@XmlRootElement(name = "StateOrdersAdd")
public class StateOrdersAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_StateOrdersTypes")
    protected int idStateOrdersTypes;
    @XmlElement(name = "Id_StateOrdersCategorie")
    protected int idStateOrdersCategorie;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "StateOrdersDatas")
    protected String stateOrdersDatas;

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
     * Gets the value of the idStateOrdersTypes property.
     * 
     */
    public int getIdStateOrdersTypes() {
        return idStateOrdersTypes;
    }

    /**
     * Sets the value of the idStateOrdersTypes property.
     * 
     */
    public void setIdStateOrdersTypes(int value) {
        this.idStateOrdersTypes = value;
    }

    /**
     * Gets the value of the idStateOrdersCategorie property.
     * 
     */
    public int getIdStateOrdersCategorie() {
        return idStateOrdersCategorie;
    }

    /**
     * Sets the value of the idStateOrdersCategorie property.
     * 
     */
    public void setIdStateOrdersCategorie(int value) {
        this.idStateOrdersCategorie = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the stateOrdersDatas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrdersDatas() {
        return stateOrdersDatas;
    }

    /**
     * Sets the value of the stateOrdersDatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrdersDatas(String value) {
        this.stateOrdersDatas = value;
    }

}
