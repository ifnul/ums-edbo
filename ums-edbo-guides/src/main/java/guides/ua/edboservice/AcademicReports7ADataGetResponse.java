
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
 *         &lt;element name="AcademicReports7ADataGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicReports7AData" minOccurs="0"/>
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
    "academicReports7ADataGetResult"
})
@XmlRootElement(name = "AcademicReports7ADataGetResponse")
public class AcademicReports7ADataGetResponse {

    @XmlElement(name = "AcademicReports7ADataGetResult")
    protected ArrayOfDAcademicReports7AData academicReports7ADataGetResult;

    /**
     * Gets the value of the academicReports7ADataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicReports7AData }
     *     
     */
    public ArrayOfDAcademicReports7AData getAcademicReports7ADataGetResult() {
        return academicReports7ADataGetResult;
    }

    /**
     * Sets the value of the academicReports7ADataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicReports7AData }
     *     
     */
    public void setAcademicReports7ADataGetResult(ArrayOfDAcademicReports7AData value) {
        this.academicReports7ADataGetResult = value;
    }

}
