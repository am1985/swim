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
 * Describes a meridian of longitude. Used with a latitude, a geographical point can be realized.
 * 
 * <p>Java class for longitudeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="longitudeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="longitudeDMS"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="degrees" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}longitudeDegreesType" /&gt;
 *                 &lt;attribute name="minutes" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}secOfMinuteOfDegreeType" /&gt;
 *                 &lt;attribute name="seconds" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}secOfMinuteOfDegreeType" /&gt;
 *                 &lt;attribute name="direction" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}longitudeDirectionType" default="WEST" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="longitudeDecimal"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}longitudeDecimalType"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="longitudeRadians" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "longitudeType", propOrder = {
    "longitudeDMS",
    "longitudeDecimal",
    "longitudeRadians"
})
public class LongitudeType {

    protected LongitudeType.LongitudeDMS longitudeDMS;
    protected Float longitudeDecimal;
    protected Float longitudeRadians;

    /**
     * Gets the value of the longitudeDMS property.
     * 
     * @return
     *     possible object is
     *     {@link LongitudeType.LongitudeDMS }
     *     
     */
    public LongitudeType.LongitudeDMS getLongitudeDMS() {
        return longitudeDMS;
    }

    /**
     * Sets the value of the longitudeDMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeType.LongitudeDMS }
     *     
     */
    public void setLongitudeDMS(LongitudeType.LongitudeDMS value) {
        this.longitudeDMS = value;
    }

    /**
     * Gets the value of the longitudeDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLongitudeDecimal() {
        return longitudeDecimal;
    }

    /**
     * Sets the value of the longitudeDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLongitudeDecimal(Float value) {
        this.longitudeDecimal = value;
    }

    /**
     * Gets the value of the longitudeRadians property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLongitudeRadians() {
        return longitudeRadians;
    }

    /**
     * Sets the value of the longitudeRadians property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLongitudeRadians(Float value) {
        this.longitudeRadians = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="degrees" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}longitudeDegreesType" /&gt;
     *       &lt;attribute name="minutes" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}secOfMinuteOfDegreeType" /&gt;
     *       &lt;attribute name="seconds" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}secOfMinuteOfDegreeType" /&gt;
     *       &lt;attribute name="direction" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}longitudeDirectionType" default="WEST" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LongitudeDMS {

        @XmlAttribute(name = "degrees", required = true)
        protected int degrees;
        @XmlAttribute(name = "minutes", required = true)
        protected int minutes;
        @XmlAttribute(name = "seconds")
        protected Integer seconds;
        @XmlAttribute(name = "direction")
        protected LongitudeDirectionType direction;

        /**
         * Gets the value of the degrees property.
         * 
         */
        public int getDegrees() {
            return degrees;
        }

        /**
         * Sets the value of the degrees property.
         * 
         */
        public void setDegrees(int value) {
            this.degrees = value;
        }

        /**
         * Gets the value of the minutes property.
         * 
         */
        public int getMinutes() {
            return minutes;
        }

        /**
         * Sets the value of the minutes property.
         * 
         */
        public void setMinutes(int value) {
            this.minutes = value;
        }

        /**
         * Gets the value of the seconds property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSeconds() {
            return seconds;
        }

        /**
         * Sets the value of the seconds property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSeconds(Integer value) {
            this.seconds = value;
        }

        /**
         * Gets the value of the direction property.
         * 
         * @return
         *     possible object is
         *     {@link LongitudeDirectionType }
         *     
         */
        public LongitudeDirectionType getDirection() {
            if (direction == null) {
                return LongitudeDirectionType.WEST;
            } else {
                return direction;
            }
        }

        /**
         * Sets the value of the direction property.
         * 
         * @param value
         *     allowed object is
         *     {@link LongitudeDirectionType }
         *     
         */
        public void setDirection(LongitudeDirectionType value) {
            this.direction = value;
        }

    }

}