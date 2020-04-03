//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.AircraftCategoryType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.CenterAirportListType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.TimePeriodType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.UserCategoryType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.WeightClassType;


/**
 * None, Any and All conditions list.
 * 
 * <p>Java class for anyAllConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="anyAllConditionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="departsAny" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}centerAirportListType" minOccurs="0"/&gt;
 *         &lt;element name="departsNone" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}centerAirportListType" minOccurs="0"/&gt;
 *         &lt;element name="arrivesAny" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}centerAirportListType" minOccurs="0"/&gt;
 *         &lt;element name="arrivesNone" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}centerAirportListType" minOccurs="0"/&gt;
 *         &lt;element name="traverseAny" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}traverseListType" minOccurs="0"/&gt;
 *         &lt;element name="traverseAll" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}traverseListType" minOccurs="0"/&gt;
 *         &lt;element name="traverseNone" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}traverseListType" minOccurs="0"/&gt;
 *         &lt;element name="useAirwayAny" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}useAirwayListType" minOccurs="0"/&gt;
 *         &lt;element name="useAirwayAll" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}useAirwayListType" minOccurs="0"/&gt;
 *         &lt;element name="useAirwayNone" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}useAirwayListType" minOccurs="0"/&gt;
 *         &lt;element name="locatedAny" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}locatedListType" minOccurs="0"/&gt;
 *         &lt;element name="locatedNone" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}locatedListType" minOccurs="0"/&gt;
 *         &lt;element name="typeAny" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}aircraftTypeListType" minOccurs="0"/&gt;
 *         &lt;element name="typeNone" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}aircraftTypeListType" minOccurs="0"/&gt;
 *         &lt;element name="remarksAny" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}remarksListType" minOccurs="0"/&gt;
 *         &lt;element name="remarksAll" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}remarksListType" minOccurs="0"/&gt;
 *         &lt;element name="remarksNone" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}remarksListType" minOccurs="0"/&gt;
 *         &lt;element name="headingIs" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}headingType" minOccurs="0"/&gt;
 *         &lt;element name="headingNot" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}headingType" minOccurs="0"/&gt;
 *         &lt;element name="aircraftIdAny" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}aircraftIdListType" minOccurs="0"/&gt;
 *         &lt;element name="aircraftIdNone" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}aircraftIdListType" minOccurs="0"/&gt;
 *         &lt;element name="flightLevel" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="upper"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                         &lt;maxInclusive value="999"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="lower"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                         &lt;maxInclusive value="999"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="aircraftCategoryAny" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="category" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}aircraftCategoryType" maxOccurs="3"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="weightClassAny" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="weightClass" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}weightClassType" maxOccurs="3"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="userCategoryAny" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="userCategory" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}userCategoryType" maxOccurs="5"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="status" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="ACTIVE"/&gt;
 *               &lt;enumeration value="PROPOSED"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rvsm" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="COMPLIANT"/&gt;
 *               &lt;enumeration value="NON-COMPLIANT"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="departureTimeRange" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}timePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="arrivalTimeRange" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}timePeriodType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anyAllConditionsType", propOrder = {

})
public class AnyAllConditionsType {

    protected CenterAirportListType departsAny;
    protected CenterAirportListType departsNone;
    protected CenterAirportListType arrivesAny;
    protected CenterAirportListType arrivesNone;
    protected TraverseListType traverseAny;
    protected TraverseListType traverseAll;
    protected TraverseListType traverseNone;
    protected UseAirwayListType useAirwayAny;
    protected UseAirwayListType useAirwayAll;
    protected UseAirwayListType useAirwayNone;
    protected LocatedListType locatedAny;
    protected LocatedListType locatedNone;
    protected AircraftTypeListType typeAny;
    protected AircraftTypeListType typeNone;
    protected RemarksListType remarksAny;
    protected RemarksListType remarksAll;
    protected RemarksListType remarksNone;
    protected HeadingType headingIs;
    protected HeadingType headingNot;
    protected AircraftIdListType aircraftIdAny;
    protected AircraftIdListType aircraftIdNone;
    protected AnyAllConditionsType.FlightLevel flightLevel;
    protected AnyAllConditionsType.AircraftCategoryAny aircraftCategoryAny;
    protected AnyAllConditionsType.WeightClassAny weightClassAny;
    protected AnyAllConditionsType.UserCategoryAny userCategoryAny;
    protected String status;
    protected String rvsm;
    protected TimePeriodType departureTimeRange;
    protected TimePeriodType arrivalTimeRange;

    /**
     * Gets the value of the departsAny property.
     * 
     * @return
     *     possible object is
     *     {@link CenterAirportListType }
     *     
     */
    public CenterAirportListType getDepartsAny() {
        return departsAny;
    }

    /**
     * Sets the value of the departsAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link CenterAirportListType }
     *     
     */
    public void setDepartsAny(CenterAirportListType value) {
        this.departsAny = value;
    }

    /**
     * Gets the value of the departsNone property.
     * 
     * @return
     *     possible object is
     *     {@link CenterAirportListType }
     *     
     */
    public CenterAirportListType getDepartsNone() {
        return departsNone;
    }

    /**
     * Sets the value of the departsNone property.
     * 
     * @param value
     *     allowed object is
     *     {@link CenterAirportListType }
     *     
     */
    public void setDepartsNone(CenterAirportListType value) {
        this.departsNone = value;
    }

    /**
     * Gets the value of the arrivesAny property.
     * 
     * @return
     *     possible object is
     *     {@link CenterAirportListType }
     *     
     */
    public CenterAirportListType getArrivesAny() {
        return arrivesAny;
    }

    /**
     * Sets the value of the arrivesAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link CenterAirportListType }
     *     
     */
    public void setArrivesAny(CenterAirportListType value) {
        this.arrivesAny = value;
    }

    /**
     * Gets the value of the arrivesNone property.
     * 
     * @return
     *     possible object is
     *     {@link CenterAirportListType }
     *     
     */
    public CenterAirportListType getArrivesNone() {
        return arrivesNone;
    }

    /**
     * Sets the value of the arrivesNone property.
     * 
     * @param value
     *     allowed object is
     *     {@link CenterAirportListType }
     *     
     */
    public void setArrivesNone(CenterAirportListType value) {
        this.arrivesNone = value;
    }

    /**
     * Gets the value of the traverseAny property.
     * 
     * @return
     *     possible object is
     *     {@link TraverseListType }
     *     
     */
    public TraverseListType getTraverseAny() {
        return traverseAny;
    }

    /**
     * Sets the value of the traverseAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraverseListType }
     *     
     */
    public void setTraverseAny(TraverseListType value) {
        this.traverseAny = value;
    }

    /**
     * Gets the value of the traverseAll property.
     * 
     * @return
     *     possible object is
     *     {@link TraverseListType }
     *     
     */
    public TraverseListType getTraverseAll() {
        return traverseAll;
    }

    /**
     * Sets the value of the traverseAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraverseListType }
     *     
     */
    public void setTraverseAll(TraverseListType value) {
        this.traverseAll = value;
    }

    /**
     * Gets the value of the traverseNone property.
     * 
     * @return
     *     possible object is
     *     {@link TraverseListType }
     *     
     */
    public TraverseListType getTraverseNone() {
        return traverseNone;
    }

    /**
     * Sets the value of the traverseNone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TraverseListType }
     *     
     */
    public void setTraverseNone(TraverseListType value) {
        this.traverseNone = value;
    }

    /**
     * Gets the value of the useAirwayAny property.
     * 
     * @return
     *     possible object is
     *     {@link UseAirwayListType }
     *     
     */
    public UseAirwayListType getUseAirwayAny() {
        return useAirwayAny;
    }

    /**
     * Sets the value of the useAirwayAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseAirwayListType }
     *     
     */
    public void setUseAirwayAny(UseAirwayListType value) {
        this.useAirwayAny = value;
    }

    /**
     * Gets the value of the useAirwayAll property.
     * 
     * @return
     *     possible object is
     *     {@link UseAirwayListType }
     *     
     */
    public UseAirwayListType getUseAirwayAll() {
        return useAirwayAll;
    }

    /**
     * Sets the value of the useAirwayAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseAirwayListType }
     *     
     */
    public void setUseAirwayAll(UseAirwayListType value) {
        this.useAirwayAll = value;
    }

    /**
     * Gets the value of the useAirwayNone property.
     * 
     * @return
     *     possible object is
     *     {@link UseAirwayListType }
     *     
     */
    public UseAirwayListType getUseAirwayNone() {
        return useAirwayNone;
    }

    /**
     * Sets the value of the useAirwayNone property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseAirwayListType }
     *     
     */
    public void setUseAirwayNone(UseAirwayListType value) {
        this.useAirwayNone = value;
    }

    /**
     * Gets the value of the locatedAny property.
     * 
     * @return
     *     possible object is
     *     {@link LocatedListType }
     *     
     */
    public LocatedListType getLocatedAny() {
        return locatedAny;
    }

    /**
     * Sets the value of the locatedAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatedListType }
     *     
     */
    public void setLocatedAny(LocatedListType value) {
        this.locatedAny = value;
    }

    /**
     * Gets the value of the locatedNone property.
     * 
     * @return
     *     possible object is
     *     {@link LocatedListType }
     *     
     */
    public LocatedListType getLocatedNone() {
        return locatedNone;
    }

    /**
     * Sets the value of the locatedNone property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatedListType }
     *     
     */
    public void setLocatedNone(LocatedListType value) {
        this.locatedNone = value;
    }

    /**
     * Gets the value of the typeAny property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftTypeListType }
     *     
     */
    public AircraftTypeListType getTypeAny() {
        return typeAny;
    }

    /**
     * Sets the value of the typeAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftTypeListType }
     *     
     */
    public void setTypeAny(AircraftTypeListType value) {
        this.typeAny = value;
    }

    /**
     * Gets the value of the typeNone property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftTypeListType }
     *     
     */
    public AircraftTypeListType getTypeNone() {
        return typeNone;
    }

    /**
     * Sets the value of the typeNone property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftTypeListType }
     *     
     */
    public void setTypeNone(AircraftTypeListType value) {
        this.typeNone = value;
    }

    /**
     * Gets the value of the remarksAny property.
     * 
     * @return
     *     possible object is
     *     {@link RemarksListType }
     *     
     */
    public RemarksListType getRemarksAny() {
        return remarksAny;
    }

    /**
     * Sets the value of the remarksAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarksListType }
     *     
     */
    public void setRemarksAny(RemarksListType value) {
        this.remarksAny = value;
    }

    /**
     * Gets the value of the remarksAll property.
     * 
     * @return
     *     possible object is
     *     {@link RemarksListType }
     *     
     */
    public RemarksListType getRemarksAll() {
        return remarksAll;
    }

    /**
     * Sets the value of the remarksAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarksListType }
     *     
     */
    public void setRemarksAll(RemarksListType value) {
        this.remarksAll = value;
    }

    /**
     * Gets the value of the remarksNone property.
     * 
     * @return
     *     possible object is
     *     {@link RemarksListType }
     *     
     */
    public RemarksListType getRemarksNone() {
        return remarksNone;
    }

    /**
     * Sets the value of the remarksNone property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarksListType }
     *     
     */
    public void setRemarksNone(RemarksListType value) {
        this.remarksNone = value;
    }

    /**
     * Gets the value of the headingIs property.
     * 
     * @return
     *     possible object is
     *     {@link HeadingType }
     *     
     */
    public HeadingType getHeadingIs() {
        return headingIs;
    }

    /**
     * Sets the value of the headingIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadingType }
     *     
     */
    public void setHeadingIs(HeadingType value) {
        this.headingIs = value;
    }

    /**
     * Gets the value of the headingNot property.
     * 
     * @return
     *     possible object is
     *     {@link HeadingType }
     *     
     */
    public HeadingType getHeadingNot() {
        return headingNot;
    }

    /**
     * Sets the value of the headingNot property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeadingType }
     *     
     */
    public void setHeadingNot(HeadingType value) {
        this.headingNot = value;
    }

    /**
     * Gets the value of the aircraftIdAny property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftIdListType }
     *     
     */
    public AircraftIdListType getAircraftIdAny() {
        return aircraftIdAny;
    }

    /**
     * Sets the value of the aircraftIdAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftIdListType }
     *     
     */
    public void setAircraftIdAny(AircraftIdListType value) {
        this.aircraftIdAny = value;
    }

    /**
     * Gets the value of the aircraftIdNone property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftIdListType }
     *     
     */
    public AircraftIdListType getAircraftIdNone() {
        return aircraftIdNone;
    }

    /**
     * Sets the value of the aircraftIdNone property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftIdListType }
     *     
     */
    public void setAircraftIdNone(AircraftIdListType value) {
        this.aircraftIdNone = value;
    }

    /**
     * Gets the value of the flightLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AnyAllConditionsType.FlightLevel }
     *     
     */
    public AnyAllConditionsType.FlightLevel getFlightLevel() {
        return flightLevel;
    }

    /**
     * Sets the value of the flightLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyAllConditionsType.FlightLevel }
     *     
     */
    public void setFlightLevel(AnyAllConditionsType.FlightLevel value) {
        this.flightLevel = value;
    }

    /**
     * Gets the value of the aircraftCategoryAny property.
     * 
     * @return
     *     possible object is
     *     {@link AnyAllConditionsType.AircraftCategoryAny }
     *     
     */
    public AnyAllConditionsType.AircraftCategoryAny getAircraftCategoryAny() {
        return aircraftCategoryAny;
    }

    /**
     * Sets the value of the aircraftCategoryAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyAllConditionsType.AircraftCategoryAny }
     *     
     */
    public void setAircraftCategoryAny(AnyAllConditionsType.AircraftCategoryAny value) {
        this.aircraftCategoryAny = value;
    }

    /**
     * Gets the value of the weightClassAny property.
     * 
     * @return
     *     possible object is
     *     {@link AnyAllConditionsType.WeightClassAny }
     *     
     */
    public AnyAllConditionsType.WeightClassAny getWeightClassAny() {
        return weightClassAny;
    }

    /**
     * Sets the value of the weightClassAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyAllConditionsType.WeightClassAny }
     *     
     */
    public void setWeightClassAny(AnyAllConditionsType.WeightClassAny value) {
        this.weightClassAny = value;
    }

    /**
     * Gets the value of the userCategoryAny property.
     * 
     * @return
     *     possible object is
     *     {@link AnyAllConditionsType.UserCategoryAny }
     *     
     */
    public AnyAllConditionsType.UserCategoryAny getUserCategoryAny() {
        return userCategoryAny;
    }

    /**
     * Sets the value of the userCategoryAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyAllConditionsType.UserCategoryAny }
     *     
     */
    public void setUserCategoryAny(AnyAllConditionsType.UserCategoryAny value) {
        this.userCategoryAny = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the rvsm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRvsm() {
        return rvsm;
    }

    /**
     * Sets the value of the rvsm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRvsm(String value) {
        this.rvsm = value;
    }

    /**
     * Gets the value of the departureTimeRange property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getDepartureTimeRange() {
        return departureTimeRange;
    }

    /**
     * Sets the value of the departureTimeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setDepartureTimeRange(TimePeriodType value) {
        this.departureTimeRange = value;
    }

    /**
     * Gets the value of the arrivalTimeRange property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getArrivalTimeRange() {
        return arrivalTimeRange;
    }

    /**
     * Sets the value of the arrivalTimeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setArrivalTimeRange(TimePeriodType value) {
        this.arrivalTimeRange = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="category" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}aircraftCategoryType" maxOccurs="3"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "category"
    })
    public static class AircraftCategoryAny {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected List<AircraftCategoryType> category;

        /**
         * Gets the value of the category property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the category property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AircraftCategoryType }
         * 
         * 
         */
        public List<AircraftCategoryType> getCategory() {
            if (category == null) {
                category = new ArrayList<AircraftCategoryType>();
            }
            return this.category;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="upper"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;minInclusive value="0"/&gt;
     *               &lt;maxInclusive value="999"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="lower"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;minInclusive value="0"/&gt;
     *               &lt;maxInclusive value="999"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "upper",
        "lower"
    })
    public static class FlightLevel {

        protected int upper;
        protected int lower;

        /**
         * Gets the value of the upper property.
         * 
         */
        public int getUpper() {
            return upper;
        }

        /**
         * Sets the value of the upper property.
         * 
         */
        public void setUpper(int value) {
            this.upper = value;
        }

        /**
         * Gets the value of the lower property.
         * 
         */
        public int getLower() {
            return lower;
        }

        /**
         * Sets the value of the lower property.
         * 
         */
        public void setLower(int value) {
            this.lower = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="userCategory" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}userCategoryType" maxOccurs="5"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userCategory"
    })
    public static class UserCategoryAny {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected List<UserCategoryType> userCategory;

        /**
         * Gets the value of the userCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserCategoryType }
         * 
         * 
         */
        public List<UserCategoryType> getUserCategory() {
            if (userCategory == null) {
                userCategory = new ArrayList<UserCategoryType>();
            }
            return this.userCategory;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="weightClass" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}weightClassType" maxOccurs="3"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "weightClass"
    })
    public static class WeightClassAny {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected List<WeightClassType> weightClass;

        /**
         * Gets the value of the weightClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the weightClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWeightClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WeightClassType }
         * 
         * 
         */
        public List<WeightClassType> getWeightClass() {
            if (weightClass == null) {
                weightClass = new ArrayList<WeightClassType>();
            }
            return this.weightClass;
        }

    }

}