//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NasSpecialAircraftQualifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NasSpecialAircraftQualifierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HEAVY_JET"/&gt;
 *     &lt;enumeration value="TCAS"/&gt;
 *     &lt;enumeration value="B757"/&gt;
 *     &lt;enumeration value="B757_TCAS"/&gt;
 *     &lt;enumeration value="HEAVY_JET_AND_TCAS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NasSpecialAircraftQualifierType")
@XmlEnum
public enum NasSpecialAircraftQualifierType {


    /**
     * 
     *                   Capable of takeoff weights of 300,000 pounds or more 
     *                
     * 
     */
    HEAVY_JET("HEAVY_JET"),

    /**
     * 
     *                   Traffic collision avoidance system or traffic alert and collision avoidance system 
     *                   
     *                
     * 
     */
    TCAS("TCAS"),

    /**
     * 
     *                   Controllers are required to apply the special wake turbulence separation criteria 
     *                   for the Boeing 757. 
     *                
     * 
     */
    @XmlEnumValue("B757")
    B_757("B757"),

    /**
     * 
     *                   Boeing 757 with traffic collision avoidance system 
     *                
     * 
     */
    @XmlEnumValue("B757_TCAS")
    B_757_TCAS("B757_TCAS"),

    /**
     * 
     *                   Capable of takeoff weights of 300,000 pounds or more and traffic collision avoidance 
     *                   system. 
     *                
     * 
     */
    HEAVY_JET_AND_TCAS("HEAVY_JET_AND_TCAS");
    private final String value;

    NasSpecialAircraftQualifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NasSpecialAircraftQualifierType fromValue(String v) {
        for (NasSpecialAircraftQualifierType c: NasSpecialAircraftQualifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
