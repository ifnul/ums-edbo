
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dGraduatesDataDisciplinesNationalGradesTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dGraduatesDataDisciplinesNationalGradesTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_GraduatesDataDisciplinesNationalGradesType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GraduatesDataDisciplinesNationalGradesTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GraduatesDataDisciplinesNationalGradesECTSRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dGraduatesDataDisciplinesNationalGradesTypes", propOrder = {
    "idGraduatesDataDisciplinesNationalGradesType",
    "graduatesDataDisciplinesNationalGradesTypeName",
    "graduatesDataDisciplinesNationalGradesECTSRank"
})
public class DGraduatesDataDisciplinesNationalGradesTypes {

    @XmlElement(name = "Id_GraduatesDataDisciplinesNationalGradesType")
    protected int idGraduatesDataDisciplinesNationalGradesType;
    @XmlElement(name = "GraduatesDataDisciplinesNationalGradesTypeName")
    protected String graduatesDataDisciplinesNationalGradesTypeName;
    @XmlElement(name = "GraduatesDataDisciplinesNationalGradesECTSRank")
    protected String graduatesDataDisciplinesNationalGradesECTSRank;

    /**
     * Gets the value of the idGraduatesDataDisciplinesNationalGradesType property.
     * 
     */
    public int getIdGraduatesDataDisciplinesNationalGradesType() {
        return idGraduatesDataDisciplinesNationalGradesType;
    }

    /**
     * Sets the value of the idGraduatesDataDisciplinesNationalGradesType property.
     * 
     */
    public void setIdGraduatesDataDisciplinesNationalGradesType(int value) {
        this.idGraduatesDataDisciplinesNationalGradesType = value;
    }

    /**
     * Gets the value of the graduatesDataDisciplinesNationalGradesTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduatesDataDisciplinesNationalGradesTypeName() {
        return graduatesDataDisciplinesNationalGradesTypeName;
    }

    /**
     * Sets the value of the graduatesDataDisciplinesNationalGradesTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduatesDataDisciplinesNationalGradesTypeName(String value) {
        this.graduatesDataDisciplinesNationalGradesTypeName = value;
    }

    /**
     * Gets the value of the graduatesDataDisciplinesNationalGradesECTSRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduatesDataDisciplinesNationalGradesECTSRank() {
        return graduatesDataDisciplinesNationalGradesECTSRank;
    }

    /**
     * Sets the value of the graduatesDataDisciplinesNationalGradesECTSRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduatesDataDisciplinesNationalGradesECTSRank(String value) {
        this.graduatesDataDisciplinesNationalGradesECTSRank = value;
    }

}
