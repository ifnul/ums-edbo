
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEDBOISUOreport_znz1_extExist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEDBOISUOreport_znz1_extExist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEDBOISUOreport_znz1_extExist" type="{http://edboservice.ua/}dEDBOISUOreport_znz1_extExist" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEDBOISUOreport_znz1_extExist", propOrder = {
    "dedboisuOreportZnz1ExtExist"
})
public class ArrayOfDEDBOISUOreportZnz1ExtExist {

    @XmlElement(name = "dEDBOISUOreport_znz1_extExist", nillable = true)
    protected List<DEDBOISUOreportZnz1ExtExist> dedboisuOreportZnz1ExtExist;

    /**
     * Gets the value of the dedboisuOreportZnz1ExtExist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dedboisuOreportZnz1ExtExist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEDBOISUOreportZnz1ExtExist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEDBOISUOreportZnz1ExtExist }
     * 
     * 
     */
    public List<DEDBOISUOreportZnz1ExtExist> getDEDBOISUOreportZnz1ExtExist() {
        if (dedboisuOreportZnz1ExtExist == null) {
            dedboisuOreportZnz1ExtExist = new ArrayList<DEDBOISUOreportZnz1ExtExist>();
        }
        return this.dedboisuOreportZnz1ExtExist;
    }

}
