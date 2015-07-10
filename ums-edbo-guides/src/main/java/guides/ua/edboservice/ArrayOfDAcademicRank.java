
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicRank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicRank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicRank" type="{http://edboservice.ua/}dAcademicRank" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicRank", propOrder = {
    "dAcademicRank"
})
public class ArrayOfDAcademicRank {

    @XmlElement(nillable = true)
    protected List<DAcademicRank> dAcademicRank;

    /**
     * Gets the value of the dAcademicRank property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicRank property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicRank().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicRank }
     * 
     * 
     */
    public List<DAcademicRank> getDAcademicRank() {
        if (dAcademicRank == null) {
            dAcademicRank = new ArrayList<DAcademicRank>();
        }
        return this.dAcademicRank;
    }

}
