
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
 *         &lt;element name="AcademicReports7AAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicReports7AAddResult"
})
@XmlRootElement(name = "AcademicReports7AAddResponse")
public class AcademicReports7AAddResponse {

    @XmlElement(name = "AcademicReports7AAddResult")
    protected int academicReports7AAddResult;

    /**
     * Gets the value of the academicReports7AAddResult property.
     * 
     */
    public int getAcademicReports7AAddResult() {
        return academicReports7AAddResult;
    }

    /**
     * Sets the value of the academicReports7AAddResult property.
     * 
     */
    public void setAcademicReports7AAddResult(int value) {
        this.academicReports7AAddResult = value;
    }

}
