//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.foundation._3.AirspeedInIasOrMachType;


/**
 * 
 *             Defines the speed schedule for climb and descent of the aircraft through the crossover 
 *             altitude. 
 *             .Speed Schedule - Climb: Initially submitted by the airspace user, this defines the 
 *             target speed in both Initial Airspeed (IAS) and MACH so the aircraft can climb through 
 *             the crossover altitude and target the MACH speed when needed. 
 *             .Speed Schedule - Descent: Initially submitted by the airspace user, this defines 
 *             the target speed in both IAS and MACH so the aircraft can descend through the crossover 
 *             altitude and target the Initial Airspeed (IAS) speed when needed. 
 *          
 * 
 * <p>Java class for SpeedScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="initialSpeed" type="{http://www.fixm.aero/foundation/3.0}AirspeedInIasOrMachType" minOccurs="0"/&gt;
 *         &lt;element name="subsequentSpeed" type="{http://www.fixm.aero/foundation/3.0}AirspeedInIasOrMachType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedScheduleType", propOrder = {
    "initialSpeed",
    "subsequentSpeed"
})
public class SpeedScheduleType {

    protected AirspeedInIasOrMachType initialSpeed;
    protected AirspeedInIasOrMachType subsequentSpeed;

    /**
     * Gets the value of the initialSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link AirspeedInIasOrMachType }
     *     
     */
    public AirspeedInIasOrMachType getInitialSpeed() {
        return initialSpeed;
    }

    /**
     * Sets the value of the initialSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspeedInIasOrMachType }
     *     
     */
    public void setInitialSpeed(AirspeedInIasOrMachType value) {
        this.initialSpeed = value;
    }

    /**
     * Gets the value of the subsequentSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link AirspeedInIasOrMachType }
     *     
     */
    public AirspeedInIasOrMachType getSubsequentSpeed() {
        return subsequentSpeed;
    }

    /**
     * Sets the value of the subsequentSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspeedInIasOrMachType }
     *     
     */
    public void setSubsequentSpeed(AirspeedInIasOrMachType value) {
        this.subsequentSpeed = value;
    }

}
