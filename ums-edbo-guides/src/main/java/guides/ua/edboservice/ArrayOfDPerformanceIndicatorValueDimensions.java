
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPerformanceIndicatorValueDimensions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPerformanceIndicatorValueDimensions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPerformanceIndicatorValueDimensions" type="{http://edboservice.ua/}dPerformanceIndicatorValueDimensions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPerformanceIndicatorValueDimensions", propOrder = {
    "dPerformanceIndicatorValueDimensions"
})
public class ArrayOfDPerformanceIndicatorValueDimensions {

    @XmlElement(nillable = true)
    protected List<DPerformanceIndicatorValueDimensions> dPerformanceIndicatorValueDimensions;

    /**
     * Gets the value of the dPerformanceIndicatorValueDimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPerformanceIndicatorValueDimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPerformanceIndicatorValueDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPerformanceIndicatorValueDimensions }
     * 
     * 
     */
    public List<DPerformanceIndicatorValueDimensions> getDPerformanceIndicatorValueDimensions() {
        if (dPerformanceIndicatorValueDimensions == null) {
            dPerformanceIndicatorValueDimensions = new ArrayList<DPerformanceIndicatorValueDimensions>();
        }
        return this.dPerformanceIndicatorValueDimensions;
    }

}
