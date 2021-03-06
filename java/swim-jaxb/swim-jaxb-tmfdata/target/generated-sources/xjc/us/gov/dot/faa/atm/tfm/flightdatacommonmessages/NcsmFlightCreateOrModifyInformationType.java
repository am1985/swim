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
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.QualifiedAircraftIdType;


/**
 * The purpose of the NCSM Flight Create or Modify Information message is to provide modification to airline related data for a flight on TFMS specific Messages and Events.
 * 
 * <p>Java class for ncsmFlightCreateOrModifyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ncsmFlightCreateOrModifyInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qualifiedAircraftId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}qualifiedAircraftIdType"/&gt;
 *         &lt;element name="airlineData" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmAirlineDataType"/&gt;
 *         &lt;element name="diversionCancelData" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmDiversionCancelDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ncsmFlightCreateOrModifyInformationType", propOrder = {
    "qualifiedAircraftId",
    "airlineData",
    "diversionCancelData"
})
public class NcsmFlightCreateOrModifyInformationType {

    @XmlElement(required = true)
    protected QualifiedAircraftIdType qualifiedAircraftId;
    @XmlElement(required = true)
    protected NcsmAirlineDataType airlineData;
    protected NcsmDiversionCancelDataType diversionCancelData;

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
     * Gets the value of the airlineData property.
     * 
     * @return
     *     possible object is
     *     {@link NcsmAirlineDataType }
     *     
     */
    public NcsmAirlineDataType getAirlineData() {
        return airlineData;
    }

    /**
     * Sets the value of the airlineData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NcsmAirlineDataType }
     *     
     */
    public void setAirlineData(NcsmAirlineDataType value) {
        this.airlineData = value;
    }

    /**
     * Gets the value of the diversionCancelData property.
     * 
     * @return
     *     possible object is
     *     {@link NcsmDiversionCancelDataType }
     *     
     */
    public NcsmDiversionCancelDataType getDiversionCancelData() {
        return diversionCancelData;
    }

    /**
     * Sets the value of the diversionCancelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NcsmDiversionCancelDataType }
     *     
     */
    public void setDiversionCancelData(NcsmDiversionCancelDataType value) {
        this.diversionCancelData = value;
    }

}
