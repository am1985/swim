//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for amendmentGenerateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="amendmentGenerateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MANUAL"/&gt;
 *     &lt;enumeration value="AUTO"/&gt;
 *     &lt;enumeration value="AUTO_CHNG_RTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "amendmentGenerateType")
@XmlEnum
public enum AmendmentGenerateType {


    /**
     * This enumerated value indicates amendment is a manual type.
     * 
     */
    MANUAL,

    /**
     * This enumerated value indicates amendment is a auto type.
     * 
     */
    AUTO,

    /**
     * This enumerated value indicates amendment is a auto type that is route changing.
     * 
     */
    AUTO_CHNG_RTE;

    public String value() {
        return name();
    }

    public static AmendmentGenerateType fromValue(String v) {
        return valueOf(v);
    }

}
