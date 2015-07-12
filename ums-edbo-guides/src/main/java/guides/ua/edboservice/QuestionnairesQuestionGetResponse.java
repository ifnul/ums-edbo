
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
 *         &lt;element name="QuestionnairesQuestionGetResult" type="{http://edboservice.ua/}ArrayOfDQuestionnairesQuestion" minOccurs="0"/>
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
    "questionnairesQuestionGetResult"
})
@XmlRootElement(name = "QuestionnairesQuestionGetResponse")
public class QuestionnairesQuestionGetResponse {

    @XmlElement(name = "QuestionnairesQuestionGetResult")
    protected ArrayOfDQuestionnairesQuestion questionnairesQuestionGetResult;

    /**
     * Gets the value of the questionnairesQuestionGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDQuestionnairesQuestion }
     *     
     */
    public ArrayOfDQuestionnairesQuestion getQuestionnairesQuestionGetResult() {
        return questionnairesQuestionGetResult;
    }

    /**
     * Sets the value of the questionnairesQuestionGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDQuestionnairesQuestion }
     *     
     */
    public void setQuestionnairesQuestionGetResult(ArrayOfDQuestionnairesQuestion value) {
        this.questionnairesQuestionGetResult = value;
    }

}
