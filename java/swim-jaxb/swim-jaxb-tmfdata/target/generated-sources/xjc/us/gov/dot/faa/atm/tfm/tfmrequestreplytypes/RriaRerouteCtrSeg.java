//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Container for reroute segment.
 * 
 * <p>Java class for rriaRerouteCtrSeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rriaRerouteCtrSeg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="INCLUDE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="INCLUDE"/&gt;
 *               &lt;enumeration value="EXCLUDE"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEGMENT_VALID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Y"/&gt;
 *               &lt;enumeration value="N"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORIGIN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[a-zA-Z0-9 ]{0,128}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DESTINATION" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[a-zA-Z0-9 ]{0,128}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FLTR_SUMMARY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value=".{0,100}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ROUTE_STR"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FULL_ROUTE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="FULL"/&gt;
 *               &lt;enumeration value="ORIG"/&gt;
 *               &lt;enumeration value="DEST"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WAYPOINT" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ROUTE_TYPE"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="NONE"/&gt;
 *               &lt;enumeration value="CDR RTE"/&gt;
 *               &lt;enumeration value="RERTE"/&gt;
 *               &lt;enumeration value="UNKN RTE"/&gt;
 *               &lt;enumeration value="UPT RTE"/&gt;
 *               &lt;enumeration value="EXCEPTED"/&gt;
 *               &lt;enumeration value="ASSIGNED:"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEG_SOURCENAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEG_ID" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaRerouteSegmentIdType"/&gt;
 *         &lt;element name="protectedSegment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *               &lt;pattern value="([A-Z0-9]{2,} ?)+"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SEG_REMARKS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="512"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CTR_FLTR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NOT_FROM" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="128"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NOT_TO" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="128"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="THRU" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="128"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AIRWAY" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="128"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="USE_FIX" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="128"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AC_TYPE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="64"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FLIGHTLVLLOW" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                         &lt;maxInclusive value="600"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FLIGHTLVLHIGH" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *                         &lt;maxInclusive value="600"/&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AIR_CAT"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="[JPT ]+"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="WEIGHT_CLASS" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="[LHS ]+"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="USER_CAT"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="[TFCGM ]+"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RVSM" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="ALL"/&gt;
 *                         &lt;enumeration value="COMPLIANT"/&gt;
 *                         &lt;enumeration value="NON-COMPLIANT"/&gt;
 *                         &lt;enumeration value="NON_COMPLIANT"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FLTR_TIMETYPE" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="DEP"/&gt;
 *                         &lt;enumeration value="ARR"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FLTR_STARTTIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="FLTR_ENDTIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "rriaRerouteCtrSeg", propOrder = {
    "include",
    "segmentvalid",
    "origin",
    "destination",
    "fltrsummary",
    "routestr",
    "fullroute",
    "waypoint",
    "routetype",
    "segsourcename",
    "segid",
    "protectedSegment",
    "segremarks",
    "ctrfltr"
})
public class RriaRerouteCtrSeg {

    @XmlElement(name = "INCLUDE", required = true)
    protected String include;
    @XmlElement(name = "SEGMENT_VALID", required = true)
    protected String segmentvalid;
    @XmlElement(name = "ORIGIN")
    protected String origin;
    @XmlElement(name = "DESTINATION")
    protected String destination;
    @XmlElement(name = "FLTR_SUMMARY")
    protected String fltrsummary;
    @XmlElement(name = "ROUTE_STR", required = true)
    protected String routestr;
    @XmlElement(name = "FULL_ROUTE", required = true)
    protected String fullroute;
    @XmlElement(name = "WAYPOINT")
    protected List<String> waypoint;
    @XmlElement(name = "ROUTE_TYPE", required = true)
    protected String routetype;
    @XmlElement(name = "SEG_SOURCENAME")
    protected String segsourcename;
    @XmlElement(name = "SEG_ID", required = true)
    protected String segid;
    protected String protectedSegment;
    @XmlElement(name = "SEG_REMARKS")
    protected String segremarks;
    @XmlElement(name = "CTR_FLTR")
    protected RriaRerouteCtrSeg.CTRFLTR ctrfltr;

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINCLUDE() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINCLUDE(String value) {
        this.include = value;
    }

