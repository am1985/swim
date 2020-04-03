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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A collection of at least one DangerousGoodsPackage. 
 *             .Shipper's Declaration For Dangerous Goods Packaging Detail: The part of the IATA 
 *             Shipper's Declaration For Dangerous Goods that contains the packaging details for 
 *             this shipment. 
 *             .Dangerous Goods Package Details: The part of the IATA Shipper's Declaration For 
 *             Dangerous Goods that contains the Package Details for the shipment. 
 *          
 * 
 * <p>Java class for DangerousGoodsPackageGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DangerousGoodsPackageGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dangerousGoodsPackage" type="{http://www.fixm.aero/flight/3.0}DangerousGoodsPackageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shipmentDimensions" type="{http://www.fixm.aero/flight/3.0}DangerousGoodsDimensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="shipmentUseIndicator" type="{http://www.fixm.aero/flight/3.0}ShipmentUseType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DangerousGoodsPackageGroupType", propOrder = {
    "dangerousGoodsPackage",
    "shipmentDimensions"
})
public class DangerousGoodsPackageGroupType {

    protected List<DangerousGoodsPackageType> dangerousGoodsPackage;
    protected DangerousGoodsDimensionsType shipmentDimensions;
    @XmlAttribute(name = "shipmentUseIndicator")
    protected ShipmentUseType shipmentUseIndicator;

    /**
     * Gets the value of the dangerousGoodsPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousGoodsPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousGoodsPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DangerousGoodsPackageType }
     * 
     * 
     */
    public List<DangerousGoodsPackageType> getDangerousGoodsPackage() {
        if (dangerousGoodsPackage == null) {
            dangerousGoodsPackage = new ArrayList<DangerousGoodsPackageType>();
        }
        return this.dangerousGoodsPackage;
    }

    /**
     * Gets the value of the shipmentDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsDimensionsType }
     *     
     */
    public DangerousGoodsDimensionsType getShipmentDimensions() {
        return shipmentDimensions;
    }

    /**
     * Sets the value of the shipmentDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsDimensionsType }
     *     
     */
    public void setShipmentDimensions(DangerousGoodsDimensionsType value) {
        this.shipmentDimensions = value;
    }

    /**
     * Gets the value of the shipmentUseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentUseType }
     *     
     */
    public ShipmentUseType getShipmentUseIndicator() {
        return shipmentUseIndicator;
    }

    /**
     * Sets the value of the shipmentUseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentUseType }
     *     
     */
    public void setShipmentUseIndicator(ShipmentUseType value) {
        this.shipmentUseIndicator = value;
    }

}
