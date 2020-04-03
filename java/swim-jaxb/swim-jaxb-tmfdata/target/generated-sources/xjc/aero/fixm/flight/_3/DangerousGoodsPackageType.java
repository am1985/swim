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
import aero.fixm.foundation._3.DimensionsType;


/**
 * 
 *             .Dangerous Goods List of Package Detail: The part of the IATA Shipper's Declaration 
 *             For Dangerous Goods that contains the Package Details for the shipment. 
 *             .Shipper's Declaration For Dangerous Goods Packaging Detail: The part of the IATA 
 *             Shipper's Declaration For Dangerous Goods that contains the packaging details for 
 *             this shipment. 
 *             .Shipper's Declaration For Dangerous Goods Line Item Details: The part of the IATA 
 *             Shipper's Declaration For Dangerous Goods contains the line items details for this 
 *             shipment. 
 *             .Dangerous Goods List of Line Item Detail: The part of the IATA Shipper's Declaration 
 *             For Dangerous Goods that contains the Line Item information for the shipment. 
 *             .Dangerous Goods List of Overpack Detail: The part of the IATA Shipper's Declaration 
 *             For Dangerous Goods that contains the Overpack Detail for the shipment. 
 *          
 * 
 * <p>Java class for DangerousGoodsPackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DangerousGoodsPackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allPackedInOne" type="{http://www.fixm.aero/flight/3.0}AllPackedInOneType" minOccurs="0"/&gt;
 *         &lt;element name="hazardClass" type="{http://www.fixm.aero/flight/3.0}HazardClassType" minOccurs="0"/&gt;
 *         &lt;element name="packageDimensions" type="{http://www.fixm.aero/foundation/3.0}DimensionsType" minOccurs="0"/&gt;
 *         &lt;element name="radioactiveMaterials" type="{http://www.fixm.aero/flight/3.0}RadioactiveMaterialType" minOccurs="0"/&gt;
 *         &lt;element name="shipmentDimensions" type="{http://www.fixm.aero/flight/3.0}DangerousGoodsDimensionsType" minOccurs="0"/&gt;
 *         &lt;element name="subsidiaryHazardClass" type="{http://www.fixm.aero/flight/3.0}HazardClassType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="temperatures" type="{http://www.fixm.aero/flight/3.0}TemperaturesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="compatibilityGroup" type="{http://www.fixm.aero/flight/3.0}CompatibilityGroupType" /&gt;
 *       &lt;attribute name="dangerousGoodsLimitation" type="{http://www.fixm.aero/flight/3.0}AircraftDangerousGoodsLimitationType" /&gt;
 *       &lt;attribute name="dangerousGoodsQuantity" type="{http://www.fixm.aero/base/3.0}CountType" /&gt;
 *       &lt;attribute name="marinePollutantIndicator" type="{http://www.fixm.aero/flight/3.0}MarinePollutantIndicatorType" /&gt;
 *       &lt;attribute name="overpackIndicator" type="{http://www.fixm.aero/flight/3.0}OverpackIndicatorType" /&gt;
 *       &lt;attribute name="packingGroup" type="{http://www.fixm.aero/flight/3.0}PackingGroupType" /&gt;
 *       &lt;attribute name="packingInstructionNumber"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.fixm.aero/base/3.0}FreeTextType"&gt;
 *             &lt;pattern value="Y?[0-9]{3}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="productName" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="properShippingName" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="reportableQuantity" type="{http://www.fixm.aero/base/3.0}CountType" /&gt;
 *       &lt;attribute name="shipmentType" type="{http://www.fixm.aero/flight/3.0}ShipmentTypeType" /&gt;
 *       &lt;attribute name="supplementaryInformation" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="technicalName" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="typeOfPackaging" type="{http://www.fixm.aero/base/3.0}FreeTextType" /&gt;
 *       &lt;attribute name="unNumber"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.fixm.aero/base/3.0}FreeTextType"&gt;
 *             &lt;pattern value="(UN|ID|NA)?\d{4}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DangerousGoodsPackageType", propOrder = {
    "allPackedInOne",
    "hazardClass",
    "packageDimensions",
    "radioactiveMaterials",
    "shipmentDimensions",
    "subsidiaryHazardClass",
    "temperatures"
})
public class DangerousGoodsPackageType {

    protected AllPackedInOneType allPackedInOne;
    protected HazardClassType hazardClass;
    protected DimensionsType packageDimensions;
    protected RadioactiveMaterialType radioactiveMaterials;
    protected DangerousGoodsDimensionsType shipmentDimensions;
    protected List<HazardClassType> subsidiaryHazardClass;
    protected TemperaturesType temperatures;
    @XmlAttribute(name = "compatibilityGroup")
    protected String compatibilityGroup;
    @XmlAttribute(name = "dangerousGoodsLimitation")
    protected AircraftDangerousGoodsLimitationType dangerousGoodsLimitation;
    @XmlAttribute(name = "dangerousGoodsQuantity")
    protected Integer dangerousGoodsQuantity;
    @XmlAttribute(name = "marinePollutantIndicator")
    protected MarinePollutantIndicatorType marinePollutantIndicator;
    @XmlAttribute(name = "overpackIndicator")
    protected OverpackIndicatorType overpackIndicator;
    @XmlAttribute(name = "packingGroup")
    protected PackingGroupType packingGroup;
    @XmlAttribute(name = "packingInstructionNumber")
    protected String packingInstructionNumber;
    @XmlAttribute(name = "productName")
    protected String productName;
    @XmlAttribute(name = "properShippingName")
    protected String properShippingName;
    @XmlAttribute(name = "reportableQuantity")
    protected Integer reportableQuantity;
    @XmlAttribute(name = "shipmentType")
    protected ShipmentTypeType shipmentType;
    @XmlAttribute(name = "supplementaryInformation")
    protected String supplementaryInformation;
    @XmlAttribute(name = "technicalName")
    protected String technicalName;
    @XmlAttribute(name = "typeOfPackaging")
    protected String typeOfPackaging;
    @XmlAttribute(name = "unNumber")
    protected String unNumber;

    /**
     * Gets the value of the allPackedInOne property.
     * 
     * @return
     *     possible object is
     *     {@link AllPackedInOneType }
     *     
     */
    public AllPackedInOneType getAllPackedInOne() {
        return allPackedInOne;
    }

    /**
     * Sets the value of the allPackedInOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllPackedInOneType }
     *     
     */
    public void setAllPackedInOne(AllPackedInOneType value) {
        this.allPackedInOne = value;
    }

    /**
     * Gets the value of the hazardClass property.
     * 
     * @return
     *     possible object is
     *     {@link HazardClassType }
     *     
     */
    public HazardClassType getHazardClass() {
        return hazardClass;
    }

    /**
     * Sets the value of the hazardClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardClassType }
     *     
     */
    public void setHazardClass(HazardClassType value) {
        this.hazardClass = value;
    }

    /**
     * Gets the value of the packageDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionsType }
     *     
     */
    public DimensionsType getPackageDimensions() {
        return packageDimensions;
    }

    /**
     * Sets the value of the packageDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionsType }
     *     
     */
    public void setPackageDimensions(DimensionsType value) {
        this.packageDimensions = value;
    }

    /**
     * Gets the value of the radioactiveMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link RadioactiveMaterialType }
     *     
     */
    public RadioactiveMaterialType getRadioactiveMaterials() {
        return radioactiveMaterials;
    }

    /**
     * Sets the value of the radioactiveMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioactiveMaterialType }
     *     
     */
    public void setRadioactiveMaterials(RadioactiveMaterialType value) {
        this.radioactiveMaterials = value;
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
     * Gets the value of the subsidiaryHazardClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsidiaryHazardClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidiaryHazardClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardClassType }
     * 
     * 
     */
    public List<HazardClassType> getSubsidiaryHazardClass() {
        if (subsidiaryHazardClass == null) {
            subsidiaryHazardClass = new ArrayList<HazardClassType>();
        }
        return this.subsidiaryHazardClass;
    }

    /**
     * Gets the value of the temperatures property.
     * 
     * @return
     *     possible object is
     *     {@link TemperaturesType }
     *     
     */
    public TemperaturesType getTemperatures() {
        return temperatures;
    }

    /**
     * Sets the value of the temperatures property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemperaturesType }
     *     
     */
    public void setTemperatures(TemperaturesType value) {
        this.temperatures = value;
    }

    /**
     * Gets the value of the compatibilityGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibilityGroup() {
        return compatibilityGroup;
    }

    /**
     * Sets the value of the compatibilityGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibilityGroup(String value) {
        this.compatibilityGroup = value;
    }

    /**
     * Gets the value of the dangerousGoodsLimitation property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftDangerousGoodsLimitationType }
     *     
     */
    public AircraftDangerousGoodsLimitationType getDangerousGoodsLimitation() {
        return dangerousGoodsLimitation;
    }

    /**
     * Sets the value of the dangerousGoodsLimitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftDangerousGoodsLimitationType }
     *     
     */
    public void setDangerousGoodsLimitation(AircraftDangerousGoodsLimitationType value) {
        this.dangerousGoodsLimitation = value;
    }

    /**
     * Gets the value of the dangerousGoodsQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDangerousGoodsQuantity() {
        return dangerousGoodsQuantity;
    }

    /**
     * Sets the value of the dangerousGoodsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDangerousGoodsQuantity(Integer value) {
        this.dangerousGoodsQuantity = value;
    }

    /**
     * Gets the value of the marinePollutantIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MarinePollutantIndicatorType }
     *     
     */
    public MarinePollutantIndicatorType getMarinePollutantIndicator() {
        return marinePollutantIndicator;
    }

    /**
     * Sets the value of the marinePollutantIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarinePollutantIndicatorType }
     *     
     */
    public void setMarinePollutantIndicator(MarinePollutantIndicatorType value) {
        this.marinePollutantIndicator = value;
    }

    /**
     * Gets the value of the overpackIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link OverpackIndicatorType }
     *     
     */
    public OverpackIndicatorType getOverpackIndicator() {
        return overpackIndicator;
    }

    /**
     * Sets the value of the overpackIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverpackIndicatorType }
     *     
     */
    public void setOverpackIndicator(OverpackIndicatorType value) {
        this.overpackIndicator = value;
    }

    /**
     * Gets the value of the packingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PackingGroupType }
     *     
     */
    public PackingGroupType getPackingGroup() {
        return packingGroup;
    }

    /**
     * Sets the value of the packingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackingGroupType }
     *     
     */
    public void setPackingGroup(PackingGroupType value) {
        this.packingGroup = value;
    }

    /**
     * Gets the value of the packingInstructionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackingInstructionNumber() {
        return packingInstructionNumber;
    }

    /**
     * Sets the value of the packingInstructionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackingInstructionNumber(String value) {
        this.packingInstructionNumber = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the properShippingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperShippingName() {
        return properShippingName;
    }

    /**
     * Sets the value of the properShippingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperShippingName(String value) {
        this.properShippingName = value;
    }

    /**
     * Gets the value of the reportableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReportableQuantity() {
        return reportableQuantity;
    }

    /**
     * Sets the value of the reportableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReportableQuantity(Integer value) {
        this.reportableQuantity = value;
    }

    /**
     * Gets the value of the shipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentTypeType }
     *     
     */
    public ShipmentTypeType getShipmentType() {
        return shipmentType;
    }

    /**
     * Sets the value of the shipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTypeType }
     *     
     */
    public void setShipmentType(ShipmentTypeType value) {
        this.shipmentType = value;
    }

    /**
     * Gets the value of the supplementaryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementaryInformation() {
        return supplementaryInformation;
    }

    /**
     * Sets the value of the supplementaryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementaryInformation(String value) {
        this.supplementaryInformation = value;
    }

    /**
     * Gets the value of the technicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnicalName() {
        return technicalName;
    }

    /**
     * Sets the value of the technicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnicalName(String value) {
        this.technicalName = value;
    }

    /**
     * Gets the value of the typeOfPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfPackaging() {
        return typeOfPackaging;
    }

    /**
     * Sets the value of the typeOfPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfPackaging(String value) {
        this.typeOfPackaging = value;
    }

    /**
     * Gets the value of the unNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnNumber() {
        return unNumber;
    }

    /**
     * Sets the value of the unNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnNumber(String value) {
        this.unNumber = value;
    }

}
