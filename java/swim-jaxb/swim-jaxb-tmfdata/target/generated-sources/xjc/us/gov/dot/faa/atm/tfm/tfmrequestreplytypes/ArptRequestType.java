//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a request for flight data associated with an airport.
 * 
 * <p>Java class for arptRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arptRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="register"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="duration"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="airports"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="monType"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="AIRPORT_ARRIVALS"/&gt;
 *                                   &lt;enumeration value="AIRPORT_DEPARTURES"/&gt;
 *                                   &lt;enumeration value="AIRPORT_ALL"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="50"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="renew"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="duration"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="24"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="airports"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="monType"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="AIRPORT_ARRIVALS"/&gt;
 *                                   &lt;enumeration value="AIRPORT_DEPARTURES"/&gt;
 *                                   &lt;enumeration value="AIRPORT_ALL"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="50"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="deregister"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="airports"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="monType"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="AIRPORT_ARRIVALS"/&gt;
 *                                   &lt;enumeration value="AIRPORT_DEPARTURES"/&gt;
 *                                   &lt;enumeration value="AIRPORT_ALL"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="50"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arptRequestType", propOrder = {
    "register",
    "renew",
    "deregister"
})
public class ArptRequestType {

    protected ArptRequestType.Register register;
    protected ArptRequestType.Renew renew;
    protected ArptRequestType.Deregister deregister;

