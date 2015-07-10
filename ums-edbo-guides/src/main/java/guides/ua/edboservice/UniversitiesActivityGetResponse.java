
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
 *         &lt;element name="UniversitiesActivityGetResult" type="{http://edboservice.ua/}ArrayOfDUniversitiesActivity" minOccurs="0"/>
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
    "universitiesActivityGetResult"
})
@XmlRootElement(name = "UniversitiesActivityGetResponse")
public class UniversitiesActivityGetResponse {

    @XmlElement(name = "UniversitiesActivityGetResult")
    protected ArrayOfDUniversitiesActivity universitiesActivityGetResult;

    /**
     * Gets the value of the universitiesActivityGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversitiesActivity }
     *     
     */
    public ArrayOfDUniversitiesActivity getUniversitiesActivityGetResult() {
        return universitiesActivityGetResult;
    }

    /**
     * Sets the value of the universitiesActivityGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversitiesActivity }
     *     
     */
    public void setUniversitiesActivityGetResult(ArrayOfDUniversitiesActivity value) {
        this.universitiesActivityGetResult = value;
    }

}
