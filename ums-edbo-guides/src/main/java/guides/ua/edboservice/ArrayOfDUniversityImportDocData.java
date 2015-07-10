
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityImportDocData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityImportDocData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityImportDocData" type="{http://edboservice.ua/}dUniversityImportDocData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityImportDocData", propOrder = {
    "dUniversityImportDocData"
})
public class ArrayOfDUniversityImportDocData {

    @XmlElement(nillable = true)
    protected List<DUniversityImportDocData> dUniversityImportDocData;

    /**
     * Gets the value of the dUniversityImportDocData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityImportDocData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityImportDocData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityImportDocData }
     * 
     * 
     */
    public List<DUniversityImportDocData> getDUniversityImportDocData() {
        if (dUniversityImportDocData == null) {
            dUniversityImportDocData = new ArrayList<DUniversityImportDocData>();
        }
        return this.dUniversityImportDocData;
    }

}
