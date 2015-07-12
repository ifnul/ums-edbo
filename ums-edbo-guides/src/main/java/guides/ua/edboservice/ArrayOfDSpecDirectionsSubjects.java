
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSpecDirectionsSubjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSpecDirectionsSubjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSpecDirectionsSubjects" type="{http://edboservice.ua/}dSpecDirectionsSubjects" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSpecDirectionsSubjects", propOrder = {
    "dSpecDirectionsSubjects"
})
public class ArrayOfDSpecDirectionsSubjects {

    @XmlElement(nillable = true)
    protected List<DSpecDirectionsSubjects> dSpecDirectionsSubjects;

    /**
     * Gets the value of the dSpecDirectionsSubjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSpecDirectionsSubjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSpecDirectionsSubjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSpecDirectionsSubjects }
     * 
     * 
     */
    public List<DSpecDirectionsSubjects> getDSpecDirectionsSubjects() {
        if (dSpecDirectionsSubjects == null) {
            dSpecDirectionsSubjects = new ArrayList<DSpecDirectionsSubjects>();
        }
        return this.dSpecDirectionsSubjects;
    }

}
