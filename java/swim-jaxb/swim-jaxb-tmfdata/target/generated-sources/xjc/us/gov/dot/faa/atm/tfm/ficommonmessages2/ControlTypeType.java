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
 * <p>Java class for controlTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="controlTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CTOP"/&gt;
 *     &lt;enumeration value="GDP"/&gt;
 *     &lt;enumeration value="AFP"/&gt;
 *     &lt;enumeration value="GS"/&gt;
 *     &lt;enumeration value="BLKT"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="BRG"/&gt;
 *     &lt;enumeration value="DAS"/&gt;
 *     &lt;enumeration value="GAAP"/&gt;
 *     &lt;enumeration value="UDP"/&gt;
 *     &lt;enumeration value="RCTL"/&gt;
 *     &lt;enumeration value="SUB"/&gt;
 *     &lt;enumeration value="SCS"/&gt;
 *     &lt;enumeration value="ECR"/&gt;
 *     &lt;enumeration value="UPD"/&gt;
 *     &lt;enumeration value="ABRG"/&gt;
 *     &lt;enumeration value="SBRG"/&gt;
 *     &lt;enumeration value="UBRG"/&gt;
 *     &lt;enumeration value="ADPT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "controlTypeType")
@XmlEnum
public enum ControlTypeType {

    CTOP,
    GDP,
    AFP,
    GS,
    BLKT,
    COMP,
    BRG,
    DAS,
    GAAP,
    UDP,
    RCTL,
    SUB,
    SCS,
    ECR,
    UPD,
    ABRG,
    SBRG,
    UBRG,
    ADPT;

    public String value() {
        return name();
    }

    public static ControlTypeType fromValue(String v) {
        return valueOf(v);
    }

}