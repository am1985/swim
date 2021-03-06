//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.faa.nas._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.base._3.SignificantPointType;
import aero.fixm.foundation._3.UnitSectorAirspaceType;


/**
 * 
 *             .Route Impact List: Current traffic flow management prediction of en route Air Traffic 
 *             Control units (centres), sectors and airspace elements along the trajectory of a 
 *             flight. 
 *          
 * 
 * <p>Java class for RouteImpactListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteImpactListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predictedAirway" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;list itemType="{http://www.fixm.aero/foundation/3.0}AtsRouteType" /&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="predictedFix" type="{http://www.fixm.aero/base/3.0}SignificantPointType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="predictedSector" type="{http://www.fixm.aero/foundation/3.0}UnitSectorAirspaceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="predictedUnit" type="{http://www.fixm.aero/foundation/3.0}UnitSectorAirspaceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="predictedWaypoint" type="{http://www.fixm.aero/base/3.0}SignificantPointType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteImpactListType", propOrder = {
    "predictedAirway",
    "predictedFix",
    "predictedSector",
    "predictedUnit",
    "predictedWaypoint"
})
public class RouteImpactListType {

    @XmlList
    protected List<String> predictedAirway;
    protected List<SignificantPointType> predictedFix;
    protected List<UnitSectorAirspaceType> predictedSector;
    protected List<UnitSectorAirspaceType> predictedUnit;
    protected List<SignificantPointType> predictedWaypoint;

    /**
     * Gets the value of the predictedAirway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predictedAirway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredictedAirway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPredictedAirway() {
        if (predictedAirway == null) {
            predictedAirway = new ArrayList<String>();
        }
        return this.predictedAirway;
    }

    /**
     * Gets the value of the predictedFix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predictedFix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredictedFix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignificantPointType }
     * 
     * 
     */
    public List<SignificantPointType> getPredictedFix() {
        if (predictedFix == null) {
            predictedFix = new ArrayList<SignificantPointType>();
        }
        return this.predictedFix;
    }

    /**
     * Gets the value of the predictedSector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predictedSector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredictedSector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitSectorAirspaceType }
     * 
     * 
     */
    public List<UnitSectorAirspaceType> getPredictedSector() {
        if (predictedSector == null) {
            predictedSector = new ArrayList<UnitSectorAirspaceType>();
        }
        return this.predictedSector;
    }

    /**
     * Gets the value of the predictedUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predictedUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredictedUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitSectorAirspaceType }
     * 
     * 
     */
    public List<UnitSectorAirspaceType> getPredictedUnit() {
        if (predictedUnit == null) {
            predictedUnit = new ArrayList<UnitSectorAirspaceType>();
        }
        return this.predictedUnit;
    }

    /**
     * Gets the value of the predictedWaypoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predictedWaypoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredictedWaypoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignificantPointType }
     * 
     * 
     */
    public List<SignificantPointType> getPredictedWaypoint() {
        if (predictedWaypoint == null) {
            predictedWaypoint = new ArrayList<SignificantPointType>();
        }
        return this.predictedWaypoint;
    }

}
