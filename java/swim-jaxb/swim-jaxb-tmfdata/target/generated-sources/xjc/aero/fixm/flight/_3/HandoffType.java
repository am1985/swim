//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import aero.faa.nas._3.NasHandoffType;
import aero.fixm.base._3.AtcUnitReferenceType;


/**
 * 
 *             An action taken to transfer the radar identification of an aircraft from one controller 
 *             to another controller if the aircraft will enter the receiving controller's airspace 
 *             and radio communications with the aircraft will be transferred. 
 *          
 * 
 * <p>Java class for HandoffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HandoffType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coordinationStatus" type="{http://www.fixm.aero/flight/3.0}CoordinationStatusType" minOccurs="0"/&gt;
 *         &lt;element name="receivingUnit" type="{http://www.fixm.aero/base/3.0}AtcUnitReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="transferringUnit" type="{http://www.fixm.aero/base/3.0}AtcUnitReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HandoffType", propOrder = {
    "coordinationStatus",
    "receivingUnit",
    "transferringUnit"
})
@XmlSeeAlso({
    NasHandoffType.class
})
public class HandoffType {

    protected CoordinationStatusType coordinationStatus;
    protected AtcUnitReferenceType receivingUnit;
    protected AtcUnitReferenceType transferringUnit;

    /**
     * Gets the value of the coordinationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinationStatusType }
     *     
     */
    public CoordinationStatusType getCoordinationStatus() {
        return coordinationStatus;
    }

    /**
     * Sets the value of the coordinationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinationStatusType }
     *     
     */
    public void setCoordinationStatus(CoordinationStatusType value) {
        this.coordinationStatus = value;
    }

    /**
     * Gets the value of the receivingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AtcUnitReferenceType }
     *     
     */
    public AtcUnitReferenceType getReceivingUnit() {
        return receivingUnit;
    }

    /**
     * Sets the value of the receivingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtcUnitReferenceType }
     *     
     */
    public void setReceivingUnit(AtcUnitReferenceType value) {
        this.receivingUnit = value;
    }

    /**
     * Gets the value of the transferringUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AtcUnitReferenceType }
     *     
     */
    public AtcUnitReferenceType getTransferringUnit() {
        return transferringUnit;
    }

    /**
     * Sets the value of the transferringUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtcUnitReferenceType }
     *     
     */
    public void setTransferringUnit(AtcUnitReferenceType value) {
        this.transferringUnit = value;
    }

}