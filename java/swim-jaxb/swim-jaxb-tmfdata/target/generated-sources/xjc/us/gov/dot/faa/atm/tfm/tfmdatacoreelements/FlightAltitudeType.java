//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The flightAltitudeType is used to report the altitudes used in the NAS.
 * 
 * <p>Java class for flightAltitudeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightAltitudeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="requestedAltitude" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}requestedAltitudeType"/&gt;
 *         &lt;element name="assignedAltitude" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}assignedAltitudeType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightAltitudeType", propOrder = {
    "requestedAltitude",
    "assignedAltitude"
})
public class FlightAltitudeType {

    protected RequestedAltitudeType requestedAltitude;
    protected AssignedAltitudeType assignedAltitude;

    /**
     * Gets the value of the requestedAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedAltitudeType }
     *     
     */
    public RequestedAltitudeType getRequestedAltitude() {
        return requestedAltitude;
    }

    /**
     * Sets the value of the requestedAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedAltitudeType }
     *     
     */
    public void setRequestedAltitude(RequestedAltitudeType value) {
        this.requestedAltitude = value;
    }

    /**
     * Gets the value of the assignedAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedAltitudeType }
     *     
     */
    public AssignedAltitudeType getAssignedAltitude() {
        return assignedAltitude;
    }

    /**
     * Sets the value of the assignedAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedAltitudeType }
     *     
     */
    public void setAssignedAltitude(AssignedAltitudeType value) {
        this.assignedAltitude = value;
    }

}
