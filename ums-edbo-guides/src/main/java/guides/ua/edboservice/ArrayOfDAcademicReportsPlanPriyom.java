
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicReportsPlanPriyom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicReportsPlanPriyom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicReportsPlanPriyom" type="{http://edboservice.ua/}dAcademicReportsPlanPriyom" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicReportsPlanPriyom", propOrder = {
    "dAcademicReportsPlanPriyom"
})
public class ArrayOfDAcademicReportsPlanPriyom {

    @XmlElement(nillable = true)
    protected List<DAcademicReportsPlanPriyom> dAcademicReportsPlanPriyom;

    /**
     * Gets the value of the dAcademicReportsPlanPriyom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicReportsPlanPriyom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicReportsPlanPriyom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicReportsPlanPriyom }
     * 
     * 
     */
    public List<DAcademicReportsPlanPriyom> getDAcademicReportsPlanPriyom() {
        if (dAcademicReportsPlanPriyom == null) {
            dAcademicReportsPlanPriyom = new ArrayList<DAcademicReportsPlanPriyom>();
        }
        return this.dAcademicReportsPlanPriyom;
    }

}
