//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.base._3.AtcUnitReferenceType;
import aero.fixm.base._3.BeaconCodeType;


/**
 * 
 *             Contains information about current, previous and next beacon code assignments along 
 *             with the beacon code assigning facility. 
 *             .Beacon Code: The assigned four-character numeric code transmitted by the aircraft 
 *             transponder in response to a secondary surveillance radar interrogation signal which 
 *             is used to assist air traffic controllers to identify aircraft. 
 *          
 * 
 * <p>Java class for BeaconCodeAssignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeaconCodeAssignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentBeaconCode" type="{http://www.fixm.aero/base/3.0}BeaconCodeType" minOccurs="0"/&gt;
 *         &lt;element name="previousBeaconCode" type="{http://www.fixm.aero/base/3.0}BeaconCodeType" minOccurs="0"/&gt;
 *         &lt;element name="reassignedBeaconCode" type="{http://www.fixm.aero/base/3.0}BeaconCodeType" minOccurs="0"/&gt;
 *         &lt;element name="reassigningUnit" type="{http://www.fixm.aero/base/3.0}AtcUnitReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeaconCodeAssignmentType", propOrder = {
    "currentBeaconCode",
    "previousBeaconCode",
    "reassignedBeaconCode",
    "reassigningUnit"
})
public class BeaconCodeAssignmentType {

    protected BeaconCodeType currentBeaconCode;
    protected BeaconCodeType previousBeaconCode;
    @XmlElementRef(name = "reassignedBeaconCode", type = JAXBElement.class, required = false)
    protected JAXBElement<BeaconCodeType> reassignedBeaconCode;
    @XmlElementRef(name = "reassigningUnit", type = JAXBElement.class, required = false)
    protected JAXBElement<AtcUnitReferenceType> reassigningUnit;

    /**
     * Gets the value of the currentBeaconCode property.
     * 
     * @return
     *     possible object is
     *     {@link BeaconCodeType }
     *     
     */
    public BeaconCodeType getCurrentBeaconCode() {
        return currentBeaconCode;
    }

    /**
     * Sets the value of the currentBeaconCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeaconCodeType }
     *     
     */
    public void setCurrentBeaconCode(BeaconCodeType value) {
        this.currentBeaconCode = value;
    }

    /**
     * Gets the value of the previousBeaconCode property.
     * 
     * @return
     *     possible object is
     *     {@link BeaconCodeType }
     *     
     */
    public BeaconCodeType getPreviousBeaconCode() {
        return previousBeaconCode;
    }

    /**
     * Sets the value of the previousBeaconCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeaconCodeType }
     *     
     */
    public void setPreviousBeaconCode(BeaconCodeType value) {
        this.previousBeaconCode = value;
    }

    /**
     * Gets the value of the reassignedBeaconCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BeaconCodeType }{@code >}
     *     
     */
    public JAXBElement<BeaconCodeType> getReassignedBeaconCode() {
        return reassignedBeaconCode;
    }

    /**
     * Sets the value of the reassignedBeaconCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BeaconCodeType }{@code >}
     *     
     */
    public void setReassignedBeaconCode(JAXBElement<BeaconCodeType> value) {
        this.reassignedBeaconCode = value;
    }

    /**
     * Gets the value of the reassigningUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AtcUnitReferenceType }{@code >}
     *     
     */
    public JAXBElement<AtcUnitReferenceType> getReassigningUnit() {
        return reassigningUnit;
    }

    /**
     * Sets the value of the reassigningUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AtcUnitReferenceType }{@code >}
     *     
     */
    public void setReassigningUnit(JAXBElement<AtcUnitReferenceType> value) {
        this.reassigningUnit = value;
    }

}
