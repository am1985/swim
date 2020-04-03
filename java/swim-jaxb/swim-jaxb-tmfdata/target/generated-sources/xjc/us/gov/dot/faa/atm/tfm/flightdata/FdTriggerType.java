//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.flightdata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fdTriggerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fdTriggerType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTIVATE_CMD"/&gt;
 *     &lt;enumeration value="ACTIVATE_SCHEDULED_FLIGHTS"/&gt;
 *     &lt;enumeration value="AIRSPACE_ASSIGNMENT"/&gt;
 *     &lt;enumeration value="CACR_EDCT"/&gt;
 *     &lt;enumeration value="CANCEL_CMD"/&gt;
 *     &lt;enumeration value="CTOP_ROUTE_ASSIGNMENT"/&gt;
 *     &lt;enumeration value="CTOP_ROUTE_CANCEL"/&gt;
 *     &lt;enumeration value="EARLY_INTENT_MSG"/&gt;
 *     &lt;enumeration value="FD_FLIGHT_CANCEL_MSG"/&gt;
 *     &lt;enumeration value="FD_FLIGHT_CREATE_MSG"/&gt;
 *     &lt;enumeration value="FD_FLIGHT_MODIFY_MSG"/&gt;
 *     &lt;enumeration value="HCS_AMENDMENT_MSG"/&gt;
 *     &lt;enumeration value="HCS_ARRIVAL_MSG"/&gt;
 *     &lt;enumeration value="HCS_BEACON_CODE_MSG"/&gt;
 *     &lt;enumeration value="HCS_CANCELLATION_MSG"/&gt;
 *     &lt;enumeration value="HCS_DEPARTURE_MSG"/&gt;
 *     &lt;enumeration value="HCS_FLIGHT_PLAN_MSG"/&gt;
 *     &lt;enumeration value="HCS_OCEANIC_POSITION_REPORT_MSG"/&gt;
 *     &lt;enumeration value="HCS_TRACK_MSG"/&gt;
 *     &lt;enumeration value="HCS_UPDATE_MSG"/&gt;
 *     &lt;enumeration value="IADE_AMENDMENT_MSG"/&gt;
 *     &lt;enumeration value="IADE_ARRIVAL_MSG"/&gt;
 *     &lt;enumeration value="IADE_BEACON_CODE_MSG"/&gt;
 *     &lt;enumeration value="IADE_CANCELLATION_MSG"/&gt;
 *     &lt;enumeration value="IADE_DEPARTURE_MSG"/&gt;
 *     &lt;enumeration value="IADE_FLIGHT_PLAN_MSG"/&gt;
 *     &lt;enumeration value="IADE_OCEANIC_POSITION_REPORT_MSG"/&gt;
 *     &lt;enumeration value="IADE_TRACK_MSG"/&gt;
 *     &lt;enumeration value="NEMS_TBFM_FLT_DEPARTURE_MSG"/&gt;
 *     &lt;enumeration value="RECOMPUTE_NCSM"/&gt;
 *     &lt;enumeration value="REMOVE_CMD"/&gt;
 *     &lt;enumeration value="REROUTE_ASSIGNED_ROUTE"/&gt;
 *     &lt;enumeration value="REROUTE_HISTORICAL_ROUTE"/&gt;
 *     &lt;enumeration value="RESTORE_CMD"/&gt;
 *     &lt;enumeration value="SMA_TRACK_MSG"/&gt;
 *     &lt;enumeration value="STDDS_SURFACE_MOVEMENT_MSG"/&gt;
 *     &lt;enumeration value="TMI_UPDATE"/&gt;
 *     &lt;enumeration value="TRAJECTORY_OPTION_SET_MSG"/&gt;
 *     &lt;enumeration value="UPDATE_CANCEL_SCHEDULE_TIMEOUT"/&gt;
 *     &lt;enumeration value="UPDATE_CANCEL_TIMEOUT"/&gt;
 *     &lt;enumeration value="UPDATE_COMPLETE_TIMEOUT"/&gt;
 *     &lt;enumeration value="UPDATE_DEPARTURE_TIMEOUT"/&gt;
 *     &lt;enumeration value="UPDATE_INHIBIT_FLIGHTS"/&gt;
 *     &lt;enumeration value="UPDATE_INTERNATIONAL_CANCEL_TIMEOUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "fdTriggerType")
@XmlEnum
public enum FdTriggerType {


    /**
     * Activate command.
     * 
     */
    ACTIVATE_CMD,

    /**
     * Activate scheduled flights.
     * 
     */
    ACTIVATE_SCHEDULED_FLIGHTS,

