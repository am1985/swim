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
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *             .Air Waybill Number: The number referencing the air waybill. 
 *          
 * 
 * <p>Java class for AirWaybillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirWaybillType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.fixm.aero/base/3.0&gt;FreeTextType"&gt;
 *       &lt;attribute name="airWaybillNumber" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirWaybillType", propOrder = {
    "value"
})
public class AirWaybillType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "airWaybillNumber")
    protected String airWaybillNumber;

    /**
     * 
     *             Provides a standard representation for elements that may contain any text, 
     *             such as comments and notes. 
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
     * Gets the value of the airWaybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirWaybillNumber() {
        return airWaybillNumber;
    }

    /**
     * Sets the value of the airWaybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirWaybillNumber(String value) {
        this.airWaybillNumber = value;
    }

}
