//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rriaModeledReroutesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rriaModeledReroutesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ctrReroute" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="rrId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/&gt;
 *                   &lt;element name="rrName" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteNameType"/&gt;
 *                   &lt;element name="rrAdvisoryNumber" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaAdvNumberType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rriaModeledReroutesType", propOrder = {
    "ctrReroute"
})
public class RriaModeledReroutesType {

    @XmlElement(required = true)
    protected List<RriaModeledReroutesType.CtrReroute> ctrReroute;

    /**
     * Gets the value of the ctrReroute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctrReroute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrReroute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RriaModeledReroutesType.CtrReroute }
     * 
     * 
     */
    public List<RriaModeledReroutesType.CtrReroute> getCtrReroute() {
        if (ctrReroute == null) {
            ctrReroute = new ArrayList<RriaModeledReroutesType.CtrReroute>();
        }
        return this.ctrReroute;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="rrId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/&gt;
     *         &lt;element name="rrName" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteNameType"/&gt;
     *         &lt;element name="rrAdvisoryNumber" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaAdvNumberType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rrId",
        "rrName",
        "rrAdvisoryNumber"
    })
    public static class CtrReroute {

        @XmlElement(required = true)
        protected String rrId;
        @XmlElement(required = true)
        protected String rrName;
        protected String rrAdvisoryNumber;

        /**
         * Gets the value of the rrId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRrId() {
            return rrId;
        }

        /**
         * Sets the value of the rrId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRrId(String value) {
            this.rrId = value;
        }

        /**
         * Gets the value of the rrName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRrName() {
            return rrName;
        }

        /**
         * Sets the value of the rrName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRrName(String value) {
            this.rrName = value;
        }

        /**
         * Gets the value of the rrAdvisoryNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRrAdvisoryNumber() {
            return rrAdvisoryNumber;
        }

        /**
         * Sets the value of the rrAdvisoryNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRrAdvisoryNumber(String value) {
            this.rrAdvisoryNumber = value;
        }

    }

}
