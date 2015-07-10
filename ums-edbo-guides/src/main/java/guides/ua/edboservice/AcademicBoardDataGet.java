
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
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_AcademicBoard" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicAttestationCaseType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicEducationDegreType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_AcademicRank" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sessionGUID",
    "idAcademicBoard",
    "idAcademicAttestationCaseType",
    "idAcademicEducationDegreType",
    "idAcademicRank"
})
@XmlRootElement(name = "AcademicBoardDataGet")
public class AcademicBoardDataGet {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_AcademicBoard")
    protected int idAcademicBoard;
    @XmlElement(name = "Id_AcademicAttestationCaseType")
    protected int idAcademicAttestationCaseType;
    @XmlElement(name = "Id_AcademicEducationDegreType")
    protected int idAcademicEducationDegreType;
    @XmlElement(name = "Id_AcademicRank")
    protected int idAcademicRank;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
    }

    /**
     * Gets the value of the idAcademicBoard property.
     * 
     */
    public int getIdAcademicBoard() {
        return idAcademicBoard;
    }

    /**
     * Sets the value of the idAcademicBoard property.
     * 
     */
    public void setIdAcademicBoard(int value) {
        this.idAcademicBoard = value;
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
     * Gets the value of the idAcademicEducationDegreType property.
     * 
     */
    public int getIdAcademicEducationDegreType() {
        return idAcademicEducationDegreType;
    }

    /**
     * Sets the value of the idAcademicEducationDegreType property.
     * 
     */
    public void setIdAcademicEducationDegreType(int value) {
        this.idAcademicEducationDegreType = value;
    }

    /**
     * Gets the value of the idAcademicRank property.
     * 
     */
    public int getIdAcademicRank() {
        return idAcademicRank;
    }

    /**
     * Sets the value of the idAcademicRank property.
     * 
     */
    public void setIdAcademicRank(int value) {
        this.idAcademicRank = value;
    }

}
