
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
 *         &lt;element name="Id_RegulationDocumentData" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "idRegulationDocumentData",
    "regulationDocumentDataDateImageFileBase64String"
})
@XmlRootElement(name = "RegulationDocumentDataImageChange")
public class RegulationDocumentDataImageChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_RegulationDocumentData")
    protected int idRegulationDocumentData;
    @XmlElement(name = "RegulationDocumentDataDateImageFileBase64String")
    protected String regulationDocumentDataDateImageFileBase64String;

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
     * Gets the value of the idRegulationDocumentData property.
     * 
     */
    public int getIdRegulationDocumentData() {
        return idRegulationDocumentData;
    }

    /**
     * Sets the value of the idRegulationDocumentData property.
     * 
     */
    public void setIdRegulationDocumentData(int value) {
        this.idRegulationDocumentData = value;
    }

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
