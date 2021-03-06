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
 * <p>Java class for EngineTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EngineTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PISTON"/&gt;
 *     &lt;enumeration value="TURBO_PROP"/&gt;
 *     &lt;enumeration value="TURBO_SHAFT"/&gt;
 *     &lt;enumeration value="TURBO_JET"/&gt;
 *     &lt;enumeration value="TURBO_FAN"/&gt;
 *     &lt;enumeration value="PROP_FAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EngineTypeType")
@XmlEnum
public enum EngineTypeType {

    PISTON,
    TURBO_PROP,
    TURBO_SHAFT,
    TURBO_JET,
    TURBO_FAN,
    PROP_FAN;

    public String value() {
        return name();
    }

    public static EngineTypeType fromValue(String v) {
        return valueOf(v);
    }

}
