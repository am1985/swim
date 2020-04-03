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
 * <p>Java class for sensitivityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sensitivityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "sensitivityType")
@XmlEnum
public enum SensitivityType {


    /**
     * Sensitive data for distribution to govenment agency only.
     * 
     */
    R,

    /**
     * Data that can be distributed to all users including delayed users.
     * 
     */
    A,

    /**
     * Duplication of sensitive data but sanitized, i.e. sensitive data removed. It can be distributed to all users except government agency.
     * 
     */
    D;

    public String value() {
        return name();
    }

    public static SensitivityType fromValue(String v) {
        return valueOf(v);
    }

}
