
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dReceptionConditionAdditionsTableData234Professions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReceptionConditionAdditionsTableData234Professions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData234SpecDirProf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData234" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecDirProfCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirProfClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirProfName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReceptionConditionAdditionsTableData234Professions", propOrder = {
    "idReceptionConditionAdditionsTableData234SpecDirProf",
    "idReceptionConditionAdditionsTableData234",
    "specDirProfCode",
    "specDirProfClasifierCode",
    "specDirProfName"
})
public class DReceptionConditionAdditionsTableData234Professions {

    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData234SpecDirProf")
    protected int idReceptionConditionAdditionsTableData234SpecDirProf;
    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData234")
    protected int idReceptionConditionAdditionsTableData234;
    @XmlElement(name = "SpecDirProfCode")
    protected String specDirProfCode;
    @XmlElement(name = "SpecDirProfClasifierCode")
    protected String specDirProfClasifierCode;
    @XmlElement(name = "SpecDirProfName")
    protected String specDirProfName;

    /**
     * Gets the value of the idReceptionConditionAdditionsTableData234SpecDirProf property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData234SpecDirProf() {
        return idReceptionConditionAdditionsTableData234SpecDirProf;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData234SpecDirProf property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData234SpecDirProf(int value) {
        this.idReceptionConditionAdditionsTableData234SpecDirProf = value;
    }

    /**
     * Gets the value of the idReceptionConditionAdditionsTableData234 property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData234() {
        return idReceptionConditionAdditionsTableData234;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData234 property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData234(int value) {
        this.idReceptionConditionAdditionsTableData234 = value;
    }

    /**
     * Gets the value of the specDirProfCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirProfCode() {
        return specDirProfCode;
    }

    /**
     * Sets the value of the specDirProfCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirProfCode(String value) {
        this.specDirProfCode = value;
    }

    /**
     * Gets the value of the specDirProfClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirProfClasifierCode() {
        return specDirProfClasifierCode;
    }

    /**
     * Sets the value of the specDirProfClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirProfClasifierCode(String value) {
        this.specDirProfClasifierCode = value;
    }

    /**
     * Gets the value of the specDirProfName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirProfName() {
        return specDirProfName;
    }

    /**
     * Sets the value of the specDirProfName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirProfName(String value) {
        this.specDirProfName = value;
    }

}
