
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonEducationProgressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEducationProgressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationProgressType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationProgressTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonEducationProgressType", propOrder = {
    "idPersonEducationProgressType",
    "personEducationProgressTypeName"
})
public class DPersonEducationProgressType {

    @XmlElement(name = "Id_PersonEducationProgressType")
    protected int idPersonEducationProgressType;
    @XmlElement(name = "PersonEducationProgressTypeName")
    protected String personEducationProgressTypeName;

    /**
     * Gets the value of the idPersonEducationProgressType property.
     * 
     */
    public int getIdPersonEducationProgressType() {
        return idPersonEducationProgressType;
    }

    /**
     * Sets the value of the idPersonEducationProgressType property.
     * 
     */
    public void setIdPersonEducationProgressType(int value) {
        this.idPersonEducationProgressType = value;
    }

    /**
     * Gets the value of the personEducationProgressTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressTypeName() {
        return personEducationProgressTypeName;
    }

    /**
     * Sets the value of the personEducationProgressTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressTypeName(String value) {
        this.personEducationProgressTypeName = value;
    }

}
