//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messageCategoryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CDM AFP"/&gt;
 *     &lt;enumeration value="CDM AFP COMPRESSION"/&gt;
 *     &lt;enumeration value="CDM AFP CANCEL"/&gt;
 *     &lt;enumeration value="CDM GDP"/&gt;
 *     &lt;enumeration value="CDM GDP COMPRESSION"/&gt;
 *     &lt;enumeration value="CDM GDP ADJUSTMENT"/&gt;
 *     &lt;enumeration value="CDM GDP CANCEL"/&gt;
 *     &lt;enumeration value="CDM GS"/&gt;
 *     &lt;enumeration value="GS"/&gt;
 *     &lt;enumeration value="GS CANCEL"/&gt;
 *     &lt;enumeration value="REROUTE"/&gt;
 *     &lt;enumeration value="REROUTE CANCEL"/&gt;
 *     &lt;enumeration value="CTOP"/&gt;
 *     &lt;enumeration value="CTOP CANCEL"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *     &lt;enumeration value="ROUTE"/&gt;
 *     &lt;enumeration value="PLAYBOOK"/&gt;
 *     &lt;enumeration value="CDR"/&gt;
 *     &lt;enumeration value="SPECIAL OPERATIONS"/&gt;
 *     &lt;enumeration value="NRP SUSPENSIONS"/&gt;
 *     &lt;enumeration value="VOLCANIC ACTIVITY"/&gt;
 *     &lt;enumeration value="NAT"/&gt;
 *     &lt;enumeration value="SPACE LAUNCH"/&gt;
 *     &lt;enumeration value="FCA"/&gt;
 *     &lt;enumeration value="FEA"/&gt;
 *     &lt;enumeration value="INFORMATIONAL"/&gt;
 *     &lt;enumeration value="MISCELLANEOUS"/&gt;
 *     &lt;enumeration value="OPERATIONS PLANNING"/&gt;
 *     &lt;enumeration value="TCA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "messageCategoryType")
@XmlEnum
public enum MessageCategoryType {

    @XmlEnumValue("CDM AFP")
    CDM_AFP("CDM AFP"),
    @XmlEnumValue("CDM AFP COMPRESSION")
    CDM_AFP_COMPRESSION("CDM AFP COMPRESSION"),
    @XmlEnumValue("CDM AFP CANCEL")
    CDM_AFP_CANCEL("CDM AFP CANCEL"),
    @XmlEnumValue("CDM GDP")
    CDM_GDP("CDM GDP"),
    @XmlEnumValue("CDM GDP COMPRESSION")
    CDM_GDP_COMPRESSION("CDM GDP COMPRESSION"),
    @XmlEnumValue("CDM GDP ADJUSTMENT")
    CDM_GDP_ADJUSTMENT("CDM GDP ADJUSTMENT"),
    @XmlEnumValue("CDM GDP CANCEL")
    CDM_GDP_CANCEL("CDM GDP CANCEL"),
    @XmlEnumValue("CDM GS")
    CDM_GS("CDM GS"),
    GS("GS"),
    @XmlEnumValue("GS CANCEL")
    GS_CANCEL("GS CANCEL"),
    REROUTE("REROUTE"),
    @XmlEnumValue("REROUTE CANCEL")
    REROUTE_CANCEL("REROUTE CANCEL"),
    CTOP("CTOP"),
    @XmlEnumValue("CTOP CANCEL")
    CTOP_CANCEL("CTOP CANCEL"),
    OTHER("OTHER"),
    ROUTE("ROUTE"),
    PLAYBOOK("PLAYBOOK"),
    CDR("CDR"),
    @XmlEnumValue("SPECIAL OPERATIONS")
    SPECIAL_OPERATIONS("SPECIAL OPERATIONS"),
    @XmlEnumValue("NRP SUSPENSIONS")
    NRP_SUSPENSIONS("NRP SUSPENSIONS"),
    @XmlEnumValue("VOLCANIC ACTIVITY")
    VOLCANIC_ACTIVITY("VOLCANIC ACTIVITY"),
    NAT("NAT"),
    @XmlEnumValue("SPACE LAUNCH")
    SPACE_LAUNCH("SPACE LAUNCH"),
    FCA("FCA"),
    FEA("FEA"),
    INFORMATIONAL("INFORMATIONAL"),
    MISCELLANEOUS("MISCELLANEOUS"),
    @XmlEnumValue("OPERATIONS PLANNING")
    OPERATIONS_PLANNING("OPERATIONS PLANNING"),
    TCA("TCA");
    private final String value;

    MessageCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageCategoryType fromValue(String v) {
        for (MessageCategoryType c: MessageCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
