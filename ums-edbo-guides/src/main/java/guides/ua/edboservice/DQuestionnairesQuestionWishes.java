
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dQuestionnairesQuestionWishes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dQuestionnairesQuestionWishes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_QuestionnairesQuestionWishe" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_QuestionnairesQuestion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QuestionnaireWishe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuestionnaireDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fdel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dQuestionnairesQuestionWishes", propOrder = {
    "idQuestionnairesQuestionWishe",
    "idQuestionnairesQuestion",
    "questionnaireWishe",
    "questionnaireDateLastChange",
    "fdel",
    "idUser",
    "fio"
})
public class DQuestionnairesQuestionWishes {

    @XmlElement(name = "Id_QuestionnairesQuestionWishe")
    protected int idQuestionnairesQuestionWishe;
    @XmlElement(name = "Id_QuestionnairesQuestion")
    protected int idQuestionnairesQuestion;
    @XmlElement(name = "QuestionnaireWishe")
    protected String questionnaireWishe;
    @XmlElement(name = "QuestionnaireDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar questionnaireDateLastChange;
    protected int fdel;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "FIO")
    protected String fio;

    /**
     * Gets the value of the idQuestionnairesQuestionWishe property.
     * 
     */
    public int getIdQuestionnairesQuestionWishe() {
        return idQuestionnairesQuestionWishe;
    }

    /**
     * Sets the value of the idQuestionnairesQuestionWishe property.
     * 
     */
    public void setIdQuestionnairesQuestionWishe(int value) {
        this.idQuestionnairesQuestionWishe = value;
    }

    /**
     * Gets the value of the idQuestionnairesQuestion property.
     * 
     */
    public int getIdQuestionnairesQuestion() {
        return idQuestionnairesQuestion;
    }

    /**
     * Sets the value of the idQuestionnairesQuestion property.
     * 
     */
    public void setIdQuestionnairesQuestion(int value) {
        this.idQuestionnairesQuestion = value;
    }

    /**
     * Gets the value of the questionnaireWishe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionnaireWishe() {
        return questionnaireWishe;
    }

    /**
     * Sets the value of the questionnaireWishe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionnaireWishe(String value) {
        this.questionnaireWishe = value;
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
     * Gets the value of the fdel property.
     * 
     */
    public int getFdel() {
        return fdel;
    }

    /**
     * Sets the value of the fdel property.
     * 
     */
    public void setFdel(int value) {
        this.fdel = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
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

}
