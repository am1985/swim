//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.base._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.foundation._3.AirspeedInIasOrMachType;


/**
 * 
 *             The airspeed can be expressed as a specific speed with a condition. 
 *          
 * 
 * <p>Java class for SpeedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.fixm.aero/foundation/3.0&gt;AirspeedInIasOrMachType"&gt;
 *       &lt;attribute name="speedCondition" type="{http://www.fixm.aero/base/3.0}SpeedConditionType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedType")
public class SpeedType
    extends AirspeedInIasOrMachType
{

    @XmlAttribute(name = "speedCondition")
    protected SpeedConditionType speedCondition;

    /**
     * Gets the value of the speedCondition property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedConditionType }
     *     
     */
    public SpeedConditionType getSpeedCondition() {
        return speedCondition;
    }

    /**
     * Sets the value of the speedCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedConditionType }
     *     
     */
    public void setSpeedCondition(SpeedConditionType value) {
        this.speedCondition = value;
    }

}
