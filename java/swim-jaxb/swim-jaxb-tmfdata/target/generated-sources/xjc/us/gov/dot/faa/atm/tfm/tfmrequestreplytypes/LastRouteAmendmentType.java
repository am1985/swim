//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.ficommonmessages2.AmendmentGenerateType;
import us.gov.dot.faa.atm.tfm.ficommonmessages2.AmendmentStatusType;


/**
 * <p>Java class for lastRouteAmendmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lastRouteAmendmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="tmiId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="routeAmendment"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1024"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="amendmentProtectedSegment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1024"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="amendmentStatus" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}amendmentStatusType"/&gt;
 *         &lt;element name="amendmentTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="amendmentStatusUpdTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="finalControllingSectorInCenter" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}elementNameType" minOccurs="0"/&gt;
 *         &lt;element name="eramStatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="detailOne" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="detailTwo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="msgId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="36"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="workstation" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}workstationType" minOccurs="0"/&gt;
 *         &lt;element name="site" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}siteType" minOccurs="0"/&gt;
 *         &lt;element name="tmiIdSuffix"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="99"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="amendmentGeneratedType" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}amendmentGenerateType" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="MAJOR_AIRLINE" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airlineIdType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lastRouteAmendmentType", propOrder = {

})
public class LastRouteAmendmentType {

    @XmlElement(required = true)
    protected String tmiId;
    @XmlElement(required = true)
    protected String routeAmendment;
    protected String amendmentProtectedSegment;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AmendmentStatusType amendmentStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar amendmentTime;
    protected long amendmentStatusUpdTime;
    protected String finalControllingSectorInCenter;
    protected String eramStatus;
    protected String detailOne;
    protected String detailTwo;
    protected String msgId;
    protected String workstation;
    protected String site;
    protected int tmiIdSuffix;
    @XmlSchemaType(name = "string")
    protected AmendmentGenerateType amendmentGeneratedType;
    @XmlAttribute(name = "MAJOR_AIRLINE")
    protected String majorairline;

    /**
     * Gets the value of the tmiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmiId() {
        return tmiId;
    }

    /**
     * Sets the value of the tmiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmiId(String value) {
        this.tmiId = value;
    }

    /**
     * Gets the value of the routeAmendment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteAmendment() {
        return routeAmendment;
    }

    /**
     * Sets the value of the routeAmendment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteAmendment(String value) {
        this.routeAmendment = value;
    }

    /**
     * Gets the value of the amendmentProtectedSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmendmentProtectedSegment() {
        return amendmentProtectedSegment;
    }

    /**
     * Sets the value of the amendmentProtectedSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmendmentProtectedSegment(String value) {
        this.amendmentProtectedSegment = value;
    }

    /**
     * Gets the value of the amendmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentStatusType }
     *     
     */
    public AmendmentStatusType getAmendmentStatus() {
        return amendmentStatus;
    }

    /**
     * Sets the value of the amendmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentStatusType }
     *     
     */
    public void setAmendmentStatus(AmendmentStatusType value) {
        this.amendmentStatus = value;
    }

    /**
     * Gets the value of the amendmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAmendmentTime() {
        return amendmentTime;
    }

    /**
     * Sets the value of the amendmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAmendmentTime(XMLGregorianCalendar value) {
        this.amendmentTime = value;
    }

    /**
     * Gets the value of the amendmentStatusUpdTime property.
     * 
     */
    public long getAmendmentStatusUpdTime() {
        return amendmentStatusUpdTime;
    }

    /**
     * Sets the value of the amendmentStatusUpdTime property.
     * 
     */
    public void setAmendmentStatusUpdTime(long value) {
        this.amendmentStatusUpdTime = value;
    }

    /**
     * Gets the value of the finalControllingSectorInCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalControllingSectorInCenter() {
        return finalControllingSectorInCenter;
    }

    /**
     * Sets the value of the finalControllingSectorInCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalControllingSectorInCenter(String value) {
        this.finalControllingSectorInCenter = value;
    }

    /**
     * Gets the value of the eramStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEramStatus() {
        return eramStatus;
    }

    /**
     * Sets the value of the eramStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEramStatus(String value) {
        this.eramStatus = value;
    }

    /**
     * Gets the value of the detailOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailOne() {
        return detailOne;
    }

    /**
     * Sets the value of the detailOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailOne(String value) {
        this.detailOne = value;
    }

    /**
     * Gets the value of the detailTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailTwo() {
        return detailTwo;
    }

    /**
     * Sets the value of the detailTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailTwo(String value) {
        this.detailTwo = value;
    }

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the workstation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstation() {
        return workstation;
    }

    /**
     * Sets the value of the workstation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstation(String value) {
        this.workstation = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the tmiIdSuffix property.
     * 
     */
    public int getTmiIdSuffix() {
        return tmiIdSuffix;
    }

    /**
     * Sets the value of the tmiIdSuffix property.
     * 
     */
    public void setTmiIdSuffix(int value) {
        this.tmiIdSuffix = value;
    }

    /**
     * Gets the value of the amendmentGeneratedType property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentGenerateType }
     *     
     */
    public AmendmentGenerateType getAmendmentGeneratedType() {
        return amendmentGeneratedType;
    }

    /**
     * Sets the value of the amendmentGeneratedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentGenerateType }
     *     
     */
    public void setAmendmentGeneratedType(AmendmentGenerateType value) {
        this.amendmentGeneratedType = value;
    }

    /**
     * Gets the value of the majorairline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAJORAIRLINE() {
        return majorairline;
    }

    /**
     * Sets the value of the majorairline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAJORAIRLINE(String value) {
        this.majorairline = value;
    }

}
