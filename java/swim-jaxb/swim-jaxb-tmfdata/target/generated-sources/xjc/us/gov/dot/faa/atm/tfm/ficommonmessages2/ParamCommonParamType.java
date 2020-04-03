//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages2;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.AdvisoryStateType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.ElementTypeType;


/**
 * This defines the common parameters for all of the AFP/GDP/GS/CTOP TMIs.
 * 
 * <p>Java class for paramCommonParamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramCommonParamType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tmiState" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}advisoryStateType"/&gt;
 *         &lt;element name="parametersType" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}fadtParmType"/&gt;
 *         &lt;element name="elemName" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}controlElementNameType"/&gt;
 *         &lt;element name="elemType" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}elementTypeType"/&gt;
 *         &lt;element name="ctlProgram"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="3"/&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dataTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="modelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="reportTimeFull" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="eventStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="eventEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="cumulativeStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="cumulativeEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="chargeTo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="facilityType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Airport"/&gt;
 *                         &lt;enumeration value="Terminal"/&gt;
 *                         &lt;enumeration value="Center"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="facilityName" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="chargeToNonFAA"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Y"/&gt;
 *               &lt;enumeration value="N"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="impactingConditionCode" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}impactingConditionCodeType"/&gt;
 *         &lt;element name="impactingConditionEquipment" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FAA" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="scheduled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="totalFlights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="affectedFlights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="totalDelayBefore" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="totalDelayAfter" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="maxDelayBefore" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="maxDelayAfter" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="minDelayBefore" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="minDelayAfter" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="averageDelayBefore"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="averageDelayAfter"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;minInclusive value="0.0"/&gt;
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
@XmlType(name = "paramCommonParamType", propOrder = {
    "tmiState",
    "parametersType",
    "elemName",
    "elemType",
    "ctlProgram",
    "dataTime",
    "modelTime",
    "reportTimeFull",
    "eventStartTime",
    "eventEndTime",
    "cumulativeStartTime",
    "cumulativeEndTime",
    "chargeTo",
    "chargeToNonFAA",
    "impactingConditionCode",
    "impactingConditionEquipment",
    "totalFlights",
    "affectedFlights",
    "totalDelayBefore",
    "totalDelayAfter",
    "maxDelayBefore",
    "maxDelayAfter",
    "minDelayBefore",
    "minDelayAfter",
    "averageDelayBefore",
    "averageDelayAfter"
})
@XmlSeeAlso({
    ParamBlanketType.class,
    ParamCompressionType.class,
    ParamAfpGdpType.class,
    ParamGsType.class
})
public class ParamCommonParamType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AdvisoryStateType tmiState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FadtParmType parametersType;
    @XmlElement(required = true)
    protected String elemName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ElementTypeType elemType;
    @XmlElement(required = true)
    protected String ctlProgram;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modelTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportTimeFull;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventStartTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventEndTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cumulativeStartTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cumulativeEndTime;
    @XmlElement(required = true)
    protected ParamCommonParamType.ChargeTo chargeTo;
    @XmlElement(required = true)
    protected String chargeToNonFAA;
    @XmlElement(required = true)
    protected String impactingConditionCode;
    protected ParamCommonParamType.ImpactingConditionEquipment impactingConditionEquipment;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalFlights;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger affectedFlights;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalDelayBefore;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalDelayAfter;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxDelayBefore;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxDelayAfter;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minDelayBefore;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minDelayAfter;
    @XmlElement(required = true)
    protected BigDecimal averageDelayBefore;
    @XmlElement(required = true)
    protected BigDecimal averageDelayAfter;

    /**
     * Gets the value of the tmiState property.
     * 
     * @return
     *     possible object is
     *     {@link AdvisoryStateType }
     *     
     */
    public AdvisoryStateType getTmiState() {
        return tmiState;
    }

    /**
     * Sets the value of the tmiState property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvisoryStateType }
     *     
     */
    public void setTmiState(AdvisoryStateType value) {
        this.tmiState = value;
    }

    /**
     * Gets the value of the parametersType property.
     * 
     * @return
     *     possible object is
     *     {@link FadtParmType }
     *     
     */
    public FadtParmType getParametersType() {
        return parametersType;
    }

    /**
     * Sets the value of the parametersType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FadtParmType }
     *     
     */
    public void setParametersType(FadtParmType value) {
        this.parametersType = value;
    }

    /**
     * Gets the value of the elemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElemName() {
        return elemName;
    }

    /**
     * Sets the value of the elemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElemName(String value) {
        this.elemName = value;
    }

    /**
     * Gets the value of the elemType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTypeType }
     *     
     */
    public ElementTypeType getElemType() {
        return elemType;
    }

    /**
     * Sets the value of the elemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTypeType }
     *     
     */
    public void setElemType(ElementTypeType value) {
        this.elemType = value;
    }

    /**
     * Gets the value of the ctlProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtlProgram() {
        return ctlProgram;
    }

    /**
     * Sets the value of the ctlProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtlProgram(String value) {
        this.ctlProgram = value;
    }

    /**
     * Gets the value of the dataTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTime() {
        return dataTime;
    }

    /**
     * Sets the value of the dataTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTime(XMLGregorianCalendar value) {
        this.dataTime = value;
    }

    /**
     * Gets the value of the modelTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModelTime() {
        return modelTime;
    }

    /**
     * Sets the value of the modelTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModelTime(XMLGregorianCalendar value) {
        this.modelTime = value;
    }

    /**
     * Gets the value of the reportTimeFull property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportTimeFull() {
        return reportTimeFull;
    }

    /**
     * Sets the value of the reportTimeFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportTimeFull(XMLGregorianCalendar value) {
        this.reportTimeFull = value;
    }

    /**
     * Gets the value of the eventStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventStartTime() {
        return eventStartTime;
    }

    /**
     * Sets the value of the eventStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventStartTime(XMLGregorianCalendar value) {
        this.eventStartTime = value;
    }

    /**
     * Gets the value of the eventEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventEndTime() {
        return eventEndTime;
    }

    /**
     * Sets the value of the eventEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventEndTime(XMLGregorianCalendar value) {
        this.eventEndTime = value;
    }

    /**
     * Gets the value of the cumulativeStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCumulativeStartTime() {
        return cumulativeStartTime;
    }

    /**
     * Sets the value of the cumulativeStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCumulativeStartTime(XMLGregorianCalendar value) {
        this.cumulativeStartTime = value;
    }

    /**
     * Gets the value of the cumulativeEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCumulativeEndTime() {
        return cumulativeEndTime;
    }

    /**
     * Sets the value of the cumulativeEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCumulativeEndTime(XMLGregorianCalendar value) {
        this.cumulativeEndTime = value;
    }

    /**
     * Gets the value of the chargeTo property.
     * 
     * @return
     *     possible object is
     *     {@link ParamCommonParamType.ChargeTo }
     *     
     */
    public ParamCommonParamType.ChargeTo getChargeTo() {
        return chargeTo;
    }

    /**
     * Sets the value of the chargeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamCommonParamType.ChargeTo }
     *     
     */
    public void setChargeTo(ParamCommonParamType.ChargeTo value) {
        this.chargeTo = value;
    }

    /**
     * Gets the value of the chargeToNonFAA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeToNonFAA() {
        return chargeToNonFAA;
    }

    /**
     * Sets the value of the chargeToNonFAA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeToNonFAA(String value) {
        this.chargeToNonFAA = value;
    }

    /**
     * Gets the value of the impactingConditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpactingConditionCode() {
        return impactingConditionCode;
    }

    /**
     * Sets the value of the impactingConditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpactingConditionCode(String value) {
        this.impactingConditionCode = value;
    }

    /**
     * Gets the value of the impactingConditionEquipment property.
     * 
     * @return
     *     possible object is
     *     {@link ParamCommonParamType.ImpactingConditionEquipment }
     *     
     */
    public ParamCommonParamType.ImpactingConditionEquipment getImpactingConditionEquipment() {
        return impactingConditionEquipment;
    }

    /**
     * Sets the value of the impactingConditionEquipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamCommonParamType.ImpactingConditionEquipment }
     *     
     */
    public void setImpactingConditionEquipment(ParamCommonParamType.ImpactingConditionEquipment value) {
        this.impactingConditionEquipment = value;
    }

    /**
     * Gets the value of the totalFlights property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalFlights() {
        return totalFlights;
    }

    /**
     * Sets the value of the totalFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalFlights(BigInteger value) {
        this.totalFlights = value;
    }

    /**
     * Gets the value of the affectedFlights property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAffectedFlights() {
        return affectedFlights;
    }

    /**
     * Sets the value of the affectedFlights property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAffectedFlights(BigInteger value) {
        this.affectedFlights = value;
    }

    /**
     * Gets the value of the totalDelayBefore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDelayBefore() {
        return totalDelayBefore;
    }

    /**
     * Sets the value of the totalDelayBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDelayBefore(BigInteger value) {
        this.totalDelayBefore = value;
    }

    /**
     * Gets the value of the totalDelayAfter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDelayAfter() {
        return totalDelayAfter;
    }

    /**
     * Sets the value of the totalDelayAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDelayAfter(BigInteger value) {
        this.totalDelayAfter = value;
    }

    /**
     * Gets the value of the maxDelayBefore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDelayBefore() {
        return maxDelayBefore;
    }

    /**
     * Sets the value of the maxDelayBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDelayBefore(BigInteger value) {
        this.maxDelayBefore = value;
    }

    /**
     * Gets the value of the maxDelayAfter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDelayAfter() {
        return maxDelayAfter;
    }

    /**
     * Sets the value of the maxDelayAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDelayAfter(BigInteger value) {
        this.maxDelayAfter = value;
    }

    /**
     * Gets the value of the minDelayBefore property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinDelayBefore() {
        return minDelayBefore;
    }

    /**
     * Sets the value of the minDelayBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinDelayBefore(BigInteger value) {
        this.minDelayBefore = value;
    }

    /**
     * Gets the value of the minDelayAfter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinDelayAfter() {
        return minDelayAfter;
    }

    /**
     * Sets the value of the minDelayAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinDelayAfter(BigInteger value) {
        this.minDelayAfter = value;
    }

    /**
     * Gets the value of the averageDelayBefore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageDelayBefore() {
        return averageDelayBefore;
    }

    /**
     * Sets the value of the averageDelayBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageDelayBefore(BigDecimal value) {
        this.averageDelayBefore = value;
    }

    /**
     * Gets the value of the averageDelayAfter property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageDelayAfter() {
        return averageDelayAfter;
    }

    /**
     * Sets the value of the averageDelayAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageDelayAfter(BigDecimal value) {
        this.averageDelayAfter = value;
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
     *         &lt;element name="facilityType"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Airport"/&gt;
     *               &lt;enumeration value="Terminal"/&gt;
     *               &lt;enumeration value="Center"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="facilityName" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType"/&gt;
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
        "facilityType",
        "facilityName"
    })
    public static class ChargeTo {

        @XmlElement(required = true)
        protected String facilityType;
        @XmlElement(required = true)
        protected String facilityName;

        /**
         * Gets the value of the facilityType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacilityType() {
            return facilityType;
        }

        /**
         * Sets the value of the facilityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacilityType(String value) {
            this.facilityType = value;
        }

        /**
         * Gets the value of the facilityName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacilityName() {
            return facilityName;
        }

        /**
         * Sets the value of the facilityName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacilityName(String value) {
            this.facilityName = value;
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
     *         &lt;element name="FAA" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="scheduled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
        "faa",
        "scheduled"
    })
    public static class ImpactingConditionEquipment {

        @XmlElement(name = "FAA")
        protected boolean faa;
        protected boolean scheduled;

        /**
         * Gets the value of the faa property.
         * 
         */
        public boolean isFAA() {
            return faa;
        }

        /**
         * Sets the value of the faa property.
         * 
         */
        public void setFAA(boolean value) {
            this.faa = value;
        }

        /**
         * Gets the value of the scheduled property.
         * 
         */
        public boolean isScheduled() {
            return scheduled;
        }

        /**
         * Sets the value of the scheduled property.
         * 
         */
        public void setScheduled(boolean value) {
            this.scheduled = value;
        }

    }

}
