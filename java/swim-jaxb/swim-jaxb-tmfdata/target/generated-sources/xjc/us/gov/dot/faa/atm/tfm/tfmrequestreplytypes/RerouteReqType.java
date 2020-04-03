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


/**
 * Type of reroute requests.
 * 
 * <p>Java class for rerouteReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rerouteReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="update" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteUpdateType"/&gt;
 *         &lt;element name="delete" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteDeleteType"/&gt;
 *         &lt;element name="rrAmendment" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteAmendmentType"/&gt;
 *         &lt;element name="rrPreviewAmendment" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}reroutePreviewAmendmentType"/&gt;
 *         &lt;element name="rrMerge" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteMergeType"/&gt;
 *         &lt;element name="rrCancel" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteCancelType"/&gt;
 *         &lt;element name="dynamicException" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteDynamicExceptionType"/&gt;
 *         &lt;element name="waypointRequest" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}ambiguousRouteType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rerouteReqType", propOrder = {
    "update",
    "delete",
    "rrAmendment",
    "rrPreviewAmendment",
    "rrMerge",
    "rrCancel",
    "dynamicException",
    "waypointRequest"
})
public class RerouteReqType {

    protected RerouteUpdateType update;
    protected RerouteDeleteType delete;
    protected RerouteAmendmentType rrAmendment;
    protected ReroutePreviewAmendmentType rrPreviewAmendment;
    protected RerouteMergeType rrMerge;
    protected RerouteCancelType rrCancel;
    protected RerouteDynamicExceptionType dynamicException;
    protected AmbiguousRouteType waypointRequest;

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteUpdateType }
     *     
     */
    public RerouteUpdateType getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteUpdateType }
     *     
     */
    public void setUpdate(RerouteUpdateType value) {
        this.update = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteDeleteType }
     *     
     */
    public RerouteDeleteType getDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteDeleteType }
     *     
     */
    public void setDelete(RerouteDeleteType value) {
        this.delete = value;
    }

    /**
     * Gets the value of the rrAmendment property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteAmendmentType }
     *     
     */
    public RerouteAmendmentType getRrAmendment() {
        return rrAmendment;
    }

    /**
     * Sets the value of the rrAmendment property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteAmendmentType }
     *     
     */
    public void setRrAmendment(RerouteAmendmentType value) {
        this.rrAmendment = value;
    }

    /**
     * Gets the value of the rrPreviewAmendment property.
     * 
     * @return
     *     possible object is
     *     {@link ReroutePreviewAmendmentType }
     *     
     */
    public ReroutePreviewAmendmentType getRrPreviewAmendment() {
        return rrPreviewAmendment;
    }

    /**
     * Sets the value of the rrPreviewAmendment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReroutePreviewAmendmentType }
     *     
     */
    public void setRrPreviewAmendment(ReroutePreviewAmendmentType value) {
        this.rrPreviewAmendment = value;
    }

    /**
     * Gets the value of the rrMerge property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteMergeType }
     *     
     */
    public RerouteMergeType getRrMerge() {
        return rrMerge;
    }

    /**
     * Sets the value of the rrMerge property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteMergeType }
     *     
     */
    public void setRrMerge(RerouteMergeType value) {
        this.rrMerge = value;
    }

    /**
     * Gets the value of the rrCancel property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteCancelType }
     *     
     */
    public RerouteCancelType getRrCancel() {
        return rrCancel;
    }

    /**
     * Sets the value of the rrCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteCancelType }
     *     
     */
    public void setRrCancel(RerouteCancelType value) {
        this.rrCancel = value;
    }

    /**
     * Gets the value of the dynamicException property.
     * 
     * @return
     *     possible object is
     *     {@link RerouteDynamicExceptionType }
     *     
     */
    public RerouteDynamicExceptionType getDynamicException() {
        return dynamicException;
    }

    /**
     * Sets the value of the dynamicException property.
     * 
     * @param value
     *     allowed object is
     *     {@link RerouteDynamicExceptionType }
     *     
     */
    public void setDynamicException(RerouteDynamicExceptionType value) {
        this.dynamicException = value;
    }

    /**
     * Gets the value of the waypointRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AmbiguousRouteType }
     *     
     */
    public AmbiguousRouteType getWaypointRequest() {
        return waypointRequest;
    }

    /**
     * Sets the value of the waypointRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmbiguousRouteType }
     *     
     */
    public void setWaypointRequest(AmbiguousRouteType value) {
        this.waypointRequest = value;
    }

}
