
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDProfessionUps complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDProfessionUps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dProfessionUps" type="{http://edboservice.ua/}dProfessionUps" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDProfessionUps", propOrder = {
    "dProfessionUps"
})
public class ArrayOfDProfessionUps {

    @XmlElement(nillable = true)
    protected List<DProfessionUps> dProfessionUps;

    /**
     * Gets the value of the dProfessionUps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dProfessionUps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDProfessionUps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DProfessionUps }
     * 
     * 
     */
    public List<DProfessionUps> getDProfessionUps() {
        if (dProfessionUps == null) {
            dProfessionUps = new ArrayList<DProfessionUps>();
        }
        return this.dProfessionUps;
    }

}
