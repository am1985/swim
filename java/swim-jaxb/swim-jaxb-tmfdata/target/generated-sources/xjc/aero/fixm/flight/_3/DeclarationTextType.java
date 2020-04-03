//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             .Declaration Text: Consignor: The consignor's statement indicating the dangerous 
 *             goods have been packaged and handled according to regulations. 
 *             .Declaration Text: Shipper: This shipper's statement indicating the dangerous goods 
 *             have been packaged and handled according to regulations. 
 *             .Declaration Text: Compliance: The warning message for not complying with the regulations. 
 *             
 *          
 * 
 * <p>Java class for DeclarationTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeclarationTextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="compliance" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="consignor" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="shipper" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclarationTextType")
public class DeclarationTextType {

    @XmlAttribute(name = "compliance")
    protected String compliance;
    @XmlAttribute(name = "consignor")
    protected String consignor;
    @XmlAttribute(name = "shipper")
    protected String shipper;

    /**
     * Gets the value of the compliance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompliance() {
        return compliance;
    }

    /**
     * Sets the value of the compliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompliance(String value) {
        this.compliance = value;
    }

    /**
     * Gets the value of the consignor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsignor() {
        return consignor;
    }

    /**
     * Sets the value of the consignor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignor(String value) {
        this.consignor = value;
    }

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipper(String value) {
        this.shipper = value;
    }

}