    /**
     * Gets the value of the register property.
     * 
     * @return
     *     possible object is
     *     {@link ArptRequestType.Register }
     *     
     */
    public ArptRequestType.Register getRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArptRequestType.Register }
     *     
     */
    public void setRegister(ArptRequestType.Register value) {
        this.register = value;
    }

    /**
     * Gets the value of the renew property.
     * 
     * @return
     *     possible object is
     *     {@link ArptRequestType.Renew }
     *     
     */
    public ArptRequestType.Renew getRenew() {
        return renew;
    }

    /**
     * Sets the value of the renew property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArptRequestType.Renew }
     *     
     */
    public void setRenew(ArptRequestType.Renew value) {
        this.renew = value;
    }

    /**
     * Gets the value of the deregister property.
     * 
     * @return
     *     possible object is
     *     {@link ArptRequestType.Deregister }
     *     
     */
    public ArptRequestType.Deregister getDeregister() {
        return deregister;
    }

    /**
     * Sets the value of the deregister property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArptRequestType.Deregister }
     *     
     */
    public void setDeregister(ArptRequestType.Deregister value) {
        this.deregister = value;
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
     *         &lt;element name="airports"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="monType"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="AIRPORT_ARRIVALS"/&gt;
     *                         &lt;enumeration value="AIRPORT_DEPARTURES"/&gt;
     *                         &lt;enumeration value="AIRPORT_ALL"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="50"/&gt;
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
    @XmlType(name = "", propOrder = {
        "airports"
    })
    public static class Deregister {

        @XmlElement(required = true)
        protected ArptRequestType.Deregister.Airports airports;

        /**
         * Gets the value of the airports property.
         * 
         * @return
         *     possible object is
         *     {@link ArptRequestType.Deregister.Airports }
         *     
         */
        public ArptRequestType.Deregister.Airports getAirports() {
            return airports;
        }

        /**
         * Sets the value of the airports property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArptRequestType.Deregister.Airports }
         *     
         */
        public void setAirports(ArptRequestType.Deregister.Airports value) {
            this.airports = value;
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
         *         &lt;element name="monType"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="AIRPORT_ARRIVALS"/&gt;
         *               &lt;enumeration value="AIRPORT_DEPARTURES"/&gt;
         *               &lt;enumeration value="AIRPORT_ALL"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="50"/&gt;
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
            "monType",
            "airport"
        })
        public static class Airports {

            @XmlElement(required = true)
            protected String monType;
            @XmlElement(required = true)
            protected List<String> airport;

            /**
             * Gets the value of the monType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMonType() {
                return monType;
            }

            /**
             * Sets the value of the monType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMonType(String value) {
                this.monType = value;
            }

            /**
             * Gets the value of the airport property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the airport property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAirport().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getAirport() {
                if (airport == null) {
                    airport = new ArrayList<String>();
                }
                return this.airport;
            }

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
     *         &lt;element name="duration"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="24"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="airports"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="monType"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="AIRPORT_ARRIVALS"/&gt;
     *                         &lt;enumeration value="AIRPORT_DEPARTURES"/&gt;
     *                         &lt;enumeration value="AIRPORT_ALL"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="50"/&gt;
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
    @XmlType(name = "", propOrder = {
        "duration",
        "airports"
    })
    public static class Register {

        protected int duration;
        @XmlElement(required = true)
        protected ArptRequestType.Register.Airports airports;

        /**
         * Gets the value of the duration property.
         * 
         */
        public int getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         */
        public void setDuration(int value) {
            this.duration = value;
        }

        /**
         * Gets the value of the airports property.
         * 
         * @return
         *     possible object is
         *     {@link ArptRequestType.Register.Airports }
         *     
         */
        public ArptRequestType.Register.Airports getAirports() {
            return airports;
        }

        /**
         * Sets the value of the airports property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArptRequestType.Register.Airports }
         *     
         */
        public void setAirports(ArptRequestType.Register.Airports value) {
            this.airports = value;
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
         *         &lt;element name="monType"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="AIRPORT_ARRIVALS"/&gt;
         *               &lt;enumeration value="AIRPORT_DEPARTURES"/&gt;
         *               &lt;enumeration value="AIRPORT_ALL"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="50"/&gt;
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
            "monType",
            "airport"
        })
        public static class Airports {

            @XmlElement(required = true)
            protected String monType;
            @XmlElement(required = true)
            protected List<String> airport;

            /**
             * Gets the value of the monType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMonType() {
                return monType;
            }

            /**
             * Sets the value of the monType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMonType(String value) {
                this.monType = value;
            }

            /**
             * Gets the value of the airport property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the airport property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAirport().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getAirport() {
                if (airport == null) {
                    airport = new ArrayList<String>();
                }
                return this.airport;
            }

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
     *         &lt;element name="duration"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="24"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="airports"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="monType"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="AIRPORT_ARRIVALS"/&gt;
     *                         &lt;enumeration value="AIRPORT_DEPARTURES"/&gt;
     *                         &lt;enumeration value="AIRPORT_ALL"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="50"/&gt;
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
    @XmlType(name = "", propOrder = {
        "duration",
        "airports"
    })
    public static class Renew {

        protected int duration;
        @XmlElement(required = true)
        protected ArptRequestType.Renew.Airports airports;

        /**
         * Gets the value of the duration property.
         * 
         */
        public int getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         */
        public void setDuration(int value) {
            this.duration = value;
        }

        /**
         * Gets the value of the airports property.
         * 
         * @return
         *     possible object is
         *     {@link ArptRequestType.Renew.Airports }
         *     
         */
        public ArptRequestType.Renew.Airports getAirports() {
            return airports;
        }

        /**
         * Sets the value of the airports property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArptRequestType.Renew.Airports }
         *     
         */
        public void setAirports(ArptRequestType.Renew.Airports value) {
            this.airports = value;
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
         *         &lt;element name="monType"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="AIRPORT_ARRIVALS"/&gt;
         *               &lt;enumeration value="AIRPORT_DEPARTURES"/&gt;
         *               &lt;enumeration value="AIRPORT_ALL"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="50"/&gt;
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
            "monType",
            "airport"
        })
        public static class Airports {

            @XmlElement(required = true)
            protected String monType;
            @XmlElement(required = true)
            protected List<String> airport;

            /**
             * Gets the value of the monType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMonType() {
                return monType;
            }

            /**
             * Sets the value of the monType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMonType(String value) {
                this.monType = value;
            }

            /**
             * Gets the value of the airport property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the airport property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAirport().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getAirport() {
                if (airport == null) {
                    airport = new ArrayList<String>();
                }
                return this.airport;
            }

        }

    }

}