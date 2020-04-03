//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdvisoryTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdvisoryTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GDP"/&gt;
 *     &lt;enumeration value="AFP"/&gt;
 *     &lt;enumeration value="GDP_CANCEL"/&gt;
 *     &lt;enumeration value="AFP_CANCEL"/&gt;
 *     &lt;enumeration value="GS"/&gt;
 *     &lt;enumeration value="GS_CANCEL"/&gt;
 *     &lt;enumeration value="REROUTE"/&gt;
 *     &lt;enumeration value="CTOP"/&gt;
 *     &lt;enumeration value="CTOP_CANCEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdvisoryTypeType")
@XmlEnum
public enum AdvisoryTypeType {


    /**
     * 
     *                   Ground Delay Program Advisory 
     *                
     * 
     */
    GDP,

    /**
     * 
     *                   Airspace Flow Program Advisory 
     *                
     * 
     */
    AFP,

    /**
     * 
     *                   Ground Delay Program cancellation Advisory 
     *                
     * 
     */
    GDP_CANCEL,

    /**
     * 
     *                   Airspace Flow Program Cancellation Advisory 
     *                
     * 
     */
    AFP_CANCEL,

    /**
     * 
     *                   Ground Stop Program Advisory 
     *                
     * 
     */
    GS,

    /**
     * 
     *                   Ground Stop Program cancellation Advisory 
     *                
     * 
     */
    GS_CANCEL,

    /**
     * 
     *                   Reroute Advisory 
     *                
     * 
     */
    REROUTE,

    /**
     * 
     *                   Collaborative Trajectory Options Program Advisory 
     *                
     * 
     */
    CTOP,

    /**
     * 
     *                   Collaborative Trajectory Options Program cancellation Advisory 
     *                
     * 
     */
    CTOP_CANCEL;

    public String value() {
        return name();
    }

    public static AdvisoryTypeType fromValue(String v) {
        return valueOf(v);
    }

}