//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.base._3.FeatureType;
import aero.fixm.base._3.IdentifiedUnitReferenceType;


/**
 * 
 *             Groups emergency information (description, phase, position, etc) for the flight. 
 *             
 *          
 * 
 * <p>Java class for FlightEmergencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightEmergencyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixm.aero/base/3.0}FeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contact" type="{http://www.fixm.aero/flight/3.0}LastContactType" minOccurs="0"/&gt;
 *         &lt;element name="originator" type="{http://www.fixm.aero/base/3.0}IdentifiedUnitReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionTaken" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="emergencyDescription" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="otherInformation" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="phase" type="{http://www.fixm.aero/flight/3.0}EmergencyPhaseType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightEmergencyType", propOrder = {
    "contact",
    "originator"
})
public class FlightEmergencyType
    extends FeatureType
{

    protected LastContactType contact;
    protected IdentifiedUnitReferenceType originator;
    @XmlAttribute(name = "actionTaken")
    protected String actionTaken;
    @XmlAttribute(name = "emergencyDescription")
    protected String emergencyDescription;
    @XmlAttribute(name = "otherInformation")
    protected String otherInformation;
    @XmlAttribute(name = "phase")
    protected EmergencyPhaseType phase;

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link LastContactType }
     *     
     */
    public LastContactType getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastContactType }
     *     
     */
    public void setContact(LastContactType value) {
        this.contact = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedUnitReferenceType }
     *     
     */
    public IdentifiedUnitReferenceType getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedUnitReferenceType }
     *     
     */
    public void setOriginator(IdentifiedUnitReferenceType value) {
        this.originator = value;
    }

    /**
     * Gets the value of the actionTaken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTaken() {
        return actionTaken;
    }

    /**
     * Sets the value of the actionTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTaken(String value) {
        this.actionTaken = value;
    }

    /**
     * Gets the value of the emergencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyDescription() {
        return emergencyDescription;
    }

    /**
     * Sets the value of the emergencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyDescription(String value) {
        this.emergencyDescription = value;
    }

    /**
     * Gets the value of the otherInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInformation() {
        return otherInformation;
    }

    /**
     * Sets the value of the otherInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInformation(String value) {
        this.otherInformation = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyPhaseType }
     *     
     */
    public EmergencyPhaseType getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyPhaseType }
     *     
     */
    public void setPhase(EmergencyPhaseType value) {
        this.phase = value;
    }

}
