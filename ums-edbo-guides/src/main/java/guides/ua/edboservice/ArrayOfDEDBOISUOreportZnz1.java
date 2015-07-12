
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEDBOISUOreport_znz1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEDBOISUOreport_znz1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEDBOISUOreport_znz1" type="{http://edboservice.ua/}dEDBOISUOreport_znz1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEDBOISUOreport_znz1", propOrder = {
    "dedboisuOreportZnz1"
})
public class ArrayOfDEDBOISUOreportZnz1 {

    @XmlElement(name = "dEDBOISUOreport_znz1", nillable = true)
    protected List<DEDBOISUOreportZnz1> dedboisuOreportZnz1;

    /**
     * Gets the value of the dedboisuOreportZnz1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dedboisuOreportZnz1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEDBOISUOreportZnz1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEDBOISUOreportZnz1 }
     * 
     * 
     */
    public List<DEDBOISUOreportZnz1> getDEDBOISUOreportZnz1() {
        if (dedboisuOreportZnz1 == null) {
            dedboisuOreportZnz1 = new ArrayList<DEDBOISUOreportZnz1>();
        }
        return this.dedboisuOreportZnz1;
    }

}
