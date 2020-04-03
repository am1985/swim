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
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *             This is a TFMS Specific route designator that can be defined as one of several specific 
 *             TFMS route types. 
 *          
 * 
 * <p>Java class for TfmsInstrumentRouteDesignatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TfmsInstrumentRouteDesignatorType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.fixm.aero/base/3.0&gt;StandardInstrumentRouteDesignatorType"&gt;
 *       &lt;attribute name="routeType" type="{http://www.faa.aero/nas/3.1}TfmsRouteTypeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TfmsInstrumentRouteDesignatorType", propOrder = {
    "value"
})
public class TfmsInstrumentRouteDesignatorType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "routeType")
    protected TfmsRouteTypeType routeType;

    /**
     * 
     *             Describes a standard instrument route procedure. May be used for arrival or departure 
     *             depending on context. 
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
     * Gets the value of the routeType property.
     * 
     * @return
     *     possible object is
     *     {@link TfmsRouteTypeType }
     *     
     */
    public TfmsRouteTypeType getRouteType() {
        return routeType;
    }

    /**
     * Sets the value of the routeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfmsRouteTypeType }
     *     
     */
    public void setRouteType(TfmsRouteTypeType value) {
        this.routeType = value;
    }

}