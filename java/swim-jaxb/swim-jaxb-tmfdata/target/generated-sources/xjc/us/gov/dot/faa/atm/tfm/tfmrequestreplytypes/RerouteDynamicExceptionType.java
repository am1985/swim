//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.TmiType;


/**
 * <p>Java class for rerouteDynamicExceptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rerouteDynamicExceptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rerouteId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteIdType"/&gt;
 *         &lt;element name="tmiName" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}tmiNameType"/&gt;
 *         &lt;element name="tmiType" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}tmiType"/&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="status"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="OK"/&gt;
 *               &lt;enumeration value="UNOK"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="acid" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}acidType"/&gt;
 *         &lt;element name="origin" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}airportNameType"/&gt;
 *         &lt;element name="destination" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}airportNameType"/&gt;
 *         &lt;element name="initialGateDepartureTime" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}dayTimeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rerouteDynamicExceptionType", propOrder = {
    "rerouteId",
    "tmiName",
    "tmiType",
    "timestamp",
    "status",
    "acid",
    "origin",
    "destination",
    "initialGateDepartureTime"
})
public class RerouteDynamicExceptionType {

    @XmlElement(required = true)
    protected String rerouteId;
    @XmlElement(required = true)
    protected String tmiName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TmiType tmiType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String acid;
    @XmlElement(required = true)
    protected String origin;
    @XmlElement(required = true)
    protected String destination;
    @XmlElement(required = true)
    protected String initialGateDepartureTime;

    /**
     * Gets the value of the rerouteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRerouteId() {
        return rerouteId;
    }

    /**
     * Sets the value of the rerouteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRerouteId(String value) {
        this.rerouteId = value;
    }

    /**
     * Gets the value of the tmiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmiName() {
        return tmiName;
    }

    /**
     * Sets the value of the tmiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmiName(String value) {
        this.tmiName = value;
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
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the initialGateDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialGateDepartureTime() {
        return initialGateDepartureTime;
    }

    /**
     * Sets the value of the initialGateDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialGateDepartureTime(String value) {
        this.initialGateDepartureTime = value;
    }

}
