
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDGraduatesKnowledge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDGraduatesKnowledge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dGraduatesKnowledge" type="{http://edboservice.ua/}dGraduatesKnowledge" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDGraduatesKnowledge", propOrder = {
    "dGraduatesKnowledge"
})
public class ArrayOfDGraduatesKnowledge {

    @XmlElement(nillable = true)
    protected List<DGraduatesKnowledge> dGraduatesKnowledge;

    /**
     * Gets the value of the dGraduatesKnowledge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dGraduatesKnowledge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDGraduatesKnowledge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DGraduatesKnowledge }
     * 
     * 
     */
    public List<DGraduatesKnowledge> getDGraduatesKnowledge() {
        if (dGraduatesKnowledge == null) {
            dGraduatesKnowledge = new ArrayList<DGraduatesKnowledge>();
        }
        return this.dGraduatesKnowledge;
    }

}
