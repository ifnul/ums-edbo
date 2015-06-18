
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
 *         &lt;element name="Id_PersonEducationProgressOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityDateCreate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_PersonWork" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateRun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeDegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Examinatorts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Teachers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ControlValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPersonEducationProgressOrders",
    "universityDateCreate",
    "universityNumber",
    "idPersonWork",
    "dateRun",
    "timeDegin",
    "timeEnd",
    "examinatorts",
    "teachers",
    "controlValue"
})
@XmlRootElement(name = "PersonEducationProgressOrdersEdit")
public class PersonEducationProgressOrdersEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonEducationProgressOrders")
    protected int idPersonEducationProgressOrders;
    @XmlElement(name = "UniversityDateCreate")
    protected String universityDateCreate;
    @XmlElement(name = "UniversityNumber")
    protected String universityNumber;
    @XmlElement(name = "Id_PersonWork")
    protected int idPersonWork;
    @XmlElement(name = "DateRun")
    protected String dateRun;
    @XmlElement(name = "TimeDegin")
    protected String timeDegin;
    @XmlElement(name = "TimeEnd")
    protected String timeEnd;
    @XmlElement(name = "Examinatorts")
    protected String examinatorts;
    @XmlElement(name = "Teachers")
    protected String teachers;
    @XmlElement(name = "ControlValue")
    protected String controlValue;

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
     * Gets the value of the idPersonEducationProgressOrders property.
     * 
     */
    public int getIdPersonEducationProgressOrders() {
        return idPersonEducationProgressOrders;
    }

    /**
     * Sets the value of the idPersonEducationProgressOrders property.
     * 
     */
    public void setIdPersonEducationProgressOrders(int value) {
        this.idPersonEducationProgressOrders = value;
    }

    /**
     * Gets the value of the universityDateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityDateCreate() {
        return universityDateCreate;
    }

    /**
     * Sets the value of the universityDateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityDateCreate(String value) {
        this.universityDateCreate = value;
    }

    /**
     * Gets the value of the universityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityNumber() {
        return universityNumber;
    }

    /**
     * Sets the value of the universityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityNumber(String value) {
        this.universityNumber = value;
    }

    /**
     * Gets the value of the idPersonWork property.
     * 
     */
    public int getIdPersonWork() {
        return idPersonWork;
    }

    /**
     * Sets the value of the idPersonWork property.
     * 
     */
    public void setIdPersonWork(int value) {
        this.idPersonWork = value;
    }

    /**
     * Gets the value of the dateRun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateRun() {
        return dateRun;
    }

    /**
     * Sets the value of the dateRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateRun(String value) {
        this.dateRun = value;
    }

    /**
     * Gets the value of the timeDegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeDegin() {
        return timeDegin;
    }

    /**
     * Sets the value of the timeDegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeDegin(String value) {
        this.timeDegin = value;
    }

    /**
     * Gets the value of the timeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeEnd() {
        return timeEnd;
    }

    /**
     * Sets the value of the timeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeEnd(String value) {
        this.timeEnd = value;
    }

    /**
     * Gets the value of the examinatorts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminatorts() {
        return examinatorts;
    }

    /**
     * Sets the value of the examinatorts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminatorts(String value) {
        this.examinatorts = value;
    }

    /**
     * Gets the value of the teachers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeachers() {
        return teachers;
    }

    /**
     * Sets the value of the teachers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeachers(String value) {
        this.teachers = value;
    }

    /**
     * Gets the value of the controlValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlValue() {
        return controlValue;
    }

    /**
     * Sets the value of the controlValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlValue(String value) {
        this.controlValue = value;
    }

}
