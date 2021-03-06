//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.tfm._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TfmFlightDataChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TfmFlightDataChangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="chgAircraftId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="chgFlightRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="chgFlightType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="chgAircraftSpec" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="chgAircraftEquip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="chgDepArpt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="chgEDT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="chgSpeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="chgAlt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="chgDestArpt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="chgETA" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="chgRoute" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TfmFlightDataChangeType", propOrder = {

})
public class TfmFlightDataChangeType {

    protected Boolean chgAircraftId;
    protected Boolean chgFlightRules;
    protected Boolean chgFlightType;
    protected Boolean chgAircraftSpec;
    protected Boolean chgAircraftEquip;
    protected Boolean chgDepArpt;
    protected Boolean chgEDT;
    protected Boolean chgSpeed;
    protected Boolean chgAlt;
    protected Boolean chgDestArpt;
    protected Boolean chgETA;
    protected Boolean chgRoute;

    /**
     * Gets the value of the chgAircraftId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgAircraftId() {
        return chgAircraftId;
    }

    /**
     * Sets the value of the chgAircraftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgAircraftId(Boolean value) {
        this.chgAircraftId = value;
    }

    /**
     * Gets the value of the chgFlightRules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgFlightRules() {
        return chgFlightRules;
    }

    /**
     * Sets the value of the chgFlightRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgFlightRules(Boolean value) {
        this.chgFlightRules = value;
    }

    /**
     * Gets the value of the chgFlightType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgFlightType() {
        return chgFlightType;
    }

    /**
     * Sets the value of the chgFlightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgFlightType(Boolean value) {
        this.chgFlightType = value;
    }

    /**
     * Gets the value of the chgAircraftSpec property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgAircraftSpec() {
        return chgAircraftSpec;
    }

    /**
     * Sets the value of the chgAircraftSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgAircraftSpec(Boolean value) {
        this.chgAircraftSpec = value;
    }

    /**
     * Gets the value of the chgAircraftEquip property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgAircraftEquip() {
        return chgAircraftEquip;
    }

    /**
     * Sets the value of the chgAircraftEquip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgAircraftEquip(Boolean value) {
        this.chgAircraftEquip = value;
    }

    /**
     * Gets the value of the chgDepArpt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgDepArpt() {
        return chgDepArpt;
    }

    /**
     * Sets the value of the chgDepArpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgDepArpt(Boolean value) {
        this.chgDepArpt = value;
    }

    /**
     * Gets the value of the chgEDT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgEDT() {
        return chgEDT;
    }

    /**
     * Sets the value of the chgEDT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgEDT(Boolean value) {
        this.chgEDT = value;
    }

    /**
     * Gets the value of the chgSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgSpeed() {
        return chgSpeed;
    }

    /**
     * Sets the value of the chgSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgSpeed(Boolean value) {
        this.chgSpeed = value;
    }

    /**
     * Gets the value of the chgAlt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgAlt() {
        return chgAlt;
    }

    /**
     * Sets the value of the chgAlt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgAlt(Boolean value) {
        this.chgAlt = value;
    }

    /**
     * Gets the value of the chgDestArpt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgDestArpt() {
        return chgDestArpt;
    }

    /**
     * Sets the value of the chgDestArpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgDestArpt(Boolean value) {
        this.chgDestArpt = value;
    }

    /**
     * Gets the value of the chgETA property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgETA() {
        return chgETA;
    }

    /**
     * Sets the value of the chgETA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgETA(Boolean value) {
        this.chgETA = value;
    }

    /**
     * Gets the value of the chgRoute property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgRoute() {
        return chgRoute;
    }

    /**
     * Sets the value of the chgRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgRoute(Boolean value) {
        this.chgRoute = value;
    }

}
