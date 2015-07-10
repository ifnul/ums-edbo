
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
 *         &lt;element name="Id_ReceptionConditionAddition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Koeficients" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_ReceptionConditionAdditionsKoeficientsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idReceptionConditionAddition",
    "koeficients",
    "idReceptionConditionAdditionsKoeficientsTypes"
})
@XmlRootElement(name = "ReceptionConditionAdditionsKoeficientsChange")
public class ReceptionConditionAdditionsKoeficientsChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_ReceptionConditionAddition")
    protected int idReceptionConditionAddition;
    @XmlElement(name = "Koeficients")
    protected String koeficients;
    @XmlElement(name = "Id_ReceptionConditionAdditionsKoeficientsTypes")
    protected int idReceptionConditionAdditionsKoeficientsTypes;

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
     * Gets the value of the idReceptionConditionAddition property.
     * 
     */
    public int getIdReceptionConditionAddition() {
        return idReceptionConditionAddition;
    }

    /**
     * Sets the value of the idReceptionConditionAddition property.
     * 
     */
    public void setIdReceptionConditionAddition(int value) {
        this.idReceptionConditionAddition = value;
    }

    /**
     * Gets the value of the koeficients property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoeficients() {
        return koeficients;
    }

    /**
     * Sets the value of the koeficients property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoeficients(String value) {
        this.koeficients = value;
    }

    /**
     * Gets the value of the idReceptionConditionAdditionsKoeficientsTypes property.
     * 
     */
    public int getIdReceptionConditionAdditionsKoeficientsTypes() {
        return idReceptionConditionAdditionsKoeficientsTypes;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsKoeficientsTypes property.
     * 
     */
    public void setIdReceptionConditionAdditionsKoeficientsTypes(int value) {
        this.idReceptionConditionAdditionsKoeficientsTypes = value;
    }

}
