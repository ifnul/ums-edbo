
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dQuestionnaires complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dQuestionnaires">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Questionnaire" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_QuestionnaireType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuestionnaireName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuestionnaireDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuestionnaireDateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="QuestionnaireDateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="QuestionnaireTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allquestions" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="processedquestion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="persentcompleted" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HeaderText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dQuestionnaires", propOrder = {
    "idQuestionnaire",
    "idQuestionnaireType",
    "questionnaireName",
    "questionnaireDateLastChange",
    "universityKode",
    "questionnaireDateBegin",
    "questionnaireDateEnd",
    "questionnaireTypeName",
    "allquestions",
    "processedquestion",
    "persentcompleted",
    "headerText"
})
public class DQuestionnaires {

    @XmlElement(name = "Id_Questionnaire")
    protected int idQuestionnaire;
    @XmlElement(name = "Id_QuestionnaireType")
    protected int idQuestionnaireType;
    @XmlElement(name = "QuestionnaireName")
    protected String questionnaireName;
    @XmlElement(name = "QuestionnaireDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar questionnaireDateLastChange;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "QuestionnaireDateBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar questionnaireDateBegin;
    @XmlElement(name = "QuestionnaireDateEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar questionnaireDateEnd;
    @XmlElement(name = "QuestionnaireTypeName")
    protected String questionnaireTypeName;
    protected int allquestions;
    protected int processedquestion;
    protected int persentcompleted;
    @XmlElement(name = "HeaderText")
    protected String headerText;

    /**
     * Gets the value of the idQuestionnaire property.
     * 
     */
    public int getIdQuestionnaire() {
        return idQuestionnaire;
    }

    /**
     * Sets the value of the idQuestionnaire property.
     * 
     */
    public void setIdQuestionnaire(int value) {
        this.idQuestionnaire = value;
    }

    /**
     * Gets the value of the idQuestionnaireType property.
     * 
     */
    public int getIdQuestionnaireType() {
        return idQuestionnaireType;
    }

    /**
     * Sets the value of the idQuestionnaireType property.
     * 
     */
    public void setIdQuestionnaireType(int value) {
        this.idQuestionnaireType = value;
    }

    /**
     * Gets the value of the questionnaireName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionnaireName() {
        return questionnaireName;
    }

    /**
     * Sets the value of the questionnaireName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionnaireName(String value) {
        this.questionnaireName = value;
    }

    /**
     * Gets the value of the questionnaireDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuestionnaireDateLastChange() {
        return questionnaireDateLastChange;
    }

    /**
     * Sets the value of the questionnaireDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuestionnaireDateLastChange(XMLGregorianCalendar value) {
        this.questionnaireDateLastChange = value;
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
     * Gets the value of the questionnaireDateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuestionnaireDateBegin() {
        return questionnaireDateBegin;
    }

    /**
     * Sets the value of the questionnaireDateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuestionnaireDateBegin(XMLGregorianCalendar value) {
        this.questionnaireDateBegin = value;
    }

    /**
     * Gets the value of the questionnaireDateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuestionnaireDateEnd() {
        return questionnaireDateEnd;
    }

    /**
     * Sets the value of the questionnaireDateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuestionnaireDateEnd(XMLGregorianCalendar value) {
        this.questionnaireDateEnd = value;
    }

    /**
     * Gets the value of the questionnaireTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionnaireTypeName() {
        return questionnaireTypeName;
    }

    /**
     * Sets the value of the questionnaireTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionnaireTypeName(String value) {
        this.questionnaireTypeName = value;
    }

    /**
     * Gets the value of the allquestions property.
     * 
     */
    public int getAllquestions() {
        return allquestions;
    }

    /**
     * Sets the value of the allquestions property.
     * 
     */
    public void setAllquestions(int value) {
        this.allquestions = value;
    }

    /**
     * Gets the value of the processedquestion property.
     * 
     */
    public int getProcessedquestion() {
        return processedquestion;
    }

    /**
     * Sets the value of the processedquestion property.
     * 
     */
    public void setProcessedquestion(int value) {
        this.processedquestion = value;
    }

    /**
     * Gets the value of the persentcompleted property.
     * 
     */
    public int getPersentcompleted() {
        return persentcompleted;
    }

    /**
     * Sets the value of the persentcompleted property.
     * 
     */
    public void setPersentcompleted(int value) {
        this.persentcompleted = value;
    }

    /**
     * Gets the value of the headerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderText() {
        return headerText;
    }

    /**
     * Sets the value of the headerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderText(String value) {
        this.headerText = value;
    }

}
