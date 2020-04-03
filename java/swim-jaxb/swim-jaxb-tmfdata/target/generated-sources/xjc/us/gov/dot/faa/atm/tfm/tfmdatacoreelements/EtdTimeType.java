//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for etdTimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="etdTimeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTUAL"/&gt;
 *     &lt;enumeration value="AIRLINE"/&gt;
 *     &lt;enumeration value="EARLY_INTENT"/&gt;
 *     &lt;enumeration value="ESTIMATED"/&gt;
 *     &lt;enumeration value="METERED"/&gt;
 *     &lt;enumeration value="PROPOSED"/&gt;
 *     &lt;enumeration value="REROUTE"/&gt;
 *     &lt;enumeration value="SCHEDULED"/&gt;
 *     &lt;enumeration value="TAXIED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "etdTimeType")
@XmlEnum
public enum EtdTimeType {

    ACTUAL,
    AIRLINE,
    EARLY_INTENT,
    ESTIMATED,
    METERED,
    PROPOSED,
    REROUTE,
    SCHEDULED,
    TAXIED;

    public String value() {
        return name();
    }

    public static EtdTimeType fromValue(String v) {
        return valueOf(v);
    }

}
