
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
 *         &lt;element name="ReceptionConditionAdditionsTableData234SubjectsGetResult" type="{http://edboservice.ua/}ArrayOfDReceptionConditionAdditionsTableData234Subjects" minOccurs="0"/>
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
    "receptionConditionAdditionsTableData234SubjectsGetResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData234SubjectsGetResponse")
public class ReceptionConditionAdditionsTableData234SubjectsGetResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData234SubjectsGetResult")
    protected ArrayOfDReceptionConditionAdditionsTableData234Subjects receptionConditionAdditionsTableData234SubjectsGetResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData234SubjectsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData234Subjects }
     *     
     */
    public ArrayOfDReceptionConditionAdditionsTableData234Subjects getReceptionConditionAdditionsTableData234SubjectsGetResult() {
        return receptionConditionAdditionsTableData234SubjectsGetResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData234SubjectsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData234Subjects }
     *     
     */
    public void setReceptionConditionAdditionsTableData234SubjectsGetResult(ArrayOfDReceptionConditionAdditionsTableData234Subjects value) {
        this.receptionConditionAdditionsTableData234SubjectsGetResult = value;
    }

}
