
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityAccreditation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityAccreditation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityAccreditation" type="{http://edboservice.ua/}dUniversityAccreditation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityAccreditation", propOrder = {
    "dUniversityAccreditation"
})
public class ArrayOfDUniversityAccreditation {

    @XmlElement(nillable = true)
    protected List<DUniversityAccreditation> dUniversityAccreditation;

    /**
     * Gets the value of the dUniversityAccreditation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityAccreditation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityAccreditation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityAccreditation }
     * 
     * 
     */
    public List<DUniversityAccreditation> getDUniversityAccreditation() {
        if (dUniversityAccreditation == null) {
            dUniversityAccreditation = new ArrayList<DUniversityAccreditation>();
        }
        return this.dUniversityAccreditation;
    }

}