    /**
     * Airspace assignment.
     * 
     */
    AIRSPACE_ASSIGNMENT,

    /**
     * CACR EDCT.
     * 
     */
    CACR_EDCT,

    /**
     * Cancel command.
     * 
     */
    CANCEL_CMD,

    /**
     * CTOP route assignment.
     * 
     */
    CTOP_ROUTE_ASSIGNMENT,

    /**
     * CTOP route cancel.
     * 
     */
    CTOP_ROUTE_CANCEL,

    /**
     * Early intent message.
     * 
     */
    EARLY_INTENT_MSG,

    /**
     * Flight cancel message.
     * 
     */
    FD_FLIGHT_CANCEL_MSG,

    /**
     * Flight cancel message.
     * 
     */
    FD_FLIGHT_CREATE_MSG,

    /**
     * Flight modify message.
     * 
     */
    FD_FLIGHT_MODIFY_MSG,

    /**
     * Amendment message.
     * 
     */
    HCS_AMENDMENT_MSG,

    /**
     * Arrival message.
     * 
     */
    HCS_ARRIVAL_MSG,

    /**
     * Tack message.
     * 
     */
    HCS_BEACON_CODE_MSG,

    /**
     * Cancellation message.
     * 
     */
    HCS_CANCELLATION_MSG,

    /**
     * Departure message.
     * 
     */
    HCS_DEPARTURE_MSG,

    /**
     * Flight plan message.
     * 
     */
    HCS_FLIGHT_PLAN_MSG,

    /**
     * Oceanin position message.
     * 
     */
    HCS_OCEANIC_POSITION_REPORT_MSG,

    /**
     * Tack message.
     * 
     */
    HCS_TRACK_MSG,

    /**
     * Boundary crossing message.
     * 
     */
    HCS_UPDATE_MSG,

    /**
     * Amendment message.
     * 
     */
    IADE_AMENDMENT_MSG,

    /**
     * Arrival message.
     * 
     */
    IADE_ARRIVAL_MSG,

    /**
     * Track message.
     * 
     */
    IADE_BEACON_CODE_MSG,

    /**
     * Cancellation message.
     * 
     */
    IADE_CANCELLATION_MSG,

    /**
     * Departure message.
     * 
     */
    IADE_DEPARTURE_MSG,

    /**
     * Flight plan message.
     * 
     */
    IADE_FLIGHT_PLAN_MSG,

    /**
     * Oceanic position message.
     * 
     */
    IADE_OCEANIC_POSITION_REPORT_MSG,

    /**
     * Track message.
     * 
     */
    IADE_TRACK_MSG,

    /**
     * A scheduled time of departure.
     * 
     */
    NEMS_TBFM_FLT_DEPARTURE_MSG,

    /**
     * Restore command.
     * 
     */
    RECOMPUTE_NCSM,

    /**
     * Remove command
     * 
     */
    REMOVE_CMD,

    /**
     * Reroute assigned route.
     * 
     */
    REROUTE_ASSIGNED_ROUTE,

    /**
     * Reroute historical route.
     * 
     */
    REROUTE_HISTORICAL_ROUTE,

    /**
     * Restore command.
     * 
     */
    RESTORE_CMD,

    /**
     * Rrack message.
     * 
     */
    SMA_TRACK_MSG,

    /**
     * A surface movement event.
     * 
     */
    STDDS_SURFACE_MOVEMENT_MSG,

    /**
     * A scheduled time of departure.
     * 
     */
    TMI_UPDATE,

    /**
     * TOS message.
     * 
     */
    TRAJECTORY_OPTION_SET_MSG,

    /**
     * Update cancel schedule timeout.
     * 
     */
    UPDATE_CANCEL_SCHEDULE_TIMEOUT,

    /**
     * Update cancel schedule timeout.
     * 
     */
    UPDATE_CANCEL_TIMEOUT,

    /**
     * Update complete timeout.
     * 
     */
    UPDATE_COMPLETE_TIMEOUT,

    /**
     * Update departure timeout.
     * 
     */
    UPDATE_DEPARTURE_TIMEOUT,

    /**
     * Update cancel schedule timeout.
     * 
     */
    UPDATE_INHIBIT_FLIGHTS,

    /**
     * Update cancel schedule timeout.
     * 
     */
    UPDATE_INTERNATIONAL_CANCEL_TIMEOUT;

    public String value() {
        return name();
    }

    public static FdTriggerType fromValue(String v) {
        return valueOf(v);
    }

}
