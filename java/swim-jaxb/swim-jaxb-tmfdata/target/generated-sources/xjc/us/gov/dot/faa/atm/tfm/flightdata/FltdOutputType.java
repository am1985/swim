//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.flightdata;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.ArrivalInformationType;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.BeaconCodeInformationType;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.BoundaryCrossingUpdateType;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.DepartureInformationType;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.FlightPlanAmendmentType;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.FlightPlanCancellationType;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.FlightPlanType;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.NcsmControlInformationType;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.NcsmFlightCreateOrModifyInformationType;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.NcsmFlightRouteInformationType;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.NcsmFlightTimeInformationType;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.NcsmSectorsInformationType;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.OceanicReportType;
import us.gov.dot.faa.atm.tfm.flightdatacommonmessages.TrackInformationType;


/**
 * Defines the Flight Data message.
 * 
 * <p>Java class for fltdOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fltdOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="128"&gt;
 *         &lt;element name="fltdMessage"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:flightdata}fltdMessageType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="flightPlanInformation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}flightPlanType"/&gt;
 *                   &lt;element name="flightPlanAmendmentInformation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}flightPlanAmendmentType"/&gt;
 *                   &lt;element name="arrivalInformation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}arrivalInformationType"/&gt;
 *                   &lt;element name="beaconCodeInformation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}beaconCodeInformationType"/&gt;
 *                   &lt;element name="departureInformation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}departureInformationType"/&gt;
 *                   &lt;element name="flightPlanCancellation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}flightPlanCancellationType"/&gt;
 *                   &lt;element name="trackInformation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}trackInformationType"/&gt;
 *                   &lt;element name="boundaryCrossingUpdate" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}boundaryCrossingUpdateType"/&gt;
 *                   &lt;element name="oceanicReport" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}oceanicReportType"/&gt;
 *                   &lt;element name="ncsmFlightControl" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmControlInformationType"/&gt;
 *                   &lt;element name="ncsmFlightCreate" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmFlightCreateOrModifyInformationType"/&gt;
 *                   &lt;element name="ncsmFlightModify" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmFlightCreateOrModifyInformationType"/&gt;
 *                   &lt;element name="ncsmFlightScheduleActivate" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmFlightRouteInformationType"/&gt;
 *                   &lt;element name="ncsmFlightRoute" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmFlightRouteInformationType"/&gt;
 *                   &lt;element name="ncsmFlightSectors" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmSectorsInformationType"/&gt;
 *                   &lt;element name="ncsmFlightTimes" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmFlightTimeInformationType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="source" type="{urn:us:gov:dot:faa:atm:tfm:flightdata}sourceType" /&gt;
 *       &lt;attribute name="xmitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fltdOutputType", propOrder = {
    "fltdMessage"
})
public class FltdOutputType {

    @XmlElement(required = true)
    protected List<FltdOutputType.FltdMessage> fltdMessage;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "xmitTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xmitTime;

    /**
     * Gets the value of the fltdMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fltdMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFltdMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FltdOutputType.FltdMessage }
     * 
     * 
     */
    public List<FltdOutputType.FltdMessage> getFltdMessage() {
        if (fltdMessage == null) {
            fltdMessage = new ArrayList<FltdOutputType.FltdMessage>();
        }
        return this.fltdMessage;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the xmitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXmitTime() {
        return xmitTime;
    }

    /**
     * Sets the value of the xmitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXmitTime(XMLGregorianCalendar value) {
        this.xmitTime = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:flightdata}fltdMessageType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="flightPlanInformation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}flightPlanType"/&gt;
     *         &lt;element name="flightPlanAmendmentInformation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}flightPlanAmendmentType"/&gt;
     *         &lt;element name="arrivalInformation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}arrivalInformationType"/&gt;
     *         &lt;element name="beaconCodeInformation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}beaconCodeInformationType"/&gt;
     *         &lt;element name="departureInformation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}departureInformationType"/&gt;
     *         &lt;element name="flightPlanCancellation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}flightPlanCancellationType"/&gt;
     *         &lt;element name="trackInformation" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}trackInformationType"/&gt;
     *         &lt;element name="boundaryCrossingUpdate" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}boundaryCrossingUpdateType"/&gt;
     *         &lt;element name="oceanicReport" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}oceanicReportType"/&gt;
     *         &lt;element name="ncsmFlightControl" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmControlInformationType"/&gt;
     *         &lt;element name="ncsmFlightCreate" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmFlightCreateOrModifyInformationType"/&gt;
     *         &lt;element name="ncsmFlightModify" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmFlightCreateOrModifyInformationType"/&gt;
     *         &lt;element name="ncsmFlightScheduleActivate" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmFlightRouteInformationType"/&gt;
     *         &lt;element name="ncsmFlightRoute" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmFlightRouteInformationType"/&gt;
     *         &lt;element name="ncsmFlightSectors" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmSectorsInformationType"/&gt;
     *         &lt;element name="ncsmFlightTimes" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmFlightTimeInformationType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightPlanInformation",
        "flightPlanAmendmentInformation",
        "arrivalInformation",
        "beaconCodeInformation",
        "departureInformation",
        "flightPlanCancellation",
        "trackInformation",
        "boundaryCrossingUpdate",
        "oceanicReport",
        "ncsmFlightControl",
        "ncsmFlightCreate",
        "ncsmFlightModify",
        "ncsmFlightScheduleActivate",
        "ncsmFlightRoute",
        "ncsmFlightSectors",
        "ncsmFlightTimes"
    })
    public static class FltdMessage
        extends FltdMessageType
    {

        protected FlightPlanType flightPlanInformation;
        protected FlightPlanAmendmentType flightPlanAmendmentInformation;
        protected ArrivalInformationType arrivalInformation;
        protected BeaconCodeInformationType beaconCodeInformation;
        protected DepartureInformationType departureInformation;
        protected FlightPlanCancellationType flightPlanCancellation;
        protected TrackInformationType trackInformation;
        protected BoundaryCrossingUpdateType boundaryCrossingUpdate;
        protected OceanicReportType oceanicReport;
        protected NcsmControlInformationType ncsmFlightControl;
        protected NcsmFlightCreateOrModifyInformationType ncsmFlightCreate;
        protected NcsmFlightCreateOrModifyInformationType ncsmFlightModify;
        protected NcsmFlightRouteInformationType ncsmFlightScheduleActivate;
        protected NcsmFlightRouteInformationType ncsmFlightRoute;
        protected NcsmSectorsInformationType ncsmFlightSectors;
        protected NcsmFlightTimeInformationType ncsmFlightTimes;

        /**
         * Gets the value of the flightPlanInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPlanType }
         *     
         */
        public FlightPlanType getFlightPlanInformation() {
            return flightPlanInformation;
        }

        /**
         * Sets the value of the flightPlanInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPlanType }
         *     
         */
        public void setFlightPlanInformation(FlightPlanType value) {
            this.flightPlanInformation = value;
        }

        /**
         * Gets the value of the flightPlanAmendmentInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPlanAmendmentType }
         *     
         */
        public FlightPlanAmendmentType getFlightPlanAmendmentInformation() {
            return flightPlanAmendmentInformation;
        }

        /**
         * Sets the value of the flightPlanAmendmentInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPlanAmendmentType }
         *     
         */
        public void setFlightPlanAmendmentInformation(FlightPlanAmendmentType value) {
            this.flightPlanAmendmentInformation = value;
        }

        /**
         * Gets the value of the arrivalInformation property.
         * 
         * @return
         *     possible object is
         *     {@link ArrivalInformationType }
         *     
         */
        public ArrivalInformationType getArrivalInformation() {
            return arrivalInformation;
        }

        /**
         * Sets the value of the arrivalInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrivalInformationType }
         *     
         */
        public void setArrivalInformation(ArrivalInformationType value) {
            this.arrivalInformation = value;
        }

        /**
         * Gets the value of the beaconCodeInformation property.
         * 
         * @return
         *     possible object is
         *     {@link BeaconCodeInformationType }
         *     
         */
        public BeaconCodeInformationType getBeaconCodeInformation() {
            return beaconCodeInformation;
        }

        /**
         * Sets the value of the beaconCodeInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link BeaconCodeInformationType }
         *     
         */
        public void setBeaconCodeInformation(BeaconCodeInformationType value) {
            this.beaconCodeInformation = value;
        }

        /**
         * Gets the value of the departureInformation property.
         * 
         * @return
         *     possible object is
         *     {@link DepartureInformationType }
         *     
         */
        public DepartureInformationType getDepartureInformation() {
            return departureInformation;
        }

        /**
         * Sets the value of the departureInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link DepartureInformationType }
         *     
         */
        public void setDepartureInformation(DepartureInformationType value) {
            this.departureInformation = value;
        }

        /**
         * Gets the value of the flightPlanCancellation property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPlanCancellationType }
         *     
         */
        public FlightPlanCancellationType getFlightPlanCancellation() {
            return flightPlanCancellation;
        }

        /**
         * Sets the value of the flightPlanCancellation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPlanCancellationType }
         *     
         */
        public void setFlightPlanCancellation(FlightPlanCancellationType value) {
            this.flightPlanCancellation = value;
        }

        /**
         * Gets the value of the trackInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TrackInformationType }
         *     
         */
        public TrackInformationType getTrackInformation() {
            return trackInformation;
        }

        /**
         * Sets the value of the trackInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TrackInformationType }
         *     
         */
        public void setTrackInformation(TrackInformationType value) {
            this.trackInformation = value;
        }

        /**
         * Gets the value of the boundaryCrossingUpdate property.
         * 
         * @return
         *     possible object is
         *     {@link BoundaryCrossingUpdateType }
         *     
         */
        public BoundaryCrossingUpdateType getBoundaryCrossingUpdate() {
            return boundaryCrossingUpdate;
        }

        /**
         * Sets the value of the boundaryCrossingUpdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BoundaryCrossingUpdateType }
         *     
         */
        public void setBoundaryCrossingUpdate(BoundaryCrossingUpdateType value) {
            this.boundaryCrossingUpdate = value;
        }

        /**
         * Gets the value of the oceanicReport property.
         * 
         * @return
         *     possible object is
         *     {@link OceanicReportType }
         *     
         */
        public OceanicReportType getOceanicReport() {
            return oceanicReport;
        }

        /**
         * Sets the value of the oceanicReport property.
         * 
         * @param value
         *     allowed object is
         *     {@link OceanicReportType }
         *     
         */
        public void setOceanicReport(OceanicReportType value) {
            this.oceanicReport = value;
        }

        /**
         * Gets the value of the ncsmFlightControl property.
         * 
         * @return
         *     possible object is
         *     {@link NcsmControlInformationType }
         *     
         */
        public NcsmControlInformationType getNcsmFlightControl() {
            return ncsmFlightControl;
        }

        /**
         * Sets the value of the ncsmFlightControl property.
         * 
         * @param value
         *     allowed object is
         *     {@link NcsmControlInformationType }
         *     
         */
        public void setNcsmFlightControl(NcsmControlInformationType value) {
            this.ncsmFlightControl = value;
        }

        /**
         * Gets the value of the ncsmFlightCreate property.
         * 
         * @return
         *     possible object is
         *     {@link NcsmFlightCreateOrModifyInformationType }
         *     
         */
        public NcsmFlightCreateOrModifyInformationType getNcsmFlightCreate() {
            return ncsmFlightCreate;
        }

        /**
         * Sets the value of the ncsmFlightCreate property.
         * 
         * @param value
         *     allowed object is
         *     {@link NcsmFlightCreateOrModifyInformationType }
         *     
         */
        public void setNcsmFlightCreate(NcsmFlightCreateOrModifyInformationType value) {
            this.ncsmFlightCreate = value;
        }

        /**
         * Gets the value of the ncsmFlightModify property.
         * 
         * @return
         *     possible object is
         *     {@link NcsmFlightCreateOrModifyInformationType }
         *     
         */
        public NcsmFlightCreateOrModifyInformationType getNcsmFlightModify() {
            return ncsmFlightModify;
        }

        /**
         * Sets the value of the ncsmFlightModify property.
         * 
         * @param value
         *     allowed object is
         *     {@link NcsmFlightCreateOrModifyInformationType }
         *     
         */
        public void setNcsmFlightModify(NcsmFlightCreateOrModifyInformationType value) {
            this.ncsmFlightModify = value;
        }

        /**
         * Gets the value of the ncsmFlightScheduleActivate property.
         * 
         * @return
         *     possible object is
         *     {@link NcsmFlightRouteInformationType }
         *     
         */
        public NcsmFlightRouteInformationType getNcsmFlightScheduleActivate() {
            return ncsmFlightScheduleActivate;
        }

        /**
         * Sets the value of the ncsmFlightScheduleActivate property.
         * 
         * @param value
         *     allowed object is
         *     {@link NcsmFlightRouteInformationType }
         *     
         */
        public void setNcsmFlightScheduleActivate(NcsmFlightRouteInformationType value) {
            this.ncsmFlightScheduleActivate = value;
        }

        /**
         * Gets the value of the ncsmFlightRoute property.
         * 
         * @return
         *     possible object is
         *     {@link NcsmFlightRouteInformationType }
         *     
         */
        public NcsmFlightRouteInformationType getNcsmFlightRoute() {
            return ncsmFlightRoute;
        }

        /**
         * Sets the value of the ncsmFlightRoute property.
         * 
         * @param value
         *     allowed object is
         *     {@link NcsmFlightRouteInformationType }
         *     
         */
        public void setNcsmFlightRoute(NcsmFlightRouteInformationType value) {
            this.ncsmFlightRoute = value;
        }

        /**
         * Gets the value of the ncsmFlightSectors property.
         * 
         * @return
         *     possible object is
         *     {@link NcsmSectorsInformationType }
         *     
         */
        public NcsmSectorsInformationType getNcsmFlightSectors() {
            return ncsmFlightSectors;
        }

        /**
         * Sets the value of the ncsmFlightSectors property.
         * 
         * @param value
         *     allowed object is
         *     {@link NcsmSectorsInformationType }
         *     
         */
        public void setNcsmFlightSectors(NcsmSectorsInformationType value) {
            this.ncsmFlightSectors = value;
        }

        /**
         * Gets the value of the ncsmFlightTimes property.
         * 
         * @return
         *     possible object is
         *     {@link NcsmFlightTimeInformationType }
         *     
         */
        public NcsmFlightTimeInformationType getNcsmFlightTimes() {
            return ncsmFlightTimes;
        }

        /**
         * Sets the value of the ncsmFlightTimes property.
         * 
         * @param value
         *     allowed object is
         *     {@link NcsmFlightTimeInformationType }
         *     
         */
        public void setNcsmFlightTimes(NcsmFlightTimeInformationType value) {
            this.ncsmFlightTimes = value;
        }

    }

}
