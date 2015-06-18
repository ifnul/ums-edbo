
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
 *         &lt;element name="Id_ExaminationSheet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExaminationSheetDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetStreemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetExaminer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetDateBegin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExaminationSheetDateEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Room" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idExaminationSheet",
    "examinationSheetDate",
    "examinationSheetNumber",
    "examinationSheetGroupName",
    "examinationSheetStreemName",
    "examinationSheetExaminer",
    "examinationSheetDateBegin",
    "examinationSheetDateEnd",
    "building",
    "room"
})
@XmlRootElement(name = "ExaminationSheetsEdit2")
public class ExaminationSheetsEdit2 {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_ExaminationSheet")
    protected int idExaminationSheet;
    @XmlElement(name = "ExaminationSheetDate")
    protected String examinationSheetDate;
    @XmlElement(name = "ExaminationSheetNumber")
    protected String examinationSheetNumber;
    @XmlElement(name = "ExaminationSheetGroupName")
    protected String examinationSheetGroupName;
    @XmlElement(name = "ExaminationSheetStreemName")
    protected String examinationSheetStreemName;
    @XmlElement(name = "ExaminationSheetExaminer")
    protected String examinationSheetExaminer;
    @XmlElement(name = "ExaminationSheetDateBegin")
    protected String examinationSheetDateBegin;
    @XmlElement(name = "ExaminationSheetDateEnd")
    protected String examinationSheetDateEnd;
    @XmlElement(name = "Building")
    protected String building;
    @XmlElement(name = "Room")
    protected String room;

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
     * Gets the value of the idExaminationSheet property.
     * 
     */
    public int getIdExaminationSheet() {
        return idExaminationSheet;
    }

    /**
     * Sets the value of the idExaminationSheet property.
     * 
     */
    public void setIdExaminationSheet(int value) {
        this.idExaminationSheet = value;
    }

    /**
     * Gets the value of the examinationSheetDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetDate() {
        return examinationSheetDate;
    }

    /**
     * Sets the value of the examinationSheetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetDate(String value) {
        this.examinationSheetDate = value;
    }

    /**
     * Gets the value of the examinationSheetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetNumber() {
        return examinationSheetNumber;
    }

    /**
     * Sets the value of the examinationSheetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetNumber(String value) {
        this.examinationSheetNumber = value;
    }

    /**
     * Gets the value of the examinationSheetGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetGroupName() {
        return examinationSheetGroupName;
    }

    /**
     * Sets the value of the examinationSheetGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetGroupName(String value) {
        this.examinationSheetGroupName = value;
    }

    /**
     * Gets the value of the examinationSheetStreemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetStreemName() {
        return examinationSheetStreemName;
    }

    /**
     * Sets the value of the examinationSheetStreemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetStreemName(String value) {
        this.examinationSheetStreemName = value;
    }

    /**
     * Gets the value of the examinationSheetExaminer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetExaminer() {
        return examinationSheetExaminer;
    }

    /**
     * Sets the value of the examinationSheetExaminer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetExaminer(String value) {
        this.examinationSheetExaminer = value;
    }

    /**
     * Gets the value of the examinationSheetDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetDateBegin() {
        return examinationSheetDateBegin;
    }

    /**
     * Sets the value of the examinationSheetDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetDateBegin(String value) {
        this.examinationSheetDateBegin = value;
    }

    /**
     * Gets the value of the examinationSheetDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExaminationSheetDateEnd() {
        return examinationSheetDateEnd;
    }

    /**
     * Sets the value of the examinationSheetDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExaminationSheetDateEnd(String value) {
        this.examinationSheetDateEnd = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the room property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoom() {
        return room;
    }

    /**
     * Sets the value of the room property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoom(String value) {
        this.room = value;
    }

}
