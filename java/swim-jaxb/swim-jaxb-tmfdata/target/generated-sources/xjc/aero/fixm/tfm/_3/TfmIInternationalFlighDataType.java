//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.tfm._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.fixm.flight._3.FlightType;


/**
 * <p>Java class for TfmIInternationalFlighDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TfmIInternationalFlighDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="changeIndindicators" type="{http://www.fixm.aero/tfm/3.1}TfmFlightDataChangeType" minOccurs="0"/&gt;
 *         &lt;element name="flight" type="{http://www.fixm.aero/flight/3.0}FlightType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.fixm.aero/tfm/3.1}TfmFlightDataAttributeType"/&gt;
 *       &lt;attribute name="msgType" type="{http://www.fixm.aero/tfm/3.1}TfmIcaoMessageType" /&gt;
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="xmitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TfmIInternationalFlighDataType", propOrder = {
    "changeIndindicators",
    "flight"
})
public class TfmIInternationalFlighDataType {

    protected TfmFlightDataChangeType changeIndindicators;
    @XmlElement(required = true)
    protected FlightType flight;
    @XmlAttribute(name = "msgType")
    protected TfmIcaoMessageType msgType;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "xmitTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xmitTime;
    @XmlAttribute(name = "sensitivity")
    protected TfmSensitivityType sensitivity;
    @XmlAttribute(name = "sourceFacility")
    protected String sourceFacility;
    @XmlAttribute(name = "sourceTimeStamp")
    protected XMLGregorianCalendar sourceTimeStamp;
    @XmlAttribute(name = "airline")
    protected String airline;
    @XmlAttribute(name = "countryAirspace")
    protected String countryAirspace;
    @XmlAttribute(name = "flightRef")
    protected String flightRef;
    @XmlAttribute(name = "acid")
    protected String acid;
    @XmlAttribute(name = "cdmPart")
    protected Boolean cdmPart;
    @XmlAttribute(name = "depArpt")
    protected String depArpt;
    @XmlAttribute(name = "arrArpt")
    protected String arrArpt;
    @XmlAttribute(name = "sensReason")
    protected TfmSensitivityReasonType sensReason;

    /**
     * Gets the value of the changeIndindicators property.
     * 
     * @return
     *     possible object is
     *     {@link TfmFlightDataChangeType }
     *     
     */
    public TfmFlightDataChangeType getChangeIndindicators() {
        return changeIndindicators;
    }

    /**
     * Sets the value of the changeIndindicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfmFlightDataChangeType }
     *     
     */
    public void setChangeIndindicators(TfmFlightDataChangeType value) {
        this.changeIndindicators = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link FlightType }
     *     
     */
    public FlightType getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightType }
     *     
     */
    public void setFlight(FlightType value) {
        this.flight = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link TfmIcaoMessageType }
     *     
     */
    public TfmIcaoMessageType getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfmIcaoMessageType }
     *     
     */
    public void setMsgType(TfmIcaoMessageType value) {
        this.msgType = value;
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
     * Gets the value of the sensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link TfmSensitivityType }
     *     
     */
    public TfmSensitivityType getSensitivity() {
        return sensitivity;
    }

    /**
     * Sets the value of the sensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfmSensitivityType }
     *     
     */
    public void setSensitivity(TfmSensitivityType value) {
        this.sensitivity = value;
    }

    /**
     * Gets the value of the sourceFacility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFacility() {
        return sourceFacility;
    }

    /**
     * Sets the value of the sourceFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFacility(String value) {
        this.sourceFacility = value;
    }

    /**
     * Gets the value of the sourceTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSourceTimeStamp() {
        return sourceTimeStamp;
    }

    /**
     * Sets the value of the sourceTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSourceTimeStamp(XMLGregorianCalendar value) {
        this.sourceTimeStamp = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirline(String value) {
        this.airline = value;
    }

    /**
     * Gets the value of the countryAirspace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryAirspace() {
        return countryAirspace;
    }

    /**
     * Sets the value of the countryAirspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryAirspace(String value) {
        this.countryAirspace = value;
    }

    /**
     * Gets the value of the flightRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightRef() {
        return flightRef;
    }

    /**
     * Sets the value of the flightRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightRef(String value) {
        this.flightRef = value;
    }

    /**
     * Gets the value of the acid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcid() {
        return acid;
    }

    /**
     * Sets the value of the acid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcid(String value) {
        this.acid = value;
    }

    /**
     * Gets the value of the cdmPart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdmPart() {
        return cdmPart;
    }

    /**
     * Sets the value of the cdmPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdmPart(Boolean value) {
        this.cdmPart = value;
    }

    /**
     * Gets the value of the depArpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepArpt() {
        return depArpt;
    }

    /**
     * Sets the value of the depArpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepArpt(String value) {
        this.depArpt = value;
    }

    /**
     * Gets the value of the arrArpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrArpt() {
        return arrArpt;
    }

    /**
     * Sets the value of the arrArpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrArpt(String value) {
        this.arrArpt = value;
    }

    /**
     * Gets the value of the sensReason property.
     * 
     * @return
     *     possible object is
     *     {@link TfmSensitivityReasonType }
     *     
     */
    public TfmSensitivityReasonType getSensReason() {
        return sensReason;
    }

    /**
     * Sets the value of the sensReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfmSensitivityReasonType }
     *     
     */
    public void setSensReason(TfmSensitivityReasonType value) {
        this.sensReason = value;
    }

}
