
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniveristyDopUgodaClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniveristyDopUgodaClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityDopUgodas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityDopUgodasStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityDopUgodasYearDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityDopUgodasNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityDogovorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityDogovorDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CostOneStudent" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="StudentsCount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UniversityDopUgodasDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityDopUgodasStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocument" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsVerified" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_RegulationDocumentVerificationHistoryType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentVerificationHistoryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsExistFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_University" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniveristyDopUgodaClient", propOrder = {
    "idUniversityDopUgodas",
    "idUniversityDopUgodasStatus",
    "universityKode",
    "universityDopUgodasYearDate",
    "universityDopUgodasNumber",
    "universityDogovorNumber",
    "universityDogovorDate",
    "costOneStudent",
    "studentsCount",
    "universityDopUgodasDateLastChange",
    "universityDopUgodasStatusName",
    "idRegulationDocument",
    "isVerified",
    "idRegulationDocumentVerificationHistoryType",
    "regulationDocumentVerificationHistoryTypeName",
    "isExistFile",
    "idUniversity",
    "universityFullName",
    "region"
})
public class DUniveristyDopUgodaClient {

    @XmlElement(name = "Id_UniversityDopUgodas")
    protected int idUniversityDopUgodas;
    @XmlElement(name = "Id_UniversityDopUgodasStatus")
    protected int idUniversityDopUgodasStatus;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "UniversityDopUgodasYearDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityDopUgodasYearDate;
    @XmlElement(name = "UniversityDopUgodasNumber")
    protected String universityDopUgodasNumber;
    @XmlElement(name = "UniversityDogovorNumber")
    protected String universityDogovorNumber;
    @XmlElement(name = "UniversityDogovorDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityDogovorDate;
    @XmlElement(name = "CostOneStudent", required = true)
    protected BigDecimal costOneStudent;
    @XmlElement(name = "StudentsCount", required = true)
    protected BigDecimal studentsCount;
    @XmlElement(name = "UniversityDopUgodasDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar universityDopUgodasDateLastChange;
    @XmlElement(name = "UniversityDopUgodasStatusName")
    protected String universityDopUgodasStatusName;
    @XmlElement(name = "Id_RegulationDocument")
    protected int idRegulationDocument;
    @XmlElement(name = "IsVerified")
    protected int isVerified;
    @XmlElement(name = "Id_RegulationDocumentVerificationHistoryType")
    protected int idRegulationDocumentVerificationHistoryType;
    @XmlElement(name = "RegulationDocumentVerificationHistoryTypeName")
    protected String regulationDocumentVerificationHistoryTypeName;
    @XmlElement(name = "IsExistFile")
    protected int isExistFile;
    @XmlElement(name = "Id_University")
    protected int idUniversity;
    @XmlElement(name = "UniversityFullName")
    protected String universityFullName;
    @XmlElement(name = "Region")
    protected String region;

    /**
     * Gets the value of the idUniversityDopUgodas property.
     * 
     */
    public int getIdUniversityDopUgodas() {
        return idUniversityDopUgodas;
    }

    /**
     * Sets the value of the idUniversityDopUgodas property.
     * 
     */
    public void setIdUniversityDopUgodas(int value) {
        this.idUniversityDopUgodas = value;
    }

    /**
     * Gets the value of the idUniversityDopUgodasStatus property.
     * 
     */
    public int getIdUniversityDopUgodasStatus() {
        return idUniversityDopUgodasStatus;
    }

    /**
     * Sets the value of the idUniversityDopUgodasStatus property.
     * 
     */
    public void setIdUniversityDopUgodasStatus(int value) {
        this.idUniversityDopUgodasStatus = value;
    }

    /**
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the universityDopUgodasYearDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityDopUgodasYearDate() {
        return universityDopUgodasYearDate;
    }

    /**
     * Sets the value of the universityDopUgodasYearDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityDopUgodasYearDate(XMLGregorianCalendar value) {
        this.universityDopUgodasYearDate = value;
    }

    /**
     * Gets the value of the universityDopUgodasNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityDopUgodasNumber() {
        return universityDopUgodasNumber;
    }

    /**
     * Sets the value of the universityDopUgodasNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityDopUgodasNumber(String value) {
        this.universityDopUgodasNumber = value;
    }

    /**
     * Gets the value of the universityDogovorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityDogovorNumber() {
        return universityDogovorNumber;
    }

    /**
     * Sets the value of the universityDogovorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityDogovorNumber(String value) {
        this.universityDogovorNumber = value;
    }

    /**
     * Gets the value of the universityDogovorDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityDogovorDate() {
        return universityDogovorDate;
    }

    /**
     * Sets the value of the universityDogovorDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityDogovorDate(XMLGregorianCalendar value) {
        this.universityDogovorDate = value;
    }

    /**
     * Gets the value of the costOneStudent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostOneStudent() {
        return costOneStudent;
    }

    /**
     * Sets the value of the costOneStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostOneStudent(BigDecimal value) {
        this.costOneStudent = value;
    }

    /**
     * Gets the value of the studentsCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStudentsCount() {
        return studentsCount;
    }

    /**
     * Sets the value of the studentsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStudentsCount(BigDecimal value) {
        this.studentsCount = value;
    }

    /**
     * Gets the value of the universityDopUgodasDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUniversityDopUgodasDateLastChange() {
        return universityDopUgodasDateLastChange;
    }

    /**
     * Sets the value of the universityDopUgodasDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUniversityDopUgodasDateLastChange(XMLGregorianCalendar value) {
        this.universityDopUgodasDateLastChange = value;
    }

    /**
     * Gets the value of the universityDopUgodasStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityDopUgodasStatusName() {
        return universityDopUgodasStatusName;
    }

    /**
     * Sets the value of the universityDopUgodasStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityDopUgodasStatusName(String value) {
        this.universityDopUgodasStatusName = value;
    }

    /**
     * Gets the value of the idRegulationDocument property.
     * 
     */
    public int getIdRegulationDocument() {
        return idRegulationDocument;
    }

    /**
     * Sets the value of the idRegulationDocument property.
     * 
     */
    public void setIdRegulationDocument(int value) {
        this.idRegulationDocument = value;
    }

    /**
     * Gets the value of the isVerified property.
     * 
     */
    public int getIsVerified() {
        return isVerified;
    }

    /**
     * Sets the value of the isVerified property.
     * 
     */
    public void setIsVerified(int value) {
        this.isVerified = value;
    }

    /**
     * Gets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public int getIdRegulationDocumentVerificationHistoryType() {
        return idRegulationDocumentVerificationHistoryType;
    }

    /**
     * Sets the value of the idRegulationDocumentVerificationHistoryType property.
     * 
     */
    public void setIdRegulationDocumentVerificationHistoryType(int value) {
        this.idRegulationDocumentVerificationHistoryType = value;
    }

    /**
     * Gets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentVerificationHistoryTypeName() {
        return regulationDocumentVerificationHistoryTypeName;
    }

    /**
     * Sets the value of the regulationDocumentVerificationHistoryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentVerificationHistoryTypeName(String value) {
        this.regulationDocumentVerificationHistoryTypeName = value;
    }

    /**
     * Gets the value of the isExistFile property.
     * 
     */
    public int getIsExistFile() {
        return isExistFile;
    }

    /**
     * Sets the value of the isExistFile property.
     * 
     */
    public void setIsExistFile(int value) {
        this.isExistFile = value;
    }

    /**
     * Gets the value of the idUniversity property.
     * 
     */
    public int getIdUniversity() {
        return idUniversity;
    }

    /**
     * Sets the value of the idUniversity property.
     * 
     */
    public void setIdUniversity(int value) {
        this.idUniversity = value;
    }

    /**
     * Gets the value of the universityFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityFullName() {
        return universityFullName;
    }

    /**
     * Sets the value of the universityFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityFullName(String value) {
        this.universityFullName = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

}
