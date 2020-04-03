//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.base._3.ReportedTimeType;


/**
 * 
 *             Container for 
 *             Airspace Exit Time - Traffic Flow Management System Estimated 
 *          
 * 
 * <p>Java class for AirspaceExitTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirspaceExitTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tfmsEstimated" type="{http://www.fixm.aero/base/3.0}ReportedTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspaceExitTimeType", propOrder = {
    "tfmsEstimated"
})
public class AirspaceExitTimeType {

    protected ReportedTimeType tfmsEstimated;

    /**
     * Gets the value of the tfmsEstimated property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedTimeType }
     *     
     */
    public ReportedTimeType getTfmsEstimated() {
        return tfmsEstimated;
    }

    /**
     * Sets the value of the tfmsEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedTimeType }
     *     
     */
    public void setTfmsEstimated(ReportedTimeType value) {
        this.tfmsEstimated = value;
    }

}