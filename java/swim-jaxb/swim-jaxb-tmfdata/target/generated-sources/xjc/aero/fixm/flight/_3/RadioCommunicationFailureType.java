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


/**
 * 
 *             Groups information regarding loss of radio communication capabilities. 
 *          
 * 
 * <p>Java class for RadioCommunicationFailureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadioCommunicationFailureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixm.aero/base/3.0}FeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contact" type="{http://www.fixm.aero/flight/3.0}LastContactType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="radioFailureRemarks" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="remainingComCapability" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioCommunicationFailureType", propOrder = {
    "contact"
})
public class RadioCommunicationFailureType
    extends FeatureType
{

    protected LastContactType contact;
    @XmlAttribute(name = "radioFailureRemarks")
    protected String radioFailureRemarks;
    @XmlAttribute(name = "remainingComCapability")
    protected String remainingComCapability;

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
     * Gets the value of the radioFailureRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioFailureRemarks() {
        return radioFailureRemarks;
    }

    /**
     * Sets the value of the radioFailureRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioFailureRemarks(String value) {
        this.radioFailureRemarks = value;
    }

    /**
     * Gets the value of the remainingComCapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainingComCapability() {
        return remainingComCapability;
    }

    /**
     * Sets the value of the remainingComCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainingComCapability(String value) {
        this.remainingComCapability = value;
    }

}
