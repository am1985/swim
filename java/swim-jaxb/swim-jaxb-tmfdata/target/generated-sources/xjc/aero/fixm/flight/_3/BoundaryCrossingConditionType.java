//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoundaryCrossingConditionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BoundaryCrossingConditionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AT_OR_ABOVE"/&gt;
 *     &lt;enumeration value="AT_OR_BELOW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BoundaryCrossingConditionType")
@XmlEnum
public enum BoundaryCrossingConditionType {


    /**
     * 
     *                   Indicates that the transition altitude is at or above the specified. 
     *                
     * 
     */
    AT_OR_ABOVE,

    /**
     * 
     *                   Indicates that the transition altitude is at or below the specified. 
     *                
     * 
     */
    AT_OR_BELOW;

    public String value() {
        return name();
    }

    public static BoundaryCrossingConditionType fromValue(String v) {
        return valueOf(v);
    }

}
