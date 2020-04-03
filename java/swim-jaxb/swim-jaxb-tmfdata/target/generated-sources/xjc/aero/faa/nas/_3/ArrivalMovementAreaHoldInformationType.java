//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *             .Airport Movement Area Holding - Departure Information: Indicates the intent for 
 *             a departing flight to hold in the airport movement area when surface departure metering 
 *             or other Traffic Management Initiatives are in effect, and the time when the flight 
 *             is estimated to request entry in the airport movement area. 
 *             .Airport Movement Area Holding - Arrival Information: Indicates the intent for an 
 *             arriving flight to hold in the airport movement area due to unavailability of a parking 
 *             stand or ramp access, and the time when the flight is estimated to exit the airport 
 *             movement area. 
 *          
 * 
 * <p>Java class for ArrivalMovementAreaHoldInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrivalMovementAreaHoldInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="estimatedExitTime" type="{http://www.fixm.aero/foundation/3.0}TimeType" /&gt;
 *       &lt;attribute name="holdIntent" type="{http://www.faa.aero/nas/3.1}HoldIntentType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalMovementAreaHoldInformationType")
public class ArrivalMovementAreaHoldInformationType {

    @XmlAttribute(name = "estimatedExitTime")
    protected XMLGregorianCalendar estimatedExitTime;
    @XmlAttribute(name = "holdIntent")
    protected HoldIntentType holdIntent;

    /**
     * Gets the value of the estimatedExitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedExitTime() {
        return estimatedExitTime;
    }

    /**
     * Sets the value of the estimatedExitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedExitTime(XMLGregorianCalendar value) {
        this.estimatedExitTime = value;
    }

    /**
     * Gets the value of the holdIntent property.
     * 
     * @return
     *     possible object is
     *     {@link HoldIntentType }
     *     
     */
    public HoldIntentType getHoldIntent() {
        return holdIntent;
    }

    /**
     * Sets the value of the holdIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldIntentType }
     *     
     */
    public void setHoldIntent(HoldIntentType value) {
        this.holdIntent = value;
    }

}
