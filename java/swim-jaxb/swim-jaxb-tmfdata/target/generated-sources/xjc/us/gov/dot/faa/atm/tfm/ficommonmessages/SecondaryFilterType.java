//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.TmiVisibilityDomainType;


/**
 * Secondary filter type definition.
 * 
 * Extends the primary filter type.
 * 
 * <p>Java class for secondaryFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="secondaryFilterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}primaryFilterType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filterId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fcaId" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fcaIdType"/&gt;
 *         &lt;element name="fcaName" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}fcaNameType"/&gt;
 *         &lt;element name="domain" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}tmiVisibilityDomainType"/&gt;
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="lastUpdateWorkstationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lastUpdateSiteId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="createWorkstationId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="createSiteId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="priority"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="-1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="show" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="colorId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;maxInclusive value="35"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "secondaryFilterType", propOrder = {
    "filterId",
    "filterName",
    "fcaId",
    "fcaName",
    "domain",
    "lastUpdate",
    "lastUpdateWorkstationId",
    "lastUpdateSiteId",
    "createWorkstationId",
    "createSiteId",
    "priority",
    "show",
    "colorId"
})
public class SecondaryFilterType
    extends PrimaryFilterType
{

    @XmlElement(required = true)
    protected String filterId;
    protected String filterName;
    @XmlElement(required = true)
    protected String fcaId;
    @XmlElement(required = true)
    protected String fcaName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TmiVisibilityDomainType domain;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    @XmlElement(required = true)
    protected String lastUpdateWorkstationId;
    @XmlElement(required = true)
    protected String lastUpdateSiteId;
    @XmlElement(required = true)
    protected String createWorkstationId;
    @XmlElement(required = true)
    protected String createSiteId;
    @XmlElement(required = true)
    protected BigInteger priority;
    protected Boolean show;
    protected Integer colorId;

    /**
     * Gets the value of the filterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterId() {
        return filterId;
    }

    /**
     * Sets the value of the filterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterId(String value) {
        this.filterId = value;
    }

    /**
     * Gets the value of the filterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * Sets the value of the filterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterName(String value) {
        this.filterName = value;
    }

    /**
     * Gets the value of the fcaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcaId() {
        return fcaId;
    }

    /**
     * Sets the value of the fcaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcaId(String value) {
        this.fcaId = value;
    }

    /**
     * Gets the value of the fcaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcaName() {
        return fcaName;
    }

    /**
     * Sets the value of the fcaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcaName(String value) {
        this.fcaName = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link TmiVisibilityDomainType }
     *     
     */
    public TmiVisibilityDomainType getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link TmiVisibilityDomainType }
     *     
     */
    public void setDomain(TmiVisibilityDomainType value) {
        this.domain = value;
    }

    /**
     * Gets the value of the lastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the value of the lastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Gets the value of the lastUpdateWorkstationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateWorkstationId() {
        return lastUpdateWorkstationId;
    }

    /**
     * Sets the value of the lastUpdateWorkstationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateWorkstationId(String value) {
        this.lastUpdateWorkstationId = value;
    }

    /**
     * Gets the value of the lastUpdateSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateSiteId() {
        return lastUpdateSiteId;
    }

    /**
     * Sets the value of the lastUpdateSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateSiteId(String value) {
        this.lastUpdateSiteId = value;
    }

    /**
     * Gets the value of the createWorkstationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateWorkstationId() {
        return createWorkstationId;
    }

    /**
     * Sets the value of the createWorkstationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateWorkstationId(String value) {
        this.createWorkstationId = value;
    }

    /**
     * Gets the value of the createSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateSiteId() {
        return createSiteId;
    }

    /**
     * Sets the value of the createSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateSiteId(String value) {
        this.createSiteId = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShow(Boolean value) {
        this.show = value;
    }

    /**
     * Gets the value of the colorId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColorId() {
        return colorId;
    }

    /**
     * Sets the value of the colorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColorId(Integer value) {
        this.colorId = value;
    }

}