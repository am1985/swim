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
 * <p>Java class for coordinationTimeDescriptorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="coordinationTimeDescriptorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ESTIMATED"/&gt;
 *     &lt;enumeration value="PROPOSED"/&gt;
 *     &lt;enumeration value="ACTUAL"/&gt;
 *     &lt;enumeration value="FLUSH"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "coordinationTimeDescriptorType")
@XmlEnum
public enum CoordinationTimeDescriptorType {

    ESTIMATED,
    PROPOSED,
    ACTUAL,
    FLUSH,
    OTHER;

    public String value() {
        return name();
    }

    public static CoordinationTimeDescriptorType fromValue(String v) {
        return valueOf(v);
    }

}