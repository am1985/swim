//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The Slot Create (SC) message allows an airline to manage this scenario. Using slot create, the airline can voluntarily control FLIGHT2, creating an arrival slot for it at its normally planned arrival time. Once the slot is created, the airline can swap the two flights using the usual mechanisms.
 * 
 * <p>Java class for slotCreateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="slotCreateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commonCompositeFlightId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}commonCompositeFlightIdType"/&gt;
 *         &lt;element name="controlledDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="controlledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="assignedArrivalSlot" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}arrivalSlotType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "slotCreateType", propOrder = {
    "commonCompositeFlightId",
    "controlledDepartureTime",
    "controlledArrivalTime",
    "assignedArrivalSlot"
})
public class SlotCreateType {

    @XmlElement(required = true)
    protected CommonCompositeFlightIdType commonCompositeFlightId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar controlledDepartureTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar controlledArrivalTime;
    @XmlElement(required = true)
    protected ArrivalSlotType assignedArrivalSlot;

    /**
     * Gets the value of the commonCompositeFlightId property.
     * 
     * @return
     *     possible object is
     *     {@link CommonCompositeFlightIdType }
     *     
     */
    public CommonCompositeFlightIdType getCommonCompositeFlightId() {
        return commonCompositeFlightId;
    }

    /**
     * Sets the value of the commonCompositeFlightId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonCompositeFlightIdType }
     *     
     */
    public void setCommonCompositeFlightId(CommonCompositeFlightIdType value) {
        this.commonCompositeFlightId = value;
    }

    /**
     * Gets the value of the controlledDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getControlledDepartureTime() {
        return controlledDepartureTime;
    }

    /**
     * Sets the value of the controlledDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setControlledDepartureTime(XMLGregorianCalendar value) {
        this.controlledDepartureTime = value;
    }

    /**
     * Gets the value of the controlledArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getControlledArrivalTime() {
        return controlledArrivalTime;
    }

    /**
     * Sets the value of the controlledArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setControlledArrivalTime(XMLGregorianCalendar value) {
        this.controlledArrivalTime = value;
    }

    /**
     * Gets the value of the assignedArrivalSlot property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalSlotType }
     *     
     */
    public ArrivalSlotType getAssignedArrivalSlot() {
        return assignedArrivalSlot;
    }

    /**
     * Sets the value of the assignedArrivalSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalSlotType }
     *     
     */
    public void setAssignedArrivalSlot(ArrivalSlotType value) {
        this.assignedArrivalSlot = value;
    }

}
