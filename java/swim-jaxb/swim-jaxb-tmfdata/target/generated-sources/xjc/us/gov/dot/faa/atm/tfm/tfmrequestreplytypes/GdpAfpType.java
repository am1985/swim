//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gdpAfpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gdpAfpType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="programRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flightsInclude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="delayAssignmentMode" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}delayAssignmentModeType" minOccurs="0"/&gt;
 *         &lt;element name="cumTimePeriod" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}timePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="delayAssign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="avgDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="programComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gdpAfpType", propOrder = {
    "programRate",
    "flightsInclude",
    "delayAssignmentMode",
    "cumTimePeriod",
    "delayAssign",
    "maxDelay",
    "avgDelay",
    "programComment"
})
@XmlSeeAlso({
    us.gov.dot.faa.atm.tfm.tfmrequestreplytypes.DelayProgramType.GdpAfp.class
})
public class GdpAfpType {

    protected String programRate;
    protected String flightsInclude;
    @XmlSchemaType(name = "string")
    protected DelayAssignmentModeType delayAssignmentMode;
    protected TimePeriodType cumTimePeriod;
    protected String delayAssign;
    protected Integer maxDelay;
    protected Integer avgDelay;
    protected String programComment;

    /**
     * Gets the value of the programRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramRate() {
        return programRate;
    }

    /**
     * Sets the value of the programRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramRate(String value) {
        this.programRate = value;
    }

    /**
     * Gets the value of the flightsInclude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightsInclude() {
        return flightsInclude;
    }

    /**
     * Sets the value of the flightsInclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightsInclude(String value) {
        this.flightsInclude = value;
    }

    /**
     * Gets the value of the delayAssignmentMode property.
     * 
     * @return
     *     possible object is
     *     {@link DelayAssignmentModeType }
     *     
     */
    public DelayAssignmentModeType getDelayAssignmentMode() {
        return delayAssignmentMode;
    }

    /**
     * Sets the value of the delayAssignmentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayAssignmentModeType }
     *     
     */
    public void setDelayAssignmentMode(DelayAssignmentModeType value) {
        this.delayAssignmentMode = value;
    }

    /**
     * Gets the value of the cumTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getCumTimePeriod() {
        return cumTimePeriod;
    }

    /**
     * Sets the value of the cumTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setCumTimePeriod(TimePeriodType value) {
        this.cumTimePeriod = value;
    }

    /**
     * Gets the value of the delayAssign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayAssign() {
        return delayAssign;
    }

    /**
     * Sets the value of the delayAssign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayAssign(String value) {
        this.delayAssign = value;
    }

    /**
     * Gets the value of the maxDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxDelay() {
        return maxDelay;
    }

    /**
     * Sets the value of the maxDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxDelay(Integer value) {
        this.maxDelay = value;
    }

    /**
     * Gets the value of the avgDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvgDelay() {
        return avgDelay;
    }

    /**
     * Sets the value of the avgDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvgDelay(Integer value) {
        this.avgDelay = value;
    }

    /**
     * Gets the value of the programComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramComment() {
        return programComment;
    }

    /**
     * Sets the value of the programComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramComment(String value) {
        this.programComment = value;
    }

}