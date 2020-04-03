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
import javax.xml.datatype.XMLGregorianCalendar;
import aero.fixm.base._3.SignificantPointType;


/**
 * 
 *             .Last Known Position Report: The position of the aircraft last known to ATS and a 
 *             corresponding timestamp. 
 *          
 * 
 * <p>Java class for LastPositionReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LastPositionReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="position" type="{http://www.fixm.aero/base/3.0}SignificantPointType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="determinationMethod" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="timeAtPosition" type="{http://www.fixm.aero/foundation/3.0}TimeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LastPositionReportType", propOrder = {
    "position"
})
public class LastPositionReportType {

    protected SignificantPointType position;
    @XmlAttribute(name = "determinationMethod")
    protected String determinationMethod;
    @XmlAttribute(name = "timeAtPosition")
    protected XMLGregorianCalendar timeAtPosition;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link SignificantPointType }
     *     
     */
    public SignificantPointType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificantPointType }
     *     
     */
    public void setPosition(SignificantPointType value) {
        this.position = value;
    }

    /**
     * Gets the value of the determinationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeterminationMethod() {
        return determinationMethod;
    }

    /**
     * Sets the value of the determinationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminationMethod(String value) {
        this.determinationMethod = value;
    }

    /**
     * Gets the value of the timeAtPosition property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeAtPosition() {
        return timeAtPosition;
    }

    /**
     * Sets the value of the timeAtPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeAtPosition(XMLGregorianCalendar value) {
        this.timeAtPosition = value;
    }

}
