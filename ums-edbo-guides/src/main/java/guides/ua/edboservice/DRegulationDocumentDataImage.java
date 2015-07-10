
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dRegulationDocumentDataImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRegulationDocumentDataImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegulationDocumentDataDateImageFileBase64String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRegulationDocumentDataImage", propOrder = {
    "regulationDocumentDataDateImageFileBase64String"
})
public class DRegulationDocumentDataImage {

    @XmlElement(name = "RegulationDocumentDataDateImageFileBase64String")
    protected String regulationDocumentDataDateImageFileBase64String;

    /**
     * Gets the value of the regulationDocumentDataDateImageFileBase64String property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentDataDateImageFileBase64String() {
        return regulationDocumentDataDateImageFileBase64String;
    }

    /**
     * Sets the value of the regulationDocumentDataDateImageFileBase64String property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentDataDateImageFileBase64String(String value) {
        this.regulationDocumentDataDateImageFileBase64String = value;
    }

}