    /**
     * Gets the value of the segmentvalid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGMENTVALID() {
        return segmentvalid;
    }

    /**
     * Sets the value of the segmentvalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGMENTVALID(String value) {
        this.segmentvalid = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORIGIN() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORIGIN(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINATION() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINATION(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the fltrsummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLTRSUMMARY() {
        return fltrsummary;
    }

    /**
     * Sets the value of the fltrsummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLTRSUMMARY(String value) {
        this.fltrsummary = value;
    }

    /**
     * Gets the value of the routestr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROUTESTR() {
        return routestr;
    }

    /**
     * Sets the value of the routestr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROUTESTR(String value) {
        this.routestr = value;
    }

    /**
     * Gets the value of the fullroute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFULLROUTE() {
        return fullroute;
    }

    /**
     * Sets the value of the fullroute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFULLROUTE(String value) {
        this.fullroute = value;
    }

    /**
     * Gets the value of the waypoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waypoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWAYPOINT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWAYPOINT() {
        if (waypoint == null) {
            waypoint = new ArrayList<String>();
        }
        return this.waypoint;
    }

    /**
     * Gets the value of the routetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROUTETYPE() {
        return routetype;
    }

    /**
     * Sets the value of the routetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROUTETYPE(String value) {
        this.routetype = value;
    }

    /**
     * Gets the value of the segsourcename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGSOURCENAME() {
        return segsourcename;
    }

    /**
     * Sets the value of the segsourcename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGSOURCENAME(String value) {
        this.segsourcename = value;
    }

    /**
     * Gets the value of the segid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGID() {
        return segid;
    }

    /**
     * Sets the value of the segid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGID(String value) {
        this.segid = value;
    }

    /**
     * Gets the value of the protectedSegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectedSegment() {
        return protectedSegment;
    }

    /**
     * Sets the value of the protectedSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectedSegment(String value) {
        this.protectedSegment = value;
    }

    /**
     * Gets the value of the segremarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEGREMARKS() {
        return segremarks;
    }

    /**
     * Sets the value of the segremarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEGREMARKS(String value) {
        this.segremarks = value;
    }

    /**
     * Gets the value of the ctrfltr property.
     * 
     * @return
     *     possible object is
     *     {@link RriaRerouteCtrSeg.CTRFLTR }
     *     
     */
    public RriaRerouteCtrSeg.CTRFLTR getCTRFLTR() {
        return ctrfltr;
    }

