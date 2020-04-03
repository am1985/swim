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
import aero.fixm.base._3.FeatureType;


/**
 * 
 *             Describes the flight plan structure used by NAS. Based on core ICAO flight plan. 
 *             
 *          
 * 
 * <p>Java class for NasFlightPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NasFlightPlanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixm.aero/base/3.0}FeatureType"&gt;
 *       &lt;attribute name="flightPlanRemarks" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="identifier" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasFlightPlanType")
public class NasFlightPlanType
    extends FeatureType
{

    @XmlAttribute(name = "flightPlanRemarks")
    protected String flightPlanRemarks;
    @XmlAttribute(name = "identifier")
    protected String identifier;

    /**
     * Gets the value of the flightPlanRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightPlanRemarks() {
        return flightPlanRemarks;
    }

    /**
     * Sets the value of the flightPlanRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightPlanRemarks(String value) {
        this.flightPlanRemarks = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

}