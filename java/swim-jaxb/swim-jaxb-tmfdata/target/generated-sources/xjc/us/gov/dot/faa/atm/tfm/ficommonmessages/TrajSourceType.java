//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trajSourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="trajSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FILED_FLIGHT_PLAN"/&gt;
 *     &lt;enumeration value="CTOP_ASSIGNED"/&gt;
 *     &lt;enumeration value="CTOP_MANUAL_ASSIGNED"/&gt;
 *     &lt;enumeration value="TOS_OPTION"/&gt;
 *     &lt;enumeration value="TFMS_REROUTE"/&gt;
 *     &lt;enumeration value="EARLY_INTENT"/&gt;
 *     &lt;enumeration value="HISTORICAL_ROUTE"/&gt;
 *     &lt;enumeration value="DIRECT_ROUTE"/&gt;
 *     &lt;enumeration value="CTOP_ASSIGNED_MODEL"/&gt;
 *     &lt;enumeration value="CTOP_MANUAL_ASSIGNED_MODEL"/&gt;
 *     &lt;enumeration value="TACTICAL_REROUTE"/&gt;
 *     &lt;enumeration value="DYNAMIC_EXCEPTION"/&gt;
 *     &lt;enumeration value="DYNAMIC_EXCEPTION_MODEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "trajSourceType")
@XmlEnum
public enum TrajSourceType {

    FILED_FLIGHT_PLAN,
    CTOP_ASSIGNED,
    CTOP_MANUAL_ASSIGNED,
    TOS_OPTION,
    TFMS_REROUTE,
    EARLY_INTENT,
    HISTORICAL_ROUTE,
    DIRECT_ROUTE,
    CTOP_ASSIGNED_MODEL,
    CTOP_MANUAL_ASSIGNED_MODEL,
    TACTICAL_REROUTE,
    DYNAMIC_EXCEPTION,
    DYNAMIC_EXCEPTION_MODEL;

    public String value() {
        return name();
    }

    public static TrajSourceType fromValue(String v) {
        return valueOf(v);
    }

}
