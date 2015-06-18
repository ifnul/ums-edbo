
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityBossOperatedTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityBossOperatedTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityBossOperatedType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityBossOperatedTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityBossOperatedTypes", propOrder = {
    "idUniversityBossOperatedType",
    "universityBossOperatedTypeName"
})
public class DUniversityBossOperatedTypes {

    @XmlElement(name = "Id_UniversityBossOperatedType")
    protected int idUniversityBossOperatedType;
    @XmlElement(name = "UniversityBossOperatedTypeName")
    protected String universityBossOperatedTypeName;

    /**
     * Gets the value of the idUniversityBossOperatedType property.
     * 
     */
    public int getIdUniversityBossOperatedType() {
        return idUniversityBossOperatedType;
    }

    /**
     * Sets the value of the idUniversityBossOperatedType property.
     * 
     */
    public void setIdUniversityBossOperatedType(int value) {
        this.idUniversityBossOperatedType = value;
    }

    /**
     * Gets the value of the universityBossOperatedTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityBossOperatedTypeName() {
        return universityBossOperatedTypeName;
    }

    /**
     * Sets the value of the universityBossOperatedTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityBossOperatedTypeName(String value) {
        this.universityBossOperatedTypeName = value;
    }

}
