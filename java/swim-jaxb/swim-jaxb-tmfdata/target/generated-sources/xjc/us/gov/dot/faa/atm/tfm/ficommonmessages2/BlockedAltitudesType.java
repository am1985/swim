//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * NAS Field Reference: Field 08, 09. Components: (lowerAltitude) (higherAltitude) A block of altitudes or flight levels.
 * 
 * <p>Java class for blockedAltitudesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="blockedAltitudesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lowerAltitude" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}altitudeType"/&gt;
 *         &lt;element name="higherAltitude" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}altitudeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blockedAltitudesType", propOrder = {
    "lowerAltitude",
    "higherAltitude"
})
public class BlockedAltitudesType {

    @XmlElement(required = true)
    protected String lowerAltitude;
    @XmlElement(required = true)
    protected String higherAltitude;

    /**
     * Gets the value of the lowerAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerAltitude() {
        return lowerAltitude;
    }

    /**
     * Sets the value of the lowerAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerAltitude(String value) {
        this.lowerAltitude = value;
    }

    /**
     * Gets the value of the higherAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHigherAltitude() {
        return higherAltitude;
    }

    /**
     * Sets the value of the higherAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHigherAltitude(String value) {
        this.higherAltitude = value;
    }

}
