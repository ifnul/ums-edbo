
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dUniversityLicensesOrganisationsRishen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dUniversityLicensesOrganisationsRishen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UniversityLicensesOrganisationsRishen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityLicensesOrganisationsRishenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicensesOrganisationsRishenSmallName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniversityLicensesOrganisationsRishenDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dUniversityLicensesOrganisationsRishen", propOrder = {
    "idUniversityLicensesOrganisationsRishen",
    "universityLicensesOrganisationsRishenName",
    "universityLicensesOrganisationsRishenSmallName",
    "universityLicensesOrganisationsRishenDisplayName"
})
public class DUniversityLicensesOrganisationsRishen {

    @XmlElement(name = "Id_UniversityLicensesOrganisationsRishen")
    protected int idUniversityLicensesOrganisationsRishen;
    @XmlElement(name = "UniversityLicensesOrganisationsRishenName")
    protected String universityLicensesOrganisationsRishenName;
    @XmlElement(name = "UniversityLicensesOrganisationsRishenSmallName")
    protected String universityLicensesOrganisationsRishenSmallName;
    @XmlElement(name = "UniversityLicensesOrganisationsRishenDisplayName")
    protected String universityLicensesOrganisationsRishenDisplayName;

    /**
     * Gets the value of the idUniversityLicensesOrganisationsRishen property.
     * 
     */
    public int getIdUniversityLicensesOrganisationsRishen() {
        return idUniversityLicensesOrganisationsRishen;
    }

    /**
     * Sets the value of the idUniversityLicensesOrganisationsRishen property.
     * 
     */
    public void setIdUniversityLicensesOrganisationsRishen(int value) {
        this.idUniversityLicensesOrganisationsRishen = value;
    }

    /**
     * Gets the value of the universityLicensesOrganisationsRishenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesOrganisationsRishenName() {
        return universityLicensesOrganisationsRishenName;
    }

    /**
     * Sets the value of the universityLicensesOrganisationsRishenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesOrganisationsRishenName(String value) {
        this.universityLicensesOrganisationsRishenName = value;
    }

    /**
     * Gets the value of the universityLicensesOrganisationsRishenSmallName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesOrganisationsRishenSmallName() {
        return universityLicensesOrganisationsRishenSmallName;
    }

    /**
     * Sets the value of the universityLicensesOrganisationsRishenSmallName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesOrganisationsRishenSmallName(String value) {
        this.universityLicensesOrganisationsRishenSmallName = value;
    }

    /**
     * Gets the value of the universityLicensesOrganisationsRishenDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityLicensesOrganisationsRishenDisplayName() {
        return universityLicensesOrganisationsRishenDisplayName;
    }

    /**
     * Sets the value of the universityLicensesOrganisationsRishenDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityLicensesOrganisationsRishenDisplayName(String value) {
        this.universityLicensesOrganisationsRishenDisplayName = value;
    }

}
