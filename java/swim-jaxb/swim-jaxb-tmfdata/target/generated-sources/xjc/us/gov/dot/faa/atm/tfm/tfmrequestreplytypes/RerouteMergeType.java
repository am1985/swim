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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.TmiType;


/**
 * <p>Java class for rerouteMergeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rerouteMergeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="optimizeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ctrTargetRte"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="targetRteText" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteRouteType"/&gt;
 *                   &lt;element name="targetRteProtectedSegment" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}protectedSegmentType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tmiId" maxOccurs="25"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="mergeFlight" maxOccurs="25"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="flightIdfr" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}idfrType"/&gt;
 *                             &lt;element name="gufi" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}gufiType"/&gt;
 *                             &lt;element name="baseRteText" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteRouteType"/&gt;
 *                             &lt;element name="protectedSegment" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}protectedSegmentType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="tmiId" use="required" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}tmiIdType" /&gt;
 *                 &lt;attribute name="tmiType" use="required" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}tmiType" /&gt;
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
@XmlType(name = "rerouteMergeType", propOrder = {
    "optimizeInd",
    "ctrTargetRte",
    "tmiId"
})
public class RerouteMergeType {

    protected Boolean optimizeInd;
    @XmlElement(required = true)
    protected RerouteMergeType.CtrTargetRte ctrTargetRte;
    @XmlElement(required = true)
    protected List<RerouteMergeType.TmiId> tmiId;

    /**
     * Gets the value of the optimizeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptimizeInd() {
        return optimizeInd;
    }

    /**
     * Sets the value of the optimizeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimizeInd(Boolean value) {
        this.optimizeInd = value;
    }

    /**
     * Gets the value of the ctrTargetRte property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteMergeType.CtrTargetRte }
     *     
     */
    public RerouteMergeType.CtrTargetRte getCtrTargetRte() {
        return ctrTargetRte;
    }

    /**
     * Sets the value of the ctrTargetRte property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteMergeType.CtrTargetRte }
     *     
     */
    public void setCtrTargetRte(RerouteMergeType.CtrTargetRte value) {
        this.ctrTargetRte = value;
    }

    /**
     * Gets the value of the tmiId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmiId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTmiId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RerouteMergeType.TmiId }
     * 
     * 
     */
    public List<RerouteMergeType.TmiId> getTmiId() {
        if (tmiId == null) {
            tmiId = new ArrayList<RerouteMergeType.TmiId>();
        }
        return this.tmiId;
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
     *         &lt;element name="targetRteText" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteRouteType"/&gt;
     *         &lt;element name="targetRteProtectedSegment" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}protectedSegmentType" minOccurs="0"/&gt;
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
        "targetRteText",
        "targetRteProtectedSegment"
    })
    public static class CtrTargetRte {

        @XmlElement(required = true)
        protected String targetRteText;
        protected String targetRteProtectedSegment;

        /**
         * Gets the value of the targetRteText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetRteText() {
            return targetRteText;
        }

        /**
         * Sets the value of the targetRteText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetRteText(String value) {
            this.targetRteText = value;
        }

        /**
         * Gets the value of the targetRteProtectedSegment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetRteProtectedSegment() {
            return targetRteProtectedSegment;
        }

        /**
         * Sets the value of the targetRteProtectedSegment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetRteProtectedSegment(String value) {
            this.targetRteProtectedSegment = value;
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
     *         &lt;element name="mergeFlight" maxOccurs="25"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="flightIdfr" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}idfrType"/&gt;
     *                   &lt;element name="gufi" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}gufiType"/&gt;
     *                   &lt;element name="baseRteText" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteRouteType"/&gt;
     *                   &lt;element name="protectedSegment" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}protectedSegmentType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="tmiId" use="required" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}tmiIdType" /&gt;
     *       &lt;attribute name="tmiType" use="required" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}tmiType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mergeFlight"
    })
    public static class TmiId {

        @XmlElement(required = true)
        protected List<RerouteMergeType.TmiId.MergeFlight> mergeFlight;
        @XmlAttribute(name = "tmiId", required = true)
        protected String tmiId;
        @XmlAttribute(name = "tmiType", required = true)
        protected TmiType tmiType;

        /**
         * Gets the value of the mergeFlight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mergeFlight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMergeFlight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RerouteMergeType.TmiId.MergeFlight }
         * 
         * 
         */
        public List<RerouteMergeType.TmiId.MergeFlight> getMergeFlight() {
            if (mergeFlight == null) {
                mergeFlight = new ArrayList<RerouteMergeType.TmiId.MergeFlight>();
            }
            return this.mergeFlight;
        }

        /**
         * Gets the value of the tmiId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTmiId() {
            return tmiId;
        }

        /**
         * Sets the value of the tmiId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTmiId(String value) {
            this.tmiId = value;
        }

        /**
         * Gets the value of the tmiType property.
         * 
         * @return
         *     possible object is
         *     {@link TmiType }
         *     
         */
        public TmiType getTmiType() {
            return tmiType;
        }

        /**
         * Sets the value of the tmiType property.
         * 
         * @param value
         *     allowed object is
         *     {@link TmiType }
         *     
         */
        public void setTmiType(TmiType value) {
            this.tmiType = value;
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
         *         &lt;element name="flightIdfr" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}idfrType"/&gt;
         *         &lt;element name="gufi" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}gufiType"/&gt;
         *         &lt;element name="baseRteText" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteRouteType"/&gt;
         *         &lt;element name="protectedSegment" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}protectedSegmentType" minOccurs="0"/&gt;
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
            "flightIdfr",
            "gufi",
            "baseRteText",
            "protectedSegment"
        })
        public static class MergeFlight {

            @XmlElement(required = true)
            protected String flightIdfr;
            @XmlElement(required = true)
            protected String gufi;
            @XmlElement(required = true)
            protected String baseRteText;
            protected String protectedSegment;

            /**
             * Gets the value of the flightIdfr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightIdfr() {
                return flightIdfr;
            }

            /**
             * Sets the value of the flightIdfr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightIdfr(String value) {
                this.flightIdfr = value;
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
             * Gets the value of the baseRteText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBaseRteText() {
                return baseRteText;
            }

            /**
             * Sets the value of the baseRteText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBaseRteText(String value) {
                this.baseRteText = value;
            }

            /**
             * Gets the value of the protectedSegment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProtectedSegment() {
                return protectedSegment;
            }

            /**
             * Sets the value of the protectedSegment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProtectedSegment(String value) {
                this.protectedSegment = value;
            }

        }

    }

}
