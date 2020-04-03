//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type defining the structure for describing a flight's visual flight rules type. When OTP, the optional vrfOnTOP attribute = true. When OTP/(d)dd, the optional vfrOnTOP attribute = true, AND the optional altitude attribute is occupied with the value in format (d)dd. When VFR, the optional attributes altitude and vrfOnTop are not present. When VFR/(d)dd, the optional altitude attribute is occupied with the value in format (d)dd.
 * 
 * <p>Java class for visualFlightRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="visualFlightRulesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="altitude" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}simpleAltitudeType" /&gt;
 *       &lt;attribute name="vfrOnTop" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visualFlightRulesType")
public class VisualFlightRulesType {

    @XmlAttribute(name = "altitude")
    protected String altitude;
    @XmlAttribute(name = "vfrOnTop")
    protected Boolean vfrOnTop;

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitude(String value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the vfrOnTop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVfrOnTop() {
        return vfrOnTop;
    }

    /**
     * Sets the value of the vfrOnTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVfrOnTop(Boolean value) {
        this.vfrOnTop = value;
    }

}
