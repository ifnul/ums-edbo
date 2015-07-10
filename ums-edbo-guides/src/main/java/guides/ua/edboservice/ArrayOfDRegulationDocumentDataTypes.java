
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDRegulationDocumentDataTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDRegulationDocumentDataTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dRegulationDocumentDataTypes" type="{http://edboservice.ua/}dRegulationDocumentDataTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDRegulationDocumentDataTypes", propOrder = {
    "dRegulationDocumentDataTypes"
})
public class ArrayOfDRegulationDocumentDataTypes {

    @XmlElement(nillable = true)
    protected List<DRegulationDocumentDataTypes> dRegulationDocumentDataTypes;

    /**
     * Gets the value of the dRegulationDocumentDataTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dRegulationDocumentDataTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDRegulationDocumentDataTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DRegulationDocumentDataTypes }
     * 
     * 
     */
    public List<DRegulationDocumentDataTypes> getDRegulationDocumentDataTypes() {
        if (dRegulationDocumentDataTypes == null) {
            dRegulationDocumentDataTypes = new ArrayList<DRegulationDocumentDataTypes>();
        }
        return this.dRegulationDocumentDataTypes;
    }

}
