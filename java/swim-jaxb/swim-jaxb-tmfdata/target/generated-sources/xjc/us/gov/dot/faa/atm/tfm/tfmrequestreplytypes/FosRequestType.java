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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.atm.tfm.ficommonmessages.FltIdType;
import us.gov.dot.faa.atm.tfm.ficommonmessages.SubModeType;
import us.gov.dot.faa.atm.tfm.ficommonmessages.TosType;


/**
 * Defines the FOS request Type.
 * 
 * <p>Java class for fosRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fosRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TOS_MESSAGE" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}tosType"/&gt;
 *         &lt;element name="TOS_REQ" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fltIdType"/&gt;
 *         &lt;element name="TRAJ_ASSIGN_REQ" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fltIdType"/&gt;
 *         &lt;element name="CTOP_SUB_REQ"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CTOP_NAME" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopNameType"/&gt;
 *                   &lt;element name="CTOP_SHORT_NAME" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopTmiIdType"/&gt;
 *                   &lt;element name="CTOP_SUB_MODE" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}subModeType"/&gt;
 *                   &lt;element name="FLIGHT_LIST"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FLIGHT" maxOccurs="500" minOccurs="2"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;all&gt;
 *                                       &lt;element name="UNIQUE_FLT_ID_DATA" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}commonCompositeFlightIdType"/&gt;
 *                                       &lt;element name="SLOT" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fltSlotType"/&gt;
 *                                     &lt;/all&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
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
@XmlType(name = "fosRequestType", propOrder = {
    "tosmessage",
    "tosreq",
    "trajassignreq",
    "ctopsubreq"
})
public class FosRequestType {

    @XmlElement(name = "TOS_MESSAGE")
    protected TosType tosmessage;
    @XmlElement(name = "TOS_REQ")
    protected FltIdType tosreq;
    @XmlElement(name = "TRAJ_ASSIGN_REQ")
    protected FltIdType trajassignreq;
    @XmlElement(name = "CTOP_SUB_REQ")
    protected FosRequestType.CTOPSUBREQ ctopsubreq;

    /**
     * Gets the value of the tosmessage property.
     * 
     * @return
     *     possible object is
     *     {@link TosType }
     *     
     */
    public TosType getTOSMESSAGE() {
        return tosmessage;
    }

    /**
     * Sets the value of the tosmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TosType }
     *     
     */
    public void setTOSMESSAGE(TosType value) {
        this.tosmessage = value;
    }

    /**
     * Gets the value of the tosreq property.
     * 
     * @return
     *     possible object is
     *     {@link FltIdType }
     *     
     */
    public FltIdType getTOSREQ() {
        return tosreq;
    }

    /**
     * Sets the value of the tosreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltIdType }
     *     
     */
    public void setTOSREQ(FltIdType value) {
        this.tosreq = value;
    }

    /**
     * Gets the value of the trajassignreq property.
     * 
     * @return
     *     possible object is
     *     {@link FltIdType }
     *     
     */
    public FltIdType getTRAJASSIGNREQ() {
        return trajassignreq;
    }

    /**
     * Sets the value of the trajassignreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltIdType }
     *     
     */
    public void setTRAJASSIGNREQ(FltIdType value) {
        this.trajassignreq = value;
    }

    /**
     * Gets the value of the ctopsubreq property.
     * 
     * @return
     *     possible object is
     *     {@link FosRequestType.CTOPSUBREQ }
     *     
     */
    public FosRequestType.CTOPSUBREQ getCTOPSUBREQ() {
        return ctopsubreq;
    }

    /**
     * Sets the value of the ctopsubreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link FosRequestType.CTOPSUBREQ }
     *     
     */
    public void setCTOPSUBREQ(FosRequestType.CTOPSUBREQ value) {
        this.ctopsubreq = value;
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
     *       &lt;all&gt;
     *         &lt;element name="CTOP_NAME" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopNameType"/&gt;
     *         &lt;element name="CTOP_SHORT_NAME" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopTmiIdType"/&gt;
     *         &lt;element name="CTOP_SUB_MODE" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}subModeType"/&gt;
     *         &lt;element name="FLIGHT_LIST"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FLIGHT" maxOccurs="500" minOccurs="2"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;all&gt;
     *                             &lt;element name="UNIQUE_FLT_ID_DATA" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}commonCompositeFlightIdType"/&gt;
     *                             &lt;element name="SLOT" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fltSlotType"/&gt;
     *                           &lt;/all&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class CTOPSUBREQ {

        @XmlElement(name = "CTOP_NAME", required = true)
        protected String ctopname;
        @XmlElement(name = "CTOP_SHORT_NAME", required = true)
        protected String ctopshortname;
        @XmlElement(name = "CTOP_SUB_MODE", required = true)
        @XmlSchemaType(name = "string")
        protected SubModeType ctopsubmode;
        @XmlElement(name = "FLIGHT_LIST", required = true)
        protected FosRequestType.CTOPSUBREQ.FLIGHTLIST flightlist;

        /**
         * Gets the value of the ctopname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTOPNAME() {
            return ctopname;
        }

        /**
         * Sets the value of the ctopname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTOPNAME(String value) {
            this.ctopname = value;
        }

        /**
         * Gets the value of the ctopshortname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTOPSHORTNAME() {
            return ctopshortname;
        }

        /**
         * Sets the value of the ctopshortname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTOPSHORTNAME(String value) {
            this.ctopshortname = value;
        }

        /**
         * Gets the value of the ctopsubmode property.
         * 
         * @return
         *     possible object is
         *     {@link SubModeType }
         *     
         */
        public SubModeType getCTOPSUBMODE() {
            return ctopsubmode;
        }

        /**
         * Sets the value of the ctopsubmode property.
         * 
         * @param value
         *     allowed object is
         *     {@link SubModeType }
         *     
         */
        public void setCTOPSUBMODE(SubModeType value) {
            this.ctopsubmode = value;
        }

        /**
         * Gets the value of the flightlist property.
         * 
         * @return
         *     possible object is
         *     {@link FosRequestType.CTOPSUBREQ.FLIGHTLIST }
         *     
         */
        public FosRequestType.CTOPSUBREQ.FLIGHTLIST getFLIGHTLIST() {
            return flightlist;
        }

        /**
         * Sets the value of the flightlist property.
         * 
         * @param value
         *     allowed object is
         *     {@link FosRequestType.CTOPSUBREQ.FLIGHTLIST }
         *     
         */
        public void setFLIGHTLIST(FosRequestType.CTOPSUBREQ.FLIGHTLIST value) {
            this.flightlist = value;
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
         *         &lt;element name="FLIGHT" maxOccurs="500" minOccurs="2"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;all&gt;
         *                   &lt;element name="UNIQUE_FLT_ID_DATA" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}commonCompositeFlightIdType"/&gt;
         *                   &lt;element name="SLOT" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fltSlotType"/&gt;
         *                 &lt;/all&gt;
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
            "flight"
        })
        public static class FLIGHTLIST {

            @XmlElement(name = "FLIGHT", required = true)
            protected List<FosRequestType.CTOPSUBREQ.FLIGHTLIST.FLIGHT> flight;

            /**
             * Gets the value of the flight property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flight property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFLIGHT().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FosRequestType.CTOPSUBREQ.FLIGHTLIST.FLIGHT }
             * 
             * 
             */
            public List<FosRequestType.CTOPSUBREQ.FLIGHTLIST.FLIGHT> getFLIGHT() {
                if (flight == null) {
                    flight = new ArrayList<FosRequestType.CTOPSUBREQ.FLIGHTLIST.FLIGHT>();
                }
                return this.flight;
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
             *       &lt;all&gt;
             *         &lt;element name="UNIQUE_FLT_ID_DATA" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}commonCompositeFlightIdType"/&gt;
             *         &lt;element name="SLOT" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fltSlotType"/&gt;
             *       &lt;/all&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {

            })
            public static class FLIGHT {

                @XmlElement(name = "UNIQUE_FLT_ID_DATA", required = true)
                protected CommonCompositeFlightIdType uniquefltiddata;
                @XmlElement(name = "SLOT", required = true)
                protected String slot;

                /**
                 * Gets the value of the uniquefltiddata property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CommonCompositeFlightIdType }
                 *     
                 */
                public CommonCompositeFlightIdType getUNIQUEFLTIDDATA() {
                    return uniquefltiddata;
                }

                /**
                 * Sets the value of the uniquefltiddata property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CommonCompositeFlightIdType }
                 *     
                 */
                public void setUNIQUEFLTIDDATA(CommonCompositeFlightIdType value) {
                    this.uniquefltiddata = value;
                }

                /**
                 * Gets the value of the slot property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSLOT() {
                    return slot;
                }

                /**
                 * Sets the value of the slot property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSLOT(String value) {
                    this.slot = value;
                }

            }

        }

    }

}
