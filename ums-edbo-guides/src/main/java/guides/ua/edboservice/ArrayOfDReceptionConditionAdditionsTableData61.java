
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDReceptionConditionAdditionsTableData61 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDReceptionConditionAdditionsTableData61">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dReceptionConditionAdditionsTableData61" type="{http://edboservice.ua/}dReceptionConditionAdditionsTableData61" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDReceptionConditionAdditionsTableData61", propOrder = {
    "dReceptionConditionAdditionsTableData61"
})
public class ArrayOfDReceptionConditionAdditionsTableData61 {

    @XmlElement(nillable = true)
    protected List<DReceptionConditionAdditionsTableData61> dReceptionConditionAdditionsTableData61;

    /**
     * Gets the value of the dReceptionConditionAdditionsTableData61 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dReceptionConditionAdditionsTableData61 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDReceptionConditionAdditionsTableData61().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DReceptionConditionAdditionsTableData61 }
     * 
     * 
     */
    public List<DReceptionConditionAdditionsTableData61> getDReceptionConditionAdditionsTableData61() {
        if (dReceptionConditionAdditionsTableData61 == null) {
            dReceptionConditionAdditionsTableData61 = new ArrayList<DReceptionConditionAdditionsTableData61>();
        }
        return this.dReceptionConditionAdditionsTableData61;
    }

}
