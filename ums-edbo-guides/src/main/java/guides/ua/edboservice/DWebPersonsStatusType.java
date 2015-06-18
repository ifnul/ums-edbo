
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dWebPersonsStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dWebPersonsStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_WebPersonsStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WebPersonsStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebPersonsStatusTypeDesciption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dWebPersonsStatusType", propOrder = {
    "idWebPersonsStatusType",
    "webPersonsStatusTypeName",
    "webPersonsStatusTypeDesciption"
})
public class DWebPersonsStatusType {

    @XmlElement(name = "Id_WebPersonsStatusType")
    protected int idWebPersonsStatusType;
    @XmlElement(name = "WebPersonsStatusTypeName")
    protected String webPersonsStatusTypeName;
    @XmlElement(name = "WebPersonsStatusTypeDesciption")
    protected String webPersonsStatusTypeDesciption;

    /**
     * Gets the value of the idWebPersonsStatusType property.
     * 
     */
    public int getIdWebPersonsStatusType() {
        return idWebPersonsStatusType;
    }

    /**
     * Sets the value of the idWebPersonsStatusType property.
     * 
     */
    public void setIdWebPersonsStatusType(int value) {
        this.idWebPersonsStatusType = value;
    }

    /**
     * Gets the value of the webPersonsStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPersonsStatusTypeName() {
        return webPersonsStatusTypeName;
    }

    /**
     * Sets the value of the webPersonsStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPersonsStatusTypeName(String value) {
        this.webPersonsStatusTypeName = value;
    }

    /**
     * Gets the value of the webPersonsStatusTypeDesciption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPersonsStatusTypeDesciption() {
        return webPersonsStatusTypeDesciption;
    }

    /**
     * Sets the value of the webPersonsStatusTypeDesciption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPersonsStatusTypeDesciption(String value) {
        this.webPersonsStatusTypeDesciption = value;
    }

}
