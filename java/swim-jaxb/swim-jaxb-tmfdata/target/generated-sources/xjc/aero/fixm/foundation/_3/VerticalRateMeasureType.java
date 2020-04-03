//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.foundation._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerticalRateMeasureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VerticalRateMeasureType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEET_PER_MINUTE"/&gt;
 *     &lt;enumeration value="METRES_PER_SECOND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VerticalRateMeasureType")
@XmlEnum
public enum VerticalRateMeasureType {


    /**
     * 
     *                   Indicates VerticalRate is in ft/min ([(-3000)-3000]). 
     *                
     * 
     */
    FEET_PER_MINUTE,

    /**
     * 
     *                   Indicates VerticalRate is in m/s (if [(-15)-15] ). 
     *                
     * 
     */
    METRES_PER_SECOND;

    public String value() {
        return name();
    }

    public static VerticalRateMeasureType fromValue(String v) {
        return valueOf(v);
    }

}