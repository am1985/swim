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
 * <p>Java class for SurvivalEquipmentCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SurvivalEquipmentCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="POLAR"/&gt;
 *     &lt;enumeration value="DESERT"/&gt;
 *     &lt;enumeration value="MARITIME"/&gt;
 *     &lt;enumeration value="JUNGLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SurvivalEquipmentCodeType")
@XmlEnum
public enum SurvivalEquipmentCodeType {

    POLAR,
    DESERT,
    MARITIME,
    JUNGLE;

    public String value() {
        return name();
    }

    public static SurvivalEquipmentCodeType fromValue(String v) {
        return valueOf(v);
    }

}
