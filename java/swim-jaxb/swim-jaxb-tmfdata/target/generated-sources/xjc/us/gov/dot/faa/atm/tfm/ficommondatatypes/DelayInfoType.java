//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.ficommondatatypes;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Delay information consisting of total, maximum, and average delay.
 * 
 * <p>Java class for delayInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delayInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalDelay" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="maxDelay" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="avgDelay" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delayInfoType", propOrder = {
    "totalDelay",
    "maxDelay",
    "avgDelay"
})
public class DelayInfoType {

    @XmlElement(required = true)
    protected BigInteger totalDelay;
    @XmlElement(required = true)
    protected BigInteger maxDelay;
    protected float avgDelay;

    /**
     * Gets the value of the totalDelay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalDelay() {
        return totalDelay;
    }

    /**
     * Sets the value of the totalDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalDelay(BigInteger value) {
        this.totalDelay = value;
    }

    /**
     * Gets the value of the maxDelay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDelay() {
        return maxDelay;
    }

    /**
     * Sets the value of the maxDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDelay(BigInteger value) {
        this.maxDelay = value;
    }

    /**
     * Gets the value of the avgDelay property.
     * 
     */
    public float getAvgDelay() {
        return avgDelay;
    }

    /**
     * Sets the value of the avgDelay property.
     * 
     */
    public void setAvgDelay(float value) {
        this.avgDelay = value;
    }

}