
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrderOfDocumentsForAddRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrderOfDocumentsForAddRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrderOfDocumentsForAddRequests" type="{http://edboservice.ua/}dOrderOfDocumentsForAddRequests" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrderOfDocumentsForAddRequests", propOrder = {
    "dOrderOfDocumentsForAddRequests"
})
public class ArrayOfDOrderOfDocumentsForAddRequests {

    @XmlElement(nillable = true)
    protected List<DOrderOfDocumentsForAddRequests> dOrderOfDocumentsForAddRequests;

    /**
     * Gets the value of the dOrderOfDocumentsForAddRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrderOfDocumentsForAddRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrderOfDocumentsForAddRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrderOfDocumentsForAddRequests }
     * 
     * 
     */
    public List<DOrderOfDocumentsForAddRequests> getDOrderOfDocumentsForAddRequests() {
        if (dOrderOfDocumentsForAddRequests == null) {
            dOrderOfDocumentsForAddRequests = new ArrayList<DOrderOfDocumentsForAddRequests>();
        }
        return this.dOrderOfDocumentsForAddRequests;
    }

}
