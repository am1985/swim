//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.base._3.SignificantPointType;
import aero.fixm.foundation._3.UnitSectorAirspaceType;


/**
 * 
 *             The location associated with estimated elapsed time. It can be a longitude, significant 
 *             point of flight information region. 
 *          
 * 
 * <p>Java class for ElapsedTimeLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElapsedTimeLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="longitude" type="{http://www.fixm.aero/foundation/3.0}LongitudeType" minOccurs="0"/&gt;
 *         &lt;element name="point" type="{http://www.fixm.aero/base/3.0}SignificantPointType" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://www.fixm.aero/foundation/3.0}UnitSectorAirspaceType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElapsedTimeLocationType", propOrder = {
    "longitude",
    "point",
    "region"
})
public class ElapsedTimeLocationType {

    protected Double longitude;
    protected SignificantPointType point;
    protected UnitSectorAirspaceType region;

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * @return
     *     possible object is
     *     {@link SignificantPointType }
     *     
     */
    public SignificantPointType getPoint() {
        return point;
    }

    /**
     * Sets the value of the point property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificantPointType }
     *     
     */
    public void setPoint(SignificantPointType value) {
        this.point = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link UnitSectorAirspaceType }
     *     
     */
    public UnitSectorAirspaceType getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSectorAirspaceType }
     *     
     */
    public void setRegion(UnitSectorAirspaceType value) {
        this.region = value;
    }

}
