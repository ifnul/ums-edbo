
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
 *         &lt;element name="RegulationDocumentDataImageGetResult" type="{http://edboservice.ua/}ArrayOfDRegulationDocumentDataImage" minOccurs="0"/>
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
    "regulationDocumentDataImageGetResult"
})
@XmlRootElement(name = "RegulationDocumentDataImageGetResponse")
public class RegulationDocumentDataImageGetResponse {

    @XmlElement(name = "RegulationDocumentDataImageGetResult")
    protected ArrayOfDRegulationDocumentDataImage regulationDocumentDataImageGetResult;

    /**
     * Gets the value of the regulationDocumentDataImageGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRegulationDocumentDataImage }
     *     
     */
    public ArrayOfDRegulationDocumentDataImage getRegulationDocumentDataImageGetResult() {
        return regulationDocumentDataImageGetResult;
    }

    /**
     * Sets the value of the regulationDocumentDataImageGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRegulationDocumentDataImage }
     *     
     */
    public void setRegulationDocumentDataImageGetResult(ArrayOfDRegulationDocumentDataImage value) {
        this.regulationDocumentDataImageGetResult = value;
    }

}
