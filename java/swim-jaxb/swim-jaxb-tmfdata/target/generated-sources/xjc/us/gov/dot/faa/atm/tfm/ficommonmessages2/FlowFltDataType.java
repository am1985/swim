//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the flight's AFP/GDP/GS unique data.
 * 
 * <p>Java class for flowFltDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flowFltDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="slotData" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}slotDataType"/&gt;
 *         &lt;element name="SUB" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fcaIdReference" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fcaIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flowFltDataType", propOrder = {
    "slotData",
    "sub",
    "fcaIdReference"
})
public class FlowFltDataType {

    @XmlElement(required = true)
    protected SlotDataType slotData;
    @XmlElement(name = "SUB")
    protected Boolean sub;
    protected String fcaIdReference;

    /**
     * Gets the value of the slotData property.
     * 
     * @return
     *     possible object is
     *     {@link SlotDataType }
     *     
     */
    public SlotDataType getSlotData() {
        return slotData;
    }

    /**
     * Sets the value of the slotData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotDataType }
     *     
     */
    public void setSlotData(SlotDataType value) {
        this.slotData = value;
    }

    /**
     * Gets the value of the sub property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSUB() {
        return sub;
    }

    /**
     * Sets the value of the sub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSUB(Boolean value) {
        this.sub = value;
    }

    /**
     * Gets the value of the fcaIdReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcaIdReference() {
        return fcaIdReference;
    }

    /**
     * Sets the value of the fcaIdReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcaIdReference(String value) {
        this.fcaIdReference = value;
    }

}