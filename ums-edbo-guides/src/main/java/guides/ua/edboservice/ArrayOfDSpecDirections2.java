
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSpecDirections2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSpecDirections2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSpecDirections2" type="{http://edboservice.ua/}dSpecDirections2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSpecDirections2", propOrder = {
    "dSpecDirections2"
})
public class ArrayOfDSpecDirections2 {

    @XmlElement(nillable = true)
    protected List<DSpecDirections2> dSpecDirections2;

    /**
     * Gets the value of the dSpecDirections2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSpecDirections2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSpecDirections2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSpecDirections2 }
     * 
     * 
     */
    public List<DSpecDirections2> getDSpecDirections2() {
        if (dSpecDirections2 == null) {
            dSpecDirections2 = new ArrayList<DSpecDirections2>();
        }
        return this.dSpecDirections2;
    }

}
