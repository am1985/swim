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
 * <p>Java class for delayProgramAdvisoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delayProgramAdvisoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ctop"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}ctopType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="delayProgram" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}delayProgramType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delayProgramAdvisoryType", propOrder = {
    "ctop",
    "delayProgram"
})
@XmlSeeAlso({
    us.gov.dot.faa.atm.tfm.tfmrequestreplytypes.AdvTmiType.DelayProgramAdvisory.class
})
public class DelayProgramAdvisoryType {

    protected DelayProgramAdvisoryType.Ctop ctop;
    protected DelayProgramType delayProgram;

    /**
     * Gets the value of the ctop property.
     * 
     * @return
     *     possible object is
     *     {@link DelayProgramAdvisoryType.Ctop }
     *     
     */
    public DelayProgramAdvisoryType.Ctop getCtop() {
        return ctop;
    }

    /**
     * Sets the value of the ctop property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayProgramAdvisoryType.Ctop }
     *     
     */
    public void setCtop(DelayProgramAdvisoryType.Ctop value) {
        this.ctop = value;
    }

    /**
     * Gets the value of the delayProgram property.
     * 
     * @return
     *     possible object is
     *     {@link DelayProgramType }
     *     
     */
    public DelayProgramType getDelayProgram() {
        return delayProgram;
    }

    /**
     * Sets the value of the delayProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayProgramType }
     *     
     */
    public void setDelayProgram(DelayProgramType value) {
        this.delayProgram = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}ctopType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Ctop
        extends CtopType
    {


    }

}
