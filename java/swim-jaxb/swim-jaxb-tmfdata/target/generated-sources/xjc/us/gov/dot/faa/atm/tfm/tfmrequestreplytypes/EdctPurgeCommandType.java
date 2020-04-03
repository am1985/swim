//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The EDCT Purge command purges EDCT flight controls for a specified airport or FCA or for all airports or FCAs.
 * 
 * <p>Java class for edctPurgeCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edctPurgeCommandType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlElement" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}controlElementNameType"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="directionality" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="BEFORE"/&gt;
 *               &lt;enumeration value="AFTER"/&gt;
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
@XmlType(name = "edctPurgeCommandType", propOrder = {
    "controlElement",
    "time",
    "directionality"
})
public class EdctPurgeCommandType {

    @XmlElement(required = true)
    protected String controlElement;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    protected String directionality;

    /**
     * Gets the value of the controlElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlElement() {
        return controlElement;
    }

    /**
     * Sets the value of the controlElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlElement(String value) {
        this.controlElement = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the directionality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectionality() {
        return directionality;
    }

    /**
     * Sets the value of the directionality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectionality(String value) {
        this.directionality = value;
    }

}
