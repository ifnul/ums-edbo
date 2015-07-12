
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
 *         &lt;element name="Global_EducationalCycles_JudgmentsEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "globalEducationalCyclesJudgmentsEditResult"
})
@XmlRootElement(name = "Global_EducationalCycles_JudgmentsEditResponse")
public class GlobalEducationalCyclesJudgmentsEditResponse {

    @XmlElement(name = "Global_EducationalCycles_JudgmentsEditResult")
    protected int globalEducationalCyclesJudgmentsEditResult;

    /**
     * Gets the value of the globalEducationalCyclesJudgmentsEditResult property.
     * 
     */
    public int getGlobalEducationalCyclesJudgmentsEditResult() {
        return globalEducationalCyclesJudgmentsEditResult;
    }

    /**
     * Sets the value of the globalEducationalCyclesJudgmentsEditResult property.
     * 
     */
    public void setGlobalEducationalCyclesJudgmentsEditResult(int value) {
        this.globalEducationalCyclesJudgmentsEditResult = value;
    }

}
