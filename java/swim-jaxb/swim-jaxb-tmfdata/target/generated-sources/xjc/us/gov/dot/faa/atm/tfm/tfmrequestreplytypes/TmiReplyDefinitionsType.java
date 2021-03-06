//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.atm.tfm.ficommonmessages2.ParamAfpGdpType;
import us.gov.dot.faa.atm.tfm.ficommonmessages2.ParamBlanketType;
import us.gov.dot.faa.atm.tfm.ficommonmessages2.ParamCompressionType;
import us.gov.dot.faa.atm.tfm.ficommonmessages2.ParamGsType;


/**
 * Defines the possible TMI data types.
 * 
 * <p>Java class for tmiReplyDefinitionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tmiReplyDefinitionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="afp" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}paramAfpGdpType"/&gt;
 *         &lt;element name="blanket" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}paramBlanketType"/&gt;
 *         &lt;element name="compression" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}paramCompressionType"/&gt;
 *         &lt;element name="ctop" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}reqCtopTmiType"/&gt;
 *         &lt;element name="fxa" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}fcaDefinitionResyncType"/&gt;
 *         &lt;element name="gdp" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}paramAfpGdpType"/&gt;
 *         &lt;element name="gs" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}paramGsType"/&gt;
 *         &lt;element name="reroute" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteUpdateType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tmiReplyDefinitionsType", propOrder = {
    "afp",
    "blanket",
    "compression",
    "ctop",
    "fxa",
    "gdp",
    "gs",
    "reroute"
})
public class TmiReplyDefinitionsType {

    protected ParamAfpGdpType afp;
    protected ParamBlanketType blanket;
    protected ParamCompressionType compression;
    protected ReqCtopTmiType ctop;
    protected FcaDefinitionResyncType fxa;
    protected ParamAfpGdpType gdp;
    protected ParamGsType gs;
    protected RerouteUpdateType reroute;

    /**
     * Gets the value of the afp property.
     * 
     * @return
     *     possible object is
     *     {@link ParamAfpGdpType }
     *     
     */
    public ParamAfpGdpType getAfp() {
        return afp;
    }

    /**
     * Sets the value of the afp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamAfpGdpType }
     *     
     */
    public void setAfp(ParamAfpGdpType value) {
        this.afp = value;
    }

    /**
     * Gets the value of the blanket property.
     * 
     * @return
     *     possible object is
     *     {@link ParamBlanketType }
     *     
     */
    public ParamBlanketType getBlanket() {
        return blanket;
    }

    /**
     * Sets the value of the blanket property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamBlanketType }
     *     
     */
    public void setBlanket(ParamBlanketType value) {
        this.blanket = value;
    }

    /**
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link ParamCompressionType }
     *     
     */
    public ParamCompressionType getCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamCompressionType }
     *     
     */
    public void setCompression(ParamCompressionType value) {
        this.compression = value;
    }

    /**
     * Gets the value of the ctop property.
     * 
     * @return
     *     possible object is
     *     {@link ReqCtopTmiType }
     *     
     */
    public ReqCtopTmiType getCtop() {
        return ctop;
    }

    /**
     * Sets the value of the ctop property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqCtopTmiType }
     *     
     */
    public void setCtop(ReqCtopTmiType value) {
        this.ctop = value;
    }

    /**
     * Gets the value of the fxa property.
     * 
     * @return
     *     possible object is
     *     {@link FcaDefinitionResyncType }
     *     
     */
    public FcaDefinitionResyncType getFxa() {
        return fxa;
    }

    /**
     * Sets the value of the fxa property.
     * 
     * @param value
     *     allowed object is
     *     {@link FcaDefinitionResyncType }
     *     
     */
    public void setFxa(FcaDefinitionResyncType value) {
        this.fxa = value;
    }

    /**
     * Gets the value of the gdp property.
     * 
     * @return
     *     possible object is
     *     {@link ParamAfpGdpType }
     *     
     */
    public ParamAfpGdpType getGdp() {
        return gdp;
    }

    /**
     * Sets the value of the gdp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamAfpGdpType }
     *     
     */
    public void setGdp(ParamAfpGdpType value) {
        this.gdp = value;
    }

    /**
     * Gets the value of the gs property.
     * 
     * @return
     *     possible object is
     *     {@link ParamGsType }
     *     
     */
    public ParamGsType getGs() {
        return gs;
    }

    /**
     * Sets the value of the gs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamGsType }
     *     
     */
    public void setGs(ParamGsType value) {
        this.gs = value;
    }

    /**
     * Gets the value of the reroute property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteUpdateType }
     *     
     */
    public RerouteUpdateType getReroute() {
        return reroute;
    }

    /**
     * Sets the value of the reroute property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteUpdateType }
     *     
     */
    public void setReroute(RerouteUpdateType value) {
        this.reroute = value;
    }

}
