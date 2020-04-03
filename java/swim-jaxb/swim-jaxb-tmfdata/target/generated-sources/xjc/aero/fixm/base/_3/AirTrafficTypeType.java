//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.base._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirTrafficTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AirTrafficTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OAT"/&gt;
 *     &lt;enumeration value="GAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AirTrafficTypeType")
@XmlEnum
public enum AirTrafficTypeType {


    /**
     * 
     *                   Operational Air Traffic: Military and State operations not subject to civil ATC procedures 
     *                   but are ICAO recognized operations. 
     *                
     * 
     */
    OAT,

    /**
     * 
     *                   General Air Traffic: ICAO civil type operations. 
     *                
     * 
     */
    GAT;

    public String value() {
        return name();
    }

    public static AirTrafficTypeType fromValue(String v) {
        return valueOf(v);
    }

}
