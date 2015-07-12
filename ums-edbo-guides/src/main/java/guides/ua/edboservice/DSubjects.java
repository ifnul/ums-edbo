
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dSubjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dSubjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Subject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdZnoSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ParentSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SubjectDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_Language" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dSubjects", propOrder = {
    "idSubject",
    "subjectKey",
    "idZnoSubject",
    "parentSubject",
    "subjectDateBegin",
    "subjectDateEnd",
    "idLanguage",
    "subjectName"
})
public class DSubjects {

    @XmlElement(name = "Id_Subject")
    protected int idSubject;
    @XmlElement(name = "SubjectKey")
    protected String subjectKey;
    @XmlElement(name = "IdZnoSubject")
    protected int idZnoSubject;
    @XmlElement(name = "ParentSubject")
    protected int parentSubject;
    @XmlElement(name = "SubjectDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subjectDateBegin;
    @XmlElement(name = "SubjectDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subjectDateEnd;
    @XmlElement(name = "Id_Language")
    protected int idLanguage;
    @XmlElement(name = "SubjectName")
    protected String subjectName;

    /**
     * Gets the value of the idSubject property.
     * 
     */
    public int getIdSubject() {
        return idSubject;
    }

    /**
     * Sets the value of the idSubject property.
     * 
     */
    public void setIdSubject(int value) {
        this.idSubject = value;
    }

    /**
     * Gets the value of the subjectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectKey() {
        return subjectKey;
    }

    /**
     * Sets the value of the subjectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectKey(String value) {
        this.subjectKey = value;
    }

    /**
     * Gets the value of the idZnoSubject property.
     * 
     */
    public int getIdZnoSubject() {
        return idZnoSubject;
    }

    /**
     * Sets the value of the idZnoSubject property.
     * 
     */
    public void setIdZnoSubject(int value) {
        this.idZnoSubject = value;
    }

    /**
     * Gets the value of the parentSubject property.
     * 
     */
    public int getParentSubject() {
        return parentSubject;
    }

    /**
     * Sets the value of the parentSubject property.
     * 
     */
    public void setParentSubject(int value) {
        this.parentSubject = value;
    }

    /**
     * Gets the value of the subjectDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubjectDateBegin() {
        return subjectDateBegin;
    }

    /**
     * Sets the value of the subjectDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubjectDateBegin(XMLGregorianCalendar value) {
        this.subjectDateBegin = value;
    }

    /**
     * Gets the value of the subjectDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubjectDateEnd() {
        return subjectDateEnd;
    }

    /**
     * Sets the value of the subjectDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubjectDateEnd(XMLGregorianCalendar value) {
        this.subjectDateEnd = value;
    }

    /**
     * Gets the value of the idLanguage property.
     * 
     */
    public int getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     */
    public void setIdLanguage(int value) {
        this.idLanguage = value;
    }

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

}
