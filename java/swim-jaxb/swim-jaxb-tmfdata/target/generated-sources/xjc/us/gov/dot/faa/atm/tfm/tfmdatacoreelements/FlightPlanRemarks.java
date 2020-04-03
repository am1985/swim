//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Flight Plan Remarks contain comments related to this flight plan.
 * 
 * <p>Java class for flightPlanRemarks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightPlanRemarks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="interCenterRemarks" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="intraCenterRemarks" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightPlanRemarks", propOrder = {
    "interCenterRemarks",
    "intraCenterRemarks"
})
public class FlightPlanRemarks {

    protected String interCenterRemarks;
    protected String intraCenterRemarks;

    /**
     * Gets the value of the interCenterRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterCenterRemarks() {
        return interCenterRemarks;
    }

    /**
     * Sets the value of the interCenterRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterCenterRemarks(String value) {
        this.interCenterRemarks = value;
    }

    /**
     * Gets the value of the intraCenterRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraCenterRemarks() {
        return intraCenterRemarks;
    }

    /**
     * Sets the value of the intraCenterRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraCenterRemarks(String value) {
        this.intraCenterRemarks = value;
    }

}
