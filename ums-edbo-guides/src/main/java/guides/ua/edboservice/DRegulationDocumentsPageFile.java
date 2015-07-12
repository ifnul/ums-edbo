
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dRegulationDocumentsPageFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dRegulationDocumentsPageFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_RegulationDocumentsFile" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentsFileTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_RegulationDocumentsFileType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubPageNumbers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegulationDocumentsFileBase64String" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dRegulationDocumentsPageFile", propOrder = {
    "idRegulationDocumentsFile",
    "regulationDocumentsFileTypeName",
    "idRegulationDocumentsFileType",
    "pageNumber",
    "subPageNumbers",
    "regulationDocumentsFileBase64String"
})
public class DRegulationDocumentsPageFile {

    @XmlElement(name = "Id_RegulationDocumentsFile")
    protected int idRegulationDocumentsFile;
    @XmlElement(name = "RegulationDocumentsFileTypeName")
    protected String regulationDocumentsFileTypeName;
    @XmlElement(name = "Id_RegulationDocumentsFileType")
    protected int idRegulationDocumentsFileType;
    @XmlElement(name = "PageNumber")
    protected int pageNumber;
    @XmlElement(name = "SubPageNumbers")
    protected int subPageNumbers;
    @XmlElement(name = "RegulationDocumentsFileBase64String")
    protected String regulationDocumentsFileBase64String;

    /**
     * Gets the value of the idRegulationDocumentsFile property.
     * 
     */
    public int getIdRegulationDocumentsFile() {
        return idRegulationDocumentsFile;
    }

    /**
     * Sets the value of the idRegulationDocumentsFile property.
     * 
     */
    public void setIdRegulationDocumentsFile(int value) {
        this.idRegulationDocumentsFile = value;
    }

    /**
     * Gets the value of the regulationDocumentsFileTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentsFileTypeName() {
        return regulationDocumentsFileTypeName;
    }

    /**
     * Sets the value of the regulationDocumentsFileTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentsFileTypeName(String value) {
        this.regulationDocumentsFileTypeName = value;
    }

    /**
     * Gets the value of the idRegulationDocumentsFileType property.
     * 
     */
    public int getIdRegulationDocumentsFileType() {
        return idRegulationDocumentsFileType;
    }

    /**
     * Sets the value of the idRegulationDocumentsFileType property.
     * 
     */
    public void setIdRegulationDocumentsFileType(int value) {
        this.idRegulationDocumentsFileType = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the subPageNumbers property.
     * 
     */
    public int getSubPageNumbers() {
        return subPageNumbers;
    }

    /**
     * Sets the value of the subPageNumbers property.
     * 
     */
    public void setSubPageNumbers(int value) {
        this.subPageNumbers = value;
    }

    /**
     * Gets the value of the regulationDocumentsFileBase64String property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegulationDocumentsFileBase64String() {
        return regulationDocumentsFileBase64String;
    }

    /**
     * Sets the value of the regulationDocumentsFileBase64String property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegulationDocumentsFileBase64String(String value) {
        this.regulationDocumentsFileBase64String = value;
    }

}
