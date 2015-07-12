
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDReceptionConditionAdditionsTableData1Periods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDReceptionConditionAdditionsTableData1Periods">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dReceptionConditionAdditionsTableData1Periods" type="{http://edboservice.ua/}dReceptionConditionAdditionsTableData1Periods" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDReceptionConditionAdditionsTableData1Periods", propOrder = {
    "dReceptionConditionAdditionsTableData1Periods"
})
public class ArrayOfDReceptionConditionAdditionsTableData1Periods {

    @XmlElement(nillable = true)
    protected List<DReceptionConditionAdditionsTableData1Periods> dReceptionConditionAdditionsTableData1Periods;

    /**
     * Gets the value of the dReceptionConditionAdditionsTableData1Periods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dReceptionConditionAdditionsTableData1Periods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDReceptionConditionAdditionsTableData1Periods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DReceptionConditionAdditionsTableData1Periods }
     * 
     * 
     */
    public List<DReceptionConditionAdditionsTableData1Periods> getDReceptionConditionAdditionsTableData1Periods() {
        if (dReceptionConditionAdditionsTableData1Periods == null) {
            dReceptionConditionAdditionsTableData1Periods = new ArrayList<DReceptionConditionAdditionsTableData1Periods>();
        }
        return this.dReceptionConditionAdditionsTableData1Periods;
    }

}
