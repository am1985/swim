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
 * <p>Java class for amendmentStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="amendmentStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SENT"/&gt;
 *     &lt;enumeration value="HELD"/&gt;
 *     &lt;enumeration value="TOUT"/&gt;
 *     &lt;enumeration value="PEND"/&gt;
 *     &lt;enumeration value="APLD"/&gt;
 *     &lt;enumeration value="AMOD"/&gt;
 *     &lt;enumeration value="DROP"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "amendmentStatusType")
@XmlEnum
public enum AmendmentStatusType {


    /**
     * This enumerated value indicates amendment successfully
     *                         sent to ERAM.
     * 
     */
    SENT,

    /**
     * This enumerated value indicates amendment successfully
     *                         held.
     * 
     */
    HELD,

    /**
     * This enumerated value indicates amendment timed out.
     * 
     */
    TOUT,

    /**
     * This enumerated value indicates amendment is pending.
     * 
     */
    PEND,

    /**
     * This enumerated value indicates amendment was applied.
     * 
     */
    APLD,

    /**
     * This enumerated value indicates amendment was applied
     *                         with modifications.
     * 
     */
    AMOD,

    /**
     * This enumerated value indicates amendment was dropped.
     * 
     */
    DROP,

    /**
     * This enumerated value indicates amendment was rejected.
     * 
     */
    RJCT;

    public String value() {
        return name();
    }

    public static AmendmentStatusType fromValue(String v) {
        return valueOf(v);
    }

}
