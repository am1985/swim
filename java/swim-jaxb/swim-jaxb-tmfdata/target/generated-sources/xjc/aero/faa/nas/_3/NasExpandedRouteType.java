//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.flight._3.ExpandedRouteType;


/**
 * 
 *             Extends Expanded Route with a Route Impact List 
 *              
 *             .Route Impact List: Current traffic flow management prediction of en route Air Traffic 
 *             Control units (centres), sectors and airspace elements along the trajectory of a 
 *             flight. 
 *          
 * 
 * <p>Java class for NasExpandedRouteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NasExpandedRouteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixm.aero/flight/3.0}ExpandedRouteType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routeImpactList" type="{http://www.faa.aero/nas/3.1}RouteImpactListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasExpandedRouteType", propOrder = {
    "routeImpactList"
})
public class NasExpandedRouteType
    extends ExpandedRouteType
{

    protected RouteImpactListType routeImpactList;

    /**
     * Gets the value of the routeImpactList property.
     * 
     * @return
     *     possible object is
     *     {@link RouteImpactListType }
     *     
     */
    public RouteImpactListType getRouteImpactList() {
        return routeImpactList;
    }

    /**
     * Sets the value of the routeImpactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteImpactListType }
     *     
     */
    public void setRouteImpactList(RouteImpactListType value) {
        this.routeImpactList = value;
    }

}
