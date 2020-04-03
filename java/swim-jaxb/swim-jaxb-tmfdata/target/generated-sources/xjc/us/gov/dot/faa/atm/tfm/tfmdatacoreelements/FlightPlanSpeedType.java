//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type defining the structure for describing a flight's speed type used in a flight plan.
 * 
 * <p>Java class for flightPlanSpeedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightPlanSpeedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="filedTrueAirSpeed" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}filedTrueAirspeedType"/&gt;
 *         &lt;element name="mach" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}machSpeedType"/&gt;
 *         &lt;element name="classified" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightPlanSpeedType", propOrder = {
    "filedTrueAirSpeed",
    "mach",
    "classified"
})
public class FlightPlanSpeedType {

    @XmlSchemaType(name = "integer")
    protected Integer filedTrueAirSpeed;
    @XmlSchemaType(name = "integer")
    protected Integer mach;
    @XmlElementRef(name = "classified", namespace = "urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> classified;

    /**
     * Gets the value of the filedTrueAirSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFiledTrueAirSpeed() {
        return filedTrueAirSpeed;
    }

    /**
     * Sets the value of the filedTrueAirSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFiledTrueAirSpeed(Integer value) {
        this.filedTrueAirSpeed = value;
    }

    /**
     * Gets the value of the mach property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMach() {
        return mach;
    }

    /**
     * Sets the value of the mach property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMach(Integer value) {
        this.mach = value;
    }

    /**
     * Gets the value of the classified property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getClassified() {
        return classified;
    }

    /**
     * Sets the value of the classified property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setClassified(JAXBElement<Boolean> value) {
        this.classified = value;
    }

}
