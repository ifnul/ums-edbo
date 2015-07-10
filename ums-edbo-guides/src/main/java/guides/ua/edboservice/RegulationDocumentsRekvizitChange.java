
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
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentRekvisites" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegDocRekDateRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekSuprovodNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegDocRekSendNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekDateSend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekVozvrat" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegDocRekDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekDateRecive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegDocRekPaperCopy" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idLanguage",
    "idRegulationDocumentRekvisites",
    "idRegulationDocument",
    "regDocRekDateRegistration",
    "regDocRekSuprovodNumber",
    "regDocRekPages",
    "regDocRekSendNumber",
    "regDocRekDateSend",
    "regDocRekVozvrat",
    "regDocRekDescription",
    "regDocRekDateRecive",
    "regDocRekPaperCopy"
})
@XmlRootElement(name = "RegulationDocumentsRekvizitChange")
public class RegulationDocumentsRekvizitChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "Id_RegulationDocumentRekvisites")
    protected int idRegulationDocumentRekvisites;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "RegDocRekDateRegistration")
    protected String regDocRekDateRegistration;
    @XmlElement(name = "RegDocRekSuprovodNumber")
    protected String regDocRekSuprovodNumber;
    @XmlElement(name = "RegDocRekPages")
    protected int regDocRekPages;
    @XmlElement(name = "RegDocRekSendNumber")
    protected String regDocRekSendNumber;
    @XmlElement(name = "RegDocRekDateSend")
    protected String regDocRekDateSend;
    @XmlElement(name = "RegDocRekVozvrat")
    protected int regDocRekVozvrat;
    @XmlElement(name = "RegDocRekDescription")
    protected String regDocRekDescription;
    @XmlElement(name = "RegDocRekDateRecive")
    protected String regDocRekDateRecive;
    @XmlElement(name = "RegDocRekPaperCopy")
    protected int regDocRekPaperCopy;

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
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
    }

    /**
     * Gets the value of the idRegulationDocumentRekvisites property.
     * 
     */
    public int getIdRegulationDocumentRekvisites() {
        return idRegulationDocumentRekvisites;
    }

    /**
     * Sets the value of the idRegulationDocumentRekvisites property.
     * 
     */
    public void setIdRegulationDocumentRekvisites(int value) {
        this.idRegulationDocumentRekvisites = value;
    }

    /**
     * Gets the value of the idRegulationDocument property.
     * 
     */
    public int getIdRegulationDocument() {
        return idRegulationDocument;
    }

    /**
     * Sets the value of the idRegulationDocument property.
     * 
     */
    public void setIdRegulationDocument(int value) {
        this.idRegulationDocument = value;
    }

    /**
     * Gets the value of the regDocRekDateRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekDateRegistration() {
        return regDocRekDateRegistration;
    }

    /**
     * Sets the value of the regDocRekDateRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekDateRegistration(String value) {
        this.regDocRekDateRegistration = value;
    }

    /**
     * Gets the value of the regDocRekSuprovodNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekSuprovodNumber() {
        return regDocRekSuprovodNumber;
    }

    /**
     * Sets the value of the regDocRekSuprovodNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekSuprovodNumber(String value) {
        this.regDocRekSuprovodNumber = value;
    }

    /**
     * Gets the value of the regDocRekPages property.
     * 
     */
    public int getRegDocRekPages() {
        return regDocRekPages;
    }

    /**
     * Sets the value of the regDocRekPages property.
     * 
     */
    public void setRegDocRekPages(int value) {
        this.regDocRekPages = value;
    }

    /**
     * Gets the value of the regDocRekSendNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekSendNumber() {
        return regDocRekSendNumber;
    }

    /**
     * Sets the value of the regDocRekSendNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekSendNumber(String value) {
        this.regDocRekSendNumber = value;
    }

    /**
     * Gets the value of the regDocRekDateSend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekDateSend() {
        return regDocRekDateSend;
    }

    /**
     * Sets the value of the regDocRekDateSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekDateSend(String value) {
        this.regDocRekDateSend = value;
    }

    /**
     * Gets the value of the regDocRekVozvrat property.
     * 
     */
    public int getRegDocRekVozvrat() {
        return regDocRekVozvrat;
    }

    /**
     * Sets the value of the regDocRekVozvrat property.
     * 
     */
    public void setRegDocRekVozvrat(int value) {
        this.regDocRekVozvrat = value;
    }

    /**
     * Gets the value of the regDocRekDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekDescription() {
        return regDocRekDescription;
    }

    /**
     * Sets the value of the regDocRekDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekDescription(String value) {
        this.regDocRekDescription = value;
    }

    /**
     * Gets the value of the regDocRekDateRecive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDocRekDateRecive() {
        return regDocRekDateRecive;
    }

    /**
     * Sets the value of the regDocRekDateRecive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDocRekDateRecive(String value) {
        this.regDocRekDateRecive = value;
    }

    /**
     * Gets the value of the regDocRekPaperCopy property.
     * 
     */
    public int getRegDocRekPaperCopy() {
        return regDocRekPaperCopy;
    }

    /**
     * Sets the value of the regDocRekPaperCopy property.
     * 
     */
    public void setRegDocRekPaperCopy(int value) {
        this.regDocRekPaperCopy = value;
    }

}
