//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             .Dinghy Colour: The colour of the dinghies carried by the aircraft. 
 *          
 * 
 * <p>Java class for DinghyColourType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DinghyColourType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="colourCode" type="{http://www.fixm.aero/flight/3.0}DinghyColourCodeType" minOccurs="0"/&gt;
 *         &lt;element name="otherColour" type="{http://www.fixm.aero/base/3.0}FreeTextType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DinghyColourType", propOrder = {
    "colourCode",
    "otherColour"
})
public class DinghyColourType {

    @XmlSchemaType(name = "string")
    protected DinghyColourCodeType colourCode;
    protected String otherColour;

    /**
     * Gets the value of the colourCode property.
     * 
     * @return
     *     possible object is
     *     {@link DinghyColourCodeType }
     *     
     */
    public DinghyColourCodeType getColourCode() {
        return colourCode;
    }

    /**
     * Sets the value of the colourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DinghyColourCodeType }
     *     
     */
    public void setColourCode(DinghyColourCodeType value) {
        this.colourCode = value;
    }

    /**
     * Gets the value of the otherColour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherColour() {
        return otherColour;
    }

    /**
     * Sets the value of the otherColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherColour(String value) {
        this.otherColour = value;
    }

}
