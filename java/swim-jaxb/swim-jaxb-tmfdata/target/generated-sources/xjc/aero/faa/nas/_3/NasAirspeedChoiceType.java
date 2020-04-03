//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.foundation._3.TrueAirspeedOrMachType;


/**
 * 
 *             A NAS extension to add an additional optional value to element Airspeed, 
 *             In the NAS this element is: Aircraft Speed/Speed Classified.
 *             The value is "SC". Used when the speed is a classifed value.
 *          
 * 
 * <p>Java class for NasAirspeedChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NasAirspeedChoiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="classified" type="{http://www.faa.aero/nas/3.1}ClassifiedSpeedIndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="nasAirspeed" type="{http://www.fixm.aero/foundation/3.0}TrueAirspeedOrMachType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasAirspeedChoiceType", propOrder = {
    "classified",
    "nasAirspeed"
})
public class NasAirspeedChoiceType {

    @XmlSchemaType(name = "string")
    protected ClassifiedSpeedIndicatorType classified;
    protected TrueAirspeedOrMachType nasAirspeed;

    /**
     * Gets the value of the classified property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedSpeedIndicatorType }
     *     
     */
    public ClassifiedSpeedIndicatorType getClassified() {
        return classified;
    }

    /**
     * Sets the value of the classified property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedSpeedIndicatorType }
     *     
     */
    public void setClassified(ClassifiedSpeedIndicatorType value) {
        this.classified = value;
    }

    /**
     * Gets the value of the nasAirspeed property.
     * 
     * @return
     *     possible object is
     *     {@link TrueAirspeedOrMachType }
     *     
     */
    public TrueAirspeedOrMachType getNasAirspeed() {
        return nasAirspeed;
    }

    /**
     * Sets the value of the nasAirspeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueAirspeedOrMachType }
     *     
     */
    public void setNasAirspeed(TrueAirspeedOrMachType value) {
        this.nasAirspeed = value;
    }

}
