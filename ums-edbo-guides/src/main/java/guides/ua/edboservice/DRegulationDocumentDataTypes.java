
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dRegulationDocumentDataTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRegulationDocumentDataTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_RegulationDocumentDataType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentDataTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegulationDocumentDataTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRegulationDocumentDataTypes", propOrder = {
    "idRegulationDocumentDataType",
    "regulationDocumentDataTypeName",
    "regulationDocumentDataTypeCode"
})
public class DRegulationDocumentDataTypes {

    @XmlElement(name = "Id_RegulationDocumentDataType")
    protected int idRegulationDocumentDataType;
    @XmlElement(name = "RegulationDocumentDataTypeName")
    protected String regulationDocumentDataTypeName;
    @XmlElement(name = "RegulationDocumentDataTypeCode")
    protected String regulationDocumentDataTypeCode;

    /**
     * Gets the value of the idRegulationDocumentDataType property.
     * 
     */
    public int getIdRegulationDocumentDataType() {
        return idRegulationDocumentDataType;
    }

    /**
     * Sets the value of the idRegulationDocumentDataType property.
     * 
     */
    public void setIdRegulationDocumentDataType(int value) {
        this.idRegulationDocumentDataType = value;
    }

    /**
     * Gets the value of the regulationDocumentDataTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentDataTypeName() {
        return regulationDocumentDataTypeName;
    }

    /**
     * Sets the value of the regulationDocumentDataTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentDataTypeName(String value) {
        this.regulationDocumentDataTypeName = value;
    }

    /**
     * Gets the value of the regulationDocumentDataTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentDataTypeCode() {
        return regulationDocumentDataTypeCode;
    }

    /**
     * Sets the value of the regulationDocumentDataTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentDataTypeCode(String value) {
        this.regulationDocumentDataTypeCode = value;
    }

}
