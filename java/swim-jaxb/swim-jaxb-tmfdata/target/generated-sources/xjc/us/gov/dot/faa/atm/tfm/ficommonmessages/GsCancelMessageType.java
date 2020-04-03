//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.ElementTypeType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.TimePeriodType;


/**
 * Message type for proposed GS Cancel advisory.
 * 
 * <p>Java class for gsCancelMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gsCancelMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="tmiStatus" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}tmiStatusType"/&gt;
 *         &lt;element name="airportId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/&gt;
 *         &lt;element name="center" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}centerIdType"/&gt;
 *         &lt;element name="pgmExpTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="elementType" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}elementTypeType"/&gt;
 *         &lt;element name="adlTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="advisoryValidPeriod" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}timePeriodType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gsCancelMessageType", propOrder = {
    "updateTime",
    "tmiStatus",
    "airportId",
    "center",
    "pgmExpTime",
    "elementType",
    "adlTime",
    "advisoryValidPeriod"
})
public class GsCancelMessageType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TmiStatusType tmiStatus;
    @XmlElement(required = true)
    protected String airportId;
    @XmlElement(required = true)
    protected String center;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pgmExpTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ElementTypeType elementType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar adlTime;
    @XmlElement(required = true)
    protected TimePeriodType advisoryValidPeriod;

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
     * Gets the value of the airportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportId() {
        return airportId;
    }

    /**
     * Sets the value of the airportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportId(String value) {
        this.airportId = value;
    }

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenter(String value) {
        this.center = value;
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

}