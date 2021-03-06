//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to uniquely identify a flight across systems. Example usage: <flightComputerId><facilityIdentifier>ZAU</facilityIdentifier><computerSystemId>HCS</computerSystemId><idNumber>100</idNumber></flightComputerId>
 * 
 * <p>Java class for flightComputerIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightComputerIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facilityIdentifier" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="computerSystemId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}computerSystemIdType" minOccurs="0"/&gt;
 *         &lt;element name="idNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Z0-9]{3}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightComputerIdType", propOrder = {
    "facilityIdentifier",
    "computerSystemId",
    "idNumber"
})
public class FlightComputerIdType {

    protected String facilityIdentifier;
    @XmlSchemaType(name = "string")
    protected ComputerSystemIdType computerSystemId;
    protected String idNumber;

    /**
     * Gets the value of the facilityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityIdentifier() {
        return facilityIdentifier;
    }

    /**
     * Sets the value of the facilityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityIdentifier(String value) {
        this.facilityIdentifier = value;
    }

    /**
     * Gets the value of the computerSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link ComputerSystemIdType }
     *     
     */
    public ComputerSystemIdType getComputerSystemId() {
        return computerSystemId;
    }

    /**
     * Sets the value of the computerSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputerSystemIdType }
     *     
     */
    public void setComputerSystemId(ComputerSystemIdType value) {
        this.computerSystemId = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

}
