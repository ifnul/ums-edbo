
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dOrderOfDocumentsForAddRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOrderOfDocumentsForAddRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFacultetFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfEnrollmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderOfEnrollmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOrderOfDocumentsForAddRequests", propOrder = {
    "idPersonRequest",
    "universityFacultetFullName",
    "fio",
    "codeOfBusiness",
    "orderOfEnrollmentNumber",
    "orderOfEnrollmentDate",
    "personCodeU"
})
public class DOrderOfDocumentsForAddRequests {

    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "UniversityFacultetFullName")
    protected String universityFacultetFullName;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "CodeOfBusiness")
    protected String codeOfBusiness;
    @XmlElement(name = "OrderOfEnrollmentNumber")
    protected String orderOfEnrollmentNumber;
    @XmlElement(name = "OrderOfEnrollmentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderOfEnrollmentDate;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;

    /**
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
    }

    /**
     * Gets the value of the universityFacultetFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFacultetFullName() {
        return universityFacultetFullName;
    }

    /**
     * Sets the value of the universityFacultetFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFacultetFullName(String value) {
        this.universityFacultetFullName = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the codeOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeOfBusiness() {
        return codeOfBusiness;
    }

    /**
     * Sets the value of the codeOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeOfBusiness(String value) {
        this.codeOfBusiness = value;
    }

    /**
     * Gets the value of the orderOfEnrollmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfEnrollmentNumber() {
        return orderOfEnrollmentNumber;
    }

    /**
     * Sets the value of the orderOfEnrollmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfEnrollmentNumber(String value) {
        this.orderOfEnrollmentNumber = value;
    }

    /**
     * Gets the value of the orderOfEnrollmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderOfEnrollmentDate() {
        return orderOfEnrollmentDate;
    }

    /**
     * Sets the value of the orderOfEnrollmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderOfEnrollmentDate(XMLGregorianCalendar value) {
        this.orderOfEnrollmentDate = value;
    }

    /**
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
    }

}
