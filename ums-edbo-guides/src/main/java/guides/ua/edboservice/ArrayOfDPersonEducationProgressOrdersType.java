
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationProgressOrdersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationProgressOrdersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationProgressOrdersType" type="{http://edboservice.ua/}dPersonEducationProgressOrdersType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationProgressOrdersType", propOrder = {
    "dPersonEducationProgressOrdersType"
})
public class ArrayOfDPersonEducationProgressOrdersType {

    @XmlElement(nillable = true)
    protected List<DPersonEducationProgressOrdersType> dPersonEducationProgressOrdersType;

    /**
     * Gets the value of the dPersonEducationProgressOrdersType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationProgressOrdersType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationProgressOrdersType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationProgressOrdersType }
     * 
     * 
     */
    public List<DPersonEducationProgressOrdersType> getDPersonEducationProgressOrdersType() {
        if (dPersonEducationProgressOrdersType == null) {
            dPersonEducationProgressOrdersType = new ArrayList<DPersonEducationProgressOrdersType>();
        }
        return this.dPersonEducationProgressOrdersType;
    }

}
