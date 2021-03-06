//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.flight._3.FlightStatusType;


/**
 * 
 *             Extends core: Flight Status: Identifies the aspect of the flight life cycle. this 
 *             allows for NAS specific handling. 
 *          
 * 
 * <p>Java class for NasFlightStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NasFlightStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixm.aero/flight/3.0}FlightStatusType"&gt;
 *       &lt;attribute name="fdpsFlightStatus" type="{http://www.faa.aero/nas/3.1}SfdpsFlightStatusType" /&gt;
 *       &lt;attribute name="tfmsStatus" type="{http://www.faa.aero/nas/3.1}TfmsFlightStatusType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasFlightStatusType")
public class NasFlightStatusType
    extends FlightStatusType
{

    @XmlAttribute(name = "fdpsFlightStatus")
    protected SfdpsFlightStatusType fdpsFlightStatus;
    @XmlAttribute(name = "tfmsStatus")
    protected TfmsFlightStatusType tfmsStatus;

    /**
     * Gets the value of the fdpsFlightStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SfdpsFlightStatusType }
     *     
     */
    public SfdpsFlightStatusType getFdpsFlightStatus() {
        return fdpsFlightStatus;
    }

    /**
     * Sets the value of the fdpsFlightStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SfdpsFlightStatusType }
     *     
     */
    public void setFdpsFlightStatus(SfdpsFlightStatusType value) {
        this.fdpsFlightStatus = value;
    }

    /**
     * Gets the value of the tfmsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TfmsFlightStatusType }
     *     
     */
    public TfmsFlightStatusType getTfmsStatus() {
        return tfmsStatus;
    }

    /**
     * Sets the value of the tfmsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfmsFlightStatusType }
     *     
     */
    public void setTfmsStatus(TfmsFlightStatusType value) {
        this.tfmsStatus = value;
    }

}
