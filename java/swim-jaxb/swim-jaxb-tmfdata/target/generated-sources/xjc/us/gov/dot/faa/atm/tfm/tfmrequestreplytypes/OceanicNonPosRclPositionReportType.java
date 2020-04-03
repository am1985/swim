//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines an non PS/RCL oceanic reports.
 * 
 * <p>Java class for oceanicNonPosRclPositionReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oceanicNonPosRclPositionReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aircraftIdentifier" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType"/&gt;
 *         &lt;sequence maxOccurs="12"&gt;
 *           &lt;element name="oceanicDataBlock" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}oceanicDataBlockType"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oceanicNonPosRclPositionReportType", propOrder = {
    "aircraftIdentifier",
    "oceanicDataBlock"
})
public class OceanicNonPosRclPositionReportType {

    @XmlElement(required = true)
    protected String aircraftIdentifier;
    @XmlElement(required = true)
    protected List<OceanicDataBlockType> oceanicDataBlock;

    /**
     * Gets the value of the aircraftIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftIdentifier() {
        return aircraftIdentifier;
    }

    /**
     * Sets the value of the aircraftIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftIdentifier(String value) {
        this.aircraftIdentifier = value;
    }

    /**
     * Gets the value of the oceanicDataBlock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oceanicDataBlock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOceanicDataBlock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OceanicDataBlockType }
     * 
     * 
     */
    public List<OceanicDataBlockType> getOceanicDataBlock() {
        if (oceanicDataBlock == null) {
            oceanicDataBlock = new ArrayList<OceanicDataBlockType>();
        }
        return this.oceanicDataBlock;
    }

}
