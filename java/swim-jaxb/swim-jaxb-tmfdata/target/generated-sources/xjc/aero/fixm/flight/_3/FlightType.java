//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import aero.faa.nas._3.NasFlightType;
import aero.fixm.base._3.AtcUnitReferenceType;
import aero.fixm.base._3.ExtensionType;
import aero.fixm.base._3.FeatureType;
import aero.fixm.base._3.GloballyUniqueFlightIdentifierType;
import aero.fixm.tfm._3.TfmTfdmFlightType;


/**
 * 
 *             Central object of the FIXM Logical Model. Groups all information about the flight. 
 *             
 *          
 * 
 * <p>Java class for FlightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixm.aero/base/3.0}FeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="agreed" type="{http://www.fixm.aero/flight/3.0}TrajectoryRoutePairType" minOccurs="0"/&gt;
 *         &lt;element name="aircraftDescription" type="{http://www.fixm.aero/flight/3.0}AircraftType" minOccurs="0"/&gt;
 *         &lt;element name="arrival" type="{http://www.fixm.aero/flight/3.0}FlightArrivalType" minOccurs="0"/&gt;
 *         &lt;element name="controllingUnit" type="{http://www.fixm.aero/base/3.0}AtcUnitReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="dangerousGoods" type="{http://www.fixm.aero/flight/3.0}DangerousGoodsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="departure" type="{http://www.fixm.aero/flight/3.0}FlightDepartureType" minOccurs="0"/&gt;
 *         &lt;element name="emergency" type="{http://www.fixm.aero/flight/3.0}FlightEmergencyType" minOccurs="0"/&gt;
 *         &lt;element name="enRoute" type="{http://www.fixm.aero/flight/3.0}EnRouteType" minOccurs="0"/&gt;
 *         &lt;element name="enRouteDiversion" type="{http://www.fixm.aero/flight/3.0}EnRouteDiversionType" minOccurs="0"/&gt;
 *         &lt;element name="extensions" type="{http://www.fixm.aero/base/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flightIdentification" type="{http://www.fixm.aero/flight/3.0}FlightIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="flightStatus" type="{http://www.fixm.aero/flight/3.0}FlightStatusType" minOccurs="0"/&gt;
 *         &lt;element name="gufi" type="{http://www.fixm.aero/base/3.0}GloballyUniqueFlightIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="negotiating" type="{http://www.fixm.aero/flight/3.0}TrajectoryRoutePairType" minOccurs="0"/&gt;
 *         &lt;element name="operator" type="{http://www.fixm.aero/flight/3.0}AircraftOperatorType" minOccurs="0"/&gt;
 *         &lt;element name="originator" type="{http://www.fixm.aero/flight/3.0}OriginatorType" minOccurs="0"/&gt;
 *         &lt;element name="radioCommunicationFailure" type="{http://www.fixm.aero/flight/3.0}RadioCommunicationFailureType" minOccurs="0"/&gt;
 *         &lt;element name="rankedTrajectories" type="{http://www.fixm.aero/flight/3.0}RankedTrajectoryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="routeToRevisedDestination" type="{http://www.fixm.aero/flight/3.0}TrajectoryRoutePairType" minOccurs="0"/&gt;
 *         &lt;element name="specialHandling" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;list itemType="{http://www.fixm.aero/flight/3.0}SpecialHandlingCodeType" /&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="supplementalData" type="{http://www.fixm.aero/flight/3.0}SupplementalDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="flightFiler" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="flightType" type="{http://www.fixm.aero/flight/3.0}TypeOfFlightType" /&gt;
 *       &lt;attribute name="remarks" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightType", propOrder = {
    "agreed",
    "aircraftDescription",
    "arrival",
    "controllingUnit",
    "dangerousGoods",
    "departure",
    "emergency",
    "enRoute",
    "enRouteDiversion",
    "extensions",
    "flightIdentification",
    "flightStatus",
    "gufi",
    "negotiating",
    "operator",
    "originator",
    "radioCommunicationFailure",
    "rankedTrajectories",
    "routeToRevisedDestination",
    "specialHandling",
    "supplementalData"
})
@XmlSeeAlso({
    TfmTfdmFlightType.class,
    NasFlightType.class
})
public class FlightType
    extends FeatureType
{

    protected TrajectoryRoutePairType agreed;
    protected AircraftType aircraftDescription;
    protected FlightArrivalType arrival;
    protected AtcUnitReferenceType controllingUnit;
    protected List<DangerousGoodsType> dangerousGoods;
    protected FlightDepartureType departure;
    protected FlightEmergencyType emergency;
    protected EnRouteType enRoute;
    protected EnRouteDiversionType enRouteDiversion;
    protected List<ExtensionType> extensions;
    protected FlightIdentificationType flightIdentification;
    protected FlightStatusType flightStatus;
    protected GloballyUniqueFlightIdentifierType gufi;
    protected TrajectoryRoutePairType negotiating;
    protected AircraftOperatorType operator;
    protected OriginatorType originator;
    protected RadioCommunicationFailureType radioCommunicationFailure;
    protected List<RankedTrajectoryType> rankedTrajectories;
    protected TrajectoryRoutePairType routeToRevisedDestination;
    @XmlList
    protected List<SpecialHandlingCodeType> specialHandling;
    protected SupplementalDataType supplementalData;
    @XmlAttribute(name = "flightFiler")
    protected String flightFiler;
    @XmlAttribute(name = "flightType")
    protected TypeOfFlightType flightType;
    @XmlAttribute(name = "remarks")
    protected String remarks;

    /**
     * Gets the value of the agreed property.
     * 
     * @return
     *     possible object is
     *     {@link TrajectoryRoutePairType }
     *     
     */
    public TrajectoryRoutePairType getAgreed() {
        return agreed;
    }

    /**
     * Sets the value of the agreed property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajectoryRoutePairType }
     *     
     */
    public void setAgreed(TrajectoryRoutePairType value) {
        this.agreed = value;
    }

    /**
     * Gets the value of the aircraftDescription property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftType }
     *     
     */
    public AircraftType getAircraftDescription() {
        return aircraftDescription;
    }

    /**
     * Sets the value of the aircraftDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftType }
     *     
     */
    public void setAircraftDescription(AircraftType value) {
        this.aircraftDescription = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link FlightArrivalType }
     *     
     */
    public FlightArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightArrivalType }
     *     
     */
    public void setArrival(FlightArrivalType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the controllingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AtcUnitReferenceType }
     *     
     */
    public AtcUnitReferenceType getControllingUnit() {
        return controllingUnit;
    }

    /**
     * Sets the value of the controllingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtcUnitReferenceType }
     *     
     */
    public void setControllingUnit(AtcUnitReferenceType value) {
        this.controllingUnit = value;
    }

    /**
     * Gets the value of the dangerousGoods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousGoods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousGoods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DangerousGoodsType }
     * 
     * 
     */
    public List<DangerousGoodsType> getDangerousGoods() {
        if (dangerousGoods == null) {
            dangerousGoods = new ArrayList<DangerousGoodsType>();
        }
        return this.dangerousGoods;
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDepartureType }
     *     
     */
    public FlightDepartureType getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDepartureType }
     *     
     */
    public void setDeparture(FlightDepartureType value) {
        this.departure = value;
    }

    /**
     * Gets the value of the emergency property.
     * 
     * @return
     *     possible object is
     *     {@link FlightEmergencyType }
     *     
     */
    public FlightEmergencyType getEmergency() {
        return emergency;
    }

    /**
     * Sets the value of the emergency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightEmergencyType }
     *     
     */
    public void setEmergency(FlightEmergencyType value) {
        this.emergency = value;
    }

    /**
     * Gets the value of the enRoute property.
     * 
     * @return
     *     possible object is
     *     {@link EnRouteType }
     *     
     */
    public EnRouteType getEnRoute() {
        return enRoute;
    }

    /**
     * Sets the value of the enRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnRouteType }
     *     
     */
    public void setEnRoute(EnRouteType value) {
        this.enRoute = value;
    }

    /**
     * Gets the value of the enRouteDiversion property.
     * 
     * @return
     *     possible object is
     *     {@link EnRouteDiversionType }
     *     
     */
    public EnRouteDiversionType getEnRouteDiversion() {
        return enRouteDiversion;
    }

    /**
     * Sets the value of the enRouteDiversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnRouteDiversionType }
     *     
     */
    public void setEnRouteDiversion(EnRouteDiversionType value) {
        this.enRouteDiversion = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<ExtensionType>();
        }
        return this.extensions;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link FlightIdentificationType }
     *     
     */
    public FlightIdentificationType getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightIdentificationType }
     *     
     */
    public void setFlightIdentification(FlightIdentificationType value) {
        this.flightIdentification = value;
    }

    /**
     * Gets the value of the flightStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FlightStatusType }
     *     
     */
    public FlightStatusType getFlightStatus() {
        return flightStatus;
    }

    /**
     * Sets the value of the flightStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightStatusType }
     *     
     */
    public void setFlightStatus(FlightStatusType value) {
        this.flightStatus = value;
    }

    /**
     * Gets the value of the gufi property.
     * 
     * @return
     *     possible object is
     *     {@link GloballyUniqueFlightIdentifierType }
     *     
     */
    public GloballyUniqueFlightIdentifierType getGufi() {
        return gufi;
    }

    /**
     * Sets the value of the gufi property.
     * 
     * @param value
     *     allowed object is
     *     {@link GloballyUniqueFlightIdentifierType }
     *     
     */
    public void setGufi(GloballyUniqueFlightIdentifierType value) {
        this.gufi = value;
    }

    /**
     * Gets the value of the negotiating property.
     * 
     * @return
     *     possible object is
     *     {@link TrajectoryRoutePairType }
     *     
     */
    public TrajectoryRoutePairType getNegotiating() {
        return negotiating;
    }

    /**
     * Sets the value of the negotiating property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajectoryRoutePairType }
     *     
     */
    public void setNegotiating(TrajectoryRoutePairType value) {
        this.negotiating = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftOperatorType }
     *     
     */
    public AircraftOperatorType getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftOperatorType }
     *     
     */
    public void setOperator(AircraftOperatorType value) {
        this.operator = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorType }
     *     
     */
    public OriginatorType getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorType }
     *     
     */
    public void setOriginator(OriginatorType value) {
        this.originator = value;
    }

    /**
     * Gets the value of the radioCommunicationFailure property.
     * 
     * @return
     *     possible object is
     *     {@link RadioCommunicationFailureType }
     *     
     */
    public RadioCommunicationFailureType getRadioCommunicationFailure() {
        return radioCommunicationFailure;
    }

    /**
     * Sets the value of the radioCommunicationFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioCommunicationFailureType }
     *     
     */
    public void setRadioCommunicationFailure(RadioCommunicationFailureType value) {
        this.radioCommunicationFailure = value;
    }

    /**
     * Gets the value of the rankedTrajectories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rankedTrajectories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRankedTrajectories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RankedTrajectoryType }
     * 
     * 
     */
    public List<RankedTrajectoryType> getRankedTrajectories() {
        if (rankedTrajectories == null) {
            rankedTrajectories = new ArrayList<RankedTrajectoryType>();
        }
        return this.rankedTrajectories;
    }

    /**
     * Gets the value of the routeToRevisedDestination property.
     * 
     * @return
     *     possible object is
     *     {@link TrajectoryRoutePairType }
     *     
     */
    public TrajectoryRoutePairType getRouteToRevisedDestination() {
        return routeToRevisedDestination;
    }

    /**
     * Sets the value of the routeToRevisedDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajectoryRoutePairType }
     *     
     */
    public void setRouteToRevisedDestination(TrajectoryRoutePairType value) {
        this.routeToRevisedDestination = value;
    }

    /**
     * Gets the value of the specialHandling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialHandling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialHandlingCodeType }
     * 
     * 
     */
    public List<SpecialHandlingCodeType> getSpecialHandling() {
        if (specialHandling == null) {
            specialHandling = new ArrayList<SpecialHandlingCodeType>();
        }
        return this.specialHandling;
    }

    /**
     * Gets the value of the supplementalData property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementalDataType }
     *     
     */
    public SupplementalDataType getSupplementalData() {
        return supplementalData;
    }

    /**
     * Sets the value of the supplementalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementalDataType }
     *     
     */
    public void setSupplementalData(SupplementalDataType value) {
        this.supplementalData = value;
    }

    /**
     * Gets the value of the flightFiler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightFiler() {
        return flightFiler;
    }

    /**
     * Sets the value of the flightFiler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightFiler(String value) {
        this.flightFiler = value;
    }

    /**
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFlightType }
     *     
     */
    public TypeOfFlightType getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFlightType }
     *     
     */
    public void setFlightType(TypeOfFlightType value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

}
