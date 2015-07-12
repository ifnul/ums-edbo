
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityCoursesAdd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityCoursesAdd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityCourse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityCourseName" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityCoursesAdd", propOrder = {
    "idUniversityCourse",
    "idUniversityCourseName",
    "universityCourseCode"
})
public class DUniversityCoursesAdd {

    @XmlElement(name = "Id_UniversityCourse")
    protected int idUniversityCourse;
    @XmlElement(name = "Id_UniversityCourseName")
    protected int idUniversityCourseName;
    @XmlElement(name = "UniversityCourseCode")
    protected String universityCourseCode;

    /**
     * Gets the value of the idUniversityCourse property.
     * 
     */
    public int getIdUniversityCourse() {
        return idUniversityCourse;
    }

    /**
     * Sets the value of the idUniversityCourse property.
     * 
     */
    public void setIdUniversityCourse(int value) {
        this.idUniversityCourse = value;
    }

    /**
     * Gets the value of the idUniversityCourseName property.
     * 
     */
    public int getIdUniversityCourseName() {
        return idUniversityCourseName;
    }

    /**
     * Sets the value of the idUniversityCourseName property.
     * 
     */
    public void setIdUniversityCourseName(int value) {
        this.idUniversityCourseName = value;
    }

    /**
     * Gets the value of the universityCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityCourseCode() {
        return universityCourseCode;
    }

    /**
     * Sets the value of the universityCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityCourseCode(String value) {
        this.universityCourseCode = value;
    }

}
