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
 * <p>Java class for PerformanceBasedCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerformanceBasedCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A1"/&gt;
 *     &lt;enumeration value="B1"/&gt;
 *     &lt;enumeration value="B2"/&gt;
 *     &lt;enumeration value="B3"/&gt;
 *     &lt;enumeration value="B4"/&gt;
 *     &lt;enumeration value="B5"/&gt;
 *     &lt;enumeration value="B6"/&gt;
 *     &lt;enumeration value="C1"/&gt;
 *     &lt;enumeration value="C2"/&gt;
 *     &lt;enumeration value="C3"/&gt;
 *     &lt;enumeration value="C4"/&gt;
 *     &lt;enumeration value="D1"/&gt;
 *     &lt;enumeration value="D2"/&gt;
 *     &lt;enumeration value="D3"/&gt;
 *     &lt;enumeration value="D4"/&gt;
 *     &lt;enumeration value="L1"/&gt;
 *     &lt;enumeration value="O1"/&gt;
 *     &lt;enumeration value="O2"/&gt;
 *     &lt;enumeration value="O3"/&gt;
 *     &lt;enumeration value="O4"/&gt;
 *     &lt;enumeration value="S1"/&gt;
 *     &lt;enumeration value="S2"/&gt;
 *     &lt;enumeration value="T1"/&gt;
 *     &lt;enumeration value="T2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PerformanceBasedCodeType")
@XmlEnum
public enum PerformanceBasedCodeType {

    @XmlEnumValue("A1")
    A_1("A1"),
    @XmlEnumValue("B1")
    B_1("B1"),
    @XmlEnumValue("B2")
    B_2("B2"),
    @XmlEnumValue("B3")
    B_3("B3"),
    @XmlEnumValue("B4")
    B_4("B4"),
    @XmlEnumValue("B5")
    B_5("B5"),
    @XmlEnumValue("B6")
    B_6("B6"),
    @XmlEnumValue("C1")
    C_1("C1"),
    @XmlEnumValue("C2")
    C_2("C2"),
    @XmlEnumValue("C3")
    C_3("C3"),
    @XmlEnumValue("C4")
    C_4("C4"),
    @XmlEnumValue("D1")
    D_1("D1"),
    @XmlEnumValue("D2")
    D_2("D2"),
    @XmlEnumValue("D3")
    D_3("D3"),
    @XmlEnumValue("D4")
    D_4("D4"),
    @XmlEnumValue("L1")
    L_1("L1"),
    @XmlEnumValue("O1")
    O_1("O1"),
    @XmlEnumValue("O2")
    O_2("O2"),
    @XmlEnumValue("O3")
    O_3("O3"),
    @XmlEnumValue("O4")
    O_4("O4"),
    @XmlEnumValue("S1")
    S_1("S1"),
    @XmlEnumValue("S2")
    S_2("S2"),
    @XmlEnumValue("T1")
    T_1("T1"),
    @XmlEnumValue("T2")
    T_2("T2");
    private final String value;

    PerformanceBasedCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerformanceBasedCodeType fromValue(String v) {
        for (PerformanceBasedCodeType c: PerformanceBasedCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
