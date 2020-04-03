//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.ficommonmessages.FlightContainerType;
import us.gov.dot.faa.atm.tfm.ficommonmessages.MilesInTrailRestrictionType;
import us.gov.dot.faa.atm.tfm.ficommonmessages.RerouteAdvisoryListType;
import us.gov.dot.faa.atm.tfm.ficommonmessages.RerouteGeneralDataType;
import us.gov.dot.faa.atm.tfm.ficommonmessages.SegmentDataType;


/**
 * Reroute message data.
 * 
 * <p>Java class for rerouteMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rerouteMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rerouteGeneralData" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}rerouteGeneralDataType"/&gt;
 *         &lt;element name="rerouteRouteData"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="rerouteSegmentData" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}segmentDataType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rerouteFlightList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="lastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="flightContainer" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}flightContainerType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rerouteAdvisoryList" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}rerouteAdvisoryListType" minOccurs="0"/&gt;
 *         &lt;element name="rerouteMitRestrictionList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="milesInTrailRestriction" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}milesInTrailRestrictionType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "rerouteMessageType", propOrder = {
    "rerouteGeneralData",
    "rerouteRouteData",
    "rerouteFlightList",
    "rerouteAdvisoryList",
    "rerouteMitRestrictionList"
})
public class RerouteMessageType {

    @XmlElement(required = true)
    protected RerouteGeneralDataType rerouteGeneralData;
    @XmlElement(required = true)
    protected RerouteMessageType.RerouteRouteData rerouteRouteData;
    protected RerouteMessageType.RerouteFlightList rerouteFlightList;
    protected RerouteAdvisoryListType rerouteAdvisoryList;
    protected RerouteMessageType.RerouteMitRestrictionList rerouteMitRestrictionList;

    /**
     * Gets the value of the rerouteGeneralData property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteGeneralDataType }
     *     
     */
    public RerouteGeneralDataType getRerouteGeneralData() {
        return rerouteGeneralData;
    }

    /**
     * Sets the value of the rerouteGeneralData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteGeneralDataType }
     *     
     */
    public void setRerouteGeneralData(RerouteGeneralDataType value) {
        this.rerouteGeneralData = value;
    }

    /**
     * Gets the value of the rerouteRouteData property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteMessageType.RerouteRouteData }
     *     
     */
    public RerouteMessageType.RerouteRouteData getRerouteRouteData() {
        return rerouteRouteData;
    }

    /**
     * Sets the value of the rerouteRouteData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteMessageType.RerouteRouteData }
     *     
     */
    public void setRerouteRouteData(RerouteMessageType.RerouteRouteData value) {
        this.rerouteRouteData = value;
    }

    /**
     * Gets the value of the rerouteFlightList property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteMessageType.RerouteFlightList }
     *     
     */
    public RerouteMessageType.RerouteFlightList getRerouteFlightList() {
        return rerouteFlightList;
    }

    /**
     * Sets the value of the rerouteFlightList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteMessageType.RerouteFlightList }
     *     
     */
    public void setRerouteFlightList(RerouteMessageType.RerouteFlightList value) {
        this.rerouteFlightList = value;
    }

    /**
     * Gets the value of the rerouteAdvisoryList property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteAdvisoryListType }
     *     
     */
    public RerouteAdvisoryListType getRerouteAdvisoryList() {
        return rerouteAdvisoryList;
    }

    /**
     * Sets the value of the rerouteAdvisoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteAdvisoryListType }
     *     
     */
    public void setRerouteAdvisoryList(RerouteAdvisoryListType value) {
        this.rerouteAdvisoryList = value;
    }

    /**
     * Gets the value of the rerouteMitRestrictionList property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteMessageType.RerouteMitRestrictionList }
     *     
     */
    public RerouteMessageType.RerouteMitRestrictionList getRerouteMitRestrictionList() {
        return rerouteMitRestrictionList;
    }

    /**
     * Sets the value of the rerouteMitRestrictionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteMessageType.RerouteMitRestrictionList }
     *     
     */
    public void setRerouteMitRestrictionList(RerouteMessageType.RerouteMitRestrictionList value) {
        this.rerouteMitRestrictionList = value;
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
     *         &lt;element name="lastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="flightContainer" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}flightContainerType" maxOccurs="unbounded"/&gt;
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
        "lastUpdated",
        "flightContainer"
    })
    public static class RerouteFlightList {

        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar lastUpdated;
        @XmlElement(required = true)
        protected List<FlightContainerType> flightContainer;

        /**
         * Gets the value of the lastUpdated property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getLastUpdated() {
            return lastUpdated;
        }

        /**
         * Sets the value of the lastUpdated property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setLastUpdated(XMLGregorianCalendar value) {
            this.lastUpdated = value;
        }

        /**
         * Gets the value of the flightContainer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightContainer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightContainer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightContainerType }
         * 
         * 
         */
        public List<FlightContainerType> getFlightContainer() {
            if (flightContainer == null) {
                flightContainer = new ArrayList<FlightContainerType>();
            }
            return this.flightContainer;
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
     *         &lt;element name="milesInTrailRestriction" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}milesInTrailRestrictionType" maxOccurs="unbounded"/&gt;
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
        "milesInTrailRestriction"
    })
    public static class RerouteMitRestrictionList {

        @XmlElement(required = true)
        protected List<MilesInTrailRestrictionType> milesInTrailRestriction;

        /**
         * Gets the value of the milesInTrailRestriction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the milesInTrailRestriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMilesInTrailRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MilesInTrailRestrictionType }
         * 
         * 
         */
        public List<MilesInTrailRestrictionType> getMilesInTrailRestriction() {
            if (milesInTrailRestriction == null) {
                milesInTrailRestriction = new ArrayList<MilesInTrailRestrictionType>();
            }
            return this.milesInTrailRestriction;
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
     *         &lt;element name="rerouteSegmentData" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}segmentDataType" maxOccurs="unbounded"/&gt;
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
        "rerouteSegmentData"
    })
    public static class RerouteRouteData {

        @XmlElement(required = true)
        protected List<SegmentDataType> rerouteSegmentData;

        /**
         * Gets the value of the rerouteSegmentData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rerouteSegmentData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRerouteSegmentData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentDataType }
         * 
         * 
         */
        public List<SegmentDataType> getRerouteSegmentData() {
            if (rerouteSegmentData == null) {
                rerouteSegmentData = new ArrayList<SegmentDataType>();
            }
            return this.rerouteSegmentData;
        }

    }

}
