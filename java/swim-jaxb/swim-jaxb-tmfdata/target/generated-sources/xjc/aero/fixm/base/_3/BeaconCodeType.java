//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.base._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *             .Beacon Code: The assigned four-character numeric code transmitted by the aircraft 
 *             transponder in response to a secondary surveillance radar interrogation signal which 
 *             is used to assist air traffic controllers to identify aircraft. 
 *          
 * 
 * <p>Java class for BeaconCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeaconCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.fixm.aero/base/3.0&gt;RestrictedBeaconCodeType"&gt;
 *       &lt;attribute name="ssrMode" type="{http://www.fixm.aero/base/3.0}SsrModeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeaconCodeType", propOrder = {
    "value"
})
public class BeaconCodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ssrMode")
    protected SsrModeType ssrMode;

    /**
     * 
     *             Helper type for restrictions on BeaconCodeType 
     *          
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the ssrMode property.
     * 
     * @return
     *     possible object is
     *     {@link SsrModeType }
     *     
     */
    public SsrModeType getSsrMode() {
        return ssrMode;
    }

    /**
     * Sets the value of the ssrMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SsrModeType }
     *     
     */
    public void setSsrMode(SsrModeType value) {
        this.ssrMode = value;
    }

}
