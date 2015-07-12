
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dDictOrderOfDocumentsRegions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dDictOrderOfDocumentsRegions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_KOATUU" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KOATUUCodeL1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUCodeL2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KOATUUName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cou" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_KOATUUParent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dDictOrderOfDocumentsRegions", propOrder = {
    "idKOATUU",
    "koatuuCodeL1",
    "koatuuCodeL2",
    "koatuuName",
    "cou",
    "idKOATUUParent",
    "idUniversity"
})
public class DDictOrderOfDocumentsRegions {

    @XmlElement(name = "Id_KOATUU")
    protected int idKOATUU;
    @XmlElement(name = "KOATUUCodeL1")
    protected String koatuuCodeL1;
    @XmlElement(name = "KOATUUCodeL2")
    protected String koatuuCodeL2;
    @XmlElement(name = "KOATUUName")
    protected String koatuuName;
    @XmlElement(name = "Cou")
    protected int cou;
    @XmlElement(name = "Id_KOATUUParent")
    protected int idKOATUUParent;
    @XmlElement(name = "Id_University")
    protected int idUniversity;

    /**
     * Gets the value of the idKOATUU property.
     * 
     */
    public int getIdKOATUU() {
        return idKOATUU;
    }

    /**
     * Sets the value of the idKOATUU property.
     * 
     */
    public void setIdKOATUU(int value) {
        this.idKOATUU = value;
    }

    /**
     * Gets the value of the koatuuCodeL1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCodeL1() {
        return koatuuCodeL1;
    }

    /**
     * Sets the value of the koatuuCodeL1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCodeL1(String value) {
        this.koatuuCodeL1 = value;
    }

    /**
     * Gets the value of the koatuuCodeL2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUCodeL2() {
        return koatuuCodeL2;
    }

    /**
     * Sets the value of the koatuuCodeL2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUCodeL2(String value) {
        this.koatuuCodeL2 = value;
    }

    /**
     * Gets the value of the koatuuName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOATUUName() {
        return koatuuName;
    }

    /**
     * Sets the value of the koatuuName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOATUUName(String value) {
        this.koatuuName = value;
    }

    /**
     * Gets the value of the cou property.
     * 
     */
    public int getCou() {
        return cou;
    }

    /**
     * Sets the value of the cou property.
     * 
     */
    public void setCou(int value) {
        this.cou = value;
    }

    /**
     * Gets the value of the idKOATUUParent property.
     * 
     */
    public int getIdKOATUUParent() {
        return idKOATUUParent;
    }

    /**
     * Sets the value of the idKOATUUParent property.
     * 
     */
    public void setIdKOATUUParent(int value) {
        this.idKOATUUParent = value;
    }

    /**
     * Gets the value of the idUniversity property.
     * 
     */
    public int getIdUniversity() {
        return idUniversity;
    }

    /**
     * Sets the value of the idUniversity property.
     * 
     */
    public void setIdUniversity(int value) {
        this.idUniversity = value;
    }

}
