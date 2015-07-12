
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
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityDopUgodasYearDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityDopUgodasNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityDogovorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityDogovorDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CostOneStudent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StudentsCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UgodaType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityKode",
    "universityDopUgodasYearDate",
    "universityDopUgodasNumber",
    "universityDogovorNumber",
    "universityDogovorDate",
    "costOneStudent",
    "studentsCount",
    "idUgodaType"
})
@XmlRootElement(name = "UniveristyDopUgodaAdd")
public class UniveristyDopUgodaAdd {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityDopUgodasYearDate")
    protected String universityDopUgodasYearDate;
    @XmlElement(name = "UniversityDopUgodasNumber")
    protected String universityDopUgodasNumber;
    @XmlElement(name = "UniversityDogovorNumber")
    protected String universityDogovorNumber;
    @XmlElement(name = "UniversityDogovorDate")
    protected String universityDogovorDate;
    @XmlElement(name = "CostOneStudent")
    protected String costOneStudent;
    @XmlElement(name = "StudentsCount")
    protected String studentsCount;
    @XmlElement(name = "Id_UgodaType")
    protected int idUgodaType;

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
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the universityDopUgodasYearDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityDopUgodasYearDate() {
        return universityDopUgodasYearDate;
    }

    /**
     * Sets the value of the universityDopUgodasYearDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityDopUgodasYearDate(String value) {
        this.universityDopUgodasYearDate = value;
    }

    /**
     * Gets the value of the universityDopUgodasNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityDopUgodasNumber() {
        return universityDopUgodasNumber;
    }

    /**
     * Sets the value of the universityDopUgodasNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityDopUgodasNumber(String value) {
        this.universityDopUgodasNumber = value;
    }

    /**
     * Gets the value of the universityDogovorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityDogovorNumber() {
        return universityDogovorNumber;
    }

    /**
     * Sets the value of the universityDogovorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityDogovorNumber(String value) {
        this.universityDogovorNumber = value;
    }

    /**
     * Gets the value of the universityDogovorDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityDogovorDate() {
        return universityDogovorDate;
    }

    /**
     * Sets the value of the universityDogovorDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityDogovorDate(String value) {
        this.universityDogovorDate = value;
    }

    /**
     * Gets the value of the costOneStudent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostOneStudent() {
        return costOneStudent;
    }

    /**
     * Sets the value of the costOneStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostOneStudent(String value) {
        this.costOneStudent = value;
    }

    /**
     * Gets the value of the studentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentsCount() {
        return studentsCount;
    }

    /**
     * Sets the value of the studentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentsCount(String value) {
        this.studentsCount = value;
    }

    /**
     * Gets the value of the idUgodaType property.
     * 
     */
    public int getIdUgodaType() {
        return idUgodaType;
    }

    /**
     * Sets the value of the idUgodaType property.
     * 
     */
    public void setIdUgodaType(int value) {
        this.idUgodaType = value;
    }

}
