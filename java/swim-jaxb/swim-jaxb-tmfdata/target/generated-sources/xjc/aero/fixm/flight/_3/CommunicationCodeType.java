//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommunicationCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="E1"/&gt;
 *     &lt;enumeration value="E2"/&gt;
 *     &lt;enumeration value="E3"/&gt;
 *     &lt;enumeration value="H"/&gt;
 *     &lt;enumeration value="M1"/&gt;
 *     &lt;enumeration value="M2"/&gt;
 *     &lt;enumeration value="M3"/&gt;
 *     &lt;enumeration value="P1"/&gt;
 *     &lt;enumeration value="P2"/&gt;
 *     &lt;enumeration value="P3"/&gt;
 *     &lt;enumeration value="P4"/&gt;
 *     &lt;enumeration value="P5"/&gt;
 *     &lt;enumeration value="P6"/&gt;
 *     &lt;enumeration value="P7"/&gt;
 *     &lt;enumeration value="P8"/&gt;
 *     &lt;enumeration value="P9"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="V"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommunicationCodeType")
@XmlEnum
public enum CommunicationCodeType {

    @XmlEnumValue("E1")
    E_1("E1"),
    @XmlEnumValue("E2")
    E_2("E2"),
    @XmlEnumValue("E3")
    E_3("E3"),
    H("H"),
    @XmlEnumValue("M1")
    M_1("M1"),
    @XmlEnumValue("M2")
    M_2("M2"),
    @XmlEnumValue("M3")
    M_3("M3"),
    @XmlEnumValue("P1")
    P_1("P1"),
    @XmlEnumValue("P2")
    P_2("P2"),
    @XmlEnumValue("P3")
    P_3("P3"),
    @XmlEnumValue("P4")
    P_4("P4"),
    @XmlEnumValue("P5")
    P_5("P5"),
    @XmlEnumValue("P6")
    P_6("P6"),
    @XmlEnumValue("P7")
    P_7("P7"),
    @XmlEnumValue("P8")
    P_8("P8"),
    @XmlEnumValue("P9")
    P_9("P9"),
    U("U"),
    V("V"),
    Y("Y");
    private final String value;

    CommunicationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunicationCodeType fromValue(String v) {
        for (CommunicationCodeType c: CommunicationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
