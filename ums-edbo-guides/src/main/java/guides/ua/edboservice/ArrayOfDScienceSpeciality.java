
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDScienceSpeciality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDScienceSpeciality">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dScienceSpeciality" type="{http://edboservice.ua/}dScienceSpeciality" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDScienceSpeciality", propOrder = {
    "dScienceSpeciality"
})
public class ArrayOfDScienceSpeciality {

    @XmlElement(nillable = true)
    protected List<DScienceSpeciality> dScienceSpeciality;

    /**
     * Gets the value of the dScienceSpeciality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dScienceSpeciality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDScienceSpeciality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DScienceSpeciality }
     * 
     * 
     */
    public List<DScienceSpeciality> getDScienceSpeciality() {
        if (dScienceSpeciality == null) {
            dScienceSpeciality = new ArrayList<DScienceSpeciality>();
        }
        return this.dScienceSpeciality;
    }

}
