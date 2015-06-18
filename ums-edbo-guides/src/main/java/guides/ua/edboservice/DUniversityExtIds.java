
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityExtIds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityExtIds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_ExternalUniversity_1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExternalUniversity_2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExternalUniversity_3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="T_UniversityExtId_1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="T_UniversityExtId_2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="T_UniversityExtId_3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversitiyAcreditatinTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityExtIds", propOrder = {
    "idUniversity",
    "universityFullName",
    "idExternalUniversity1",
    "idExternalUniversity2",
    "idExternalUniversity3",
    "tUniversityExtId1",
    "tUniversityExtId2",
    "tUniversityExtId3",
    "universitiyAcreditatinTypeCode"
})
public class DUniversityExtIds {

    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Id_ExternalUniversity_1")
    protected int idExternalUniversity1;
    @XmlElement(name = "Id_ExternalUniversity_2")
    protected int idExternalUniversity2;
    @XmlElement(name = "Id_ExternalUniversity_3")
    protected int idExternalUniversity3;
    @XmlElement(name = "T_UniversityExtId_1")
    protected int tUniversityExtId1;
    @XmlElement(name = "T_UniversityExtId_2")
    protected int tUniversityExtId2;
    @XmlElement(name = "T_UniversityExtId_3")
    protected int tUniversityExtId3;
    @XmlElement(name = "UniversitiyAcreditatinTypeCode")
    protected String universitiyAcreditatinTypeCode;

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

    /**
     * Gets the value of the universityFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullName() {
        return universityFullName;
    }

    /**
     * Sets the value of the universityFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullName(String value) {
        this.universityFullName = value;
    }

    /**
     * Gets the value of the idExternalUniversity1 property.
     * 
     */
    public int getIdExternalUniversity1() {
        return idExternalUniversity1;
    }

    /**
     * Sets the value of the idExternalUniversity1 property.
     * 
     */
    public void setIdExternalUniversity1(int value) {
        this.idExternalUniversity1 = value;
    }

    /**
     * Gets the value of the idExternalUniversity2 property.
     * 
     */
    public int getIdExternalUniversity2() {
        return idExternalUniversity2;
    }

    /**
     * Sets the value of the idExternalUniversity2 property.
     * 
     */
    public void setIdExternalUniversity2(int value) {
        this.idExternalUniversity2 = value;
    }

    /**
     * Gets the value of the idExternalUniversity3 property.
     * 
     */
    public int getIdExternalUniversity3() {
        return idExternalUniversity3;
    }

    /**
     * Sets the value of the idExternalUniversity3 property.
     * 
     */
    public void setIdExternalUniversity3(int value) {
        this.idExternalUniversity3 = value;
    }

    /**
     * Gets the value of the tUniversityExtId1 property.
     * 
     */
    public int getTUniversityExtId1() {
        return tUniversityExtId1;
    }

    /**
     * Sets the value of the tUniversityExtId1 property.
     * 
     */
    public void setTUniversityExtId1(int value) {
        this.tUniversityExtId1 = value;
    }

    /**
     * Gets the value of the tUniversityExtId2 property.
     * 
     */
    public int getTUniversityExtId2() {
        return tUniversityExtId2;
    }

    /**
     * Sets the value of the tUniversityExtId2 property.
     * 
     */
    public void setTUniversityExtId2(int value) {
        this.tUniversityExtId2 = value;
    }

    /**
     * Gets the value of the tUniversityExtId3 property.
     * 
     */
    public int getTUniversityExtId3() {
        return tUniversityExtId3;
    }

    /**
     * Sets the value of the tUniversityExtId3 property.
     * 
     */
    public void setTUniversityExtId3(int value) {
        this.tUniversityExtId3 = value;
    }

    /**
     * Gets the value of the universitiyAcreditatinTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversitiyAcreditatinTypeCode() {
        return universitiyAcreditatinTypeCode;
    }

    /**
     * Sets the value of the universitiyAcreditatinTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversitiyAcreditatinTypeCode(String value) {
        this.universitiyAcreditatinTypeCode = value;
    }

}
