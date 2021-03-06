//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generalAircraftUserClassType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="generalAircraftUserClassType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AIR TAXI"/&gt;
 *     &lt;enumeration value="CARGO"/&gt;
 *     &lt;enumeration value="COMMERCIAL"/&gt;
 *     &lt;enumeration value="GENERAL AVIATION"/&gt;
 *     &lt;enumeration value="MILITARY"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "generalAircraftUserClassType")
@XmlEnum
public enum GeneralAircraftUserClassType {


    /**
     * Indicates an Aircraft User Class Type of "AIR TAXI" for the referent flight. Air Taxi is defined as a small aircraft that makes short local flights to areas not serviced by regular airlines.
     * 
     */
    @XmlEnumValue("AIR TAXI")
    AIR_TAXI("AIR TAXI"),

    /**
     * Indicates an Aircraft User Class Type of CARGO for the referent flight.
     * 
     */
    CARGO("CARGO"),

    /**
     * Indicates an Aircraft User Class Type of COMMERCIAL for the referent flight.
     * 
     */
    COMMERCIAL("COMMERCIAL"),

    /**
     * Indicates an Aircraft User Class Type of GENERAL AVIATION for the referent flight.
     * 
     */
    @XmlEnumValue("GENERAL AVIATION")
    GENERAL_AVIATION("GENERAL AVIATION"),

    /**
     * Indicates an Aircraft User Class Type of MILITARY for the referent flight.
     * 
     */
    MILITARY("MILITARY"),

    /**
     * Indicates an Aircraft User Class Type of OTHER for the referent flight.
     * 
     */
    OTHER("OTHER"),

    /**
     * Indicates an Aircraft User Class Type of UNKNOWN	for the referent flight.
     * 
     */
    UNKNOWN("UNKNOWN");
    private final String value;

    GeneralAircraftUserClassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeneralAircraftUserClassType fromValue(String v) {
        for (GeneralAircraftUserClassType c: GeneralAircraftUserClassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
