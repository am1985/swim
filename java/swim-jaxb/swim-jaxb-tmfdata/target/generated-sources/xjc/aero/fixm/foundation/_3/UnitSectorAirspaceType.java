//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.foundation._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *             A subdivision of the airspace. 
 *          
 * 
 * <p>Java class for UnitSectorAirspaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitSectorAirspaceType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="airspaceType" type="{http://www.fixm.aero/foundation/3.0}AirspaceTypeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitSectorAirspaceType", propOrder = {
    "value"
})
public class UnitSectorAirspaceType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "airspaceType")
    protected AirspaceTypeType airspaceType;

    /**
     * Gets the value of the value property.
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
     * Gets the value of the airspaceType property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceTypeType }
     *     
     */
    public AirspaceTypeType getAirspaceType() {
        return airspaceType;
    }

    /**
     * Sets the value of the airspaceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceTypeType }
     *     
     */
    public void setAirspaceType(AirspaceTypeType value) {
        this.airspaceType = value;
    }

}
