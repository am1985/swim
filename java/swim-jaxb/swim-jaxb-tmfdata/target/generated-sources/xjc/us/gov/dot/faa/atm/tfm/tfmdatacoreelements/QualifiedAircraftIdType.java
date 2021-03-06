//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The qualifiedAircraftIdType describes the combination of elements contained within a flight plan, which together can be used to more accurately identify and particular flight.
 * 
 * <p>Java class for qualifiedAircraftIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="qualifiedAircraftIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aircraftId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType"/&gt;
 *         &lt;element name="computerId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flightComputerIdType" minOccurs="0"/&gt;
 *         &lt;element name="gufi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="igtd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="departurePoint" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixType" minOccurs="0"/&gt;
 *                   &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="facilityId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="arrivalPoint" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixType" minOccurs="0"/&gt;
 *                   &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="facilityId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="flightClass" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flightClassType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qualifiedAircraftIdType", propOrder = {
    "aircraftId",
    "computerId",
    "gufi",
    "igtd",
    "departurePoint",
    "arrivalPoint"
})
public class QualifiedAircraftIdType {

    @XmlElement(required = true)
    protected String aircraftId;
    protected FlightComputerIdType computerId;
    protected String gufi;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar igtd;
    protected QualifiedAircraftIdType.DeparturePoint departurePoint;
    protected QualifiedAircraftIdType.ArrivalPoint arrivalPoint;
    @XmlAttribute(name = "flightClass")
    protected FlightClassType flightClass;

    /**
     * Gets the value of the aircraftId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftId() {
        return aircraftId;
    }

    /**
     * Sets the value of the aircraftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftId(String value) {
        this.aircraftId = value;
    }

    /**
     * Gets the value of the computerId property.
     * 
     * @return
     *     possible object is
     *     {@link FlightComputerIdType }
     *     
     */
    public FlightComputerIdType getComputerId() {
        return computerId;
    }

    /**
     * Sets the value of the computerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightComputerIdType }
     *     
     */
    public void setComputerId(FlightComputerIdType value) {
        this.computerId = value;
    }

    /**
     * Gets the value of the gufi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGufi() {
        return gufi;
    }

    /**
     * Sets the value of the gufi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGufi(String value) {
        this.gufi = value;
    }

    /**
     * Gets the value of the igtd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIgtd() {
        return igtd;
    }

    /**
     * Sets the value of the igtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIgtd(XMLGregorianCalendar value) {
        this.igtd = value;
    }

    /**
     * Gets the value of the departurePoint property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedAircraftIdType.DeparturePoint }
     *     
     */
    public QualifiedAircraftIdType.DeparturePoint getDeparturePoint() {
        return departurePoint;
    }

    /**
     * Sets the value of the departurePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedAircraftIdType.DeparturePoint }
     *     
     */
    public void setDeparturePoint(QualifiedAircraftIdType.DeparturePoint value) {
        this.departurePoint = value;
    }

    /**
     * Gets the value of the arrivalPoint property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedAircraftIdType.ArrivalPoint }
     *     
     */
    public QualifiedAircraftIdType.ArrivalPoint getArrivalPoint() {
        return arrivalPoint;
    }

    /**
     * Sets the value of the arrivalPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedAircraftIdType.ArrivalPoint }
     *     
     */
    public void setArrivalPoint(QualifiedAircraftIdType.ArrivalPoint value) {
        this.arrivalPoint = value;
    }

    /**
     * Gets the value of the flightClass property.
     * 
     * @return
     *     possible object is
     *     {@link FlightClassType }
     *     
     */
    public FlightClassType getFlightClass() {
        return flightClass;
    }

    /**
     * Sets the value of the flightClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightClassType }
     *     
     */
    public void setFlightClass(FlightClassType value) {
        this.flightClass = value;
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
     *         &lt;element name="fix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixType" minOccurs="0"/&gt;
     *         &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="facilityId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fix",
        "airport"
    })
    public static class ArrivalPoint {

        protected FixType fix;
        protected String airport;
        @XmlAttribute(name = "facilityId")
        protected String facilityId;

        /**
         * Gets the value of the fix property.
         * 
         * @return
         *     possible object is
         *     {@link FixType }
         *     
         */
        public FixType getFix() {
            return fix;
        }

        /**
         * Sets the value of the fix property.
         * 
         * @param value
         *     allowed object is
         *     {@link FixType }
         *     
         */
        public void setFix(FixType value) {
            this.fix = value;
        }

        /**
         * Gets the value of the airport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirport() {
            return airport;
        }

        /**
         * Sets the value of the airport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirport(String value) {
            this.airport = value;
        }

        /**
         * Gets the value of the facilityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacilityId() {
            return facilityId;
        }

        /**
         * Sets the value of the facilityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacilityId(String value) {
            this.facilityId = value;
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
     *         &lt;element name="fix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixType" minOccurs="0"/&gt;
     *         &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="facilityId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fix",
        "airport"
    })
    public static class DeparturePoint {

        protected FixType fix;
        protected String airport;
        @XmlAttribute(name = "facilityId")
        protected String facilityId;

        /**
         * Gets the value of the fix property.
         * 
         * @return
         *     possible object is
         *     {@link FixType }
         *     
         */
        public FixType getFix() {
            return fix;
        }

        /**
         * Sets the value of the fix property.
         * 
         * @param value
         *     allowed object is
         *     {@link FixType }
         *     
         */
        public void setFix(FixType value) {
            this.fix = value;
        }

        /**
         * Gets the value of the airport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirport() {
            return airport;
        }

        /**
         * Sets the value of the airport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirport(String value) {
            this.airport = value;
        }

        /**
         * Gets the value of the facilityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacilityId() {
            return facilityId;
        }

        /**
         * Sets the value of the facilityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacilityId(String value) {
            this.facilityId = value;
        }

    }

}
