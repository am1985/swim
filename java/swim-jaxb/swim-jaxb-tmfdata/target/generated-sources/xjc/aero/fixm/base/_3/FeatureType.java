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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.faa.nas._3.NasFlightPlanType;
import aero.fixm.flight._3.AircraftPositionType;
import aero.fixm.flight._3.AircraftType;
import aero.fixm.flight._3.DangerousGoodsType;
import aero.fixm.flight._3.EnRouteType;
import aero.fixm.flight._3.FlightArrivalType;
import aero.fixm.flight._3.FlightDepartureType;
import aero.fixm.flight._3.FlightEmergencyType;
import aero.fixm.flight._3.FlightStatusType;
import aero.fixm.flight._3.FlightType;
import aero.fixm.flight._3.LastContactType;
import aero.fixm.flight._3.RadioCommunicationFailureType;
import aero.fixm.flight._3.RouteType;


/**
 * 
 *             The Feature type is the parent of all FIXM complex types that describe physical 
 *             objects or events. 
 *              
 *             It is used as a marker to messaging and other tools that the contained information 
 *             is 
 *             to be treated as an unit and not further decomposed. 
 *              
 *             Feature carries information about the ultimate source of its contained data 
 *             in the "Provenance" attribute group. Implicitly, this information qualifies all the 
 *             
 *             contained elements, unless one of them overrides it locally. 
 *              
 *             It is expected that applications will use this to record their own meta-data about 
 *             the information contained in the feature. 
 *          
 * 
 * <p>Java class for FeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.fixm.aero/base/3.0}ProvenanceType"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureType")
@XmlSeeAlso({
    ExtensionType.class,
    DangerousGoodsType.class,
    FlightEmergencyType.class,
    LastContactType.class,
    RadioCommunicationFailureType.class,
    AircraftType.class,
    FlightArrivalType.class,
    FlightDepartureType.class,
    EnRouteType.class,
    NasFlightPlanType.class,
    FlightType.class,
    AircraftPositionType.class,
    RouteType.class,
    FlightStatusType.class
})
public abstract class FeatureType {

    @XmlAttribute(name = "centre")
    protected String centre;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "system")
    protected String system;
    @XmlAttribute(name = "timestamp")
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the centre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentre() {
        return centre;
    }

    /**
     * Sets the value of the centre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentre(String value) {
        this.centre = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
