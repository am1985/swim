//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.base._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Significant point described by a fix. 
 *          
 * 
 * <p>Java class for FixPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FixPointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixm.aero/base/3.0}SignificantPointType"&gt;
 *       &lt;attribute name="fix" type="{http://www.fixm.aero/foundation/3.0}FixType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixPointType")
@XmlSeeAlso({
    RelativePointType.class
})
public class FixPointType
    extends SignificantPointType
{

    @XmlAttribute(name = "fix")
    protected String fix;

    /**
     * Gets the value of the fix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFix() {
        return fix;
    }

    /**
     * Sets the value of the fix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFix(String value) {
        this.fix = value;
    }

}
