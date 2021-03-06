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
 * <p>Java class for routeTypesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="routeTypesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AIRWAY"/&gt;
 *     &lt;enumeration value="CODED_ROUTE"/&gt;
 *     &lt;enumeration value="DIRECT"/&gt;
 *     &lt;enumeration value="SID"/&gt;
 *     &lt;enumeration value="STAR"/&gt;
 *     &lt;enumeration value="PAR"/&gt;
 *     &lt;enumeration value="PDR"/&gt;
 *     &lt;enumeration value="PDAR"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "routeTypesType")
@XmlEnum
public enum RouteTypesType {

    AIRWAY,
    CODED_ROUTE,
    DIRECT,
    SID,
    STAR,
    PAR,
    PDR,
    PDAR,
    UNKNOWN,
    OTHER;

    public String value() {
        return name();
    }

    public static RouteTypesType fromValue(String v) {
        return valueOf(v);
    }

}
