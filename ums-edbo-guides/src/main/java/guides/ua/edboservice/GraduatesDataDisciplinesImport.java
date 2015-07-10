
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
 *         &lt;element name="Id_Graduate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GraduatesDataDisciplines" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idGraduate",
    "graduatesDataDisciplines"
})
@XmlRootElement(name = "GraduatesDataDisciplinesImport")
public class GraduatesDataDisciplinesImport {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_Graduate")
    protected int idGraduate;
    @XmlElement(name = "GraduatesDataDisciplines")
    protected String graduatesDataDisciplines;

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
     * Gets the value of the idGraduate property.
     * 
     */
    public int getIdGraduate() {
        return idGraduate;
    }

    /**
     * Sets the value of the idGraduate property.
     * 
     */
    public void setIdGraduate(int value) {
        this.idGraduate = value;
    }

    /**
     * Gets the value of the graduatesDataDisciplines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduatesDataDisciplines() {
        return graduatesDataDisciplines;
    }

    /**
     * Sets the value of the graduatesDataDisciplines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduatesDataDisciplines(String value) {
        this.graduatesDataDisciplines = value;
    }

}
