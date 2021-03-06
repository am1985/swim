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


/**
 * 
 *             .Aircraft Type: The manufacturer and model of the airframe expressed either as an 
 *             ICAO-approved designator or a text description. 
 *          
 * 
 * <p>Java class for AircraftTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="icaoModelIdentifier" type="{http://www.fixm.aero/base/3.0}IcaoAircraftIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="otherModelData" type="{http://www.fixm.aero/base/3.0}FreeTextType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftTypeType", propOrder = {
    "icaoModelIdentifier",
    "otherModelData"
})
public class AircraftTypeType {

    protected String icaoModelIdentifier;
    protected String otherModelData;

    /**
     * Gets the value of the icaoModelIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcaoModelIdentifier() {
        return icaoModelIdentifier;
    }

    /**
     * Sets the value of the icaoModelIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcaoModelIdentifier(String value) {
        this.icaoModelIdentifier = value;
    }

    /**
     * Gets the value of the otherModelData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherModelData() {
        return otherModelData;
    }

    /**
     * Sets the value of the otherModelData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherModelData(String value) {
        this.otherModelData = value;
    }

}
