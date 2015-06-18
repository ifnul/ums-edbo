
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityEntrantWaves2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityEntrantWaves2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityEntrantWave" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntrantWaveNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CiloviyCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BudjetCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ContractCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntrantWaveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntrantWaveDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntrantWaveDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PozakonCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsForeignWay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NotPostVstupInfo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityEntrantWaves2", propOrder = {
    "idUniversityEntrantWave",
    "entrantWaveNumber",
    "isActive",
    "ciloviyCount",
    "budjetCount",
    "contractCount",
    "entrantWaveName",
    "entrantWaveDescription",
    "entrantWaveDateLastChange",
    "pozakonCount",
    "isForeignWay",
    "notPostVstupInfo"
})
public class DUniversityEntrantWaves2 {

    @XmlElement(name = "Id_UniversityEntrantWave")
    protected int idUniversityEntrantWave;
    @XmlElement(name = "EntrantWaveNumber")
    protected int entrantWaveNumber;
    @XmlElement(name = "IsActive")
    protected int isActive;
    @XmlElement(name = "CiloviyCount")
    protected int ciloviyCount;
    @XmlElement(name = "BudjetCount")
    protected int budjetCount;
    @XmlElement(name = "ContractCount")
    protected int contractCount;
    @XmlElement(name = "EntrantWaveName")
    protected String entrantWaveName;
    @XmlElement(name = "EntrantWaveDescription")
    protected String entrantWaveDescription;
    @XmlElement(name = "EntrantWaveDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entrantWaveDateLastChange;
    @XmlElement(name = "PozakonCount")
    protected int pozakonCount;
    @XmlElement(name = "IsForeignWay")
    protected int isForeignWay;
    @XmlElement(name = "NotPostVstupInfo")
    protected int notPostVstupInfo;

    /**
     * Gets the value of the idUniversityEntrantWave property.
     * 
     */
    public int getIdUniversityEntrantWave() {
        return idUniversityEntrantWave;
    }

    /**
     * Sets the value of the idUniversityEntrantWave property.
     * 
     */
    public void setIdUniversityEntrantWave(int value) {
        this.idUniversityEntrantWave = value;
    }

    /**
     * Gets the value of the entrantWaveNumber property.
     * 
     */
    public int getEntrantWaveNumber() {
        return entrantWaveNumber;
    }

    /**
     * Sets the value of the entrantWaveNumber property.
     * 
     */
    public void setEntrantWaveNumber(int value) {
        this.entrantWaveNumber = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     */
    public int getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     */
    public void setIsActive(int value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the ciloviyCount property.
     * 
     */
    public int getCiloviyCount() {
        return ciloviyCount;
    }

    /**
     * Sets the value of the ciloviyCount property.
     * 
     */
    public void setCiloviyCount(int value) {
        this.ciloviyCount = value;
    }

    /**
     * Gets the value of the budjetCount property.
     * 
     */
    public int getBudjetCount() {
        return budjetCount;
    }

    /**
     * Sets the value of the budjetCount property.
     * 
     */
    public void setBudjetCount(int value) {
        this.budjetCount = value;
    }

    /**
     * Gets the value of the contractCount property.
     * 
     */
    public int getContractCount() {
        return contractCount;
    }

    /**
     * Sets the value of the contractCount property.
     * 
     */
    public void setContractCount(int value) {
        this.contractCount = value;
    }

    /**
     * Gets the value of the entrantWaveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrantWaveName() {
        return entrantWaveName;
    }

    /**
     * Sets the value of the entrantWaveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrantWaveName(String value) {
        this.entrantWaveName = value;
    }

    /**
     * Gets the value of the entrantWaveDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrantWaveDescription() {
        return entrantWaveDescription;
    }

    /**
     * Sets the value of the entrantWaveDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrantWaveDescription(String value) {
        this.entrantWaveDescription = value;
    }

    /**
     * Gets the value of the entrantWaveDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntrantWaveDateLastChange() {
        return entrantWaveDateLastChange;
    }

    /**
     * Sets the value of the entrantWaveDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntrantWaveDateLastChange(XMLGregorianCalendar value) {
        this.entrantWaveDateLastChange = value;
    }

    /**
     * Gets the value of the pozakonCount property.
     * 
     */
    public int getPozakonCount() {
        return pozakonCount;
    }

    /**
     * Sets the value of the pozakonCount property.
     * 
     */
    public void setPozakonCount(int value) {
        this.pozakonCount = value;
    }

    /**
     * Gets the value of the isForeignWay property.
     * 
     */
    public int getIsForeignWay() {
        return isForeignWay;
    }

    /**
     * Sets the value of the isForeignWay property.
     * 
     */
    public void setIsForeignWay(int value) {
        this.isForeignWay = value;
    }

    /**
     * Gets the value of the notPostVstupInfo property.
     * 
     */
    public int getNotPostVstupInfo() {
        return notPostVstupInfo;
    }

    /**
     * Sets the value of the notPostVstupInfo property.
     * 
     */
    public void setNotPostVstupInfo(int value) {
        this.notPostVstupInfo = value;
    }

}
