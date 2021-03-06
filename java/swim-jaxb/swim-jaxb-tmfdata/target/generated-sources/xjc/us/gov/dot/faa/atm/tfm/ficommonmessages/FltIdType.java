//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Unique flight identification for message exchange.
 * 
 * <p>Java class for fltIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fltIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ACID" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}acidType"/&gt;
 *         &lt;element name="orig" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}aptNameType"/&gt;
 *         &lt;element name="dest" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}aptNameType"/&gt;
 *         &lt;element name="IGTD" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fltIdType", propOrder = {

})
public class FltIdType {

    @XmlElement(name = "ACID", required = true)
    protected String acid;
    @XmlElement(required = true)
    protected String orig;
    @XmlElement(required = true)
    protected String dest;
    @XmlElement(name = "IGTD", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar igtd;

    /**
     * Gets the value of the acid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACID() {
        return acid;
    }

    /**
     * Sets the value of the acid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACID(String value) {
        this.acid = value;
    }

    /**
     * Gets the value of the orig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrig() {
        return orig;
    }

    /**
     * Sets the value of the orig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrig(String value) {
        this.orig = value;
    }

    /**
     * Gets the value of the dest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDest() {
        return dest;
    }

    /**
     * Sets the value of the dest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDest(String value) {
        this.dest = value;
    }

    /**
     * Gets the value of the igtd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIGTD() {
        return igtd;
    }

    /**
     * Sets the value of the igtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIGTD(XMLGregorianCalendar value) {
        this.igtd = value;
    }

}
