
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dReceptionConditionAdditionsTableData1Periods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReceptionConditionAdditionsTableData1Periods">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData1Periods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonEducationForm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DurYears" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DurMonths" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Vartist" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="VartistComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReceptionConditionAdditionsTableData1Periods", propOrder = {
    "idReceptionConditionAdditionsTableData1Periods",
    "idReceptionConditionAdditionsTableData1",
    "idPersonEducationForm",
    "durYears",
    "durMonths",
    "comments",
    "vartist",
    "vartistComment"
})
public class DReceptionConditionAdditionsTableData1Periods {

    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData1Periods")
    protected int idReceptionConditionAdditionsTableData1Periods;
    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData1")
    protected int idReceptionConditionAdditionsTableData1;
    @XmlElement(name = "Id_PersonEducationForm")
    protected int idPersonEducationForm;
    @XmlElement(name = "DurYears")
    protected int durYears;
    @XmlElement(name = "DurMonths")
    protected int durMonths;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "Vartist", required = true)
    protected BigDecimal vartist;
    @XmlElement(name = "VartistComment")
    protected String vartistComment;

    /**
     * Gets the value of the idReceptionConditionAdditionsTableData1Periods property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData1Periods() {
        return idReceptionConditionAdditionsTableData1Periods;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData1Periods property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData1Periods(int value) {
        this.idReceptionConditionAdditionsTableData1Periods = value;
    }

    /**
     * Gets the value of the idReceptionConditionAdditionsTableData1 property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData1() {
        return idReceptionConditionAdditionsTableData1;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData1 property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData1(int value) {
        this.idReceptionConditionAdditionsTableData1 = value;
    }

    /**
     * Gets the value of the idPersonEducationForm property.
     * 
     */
    public int getIdPersonEducationForm() {
        return idPersonEducationForm;
    }

    /**
     * Sets the value of the idPersonEducationForm property.
     * 
     */
    public void setIdPersonEducationForm(int value) {
        this.idPersonEducationForm = value;
    }

    /**
     * Gets the value of the durYears property.
     * 
     */
    public int getDurYears() {
        return durYears;
    }

    /**
     * Sets the value of the durYears property.
     * 
     */
    public void setDurYears(int value) {
        this.durYears = value;
    }

    /**
     * Gets the value of the durMonths property.
     * 
     */
    public int getDurMonths() {
        return durMonths;
    }

    /**
     * Sets the value of the durMonths property.
     * 
     */
    public void setDurMonths(int value) {
        this.durMonths = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the vartist property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVartist() {
        return vartist;
    }

    /**
     * Sets the value of the vartist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVartist(BigDecimal value) {
        this.vartist = value;
    }

    /**
     * Gets the value of the vartistComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVartistComment() {
        return vartistComment;
    }

    /**
     * Sets the value of the vartistComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVartistComment(String value) {
        this.vartistComment = value;
    }

}
