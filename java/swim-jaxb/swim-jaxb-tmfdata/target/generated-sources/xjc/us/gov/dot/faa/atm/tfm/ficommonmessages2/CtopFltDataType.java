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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.ficommonmessages.FcaRemarksType;
import us.gov.dot.faa.atm.tfm.ficommonmessages.TrajOptionType;


/**
 * Defines the FEA/FCA specific data provided in the flight list.
 * 
 * <p>Java class for ctopFltDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctopFltDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="CTL_EXEMPT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CTOP_NAME" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopNameType" minOccurs="0"/&gt;
 *         &lt;element name="CTOP_SHORTNAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="CTP[0-9]{3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTOP_CONTROLLED_IND" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ROUTE_CONTROLLED_IND" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TRAJECTORY_LIST"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TRAJECTORY" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}trajOptionType" maxOccurs="100"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REL_FLT_PRIORITY" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}relFltPriorityType" minOccurs="0"/&gt;
 *         &lt;element name="EXEMPT_REASON" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}ctopExemptReasonType" minOccurs="0"/&gt;
 *         &lt;element name="CTOP_ROUTE_OUT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CTOP_GROUND_DELAY" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CTOP_ADDED_FLY_TIME" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SLOT" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fltSlotType" minOccurs="0"/&gt;
 *         &lt;element name="LAST_ROUTE_AMENDMENT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="TMI_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ROUTE_AMENDMENT"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1024"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AMENDMENT_PROTECTED_SEGMENT" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="1024"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AMENDMENT_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="AMENDMENT_STATUS" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}amendmentStatusType"/&gt;
 *                   &lt;element name="REJECT_REASON" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="256"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REMARKS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;list itemType="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fcaRemarksType" /&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REPORTED_ALT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONFORMANCE_STATUS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="CONFORMANCE"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="C"/&gt;
 *                         &lt;enumeration value="NC"/&gt;
 *                         &lt;enumeration value="UNKN"/&gt;
 *                         &lt;enumeration value="EXC"/&gt;
 *                         &lt;enumeration value="OK"/&gt;
 *                         &lt;enumeration value="NC/OK"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="REASON" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="routeConformant" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="speedConformant" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="altitudeConformant" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOS_SEQ_NUM" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}tosSeqNbrType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctopFltDataType", propOrder = {

})
public class CtopFltDataType {

    @XmlElement(name = "CTL_EXEMPT")
    protected Boolean ctlexempt;
    @XmlElement(name = "CTOP_NAME")
    protected String ctopname;
    @XmlElement(name = "CTOP_SHORTNAME")
    protected String ctopshortname;
    @XmlElement(name = "CTOP_CONTROLLED_IND")
    protected Boolean ctopcontrolledind;
    @XmlElement(name = "ROUTE_CONTROLLED_IND")
    protected Boolean routecontrolledind;
    @XmlElement(name = "TRAJECTORY_LIST", required = true)
    protected CtopFltDataType.TRAJECTORYLIST trajectorylist;
    @XmlElement(name = "REL_FLT_PRIORITY")
    @XmlSchemaType(name = "integer")
    protected Integer relfltpriority;
    @XmlElement(name = "EXEMPT_REASON")
    @XmlSchemaType(name = "string")
    protected CtopExemptReasonType exemptreason;
    @XmlElement(name = "CTOP_ROUTE_OUT")
    protected Boolean ctoprouteout;
    @XmlElement(name = "CTOP_GROUND_DELAY")
    protected Integer ctopgrounddelay;
    @XmlElement(name = "CTOP_ADDED_FLY_TIME")
    protected Integer ctopaddedflytime;
    @XmlElement(name = "SLOT")
    protected String slot;
    @XmlElement(name = "LAST_ROUTE_AMENDMENT")
    protected CtopFltDataType.LASTROUTEAMENDMENT lastrouteamendment;
    @XmlList
    @XmlElement(name = "REMARKS")
    protected List<FcaRemarksType> remarks;
    @XmlElement(name = "REPORTED_ALT")
    protected String reportedalt;
    @XmlElement(name = "CONFORMANCE_STATUS")
    protected CtopFltDataType.CONFORMANCESTATUS conformancestatus;
    @XmlElement(name = "TOS_SEQ_NUM")
    @XmlSchemaType(name = "integer")
    protected Integer tosseqnum;

    /**
     * Gets the value of the ctlexempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCTLEXEMPT() {
        return ctlexempt;
    }

    /**
     * Sets the value of the ctlexempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCTLEXEMPT(Boolean value) {
        this.ctlexempt = value;
    }

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
     * Gets the value of the ctopcontrolledind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCTOPCONTROLLEDIND() {
        return ctopcontrolledind;
    }

    /**
     * Sets the value of the ctopcontrolledind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCTOPCONTROLLEDIND(Boolean value) {
        this.ctopcontrolledind = value;
    }

    /**
     * Gets the value of the routecontrolledind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isROUTECONTROLLEDIND() {
        return routecontrolledind;
    }

    /**
     * Sets the value of the routecontrolledind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setROUTECONTROLLEDIND(Boolean value) {
        this.routecontrolledind = value;
    }

    /**
     * Gets the value of the trajectorylist property.
     * 
     * @return
     *     possible object is
     *     {@link CtopFltDataType.TRAJECTORYLIST }
     *     
     */
    public CtopFltDataType.TRAJECTORYLIST getTRAJECTORYLIST() {
        return trajectorylist;
    }

    /**
     * Sets the value of the trajectorylist property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtopFltDataType.TRAJECTORYLIST }
     *     
     */
    public void setTRAJECTORYLIST(CtopFltDataType.TRAJECTORYLIST value) {
        this.trajectorylist = value;
    }

    /**
     * Gets the value of the relfltpriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRELFLTPRIORITY() {
        return relfltpriority;
    }

    /**
     * Sets the value of the relfltpriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRELFLTPRIORITY(Integer value) {
        this.relfltpriority = value;
    }

    /**
     * Gets the value of the exemptreason property.
     * 
     * @return
     *     possible object is
     *     {@link CtopExemptReasonType }
     *     
     */
    public CtopExemptReasonType getEXEMPTREASON() {
        return exemptreason;
    }

    /**
     * Sets the value of the exemptreason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtopExemptReasonType }
     *     
     */
    public void setEXEMPTREASON(CtopExemptReasonType value) {
        this.exemptreason = value;
    }

    /**
     * Gets the value of the ctoprouteout property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCTOPROUTEOUT() {
        return ctoprouteout;
    }

    /**
     * Sets the value of the ctoprouteout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCTOPROUTEOUT(Boolean value) {
        this.ctoprouteout = value;
    }

    /**
     * Gets the value of the ctopgrounddelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCTOPGROUNDDELAY() {
        return ctopgrounddelay;
    }

    /**
     * Sets the value of the ctopgrounddelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCTOPGROUNDDELAY(Integer value) {
        this.ctopgrounddelay = value;
    }

    /**
     * Gets the value of the ctopaddedflytime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCTOPADDEDFLYTIME() {
        return ctopaddedflytime;
    }

    /**
     * Sets the value of the ctopaddedflytime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCTOPADDEDFLYTIME(Integer value) {
        this.ctopaddedflytime = value;
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

    /**
     * Gets the value of the lastrouteamendment property.
     * 
     * @return
     *     possible object is
     *     {@link CtopFltDataType.LASTROUTEAMENDMENT }
     *     
     */
    public CtopFltDataType.LASTROUTEAMENDMENT getLASTROUTEAMENDMENT() {
        return lastrouteamendment;
    }

    /**
     * Sets the value of the lastrouteamendment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtopFltDataType.LASTROUTEAMENDMENT }
     *     
     */
    public void setLASTROUTEAMENDMENT(CtopFltDataType.LASTROUTEAMENDMENT value) {
        this.lastrouteamendment = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREMARKS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FcaRemarksType }
     * 
     * 
     */
    public List<FcaRemarksType> getREMARKS() {
        if (remarks == null) {
            remarks = new ArrayList<FcaRemarksType>();
        }
        return this.remarks;
    }

    /**
     * Gets the value of the reportedalt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREPORTEDALT() {
        return reportedalt;
    }

    /**
     * Sets the value of the reportedalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREPORTEDALT(String value) {
        this.reportedalt = value;
    }

    /**
     * Gets the value of the conformancestatus property.
     * 
     * @return
     *     possible object is
     *     {@link CtopFltDataType.CONFORMANCESTATUS }
     *     
     */
    public CtopFltDataType.CONFORMANCESTATUS getCONFORMANCESTATUS() {
        return conformancestatus;
    }

    /**
     * Sets the value of the conformancestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtopFltDataType.CONFORMANCESTATUS }
     *     
     */
    public void setCONFORMANCESTATUS(CtopFltDataType.CONFORMANCESTATUS value) {
        this.conformancestatus = value;
    }

    /**
     * Gets the value of the tosseqnum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTOSSEQNUM() {
        return tosseqnum;
    }

    /**
     * Sets the value of the tosseqnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTOSSEQNUM(Integer value) {
        this.tosseqnum = value;
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
     *         &lt;element name="CONFORMANCE"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="C"/&gt;
     *               &lt;enumeration value="NC"/&gt;
     *               &lt;enumeration value="UNKN"/&gt;
     *               &lt;enumeration value="EXC"/&gt;
     *               &lt;enumeration value="OK"/&gt;
     *               &lt;enumeration value="NC/OK"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="REASON" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="routeConformant" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="speedConformant" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="altitudeConformant" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
    public static class CONFORMANCESTATUS {

        @XmlElement(name = "CONFORMANCE", required = true)
        protected String conformance;
        @XmlElement(name = "REASON")
        protected CtopFltDataType.CONFORMANCESTATUS.REASON reason;

        /**
         * Gets the value of the conformance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONFORMANCE() {
            return conformance;
        }

        /**
         * Sets the value of the conformance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONFORMANCE(String value) {
            this.conformance = value;
        }

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link CtopFltDataType.CONFORMANCESTATUS.REASON }
         *     
         */
        public CtopFltDataType.CONFORMANCESTATUS.REASON getREASON() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtopFltDataType.CONFORMANCESTATUS.REASON }
         *     
         */
        public void setREASON(CtopFltDataType.CONFORMANCESTATUS.REASON value) {
            this.reason = value;
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
         *       &lt;attribute name="routeConformant" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="speedConformant" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="altitudeConformant" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class REASON {

            @XmlAttribute(name = "routeConformant", required = true)
            protected boolean routeConformant;
            @XmlAttribute(name = "speedConformant", required = true)
            protected boolean speedConformant;
            @XmlAttribute(name = "altitudeConformant", required = true)
            protected boolean altitudeConformant;

            /**
             * Gets the value of the routeConformant property.
             * 
             */
            public boolean isRouteConformant() {
                return routeConformant;
            }

            /**
             * Sets the value of the routeConformant property.
             * 
             */
            public void setRouteConformant(boolean value) {
                this.routeConformant = value;
            }

            /**
             * Gets the value of the speedConformant property.
             * 
             */
            public boolean isSpeedConformant() {
                return speedConformant;
            }

            /**
             * Sets the value of the speedConformant property.
             * 
             */
            public void setSpeedConformant(boolean value) {
                this.speedConformant = value;
            }

            /**
             * Gets the value of the altitudeConformant property.
             * 
             */
            public boolean isAltitudeConformant() {
                return altitudeConformant;
            }

            /**
             * Sets the value of the altitudeConformant property.
             * 
             */
            public void setAltitudeConformant(boolean value) {
                this.altitudeConformant = value;
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
     *       &lt;all&gt;
     *         &lt;element name="TMI_ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ROUTE_AMENDMENT"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1024"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AMENDMENT_PROTECTED_SEGMENT" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="1024"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AMENDMENT_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="AMENDMENT_STATUS" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}amendmentStatusType"/&gt;
     *         &lt;element name="REJECT_REASON" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="256"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
    public static class LASTROUTEAMENDMENT {

        @XmlElement(name = "TMI_ID", required = true)
        protected String tmiid;
        @XmlElement(name = "ROUTE_AMENDMENT", required = true)
        protected String routeamendment;
        @XmlElement(name = "AMENDMENT_PROTECTED_SEGMENT")
        protected String amendmentprotectedsegment;
        @XmlElement(name = "AMENDMENT_TIME", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar amendmenttime;
        @XmlElement(name = "AMENDMENT_STATUS", required = true)
        @XmlSchemaType(name = "string")
        protected AmendmentStatusType amendmentstatus;
        @XmlElement(name = "REJECT_REASON")
        protected String rejectreason;

        /**
         * Gets the value of the tmiid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTMIID() {
            return tmiid;
        }

        /**
         * Sets the value of the tmiid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTMIID(String value) {
            this.tmiid = value;
        }

        /**
         * Gets the value of the routeamendment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROUTEAMENDMENT() {
            return routeamendment;
        }

        /**
         * Sets the value of the routeamendment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROUTEAMENDMENT(String value) {
            this.routeamendment = value;
        }

        /**
         * Gets the value of the amendmentprotectedsegment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAMENDMENTPROTECTEDSEGMENT() {
            return amendmentprotectedsegment;
        }

        /**
         * Sets the value of the amendmentprotectedsegment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAMENDMENTPROTECTEDSEGMENT(String value) {
            this.amendmentprotectedsegment = value;
        }

        /**
         * Gets the value of the amendmenttime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAMENDMENTTIME() {
            return amendmenttime;
        }

        /**
         * Sets the value of the amendmenttime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAMENDMENTTIME(XMLGregorianCalendar value) {
            this.amendmenttime = value;
        }

        /**
         * Gets the value of the amendmentstatus property.
         * 
         * @return
         *     possible object is
         *     {@link AmendmentStatusType }
         *     
         */
        public AmendmentStatusType getAMENDMENTSTATUS() {
            return amendmentstatus;
        }

        /**
         * Sets the value of the amendmentstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmendmentStatusType }
         *     
         */
        public void setAMENDMENTSTATUS(AmendmentStatusType value) {
            this.amendmentstatus = value;
        }

        /**
         * Gets the value of the rejectreason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getREJECTREASON() {
            return rejectreason;
        }

        /**
         * Sets the value of the rejectreason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setREJECTREASON(String value) {
            this.rejectreason = value;
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
     *         &lt;element name="TRAJECTORY" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}trajOptionType" maxOccurs="100"/&gt;
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
        "trajectory"
    })
    public static class TRAJECTORYLIST {

        @XmlElement(name = "TRAJECTORY", required = true)
        protected List<TrajOptionType> trajectory;

        /**
         * Gets the value of the trajectory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trajectory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTRAJECTORY().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrajOptionType }
         * 
         * 
         */
        public List<TrajOptionType> getTRAJECTORY() {
            if (trajectory == null) {
                trajectory = new ArrayList<TrajOptionType>();
            }
            return this.trajectory;
        }

    }

}
