//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TfmsFlightStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TfmsFlightStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SCHEDULED"/&gt;
 *     &lt;enumeration value="CONTROLLED"/&gt;
 *     &lt;enumeration value="FILED"/&gt;
 *     &lt;enumeration value="ACTIVE"/&gt;
 *     &lt;enumeration value="ASCENDING"/&gt;
 *     &lt;enumeration value="CRUISING"/&gt;
 *     &lt;enumeration value="DESCENDING"/&gt;
 *     &lt;enumeration value="COMPLETED"/&gt;
 *     &lt;enumeration value="CANCELLED"/&gt;
 *     &lt;enumeration value="DECONTROLLED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="NONE"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TfmsFlightStatusType")
@XmlEnum
public enum TfmsFlightStatusType {

    SCHEDULED,
    CONTROLLED,
    FILED,
    ACTIVE,
    ASCENDING,
    CRUISING,
    DESCENDING,
    COMPLETED,
    CANCELLED,
    DECONTROLLED,
    UNKNOWN,
    NONE,
    ERROR,
    OTHER;

    public String value() {
        return name();
    }

    public static TfmsFlightStatusType fromValue(String v) {
        return valueOf(v);
    }

}