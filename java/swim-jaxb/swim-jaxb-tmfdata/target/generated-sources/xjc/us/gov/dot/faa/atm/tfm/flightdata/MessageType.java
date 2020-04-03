//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.flightdata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="flightPlanAmendmentInformation"/&gt;
 *     &lt;enumeration value="arrivalInformation"/&gt;
 *     &lt;enumeration value="departureInformation"/&gt;
 *     &lt;enumeration value="flightPlanInformation"/&gt;
 *     &lt;enumeration value="flightPlanCancellation"/&gt;
 *     &lt;enumeration value="boundaryCrossingUpdate"/&gt;
 *     &lt;enumeration value="trackInformation"/&gt;
 *     &lt;enumeration value="oceanicReport"/&gt;
 *     &lt;enumeration value="beaconCodeInformation"/&gt;
 *     &lt;enumeration value="FlightCreate"/&gt;
 *     &lt;enumeration value="FlightModify"/&gt;
 *     &lt;enumeration value="FlightControl"/&gt;
 *     &lt;enumeration value="FlightScheduleActivate"/&gt;
 *     &lt;enumeration value="FlightRoute"/&gt;
 *     &lt;enumeration value="FlightSectors"/&gt;
 *     &lt;enumeration value="FlightTimes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "messageType")
@XmlEnum
public enum MessageType {


    /**
     * Amendment
     * 
     */
    @XmlEnumValue("flightPlanAmendmentInformation")
    FLIGHT_PLAN_AMENDMENT_INFORMATION("flightPlanAmendmentInformation"),

    /**
     * Arrival
     * 
     */
    @XmlEnumValue("arrivalInformation")
    ARRIVAL_INFORMATION("arrivalInformation"),

    /**
     * Departure
     * 
     */
    @XmlEnumValue("departureInformation")
    DEPARTURE_INFORMATION("departureInformation"),

    /**
     * Flight Plan
     * 
     */
    @XmlEnumValue("flightPlanInformation")
    FLIGHT_PLAN_INFORMATION("flightPlanInformation"),

    /**
     * Cancellation
     * 
     */
    @XmlEnumValue("flightPlanCancellation")
    FLIGHT_PLAN_CANCELLATION("flightPlanCancellation"),

    /**
     * Update
     * 
     */
    @XmlEnumValue("boundaryCrossingUpdate")
    BOUNDARY_CROSSING_UPDATE("boundaryCrossingUpdate"),

    /**
     *  5 minute location update
     * 
     */
    @XmlEnumValue("trackInformation")
    TRACK_INFORMATION("trackInformation"),

    /**
     * Oceanic Update
     * 
     */
    @XmlEnumValue("oceanicReport")
    OCEANIC_REPORT("oceanicReport"),

    /**
     * Beacon Code messages
     * 
     */
    @XmlEnumValue("beaconCodeInformation")
    BEACON_CODE_INFORMATION("beaconCodeInformation"),

    /**
     * Flight Create messages
     * 
     */
    @XmlEnumValue("FlightCreate")
    FLIGHT_CREATE("FlightCreate"),

    /**
     * Flight Modify messages
     * 
     */
    @XmlEnumValue("FlightModify")
    FLIGHT_MODIFY("FlightModify"),

    /**
     * Flight Contro Data messages
     * 
     */
    @XmlEnumValue("FlightControl")
    FLIGHT_CONTROL("FlightControl"),

    /**
     * Flight schedule activation  messages
     * 
     */
    @XmlEnumValue("FlightScheduleActivate")
    FLIGHT_SCHEDULE_ACTIVATE("FlightScheduleActivate"),

    /**
     * Flight Route Data messages
     * 
     */
    @XmlEnumValue("FlightRoute")
    FLIGHT_ROUTE("FlightRoute"),

    /**
     * Flight Sector Data messages
     * 
     */
    @XmlEnumValue("FlightSectors")
    FLIGHT_SECTORS("FlightSectors"),

    /**
     * Flight Times data messages
     * 
     */
    @XmlEnumValue("FlightTimes")
    FLIGHT_TIMES("FlightTimes");
    private final String value;

    MessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageType fromValue(String v) {
        for (MessageType c: MessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}