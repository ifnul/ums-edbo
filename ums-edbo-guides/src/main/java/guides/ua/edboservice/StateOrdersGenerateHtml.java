
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
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_StateOrdersCategorie" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UseShablon" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "year",
    "idStateOrdersCategorie",
    "useShablon",
    "sourceType"
})
@XmlRootElement(name = "StateOrdersGenerateHtml")
public class StateOrdersGenerateHtml {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Id_StateOrdersCategorie")
    protected int idStateOrdersCategorie;
    @XmlElement(name = "UseShablon")
    protected int useShablon;
    @XmlElement(name = "SourceType")
    protected int sourceType;

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
     * Gets the value of the useShablon property.
     * 
     */
    public int getUseShablon() {
        return useShablon;
    }

    /**
     * Sets the value of the useShablon property.
     * 
     */
    public void setUseShablon(int value) {
        this.useShablon = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     */
    public int getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     */
    public void setSourceType(int value) {
        this.sourceType = value;
    }

}
