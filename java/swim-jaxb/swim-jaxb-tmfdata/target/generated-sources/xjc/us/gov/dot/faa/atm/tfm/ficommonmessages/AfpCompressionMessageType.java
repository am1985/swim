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
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.AltitudeRangeType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.DelayInfoType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.ElementTypeType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.TimePeriodType;


/**
 * Message type for GDP Compression advisory.
 * 
 * <p>Java class for afpCompressionMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="afpCompressionMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="tmiStatus" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}tmiStatusType"/&gt;
 *         &lt;element name="afpName" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}fcaNameType"/&gt;
 *         &lt;element name="pgmExpTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="elementType" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}elementTypeType"/&gt;
 *         &lt;element name="altitudesIncluded" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}altitudeRangeType" minOccurs="0"/&gt;
 *         &lt;element name="adlTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="compressionPeriod" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}timePeriodType"/&gt;
 *         &lt;element name="cumulativeProgramPeriod" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}timePeriodType"/&gt;
 *         &lt;element name="exemptCTOPList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ctop" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopNameType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="slotHoldOverrideList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="impactingCondition" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}reasonType"/&gt;
 *         &lt;element name="advisoryValidPeriod" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}timePeriodType"/&gt;
 *         &lt;element name="currentDelays" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}delayInfoType" minOccurs="0"/&gt;
 *         &lt;element name="anticipatedDelays" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}delayInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "afpCompressionMessageType", propOrder = {
    "updateTime",
    "tmiStatus",
    "afpName",
    "pgmExpTime",
    "elementType",
    "altitudesIncluded",
    "adlTime",
    "compressionPeriod",
    "cumulativeProgramPeriod",
    "exemptCTOPList",
    "slotHoldOverrideList",
    "impactingCondition",
    "advisoryValidPeriod",
    "currentDelays",
    "anticipatedDelays"
})
public class AfpCompressionMessageType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TmiStatusType tmiStatus;
    @XmlElement(required = true)
    protected String afpName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pgmExpTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ElementTypeType elementType;
    protected AltitudeRangeType altitudesIncluded;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar adlTime;
    @XmlElement(required = true)
    protected TimePeriodType compressionPeriod;
    @XmlElement(required = true)
    protected TimePeriodType cumulativeProgramPeriod;
    protected AfpCompressionMessageType.ExemptCTOPList exemptCTOPList;
    protected AfpCompressionMessageType.SlotHoldOverrideList slotHoldOverrideList;
    @XmlElement(required = true)
    protected String impactingCondition;
    @XmlElement(required = true)
    protected TimePeriodType advisoryValidPeriod;
    protected DelayInfoType currentDelays;
    protected DelayInfoType anticipatedDelays;

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the tmiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TmiStatusType }
     *     
     */
    public TmiStatusType getTmiStatus() {
        return tmiStatus;
    }

    /**
     * Sets the value of the tmiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TmiStatusType }
     *     
     */
    public void setTmiStatus(TmiStatusType value) {
        this.tmiStatus = value;
    }

    /**
     * Gets the value of the afpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfpName() {
        return afpName;
    }

    /**
     * Sets the value of the afpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfpName(String value) {
        this.afpName = value;
    }

    /**
     * Gets the value of the pgmExpTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPgmExpTime() {
        return pgmExpTime;
    }

    /**
     * Sets the value of the pgmExpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPgmExpTime(XMLGregorianCalendar value) {
        this.pgmExpTime = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTypeType }
     *     
     */
    public ElementTypeType getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTypeType }
     *     
     */
    public void setElementType(ElementTypeType value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the altitudesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeRangeType }
     *     
     */
    public AltitudeRangeType getAltitudesIncluded() {
        return altitudesIncluded;
    }

    /**
     * Sets the value of the altitudesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeRangeType }
     *     
     */
    public void setAltitudesIncluded(AltitudeRangeType value) {
        this.altitudesIncluded = value;
    }

    /**
     * Gets the value of the adlTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdlTime() {
        return adlTime;
    }

    /**
     * Sets the value of the adlTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdlTime(XMLGregorianCalendar value) {
        this.adlTime = value;
    }

    /**
     * Gets the value of the compressionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getCompressionPeriod() {
        return compressionPeriod;
    }

    /**
     * Sets the value of the compressionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setCompressionPeriod(TimePeriodType value) {
        this.compressionPeriod = value;
    }

    /**
     * Gets the value of the cumulativeProgramPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getCumulativeProgramPeriod() {
        return cumulativeProgramPeriod;
    }

    /**
     * Sets the value of the cumulativeProgramPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setCumulativeProgramPeriod(TimePeriodType value) {
        this.cumulativeProgramPeriod = value;
    }

    /**
     * Gets the value of the exemptCTOPList property.
     * 
     * @return
     *     possible object is
     *     {@link AfpCompressionMessageType.ExemptCTOPList }
     *     
     */
    public AfpCompressionMessageType.ExemptCTOPList getExemptCTOPList() {
        return exemptCTOPList;
    }

    /**
     * Sets the value of the exemptCTOPList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfpCompressionMessageType.ExemptCTOPList }
     *     
     */
    public void setExemptCTOPList(AfpCompressionMessageType.ExemptCTOPList value) {
        this.exemptCTOPList = value;
    }

    /**
     * Gets the value of the slotHoldOverrideList property.
     * 
     * @return
     *     possible object is
     *     {@link AfpCompressionMessageType.SlotHoldOverrideList }
     *     
     */
    public AfpCompressionMessageType.SlotHoldOverrideList getSlotHoldOverrideList() {
        return slotHoldOverrideList;
    }

    /**
     * Sets the value of the slotHoldOverrideList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfpCompressionMessageType.SlotHoldOverrideList }
     *     
     */
    public void setSlotHoldOverrideList(AfpCompressionMessageType.SlotHoldOverrideList value) {
        this.slotHoldOverrideList = value;
    }

    /**
     * Gets the value of the impactingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpactingCondition() {
        return impactingCondition;
    }

    /**
     * Sets the value of the impactingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpactingCondition(String value) {
        this.impactingCondition = value;
    }

    /**
     * Gets the value of the advisoryValidPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getAdvisoryValidPeriod() {
        return advisoryValidPeriod;
    }

    /**
     * Sets the value of the advisoryValidPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setAdvisoryValidPeriod(TimePeriodType value) {
        this.advisoryValidPeriod = value;
    }

    /**
     * Gets the value of the currentDelays property.
     * 
     * @return
     *     possible object is
     *     {@link DelayInfoType }
     *     
     */
    public DelayInfoType getCurrentDelays() {
        return currentDelays;
    }

    /**
     * Sets the value of the currentDelays property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayInfoType }
     *     
     */
    public void setCurrentDelays(DelayInfoType value) {
        this.currentDelays = value;
    }

    /**
     * Gets the value of the anticipatedDelays property.
     * 
     * @return
     *     possible object is
     *     {@link DelayInfoType }
     *     
     */
    public DelayInfoType getAnticipatedDelays() {
        return anticipatedDelays;
    }

    /**
     * Sets the value of the anticipatedDelays property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayInfoType }
     *     
     */
    public void setAnticipatedDelays(DelayInfoType value) {
        this.anticipatedDelays = value;
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
     *         &lt;element name="ctop" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopNameType" maxOccurs="unbounded"/&gt;
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
        "ctop"
    })
    public static class ExemptCTOPList {

        @XmlElement(required = true)
        protected List<String> ctop;

        /**
         * Gets the value of the ctop property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ctop property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCtop().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCtop() {
            if (ctop == null) {
                ctop = new ArrayList<String>();
            }
            return this.ctop;
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
     *         &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "carrier"
    })
    public static class SlotHoldOverrideList {

        @XmlElement(required = true)
        protected List<String> carrier;

        /**
         * Gets the value of the carrier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCarrier() {
            if (carrier == null) {
                carrier = new ArrayList<String>();
            }
            return this.carrier;
        }

    }

}
