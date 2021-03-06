//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tmiFacilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tmiFacilitiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="addDepartureFacilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exemptDepartureFacilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="includedCanadianAirports" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tmiFacilitiesType", propOrder = {
    "distance",
    "addDepartureFacilities",
    "exemptDepartureFacilities",
    "includedCanadianAirports"
})
@XmlSeeAlso({
    us.gov.dot.faa.atm.tfm.tfmrequestreplytypes.DelayProgramType.DepartureScope.class
})
public class TmiFacilitiesType {

    protected Integer distance;
    protected String addDepartureFacilities;
    protected String exemptDepartureFacilities;
    protected String includedCanadianAirports;

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistance(Integer value) {
        this.distance = value;
    }

    /**
     * Gets the value of the addDepartureFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddDepartureFacilities() {
        return addDepartureFacilities;
    }

    /**
     * Sets the value of the addDepartureFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddDepartureFacilities(String value) {
        this.addDepartureFacilities = value;
    }

    /**
     * Gets the value of the exemptDepartureFacilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptDepartureFacilities() {
        return exemptDepartureFacilities;
    }

    /**
     * Sets the value of the exemptDepartureFacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptDepartureFacilities(String value) {
        this.exemptDepartureFacilities = value;
    }

    /**
     * Gets the value of the includedCanadianAirports property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludedCanadianAirports() {
        return includedCanadianAirports;
    }

    /**
     * Sets the value of the includedCanadianAirports property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludedCanadianAirports(String value) {
        this.includedCanadianAirports = value;
    }

}
