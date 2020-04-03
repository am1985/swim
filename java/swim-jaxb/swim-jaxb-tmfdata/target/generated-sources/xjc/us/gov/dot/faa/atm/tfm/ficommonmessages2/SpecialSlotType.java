//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specialSlotType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="specialSlotType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNUSED"/&gt;
 *     &lt;enumeration value="UNASSIGNED"/&gt;
 *     &lt;enumeration value="UNAVAILABLE"/&gt;
 *     &lt;enumeration value="PURGED_PLANNED"/&gt;
 *     &lt;enumeration value="PURGED_ACTIVE_COMPLETED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "specialSlotType")
@XmlEnum
public enum SpecialSlotType {

    UNUSED,
    UNASSIGNED,
    UNAVAILABLE,
    PURGED_PLANNED,
    PURGED_ACTIVE_COMPLETED;

    public String value() {
        return name();
    }

    public static SpecialSlotType fromValue(String v) {
        return valueOf(v);
    }

}