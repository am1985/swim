//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.flightdatacommonmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.ControlIndicatorType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.EtaFlightTimeType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.EtdFlightTimeType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.QualifiedAircraftIdType;


/**
 * The purpose of the NCSM Control Information message is to provide control data for the flight on TFMS specific Messages and Events.
 * 
 * <p>Java class for ncsmControlInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ncsmControlInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qualifiedAircraftId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}qualifiedAircraftIdType"/&gt;
 *         &lt;element name="etd" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}etdFlightTimeType"/&gt;
 *         &lt;element name="eta" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}etaFlightTimeType"/&gt;
 *         &lt;element name="controlIndicator" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}controlIndicatorType"/&gt;
 *         &lt;element name="ncsmControlData" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmControlDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ncsmControlInformationType", propOrder = {
    "qualifiedAircraftId",
    "etd",
    "eta",
    "controlIndicator",
    "ncsmControlData"
})
public class NcsmControlInformationType {

    @XmlElement(required = true)
    protected QualifiedAircraftIdType qualifiedAircraftId;
    @XmlElement(required = true)
    protected EtdFlightTimeType etd;
    @XmlElement(required = true)
    protected EtaFlightTimeType eta;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ControlIndicatorType controlIndicator;
    protected NcsmControlDataType ncsmControlData;

    /**
     * Gets the value of the qualifiedAircraftId property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedAircraftIdType }
     *     
     */
    public QualifiedAircraftIdType getQualifiedAircraftId() {
        return qualifiedAircraftId;
    }

    /**
     * Sets the value of the qualifiedAircraftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedAircraftIdType }
     *     
     */
    public void setQualifiedAircraftId(QualifiedAircraftIdType value) {
        this.qualifiedAircraftId = value;
    }

    /**
     * Gets the value of the etd property.
     * 
     * @return
     *     possible object is
     *     {@link EtdFlightTimeType }
     *     
     */
    public EtdFlightTimeType getEtd() {
        return etd;
    }

    /**
     * Sets the value of the etd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtdFlightTimeType }
     *     
     */
    public void setEtd(EtdFlightTimeType value) {
        this.etd = value;
    }

    /**
     * Gets the value of the eta property.
     * 
     * @return
     *     possible object is
     *     {@link EtaFlightTimeType }
     *     
     */
    public EtaFlightTimeType getEta() {
        return eta;
    }

    /**
     * Sets the value of the eta property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtaFlightTimeType }
     *     
     */
    public void setEta(EtaFlightTimeType value) {
        this.eta = value;
    }

    /**
     * Gets the value of the controlIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ControlIndicatorType }
     *     
     */
    public ControlIndicatorType getControlIndicator() {
        return controlIndicator;
    }

    /**
     * Sets the value of the controlIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlIndicatorType }
     *     
     */
    public void setControlIndicator(ControlIndicatorType value) {
        this.controlIndicator = value;
    }

    /**
     * Gets the value of the ncsmControlData property.
     * 
     * @return
     *     possible object is
     *     {@link NcsmControlDataType }
     *     
     */
    public NcsmControlDataType getNcsmControlData() {
        return ncsmControlData;
    }

    /**
     * Sets the value of the ncsmControlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NcsmControlDataType }
     *     
     */
    public void setNcsmControlData(NcsmControlDataType value) {
        this.ncsmControlData = value;
    }

}
