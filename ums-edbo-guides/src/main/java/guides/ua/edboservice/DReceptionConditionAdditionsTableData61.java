
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dReceptionConditionAdditionsTableData61 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReceptionConditionAdditionsTableData61">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReceptionConditionAddition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecSpecialityClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReceptionConditionAdditionsTableData61", propOrder = {
    "idReceptionConditionAdditionsTableData6",
    "idReceptionConditionAddition",
    "specSpecialityCode",
    "specSpecialityName",
    "specSpecialityClasifierCode"
})
public class DReceptionConditionAdditionsTableData61 {

    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData6")
    protected int idReceptionConditionAdditionsTableData6;
    @XmlElement(name = "Id_ReceptionConditionAddition")
    protected int idReceptionConditionAddition;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "SpecSpecialityName")
    protected String specSpecialityName;
    @XmlElement(name = "SpecSpecialityClasifierCode")
    protected String specSpecialityClasifierCode;

    /**
     * Gets the value of the idReceptionConditionAdditionsTableData6 property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData6() {
        return idReceptionConditionAdditionsTableData6;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData6 property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData6(int value) {
        this.idReceptionConditionAdditionsTableData6 = value;
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
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
    }

    /**
     * Gets the value of the specSpecialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityName() {
        return specSpecialityName;
    }

    /**
     * Sets the value of the specSpecialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityName(String value) {
        this.specSpecialityName = value;
    }

    /**
     * Gets the value of the specSpecialityClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityClasifierCode() {
        return specSpecialityClasifierCode;
    }

    /**
     * Sets the value of the specSpecialityClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityClasifierCode(String value) {
        this.specSpecialityClasifierCode = value;
    }

}
