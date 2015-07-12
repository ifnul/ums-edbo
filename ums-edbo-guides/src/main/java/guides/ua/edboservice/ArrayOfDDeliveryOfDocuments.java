
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDDeliveryOfDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDDeliveryOfDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dDeliveryOfDocuments" type="{http://edboservice.ua/}dDeliveryOfDocuments" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDDeliveryOfDocuments", propOrder = {
    "dDeliveryOfDocuments"
})
public class ArrayOfDDeliveryOfDocuments {

    @XmlElement(nillable = true)
    protected List<DDeliveryOfDocuments> dDeliveryOfDocuments;

    /**
     * Gets the value of the dDeliveryOfDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dDeliveryOfDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDDeliveryOfDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DDeliveryOfDocuments }
     * 
     * 
     */
    public List<DDeliveryOfDocuments> getDDeliveryOfDocuments() {
        if (dDeliveryOfDocuments == null) {
            dDeliveryOfDocuments = new ArrayList<DDeliveryOfDocuments>();
        }
        return this.dDeliveryOfDocuments;
    }

}
