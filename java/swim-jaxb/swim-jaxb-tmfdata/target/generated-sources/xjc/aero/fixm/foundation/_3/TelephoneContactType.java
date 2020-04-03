//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.foundation._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Telephone numbers at which the organisation or individual may be contacted.  From 
 *             ISO19115-2003 
 *          
 * 
 * <p>Java class for TelephoneContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneContactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="facimile" type="{http://www.fixm.aero/foundation/3.0}TextPhoneType" /&gt;
 *       &lt;attribute name="voice" type="{http://www.fixm.aero/foundation/3.0}TextPhoneType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneContactType")
public class TelephoneContactType {

    @XmlAttribute(name = "facimile")
    protected String facimile;
    @XmlAttribute(name = "voice")
    protected String voice;

    /**
     * Gets the value of the facimile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacimile() {
        return facimile;
    }

    /**
     * Sets the value of the facimile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacimile(String value) {
        this.facimile = value;
    }

    /**
     * Gets the value of the voice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoice() {
        return voice;
    }

    /**
     * Sets the value of the voice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoice(String value) {
        this.voice = value;
    }

}