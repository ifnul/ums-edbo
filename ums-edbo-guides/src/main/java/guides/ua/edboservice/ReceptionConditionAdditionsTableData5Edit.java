
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
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData5Group" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Quota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityFacultetKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalSpecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentKoeficient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Subjects" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idReceptionConditionAdditionsTableData5",
    "idReceptionConditionAdditionsTableData5Group",
    "quota",
    "universityFacultetKode",
    "additionalSpecName",
    "documentKoeficient",
    "idSubjects"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData5Edit")
public class ReceptionConditionAdditionsTableData5Edit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData5")
    protected int idReceptionConditionAdditionsTableData5;
    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData5Group")
    protected int idReceptionConditionAdditionsTableData5Group;
    @XmlElement(name = "Quota")
    protected String quota;
    @XmlElement(name = "UniversityFacultetKode")
    protected String universityFacultetKode;
    @XmlElement(name = "AdditionalSpecName")
    protected String additionalSpecName;
    @XmlElement(name = "DocumentKoeficient")
    protected String documentKoeficient;
    @XmlElement(name = "Id_Subjects")
    protected String idSubjects;

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
     * Gets the value of the idReceptionConditionAdditionsTableData5 property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData5() {
        return idReceptionConditionAdditionsTableData5;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData5 property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData5(int value) {
        this.idReceptionConditionAdditionsTableData5 = value;
    }

    /**
     * Gets the value of the idReceptionConditionAdditionsTableData5Group property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData5Group() {
        return idReceptionConditionAdditionsTableData5Group;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData5Group property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData5Group(int value) {
        this.idReceptionConditionAdditionsTableData5Group = value;
    }

    /**
     * Gets the value of the quota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuota() {
        return quota;
    }

    /**
     * Sets the value of the quota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuota(String value) {
        this.quota = value;
    }

    /**
     * Gets the value of the universityFacultetKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetKode() {
        return universityFacultetKode;
    }

    /**
     * Sets the value of the universityFacultetKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetKode(String value) {
        this.universityFacultetKode = value;
    }

    /**
     * Gets the value of the additionalSpecName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalSpecName() {
        return additionalSpecName;
    }

    /**
     * Sets the value of the additionalSpecName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalSpecName(String value) {
        this.additionalSpecName = value;
    }

    /**
     * Gets the value of the documentKoeficient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentKoeficient() {
        return documentKoeficient;
    }

    /**
     * Sets the value of the documentKoeficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentKoeficient(String value) {
        this.documentKoeficient = value;
    }

    /**
     * Gets the value of the idSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSubjects() {
        return idSubjects;
    }

    /**
     * Sets the value of the idSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSubjects(String value) {
        this.idSubjects = value;
    }

}
