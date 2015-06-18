
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDReportEmploymentsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDReportEmploymentsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dReportEmploymentsData" type="{http://edboservice.ua/}dReportEmploymentsData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDReportEmploymentsData", propOrder = {
    "dReportEmploymentsData"
})
public class ArrayOfDReportEmploymentsData {

    @XmlElement(nillable = true)
    protected List<DReportEmploymentsData> dReportEmploymentsData;

    /**
     * Gets the value of the dReportEmploymentsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dReportEmploymentsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDReportEmploymentsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DReportEmploymentsData }
     * 
     * 
     */
    public List<DReportEmploymentsData> getDReportEmploymentsData() {
        if (dReportEmploymentsData == null) {
            dReportEmploymentsData = new ArrayList<DReportEmploymentsData>();
        }
        return this.dReportEmploymentsData;
    }

}
