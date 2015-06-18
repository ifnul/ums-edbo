
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
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData5Subject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Choose" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsProfile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubjectAdditianalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idReceptionConditionAdditionsTableData5Subject",
    "choose",
    "isProfile",
    "minValue",
    "subjectAdditianalName"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData5SubjectsEdit")
public class ReceptionConditionAdditionsTableData5SubjectsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData5Subject")
    protected int idReceptionConditionAdditionsTableData5Subject;
    @XmlElement(name = "Choose")
    protected int choose;
    @XmlElement(name = "IsProfile")
    protected int isProfile;
    @XmlElement(name = "MinValue")
    protected String minValue;
    @XmlElement(name = "SubjectAdditianalName")
    protected String subjectAdditianalName;

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
     * Gets the value of the idReceptionConditionAdditionsTableData5Subject property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData5Subject() {
        return idReceptionConditionAdditionsTableData5Subject;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData5Subject property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData5Subject(int value) {
        this.idReceptionConditionAdditionsTableData5Subject = value;
    }

    /**
     * Gets the value of the choose property.
     * 
     */
    public int getChoose() {
        return choose;
    }

    /**
     * Sets the value of the choose property.
     * 
     */
    public void setChoose(int value) {
        this.choose = value;
    }

    /**
     * Gets the value of the isProfile property.
     * 
     */
    public int getIsProfile() {
        return isProfile;
    }

    /**
     * Sets the value of the isProfile property.
     * 
     */
    public void setIsProfile(int value) {
        this.isProfile = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinValue(String value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the subjectAdditianalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectAdditianalName() {
        return subjectAdditianalName;
    }

    /**
     * Sets the value of the subjectAdditianalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectAdditianalName(String value) {
        this.subjectAdditianalName = value;
    }

}
