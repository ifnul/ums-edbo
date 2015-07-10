
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDReceptionConditionAdditionsTableData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDReceptionConditionAdditionsTableData1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dReceptionConditionAdditionsTableData1" type="{http://edboservice.ua/}dReceptionConditionAdditionsTableData1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDReceptionConditionAdditionsTableData1", propOrder = {
    "dReceptionConditionAdditionsTableData1"
})
public class ArrayOfDReceptionConditionAdditionsTableData1 {

    @XmlElement(nillable = true)
    protected List<DReceptionConditionAdditionsTableData1> dReceptionConditionAdditionsTableData1;

    /**
     * Gets the value of the dReceptionConditionAdditionsTableData1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dReceptionConditionAdditionsTableData1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDReceptionConditionAdditionsTableData1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DReceptionConditionAdditionsTableData1 }
     * 
     * 
     */
    public List<DReceptionConditionAdditionsTableData1> getDReceptionConditionAdditionsTableData1() {
        if (dReceptionConditionAdditionsTableData1 == null) {
            dReceptionConditionAdditionsTableData1 = new ArrayList<DReceptionConditionAdditionsTableData1>();
        }
        return this.dReceptionConditionAdditionsTableData1;
    }

}
