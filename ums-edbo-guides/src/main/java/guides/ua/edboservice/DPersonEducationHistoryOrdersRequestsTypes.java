
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonEducationHistoryOrdersRequestsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonEducationHistoryOrdersRequestsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonEducationHistoryOrdersRequestsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationHistoryOrdersRequestsTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonEducationHistoryOrdersRequestsTypes", propOrder = {
    "idPersonEducationHistoryOrdersRequestsTypes",
    "personEducationHistoryOrdersRequestsTypesName"
})
public class DPersonEducationHistoryOrdersRequestsTypes {

    @XmlElement(name = "Id_PersonEducationHistoryOrdersRequestsTypes")
    protected int idPersonEducationHistoryOrdersRequestsTypes;
    @XmlElement(name = "PersonEducationHistoryOrdersRequestsTypesName")
    protected String personEducationHistoryOrdersRequestsTypesName;

    /**
     * Gets the value of the idPersonEducationHistoryOrdersRequestsTypes property.
     * 
     */
    public int getIdPersonEducationHistoryOrdersRequestsTypes() {
        return idPersonEducationHistoryOrdersRequestsTypes;
    }

    /**
     * Sets the value of the idPersonEducationHistoryOrdersRequestsTypes property.
     * 
     */
    public void setIdPersonEducationHistoryOrdersRequestsTypes(int value) {
        this.idPersonEducationHistoryOrdersRequestsTypes = value;
    }

    /**
     * Gets the value of the personEducationHistoryOrdersRequestsTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationHistoryOrdersRequestsTypesName() {
        return personEducationHistoryOrdersRequestsTypesName;
    }

    /**
     * Sets the value of the personEducationHistoryOrdersRequestsTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationHistoryOrdersRequestsTypesName(String value) {
        this.personEducationHistoryOrdersRequestsTypesName = value;
    }

}
