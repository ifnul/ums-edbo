
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dAcademicBoardData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicBoardData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicAttestationCase" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MIddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicAttestationCaseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicAttestationCaseTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DegreeRankTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicAttestationCaseSatusHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicBoardData", propOrder = {
    "idAcademicAttestationCase",
    "caseDate",
    "caseNumber",
    "lastName",
    "firstName",
    "mIddleName",
    "personCodeU",
    "idAcademicAttestationCaseType",
    "academicAttestationCaseTypeName",
    "degreeRankTypes",
    "academicAttestationCaseSatusHistoryTypeName"
})
public class DAcademicBoardData {

    @XmlElement(name = "Id_AcademicAttestationCase")
    protected int idAcademicAttestationCase;
    @XmlElement(name = "CaseDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar caseDate;
    @XmlElement(name = "CaseNumber")
    protected String caseNumber;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "MIddleName")
    protected String mIddleName;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "Id_AcademicAttestationCaseType")
    protected int idAcademicAttestationCaseType;
    @XmlElement(name = "AcademicAttestationCaseTypeName")
    protected String academicAttestationCaseTypeName;
    @XmlElement(name = "DegreeRankTypes")
    protected String degreeRankTypes;
    @XmlElement(name = "AcademicAttestationCaseSatusHistoryTypeName")
    protected String academicAttestationCaseSatusHistoryTypeName;

    /**
     * Gets the value of the idAcademicAttestationCase property.
     * 
     */
    public int getIdAcademicAttestationCase() {
        return idAcademicAttestationCase;
    }

    /**
     * Sets the value of the idAcademicAttestationCase property.
     * 
     */
    public void setIdAcademicAttestationCase(int value) {
        this.idAcademicAttestationCase = value;
    }

    /**
     * Gets the value of the caseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCaseDate() {
        return caseDate;
    }

    /**
     * Sets the value of the caseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCaseDate(XMLGregorianCalendar value) {
        this.caseDate = value;
    }

    /**
     * Gets the value of the caseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNumber(String value) {
        this.caseNumber = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the mIddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIddleName() {
        return mIddleName;
    }

    /**
     * Sets the value of the mIddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIddleName(String value) {
        this.mIddleName = value;
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

    /**
     * Gets the value of the idAcademicAttestationCaseType property.
     * 
     */
    public int getIdAcademicAttestationCaseType() {
        return idAcademicAttestationCaseType;
    }

    /**
     * Sets the value of the idAcademicAttestationCaseType property.
     * 
     */
    public void setIdAcademicAttestationCaseType(int value) {
        this.idAcademicAttestationCaseType = value;
    }

    /**
     * Gets the value of the academicAttestationCaseTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicAttestationCaseTypeName() {
        return academicAttestationCaseTypeName;
    }

    /**
     * Sets the value of the academicAttestationCaseTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicAttestationCaseTypeName(String value) {
        this.academicAttestationCaseTypeName = value;
    }

    /**
     * Gets the value of the degreeRankTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegreeRankTypes() {
        return degreeRankTypes;
    }

    /**
     * Sets the value of the degreeRankTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegreeRankTypes(String value) {
        this.degreeRankTypes = value;
    }

    /**
     * Gets the value of the academicAttestationCaseSatusHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicAttestationCaseSatusHistoryTypeName() {
        return academicAttestationCaseSatusHistoryTypeName;
    }

    /**
     * Sets the value of the academicAttestationCaseSatusHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicAttestationCaseSatusHistoryTypeName(String value) {
        this.academicAttestationCaseSatusHistoryTypeName = value;
    }

}
