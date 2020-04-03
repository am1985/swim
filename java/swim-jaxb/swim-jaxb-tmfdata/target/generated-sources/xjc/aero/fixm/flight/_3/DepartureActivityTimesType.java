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
import aero.fixm.base._3.TimeSequenceType;


/**
 * 
 *             Groups various TimeSequences associated with departure activities. 
 *          
 * 
 * <p>Java class for DepartureActivityTimesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartureActivityTimesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="boardingTime" type="{http://www.fixm.aero/base/3.0}TimeSequenceType" minOccurs="0"/&gt;
 *         &lt;element name="deIcingTime" type="{http://www.fixm.aero/base/3.0}TimeSequenceType" minOccurs="0"/&gt;
 *         &lt;element name="groundHandlingTime" type="{http://www.fixm.aero/base/3.0}TimeSequenceType" minOccurs="0"/&gt;
 *         &lt;element name="startupTime" type="{http://www.fixm.aero/base/3.0}TimeSequenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartureActivityTimesType", propOrder = {
    "boardingTime",
    "deIcingTime",
    "groundHandlingTime",
    "startupTime"
})
public class DepartureActivityTimesType {

    protected TimeSequenceType boardingTime;
    @XmlElementRef(name = "deIcingTime", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeSequenceType> deIcingTime;
    protected TimeSequenceType groundHandlingTime;
    protected TimeSequenceType startupTime;

    /**
     * Gets the value of the boardingTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSequenceType }
     *     
     */
    public TimeSequenceType getBoardingTime() {
        return boardingTime;
    }

    /**
     * Sets the value of the boardingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSequenceType }
     *     
     */
    public void setBoardingTime(TimeSequenceType value) {
        this.boardingTime = value;
    }

    /**
     * Gets the value of the deIcingTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeSequenceType }{@code >}
     *     
     */
    public JAXBElement<TimeSequenceType> getDeIcingTime() {
        return deIcingTime;
    }

    /**
     * Sets the value of the deIcingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeSequenceType }{@code >}
     *     
     */
    public void setDeIcingTime(JAXBElement<TimeSequenceType> value) {
        this.deIcingTime = value;
    }

    /**
     * Gets the value of the groundHandlingTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSequenceType }
     *     
     */
    public TimeSequenceType getGroundHandlingTime() {
        return groundHandlingTime;
    }

    /**
     * Sets the value of the groundHandlingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSequenceType }
     *     
     */
    public void setGroundHandlingTime(TimeSequenceType value) {
        this.groundHandlingTime = value;
    }

    /**
     * Gets the value of the startupTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSequenceType }
     *     
     */
    public TimeSequenceType getStartupTime() {
        return startupTime;
    }

    /**
     * Sets the value of the startupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSequenceType }
     *     
     */
    public void setStartupTime(TimeSequenceType value) {
        this.startupTime = value;
    }

}