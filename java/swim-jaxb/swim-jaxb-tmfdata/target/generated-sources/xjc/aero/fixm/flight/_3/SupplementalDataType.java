//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import aero.faa.nas._3.NasSupplementalDataType;
import aero.fixm.foundation._3.PersonType;


/**
 * 
 *             Contains the supplemental data about the flight. 
 *          
 * 
 * <p>Java class for SupplementalDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplementalDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pilotInCommand" type="{http://www.fixm.aero/foundation/3.0}PersonType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="fuelEndurance" type="{http://www.fixm.aero/foundation/3.0}DurationType" /&gt;
 *       &lt;attribute name="personsOnBoard" type="{http://www.fixm.aero/base/3.0}CountType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementalDataType", propOrder = {
    "pilotInCommand"
})
@XmlSeeAlso({
    NasSupplementalDataType.class
})
public class SupplementalDataType {

    protected PersonType pilotInCommand;
    @XmlAttribute(name = "fuelEndurance")
    protected Duration fuelEndurance;
    @XmlAttribute(name = "personsOnBoard")
    protected Integer personsOnBoard;

    /**
     * Gets the value of the pilotInCommand property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getPilotInCommand() {
        return pilotInCommand;
    }

    /**
     * Sets the value of the pilotInCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setPilotInCommand(PersonType value) {
        this.pilotInCommand = value;
    }

    /**
     * Gets the value of the fuelEndurance property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getFuelEndurance() {
        return fuelEndurance;
    }

    /**
     * Sets the value of the fuelEndurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setFuelEndurance(Duration value) {
        this.fuelEndurance = value;
    }

    /**
     * Gets the value of the personsOnBoard property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersonsOnBoard() {
        return personsOnBoard;
    }

    /**
     * Sets the value of the personsOnBoard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonsOnBoard(Integer value) {
        this.personsOnBoard = value;
    }

}