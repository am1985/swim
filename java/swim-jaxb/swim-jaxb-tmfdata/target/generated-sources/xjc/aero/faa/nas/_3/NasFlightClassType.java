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
 * <p>Java class for NasFlightClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NasFlightClassType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GA"/&gt;
 *     &lt;enumeration value="COMMERCIAL"/&gt;
 *     &lt;enumeration value="LIFEGUARD"/&gt;
 *     &lt;enumeration value="AIR_TAXI"/&gt;
 *     &lt;enumeration value="CANADIAN_GA"/&gt;
 *     &lt;enumeration value="MILITARY"/&gt;
 *     &lt;enumeration value="CARGO"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NasFlightClassType")
@XmlEnum
public enum NasFlightClassType {


    /**
     * 
     *                   General Aviation 
     *                
     * 
     */
    GA,
    COMMERCIAL,

    /**
     * 
     *                   air ambulance services or other flights involving the safety of life 
     *                
     * 
     */
    LIFEGUARD,

    /**
     * 
     *                   taxi flights 
     *                
     * 
     */
    AIR_TAXI,

    /**
     * 
     *                   Canadian General Aviation 
     *                
     * 
     */
    CANADIAN_GA,

    /**
     * 
     *                   Military flight 
     *                
     * 
     */
    MILITARY,
    CARGO,
    OTHER,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static NasFlightClassType fromValue(String v) {
        return valueOf(v);
    }

}
