
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDReportEmploymentsOperators complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDReportEmploymentsOperators">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dReportEmploymentsOperators" type="{http://edboservice.ua/}dReportEmploymentsOperators" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDReportEmploymentsOperators", propOrder = {
    "dReportEmploymentsOperators"
})
public class ArrayOfDReportEmploymentsOperators {

    @XmlElement(nillable = true)
    protected List<DReportEmploymentsOperators> dReportEmploymentsOperators;

    /**
     * Gets the value of the dReportEmploymentsOperators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dReportEmploymentsOperators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDReportEmploymentsOperators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DReportEmploymentsOperators }
     * 
     * 
     */
    public List<DReportEmploymentsOperators> getDReportEmploymentsOperators() {
        if (dReportEmploymentsOperators == null) {
            dReportEmploymentsOperators = new ArrayList<DReportEmploymentsOperators>();
        }
        return this.dReportEmploymentsOperators;
    }

}
