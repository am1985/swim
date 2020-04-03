//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.faa.nas._3.NasAircraftPositionType;
import aero.fixm.base._3.DirectionType;
import aero.fixm.base._3.FeatureType;
import aero.fixm.base._3.SignificantPointType;
import aero.fixm.foundation._3.AltitudeType;


/**
 * 
 *             Contains the current position and associated data of the aircraft. 
 *          
 * 
 * <p>Java class for AircraftPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftPositionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixm.aero/base/3.0}FeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actualSpeed" type="{http://www.fixm.aero/flight/3.0}ActualSpeedType" minOccurs="0"/&gt;
 *         &lt;element name="altitude" type="{http://www.fixm.aero/foundation/3.0}AltitudeType" minOccurs="0"/&gt;
 *         &lt;element name="followingPosition" type="{http://www.fixm.aero/flight/3.0}PlannedReportingPositionType" minOccurs="0"/&gt;
 *         &lt;element name="nextPosition" type="{http://www.fixm.aero/flight/3.0}PlannedReportingPositionType" minOccurs="0"/&gt;
 *         &lt;element name="position" type="{http://www.fixm.aero/base/3.0}SignificantPointType" minOccurs="0"/&gt;
 *         &lt;element name="track" type="{http://www.fixm.aero/base/3.0}DirectionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="positionTime" type="{http://www.fixm.aero/foundation/3.0}TimeType" /&gt;
 *       &lt;attribute name="reportSource" type="{http://www.fixm.aero/flight/3.0}PositionReportSourceType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftPositionType", propOrder = {
    "actualSpeed",
    "altitude",
    "followingPosition",
    "nextPosition",
    "position",
    "track"
})
@XmlSeeAlso({
    NasAircraftPositionType.class
})
public class AircraftPositionType
    extends FeatureType
{

    protected ActualSpeedType actualSpeed;
    protected AltitudeType altitude;
    @XmlElementRef(name = "followingPosition", type = JAXBElement.class, required = false)
    protected JAXBElement<PlannedReportingPositionType> followingPosition;
    @XmlElementRef(name = "nextPosition", type = JAXBElement.class, required = false)
    protected JAXBElement<PlannedReportingPositionType> nextPosition;
    protected SignificantPointType position;
    protected DirectionType track;
    @XmlAttribute(name = "positionTime")
    protected XMLGregorianCalendar positionTime;
    @XmlAttribute(name = "reportSource")
    protected PositionReportSourceType reportSource;

    /**
     * Gets the value of the actualSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link ActualSpeedType }
     *     
     */
    public ActualSpeedType getActualSpeed() {
        return actualSpeed;
    }

    /**
     * Sets the value of the actualSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualSpeedType }
     *     
     */
    public void setActualSpeed(ActualSpeedType value) {
        this.actualSpeed = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeType }
     *     
     */
    public AltitudeType getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeType }
     *     
     */
    public void setAltitude(AltitudeType value) {
        this.altitude = value;
    }

    /**
     * Gets the value of the followingPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlannedReportingPositionType }{@code >}
     *     
     */
    public JAXBElement<PlannedReportingPositionType> getFollowingPosition() {
        return followingPosition;
    }

    /**
     * Sets the value of the followingPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlannedReportingPositionType }{@code >}
     *     
     */
    public void setFollowingPosition(JAXBElement<PlannedReportingPositionType> value) {
        this.followingPosition = value;
    }

    /**
     * Gets the value of the nextPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlannedReportingPositionType }{@code >}
     *     
     */
    public JAXBElement<PlannedReportingPositionType> getNextPosition() {
        return nextPosition;
    }

    /**
     * Sets the value of the nextPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlannedReportingPositionType }{@code >}
     *     
     */
    public void setNextPosition(JAXBElement<PlannedReportingPositionType> value) {
        this.nextPosition = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link SignificantPointType }
     *     
     */
    public SignificantPointType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificantPointType }
     *     
     */
    public void setPosition(SignificantPointType value) {
        this.position = value;
    }

    /**
     * Gets the value of the track property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionType }
     *     
     */
    public DirectionType getTrack() {
        return track;
    }

    /**
     * Sets the value of the track property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionType }
     *     
     */
    public void setTrack(DirectionType value) {
        this.track = value;
    }

    /**
     * Gets the value of the positionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPositionTime() {
        return positionTime;
    }

    /**
     * Sets the value of the positionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPositionTime(XMLGregorianCalendar value) {
        this.positionTime = value;
    }

    /**
     * Gets the value of the reportSource property.
     * 
     * @return
     *     possible object is
     *     {@link PositionReportSourceType }
     *     
     */
    public PositionReportSourceType getReportSource() {
        return reportSource;
    }

    /**
     * Sets the value of the reportSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionReportSourceType }
     *     
     */
    public void setReportSource(PositionReportSourceType value) {
        this.reportSource = value;
    }

}