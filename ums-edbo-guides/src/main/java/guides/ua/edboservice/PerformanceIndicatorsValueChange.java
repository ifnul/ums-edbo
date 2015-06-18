
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
 *         &lt;element name="Id_PerformanceIndicatorData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PerformanceIndicatorDataValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPerformanceIndicatorData",
    "performanceIndicatorDataValue"
})
@XmlRootElement(name = "PerformanceIndicatorsValueChange")
public class PerformanceIndicatorsValueChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PerformanceIndicatorData")
    protected int idPerformanceIndicatorData;
    @XmlElement(name = "PerformanceIndicatorDataValue")
    protected String performanceIndicatorDataValue;

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
     * Gets the value of the idPerformanceIndicatorData property.
     * 
     */
    public int getIdPerformanceIndicatorData() {
        return idPerformanceIndicatorData;
    }

    /**
     * Sets the value of the idPerformanceIndicatorData property.
     * 
     */
    public void setIdPerformanceIndicatorData(int value) {
        this.idPerformanceIndicatorData = value;
    }

    /**
     * Gets the value of the performanceIndicatorDataValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerformanceIndicatorDataValue() {
        return performanceIndicatorDataValue;
    }

    /**
     * Sets the value of the performanceIndicatorDataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerformanceIndicatorDataValue(String value) {
        this.performanceIndicatorDataValue = value;
    }

}
