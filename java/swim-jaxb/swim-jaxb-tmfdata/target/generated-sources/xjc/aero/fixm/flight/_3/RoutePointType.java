//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Route point along a route of the flight. 
 *          
 * 
 * <p>Java class for RoutePointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePointType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fixm.aero/flight/3.0}AbstractRoutePointType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="constraint" type="{http://www.fixm.aero/flight/3.0}RouteConstraintOrPreferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointType", propOrder = {
    "constraint"
})
public class RoutePointType
    extends AbstractRoutePointType
{

    protected List<RouteConstraintOrPreferenceType> constraint;

    /**
     * Gets the value of the constraint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constraint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstraint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteConstraintOrPreferenceType }
     * 
     * 
     */
    public List<RouteConstraintOrPreferenceType> getConstraint() {
        if (constraint == null) {
            constraint = new ArrayList<RouteConstraintOrPreferenceType>();
        }
        return this.constraint;
    }

}
