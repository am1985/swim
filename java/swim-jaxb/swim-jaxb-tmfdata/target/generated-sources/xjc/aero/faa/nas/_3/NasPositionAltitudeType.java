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


/**
 * 
 *             The Mode C target altitude, corrected for barometric pressure. 
 *             Suspected invalid altitudes marked with the 'invalid' attribute
 *             .Target Altitude: The Mode C target altitude, corrected for barometric pressure. 
 *              Can be marked as invalid. 
 *          
 * 
 * <p>Java class for NasPositionAltitudeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NasPositionAltitudeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.faa.aero/nas/3.1&gt;SimpleAltitudeType"&gt;
 *       &lt;attribute name="invalid" type="{http://www.faa.aero/nas/3.1}InvalidIndicatorType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasPositionAltitudeType")
public class NasPositionAltitudeType
    extends SimpleAltitudeType
{

    @XmlAttribute(name = "invalid")
    protected InvalidIndicatorType invalid;

    /**
     * Gets the value of the invalid property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidIndicatorType }
     *     
     */
    public InvalidIndicatorType getInvalid() {
        return invalid;
    }

    /**
     * Sets the value of the invalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidIndicatorType }
     *     
     */
    public void setInvalid(InvalidIndicatorType value) {
        this.invalid = value;
    }

}