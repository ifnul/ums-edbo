
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDReceptionConditionAdditionsTableData5Groups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDReceptionConditionAdditionsTableData5Groups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dReceptionConditionAdditionsTableData5Groups" type="{http://edboservice.ua/}dReceptionConditionAdditionsTableData5Groups" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDReceptionConditionAdditionsTableData5Groups", propOrder = {
    "dReceptionConditionAdditionsTableData5Groups"
})
public class ArrayOfDReceptionConditionAdditionsTableData5Groups {

    @XmlElement(nillable = true)
    protected List<DReceptionConditionAdditionsTableData5Groups> dReceptionConditionAdditionsTableData5Groups;

    /**
     * Gets the value of the dReceptionConditionAdditionsTableData5Groups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dReceptionConditionAdditionsTableData5Groups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDReceptionConditionAdditionsTableData5Groups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DReceptionConditionAdditionsTableData5Groups }
     * 
     * 
     */
    public List<DReceptionConditionAdditionsTableData5Groups> getDReceptionConditionAdditionsTableData5Groups() {
        if (dReceptionConditionAdditionsTableData5Groups == null) {
            dReceptionConditionAdditionsTableData5Groups = new ArrayList<DReceptionConditionAdditionsTableData5Groups>();
        }
        return this.dReceptionConditionAdditionsTableData5Groups;
    }

}
