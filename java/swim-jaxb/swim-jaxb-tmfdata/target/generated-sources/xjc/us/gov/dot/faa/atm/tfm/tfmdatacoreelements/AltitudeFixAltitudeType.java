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
 * Altitude fix Altitude Type contains an altitude having a valid format of (d)dd/fix/dd(d) where fix is a valid 2-12 character fix designation.
 * 
 * <p>Java class for altitudeFixAltitudeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="altitudeFixAltitudeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixType"&gt;
 *       &lt;attribute name="preFixAltitude" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}simpleAltitudeType" /&gt;
 *       &lt;attribute name="postFixAltitude" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}simpleAltitudeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altitudeFixAltitudeType")
public class AltitudeFixAltitudeType
    extends FixType
{

    @XmlAttribute(name = "preFixAltitude", required = true)
    protected String preFixAltitude;
    @XmlAttribute(name = "postFixAltitude", required = true)
    protected String postFixAltitude;

    /**
     * Gets the value of the preFixAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreFixAltitude() {
        return preFixAltitude;
    }

    /**
     * Sets the value of the preFixAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreFixAltitude(String value) {
        this.preFixAltitude = value;
    }

    /**
     * Gets the value of the postFixAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostFixAltitude() {
        return postFixAltitude;
    }

    /**
     * Sets the value of the postFixAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostFixAltitude(String value) {
        this.postFixAltitude = value;
    }

}
