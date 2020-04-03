//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines Adapted Route name and type of route.
 * 
 * <p>Java class for adaptedRoutNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adaptedRoutNameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="routeName" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}routeNameType" /&gt;
 *       &lt;attribute name="routeType" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}routeTypesType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adaptedRoutNameType")
public class AdaptedRoutNameType {

    @XmlAttribute(name = "routeName", required = true)
    protected String routeName;
    @XmlAttribute(name = "routeType", required = true)
    protected RouteTypesType routeType;

    /**
     * Gets the value of the routeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * Sets the value of the routeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteName(String value) {
        this.routeName = value;
    }

    /**
     * Gets the value of the routeType property.
     * 
     * @return
     *     possible object is
     *     {@link RouteTypesType }
     *     
     */
    public RouteTypesType getRouteType() {
        return routeType;
    }

    /**
     * Sets the value of the routeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteTypesType }
     *     
     */
    public void setRouteType(RouteTypesType value) {
        this.routeType = value;
    }

}