    /**
     * Sets the value of the ctrfltr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RriaRerouteCtrSeg.CTRFLTR }
     *     
     */
    public void setCTRFLTR(RriaRerouteCtrSeg.CTRFLTR value) {
        this.ctrfltr = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="NOT_FROM" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="128"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NOT_TO" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="128"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="THRU" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="128"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AIRWAY" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="128"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="USE_FIX" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="128"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AC_TYPE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="64"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FLIGHTLVLLOW" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;minInclusive value="0"/&gt;
     *               &lt;maxInclusive value="600"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FLIGHTLVLHIGH" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
     *               &lt;maxInclusive value="600"/&gt;
     *               &lt;minInclusive value="0"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AIR_CAT"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="[JPT ]+"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="WEIGHT_CLASS" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="[LHS ]+"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="USER_CAT"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="[TFCGM ]+"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RVSM" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="ALL"/&gt;
     *               &lt;enumeration value="COMPLIANT"/&gt;
     *               &lt;enumeration value="NON-COMPLIANT"/&gt;
     *               &lt;enumeration value="NON_COMPLIANT"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FLTR_TIMETYPE" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="DEP"/&gt;
     *               &lt;enumeration value="ARR"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FLTR_STARTTIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *         &lt;element name="FLTR_ENDTIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "notfrom",
        "notto",
        "thru",
        "airway",
        "usefix",
        "actype",
        "flightlvllow",
        "flightlvlhigh",
        "aircat",
        "weightclass",
        "usercat",
        "rvsm",
        "fltrtimetype",
        "fltrstarttime",
        "fltrendtime"
    })
    public static class CTRFLTR {

        @XmlElement(name = "NOT_FROM")
        protected String notfrom;
        @XmlElement(name = "NOT_TO")
        protected String notto;
        @XmlElement(name = "THRU")
        protected String thru;
        @XmlElement(name = "AIRWAY")
        protected String airway;
        @XmlElement(name = "USE_FIX")
        protected String usefix;
        @XmlElement(name = "AC_TYPE")
        protected String actype;
        @XmlElement(name = "FLIGHTLVLLOW")
        protected Integer flightlvllow;
        @XmlElement(name = "FLIGHTLVLHIGH")
        protected Integer flightlvlhigh;
        @XmlElement(name = "AIR_CAT", required = true)
        protected String aircat;
        @XmlElement(name = "WEIGHT_CLASS")
        protected String weightclass;
        @XmlElement(name = "USER_CAT", required = true)
        protected String usercat;
        @XmlElement(name = "RVSM")
        protected String rvsm;
        @XmlElement(name = "FLTR_TIMETYPE")
        protected String fltrtimetype;
        @XmlElement(name = "FLTR_STARTTIME")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fltrstarttime;
        @XmlElement(name = "FLTR_ENDTIME")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fltrendtime;

        /**
         * Gets the value of the notfrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNOTFROM() {
            return notfrom;
        }

        /**
         * Sets the value of the notfrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNOTFROM(String value) {
            this.notfrom = value;
        }

        /**
         * Gets the value of the notto property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNOTTO() {
            return notto;
        }

        /**
         * Sets the value of the notto property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNOTTO(String value) {
            this.notto = value;
        }

        /**
         * Gets the value of the thru property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTHRU() {
            return thru;
        }

        /**
         * Sets the value of the thru property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTHRU(String value) {
            this.thru = value;
        }

        /**
         * Gets the value of the airway property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIRWAY() {
            return airway;
        }

        /**
         * Sets the value of the airway property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIRWAY(String value) {
            this.airway = value;
        }

        /**
         * Gets the value of the usefix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSEFIX() {
            return usefix;
        }

        /**
         * Sets the value of the usefix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSEFIX(String value) {
            this.usefix = value;
        }

        /**
         * Gets the value of the actype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getACTYPE() {
            return actype;
        }

        /**
         * Sets the value of the actype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setACTYPE(String value) {
            this.actype = value;
        }

        /**
         * Gets the value of the flightlvllow property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFLIGHTLVLLOW() {
            return flightlvllow;
        }

        /**
         * Sets the value of the flightlvllow property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFLIGHTLVLLOW(Integer value) {
            this.flightlvllow = value;
        }

        /**
         * Gets the value of the flightlvlhigh property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFLIGHTLVLHIGH() {
            return flightlvlhigh;
        }

        /**
         * Sets the value of the flightlvlhigh property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFLIGHTLVLHIGH(Integer value) {
            this.flightlvlhigh = value;
        }

        /**
         * Gets the value of the aircat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAIRCAT() {
            return aircat;
        }

        /**
         * Sets the value of the aircat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAIRCAT(String value) {
            this.aircat = value;
        }

        /**
         * Gets the value of the weightclass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWEIGHTCLASS() {
            return weightclass;
        }

        /**
         * Sets the value of the weightclass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWEIGHTCLASS(String value) {
            this.weightclass = value;
        }

        /**
         * Gets the value of the usercat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSERCAT() {
            return usercat;
        }

        /**
         * Sets the value of the usercat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSERCAT(String value) {
            this.usercat = value;
        }

        /**
         * Gets the value of the rvsm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRVSM() {
            return rvsm;
        }

        /**
         * Sets the value of the rvsm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRVSM(String value) {
            this.rvsm = value;
        }

        /**
         * Gets the value of the fltrtimetype property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFLTRTIMETYPE() {
            return fltrtimetype;
        }

        /**
         * Sets the value of the fltrtimetype property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFLTRTIMETYPE(String value) {
            this.fltrtimetype = value;
        }

        /**
         * Gets the value of the fltrstarttime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFLTRSTARTTIME() {
            return fltrstarttime;
        }

        /**
         * Sets the value of the fltrstarttime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFLTRSTARTTIME(XMLGregorianCalendar value) {
            this.fltrstarttime = value;
        }

        /**
         * Gets the value of the fltrendtime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFLTRENDTIME() {
            return fltrendtime;
        }

        /**
         * Sets the value of the fltrendtime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFLTRENDTIME(XMLGregorianCalendar value) {
            this.fltrendtime = value;
        }

    }

}
