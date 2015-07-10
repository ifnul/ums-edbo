
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
 *         &lt;element name="PersonEducationProgressOrdersDataGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationProgressOrdersData" minOccurs="0"/>
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
    "personEducationProgressOrdersDataGetResult"
})
@XmlRootElement(name = "PersonEducationProgressOrdersDataGetResponse")
public class PersonEducationProgressOrdersDataGetResponse {

    @XmlElement(name = "PersonEducationProgressOrdersDataGetResult")
    protected ArrayOfDPersonEducationProgressOrdersData personEducationProgressOrdersDataGetResult;

    /**
     * Gets the value of the personEducationProgressOrdersDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationProgressOrdersData }
     *     
     */
    public ArrayOfDPersonEducationProgressOrdersData getPersonEducationProgressOrdersDataGetResult() {
        return personEducationProgressOrdersDataGetResult;
    }

    /**
     * Sets the value of the personEducationProgressOrdersDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationProgressOrdersData }
     *     
     */
    public void setPersonEducationProgressOrdersDataGetResult(ArrayOfDPersonEducationProgressOrdersData value) {
        this.personEducationProgressOrdersDataGetResult = value;
    }

}
