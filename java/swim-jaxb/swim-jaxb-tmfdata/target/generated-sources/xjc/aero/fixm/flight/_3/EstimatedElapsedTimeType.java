//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * 
 *             .Elapsed Time - Estimated: The estimated amount of time from takeoff to reach a significant 
 *             point or Flight Information Region (FIR) boundary along the route of flight. 
 *          
 * 
 * <p>Java class for EstimatedElapsedTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimatedElapsedTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="location" type="{http://www.fixm.aero/flight/3.0}ElapsedTimeLocationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="elapsedTime" use="required" type="{http://www.fixm.aero/foundation/3.0}DurationType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedElapsedTimeType", propOrder = {
    "location"
})
public class EstimatedElapsedTimeType {

    protected ElapsedTimeLocationType location;
    @XmlAttribute(name = "elapsedTime", required = true)
    protected Duration elapsedTime;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ElapsedTimeLocationType }
     *     
     */
    public ElapsedTimeLocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElapsedTimeLocationType }
     *     
     */
    public void setLocation(ElapsedTimeLocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the elapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Sets the value of the elapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setElapsedTime(Duration value) {
        this.elapsedTime = value;
    }

}
