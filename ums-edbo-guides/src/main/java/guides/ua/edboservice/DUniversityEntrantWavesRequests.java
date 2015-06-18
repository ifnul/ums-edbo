
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dUniversityEntrantWavesRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityEntrantWavesRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RowNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodeOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="KonkursValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="KonkursValueSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistBenefitsPozacherg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExistBenefitsPershocherg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequestStatusType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestStatusTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_UniversityEntrantWave" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestStatusIsBudejt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestStatusIsContract" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntrantWaveNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EntrantWaveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OriginalDocumentsAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistQuotasCiloviy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PozakonEntranceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Course" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InformationOriginalDocumentLocation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityEntrantWavesRequests", propOrder = {
    "rowNumber",
    "idPersonRequest",
    "codeOfBusiness",
    "dateCreate",
    "konkursValue",
    "konkursValueSource",
    "existBenefitsPozacherg",
    "existBenefitsPershocherg",
    "idPersonRequestStatusType",
    "personRequestStatusTypeName",
    "idUniversityEntrantWave",
    "requestStatusIsBudejt",
    "requestStatusIsContract",
    "fio",
    "entrantWaveNumber",
    "entrantWaveName",
    "originalDocumentsAdd",
    "personCodeU",
    "existQuotasCiloviy",
    "pozakonEntranceCode",
    "idCourse",
    "informationOriginalDocumentLocation"
})
public class DUniversityEntrantWavesRequests {

    @XmlElement(name = "RowNumber")
    protected int rowNumber;
    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "CodeOfBusiness")
    protected String codeOfBusiness;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "KonkursValue", required = true)
    protected BigDecimal konkursValue;
    @XmlElement(name = "KonkursValueSource")
    protected String konkursValueSource;
    @XmlElement(name = "ExistBenefitsPozacherg")
    protected int existBenefitsPozacherg;
    @XmlElement(name = "ExistBenefitsPershocherg")
    protected int existBenefitsPershocherg;
    @XmlElement(name = "Id_PersonRequestStatusType")
    protected int idPersonRequestStatusType;
    @XmlElement(name = "PersonRequestStatusTypeName")
    protected String personRequestStatusTypeName;
    @XmlElement(name = "Id_UniversityEntrantWave")
    protected int idUniversityEntrantWave;
    @XmlElement(name = "RequestStatusIsBudejt")
    protected int requestStatusIsBudejt;
    @XmlElement(name = "RequestStatusIsContract")
    protected int requestStatusIsContract;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "EntrantWaveNumber")
    protected int entrantWaveNumber;
    @XmlElement(name = "EntrantWaveName")
    protected String entrantWaveName;
    @XmlElement(name = "OriginalDocumentsAdd")
    protected int originalDocumentsAdd;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;
    @XmlElement(name = "ExistQuotasCiloviy")
    protected int existQuotasCiloviy;
    @XmlElement(name = "PozakonEntranceCode")
    protected String pozakonEntranceCode;
    @XmlElement(name = "Id_Course")
    protected int idCourse;
    @XmlElement(name = "InformationOriginalDocumentLocation")
    protected int informationOriginalDocumentLocation;

    /**
     * Gets the value of the rowNumber property.
     * 
     */
    public int getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     */
    public void setRowNumber(int value) {
        this.rowNumber = value;
    }

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
     * Gets the value of the dateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreate() {
        return dateCreate;
    }

    /**
     * Sets the value of the dateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreate(XMLGregorianCalendar value) {
        this.dateCreate = value;
    }

    /**
     * Gets the value of the konkursValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKonkursValue() {
        return konkursValue;
    }

    /**
     * Sets the value of the konkursValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKonkursValue(BigDecimal value) {
        this.konkursValue = value;
    }

    /**
     * Gets the value of the konkursValueSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonkursValueSource() {
        return konkursValueSource;
    }

    /**
     * Sets the value of the konkursValueSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonkursValueSource(String value) {
        this.konkursValueSource = value;
    }

    /**
     * Gets the value of the existBenefitsPozacherg property.
     * 
     */
    public int getExistBenefitsPozacherg() {
        return existBenefitsPozacherg;
    }

    /**
     * Sets the value of the existBenefitsPozacherg property.
     * 
     */
    public void setExistBenefitsPozacherg(int value) {
        this.existBenefitsPozacherg = value;
    }

    /**
     * Gets the value of the existBenefitsPershocherg property.
     * 
     */
    public int getExistBenefitsPershocherg() {
        return existBenefitsPershocherg;
    }

    /**
     * Sets the value of the existBenefitsPershocherg property.
     * 
     */
    public void setExistBenefitsPershocherg(int value) {
        this.existBenefitsPershocherg = value;
    }

    /**
     * Gets the value of the idPersonRequestStatusType property.
     * 
     */
    public int getIdPersonRequestStatusType() {
        return idPersonRequestStatusType;
    }

    /**
     * Sets the value of the idPersonRequestStatusType property.
     * 
     */
    public void setIdPersonRequestStatusType(int value) {
        this.idPersonRequestStatusType = value;
    }

    /**
     * Gets the value of the personRequestStatusTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRequestStatusTypeName() {
        return personRequestStatusTypeName;
    }

    /**
     * Sets the value of the personRequestStatusTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRequestStatusTypeName(String value) {
        this.personRequestStatusTypeName = value;
    }

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
     * Gets the value of the requestStatusIsBudejt property.
     * 
     */
    public int getRequestStatusIsBudejt() {
        return requestStatusIsBudejt;
    }

    /**
     * Sets the value of the requestStatusIsBudejt property.
     * 
     */
    public void setRequestStatusIsBudejt(int value) {
        this.requestStatusIsBudejt = value;
    }

    /**
     * Gets the value of the requestStatusIsContract property.
     * 
     */
    public int getRequestStatusIsContract() {
        return requestStatusIsContract;
    }

    /**
     * Sets the value of the requestStatusIsContract property.
     * 
     */
    public void setRequestStatusIsContract(int value) {
        this.requestStatusIsContract = value;
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
     * Gets the value of the originalDocumentsAdd property.
     * 
     */
    public int getOriginalDocumentsAdd() {
        return originalDocumentsAdd;
    }

    /**
     * Sets the value of the originalDocumentsAdd property.
     * 
     */
    public void setOriginalDocumentsAdd(int value) {
        this.originalDocumentsAdd = value;
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
     * Gets the value of the existQuotasCiloviy property.
     * 
     */
    public int getExistQuotasCiloviy() {
        return existQuotasCiloviy;
    }

    /**
     * Sets the value of the existQuotasCiloviy property.
     * 
     */
    public void setExistQuotasCiloviy(int value) {
        this.existQuotasCiloviy = value;
    }

    /**
     * Gets the value of the pozakonEntranceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPozakonEntranceCode() {
        return pozakonEntranceCode;
    }

    /**
     * Sets the value of the pozakonEntranceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPozakonEntranceCode(String value) {
        this.pozakonEntranceCode = value;
    }

    /**
     * Gets the value of the idCourse property.
     * 
     */
    public int getIdCourse() {
        return idCourse;
    }

    /**
     * Sets the value of the idCourse property.
     * 
     */
    public void setIdCourse(int value) {
        this.idCourse = value;
    }

    /**
     * Gets the value of the informationOriginalDocumentLocation property.
     * 
     */
    public int getInformationOriginalDocumentLocation() {
        return informationOriginalDocumentLocation;
    }

    /**
     * Sets the value of the informationOriginalDocumentLocation property.
     * 
     */
    public void setInformationOriginalDocumentLocation(int value) {
        this.informationOriginalDocumentLocation = value;
    }

}
