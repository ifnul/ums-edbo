
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrdersOfEnrollmentsAcesses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrdersOfEnrollmentsAcesses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrdersOfEnrollmentsAcesses" type="{http://edboservice.ua/}dOrdersOfEnrollmentsAcesses" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrdersOfEnrollmentsAcesses", propOrder = {
    "dOrdersOfEnrollmentsAcesses"
})
public class ArrayOfDOrdersOfEnrollmentsAcesses {

    @XmlElement(nillable = true)
    protected List<DOrdersOfEnrollmentsAcesses> dOrdersOfEnrollmentsAcesses;

    /**
     * Gets the value of the dOrdersOfEnrollmentsAcesses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrdersOfEnrollmentsAcesses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrdersOfEnrollmentsAcesses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrdersOfEnrollmentsAcesses }
     * 
     * 
     */
    public List<DOrdersOfEnrollmentsAcesses> getDOrdersOfEnrollmentsAcesses() {
        if (dOrdersOfEnrollmentsAcesses == null) {
            dOrdersOfEnrollmentsAcesses = new ArrayList<DOrdersOfEnrollmentsAcesses>();
        }
        return this.dOrdersOfEnrollmentsAcesses;
    }

}
