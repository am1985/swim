//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseFxaFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseFxaFilterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="traverseAny"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;pattern value="(([A-Z0-9]{3,4})|([0-9A-Za-z]{2,3}|[A-Za-z][0-9A-Za-z]{3}|[0-9A-Za-z][A-Za-z][0-9A-Za-z]{2}|[0-9A-Za-z]{2}[A-Za-z][0-9A-Za-z]|[0-9A-Za-z]{3}[A-Za-z]|[0-9A-Za-z]{5})[\s]?){1,100}"/&gt;
 *                 &lt;maxLength value="64"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="traverseAll"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;pattern value="(([A-Z0-9]{3,4})|([0-9A-Za-z]{2,3}|[A-Za-z][0-9A-Za-z]{3}|[0-9A-Za-z][A-Za-z][0-9A-Za-z]{2}|[0-9A-Za-z]{2}[A-Za-z][0-9A-Za-z]|[0-9A-Za-z]{3}[A-Za-z]|[0-9A-Za-z]{5})[\s]?){1,100}"/&gt;
 *                 &lt;maxLength value="64"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="traverseNone"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;pattern value="(([A-Z0-9]{3,4})|([0-9A-Za-z]{2,3}|[A-Za-z][0-9A-Za-z]{3}|[0-9A-Za-z][A-Za-z][0-9A-Za-z]{2}|[0-9A-Za-z]{2}[A-Za-z][0-9A-Za-z]|[0-9A-Za-z]{3}[A-Za-z]|[0-9A-Za-z]{5})[\s]?){1,100}"/&gt;
 *                 &lt;maxLength value="64"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="useAirwayAny"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;pattern value="([A-Z0-9]{2,8}[\s]?){1,100}"/&gt;
 *                 &lt;maxLength value="64"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="useAirwayAll"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;pattern value="([A-Z0-9]{2,8}[\s]?){1,100}"/&gt;
 *                 &lt;maxLength value="64"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="useAirwayNone"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;pattern value="([A-Z0-9]{2,8}[\s]?){1,100}"/&gt;
 *                 &lt;maxLength value="64"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="locatedAny"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;pattern value="(([A-Z0-9]{3,4})|([0-9A-Za-z]{2,3}|[A-Za-z][0-9A-Za-z]{3}|[0-9A-Za-z][A-Za-z][0-9A-Za-z]{2}|[0-9A-Za-z]{2}[A-Za-z][0-9A-Za-z]|[0-9A-Za-z]{3}[A-Za-z]|[0-9A-Za-z]{5})[\s]?){1,100}"/&gt;
 *                 &lt;maxLength value="64"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="locatedNone"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;pattern value="(([A-Z0-9]{3,4})|([0-9A-Za-z]{2,3}|[A-Za-z][0-9A-Za-z]{3}|[0-9A-Za-z][A-Za-z][0-9A-Za-z]{2}|[0-9A-Za-z]{2}[A-Za-z][0-9A-Za-z]|[0-9A-Za-z]{3}[A-Za-z]|[0-9A-Za-z]{5})[\s]?){1,100}"/&gt;
 *                 &lt;maxLength value="64"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="typeAny"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;maxLength value="64"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="typeNone"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;maxLength value="64"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="remarksAny"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fcaRemarksType" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;maxLength value="512"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="remarksAll"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fcaRemarksType" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;maxLength value="512"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="remarksNone"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fcaRemarksType" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;maxLength value="512"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="headingIs"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                 &lt;pattern value="([0-9]|[1-9][0-9]|[1-2][0-9][0-9]|[3][0-6][0-9])\s([0-9]|[1-9][0-9]|[1][0-8][0-9])"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="headingNot"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                 &lt;pattern value="([0-9]|[1-9][0-9]|[1-2][0-9][0-9]|[3][0-6][0-9])\s([0-9]|[1-9][0-9]|[1][0-8][0-9])"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="acidAny"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;maxLength value="1024"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="acidNone"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction&gt;
 *                 &lt;simpleType&gt;
 *                   &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;/simpleType&gt;
 *                 &lt;maxLength value="1024"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseFxaFilterType", propOrder = {
    "traverseAny",
    "traverseAll",
    "traverseNone",
    "useAirwayAny",
    "useAirwayAll",
    "useAirwayNone",
    "locatedAny",
    "locatedNone",
    "typeAny",
    "typeNone",
    "remarksAny",
    "remarksAll",
    "remarksNone",
    "headingIs",
    "headingNot",
    "acidAny",
    "acidNone"
})
@XmlSeeAlso({
    SecondaryAnyFcaFilterType.class,
    PrimaryAnyFcaFilterType.class
})
public class BaseFxaFilterType {

    @XmlList
    protected List<String> traverseAny;
    @XmlList
    protected List<String> traverseAll;
    @XmlList
    protected List<String> traverseNone;
    @XmlList
    protected List<String> useAirwayAny;
    @XmlList
    protected List<String> useAirwayAll;
    @XmlList
    protected List<String> useAirwayNone;
    @XmlList
    protected List<String> locatedAny;
    @XmlList
    protected List<String> locatedNone;
    @XmlList
    protected List<String> typeAny;
    @XmlList
    protected List<String> typeNone;
    @XmlList
    protected List<FcaRemarksType> remarksAny;
    @XmlList
    protected List<FcaRemarksType> remarksAll;
    @XmlList
    protected List<FcaRemarksType> remarksNone;
    protected String headingIs;
    protected String headingNot;
    @XmlList
    protected List<String> acidAny;
    @XmlList
    protected List<String> acidNone;

    /**
     * Gets the value of the traverseAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traverseAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraverseAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTraverseAny() {
        if (traverseAny == null) {
            traverseAny = new ArrayList<String>();
        }
        return this.traverseAny;
    }

    /**
     * Gets the value of the traverseAll property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traverseAll property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraverseAll().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTraverseAll() {
        if (traverseAll == null) {
            traverseAll = new ArrayList<String>();
        }
        return this.traverseAll;
    }

    /**
     * Gets the value of the traverseNone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traverseNone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraverseNone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTraverseNone() {
        if (traverseNone == null) {
            traverseNone = new ArrayList<String>();
        }
        return this.traverseNone;
    }

    /**
     * Gets the value of the useAirwayAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useAirwayAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseAirwayAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUseAirwayAny() {
        if (useAirwayAny == null) {
            useAirwayAny = new ArrayList<String>();
        }
        return this.useAirwayAny;
    }

    /**
     * Gets the value of the useAirwayAll property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useAirwayAll property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseAirwayAll().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUseAirwayAll() {
        if (useAirwayAll == null) {
            useAirwayAll = new ArrayList<String>();
        }
        return this.useAirwayAll;
    }

    /**
     * Gets the value of the useAirwayNone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useAirwayNone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseAirwayNone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUseAirwayNone() {
        if (useAirwayNone == null) {
            useAirwayNone = new ArrayList<String>();
        }
        return this.useAirwayNone;
    }

    /**
     * Gets the value of the locatedAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locatedAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocatedAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocatedAny() {
        if (locatedAny == null) {
            locatedAny = new ArrayList<String>();
        }
        return this.locatedAny;
    }

    /**
     * Gets the value of the locatedNone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locatedNone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocatedNone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocatedNone() {
        if (locatedNone == null) {
            locatedNone = new ArrayList<String>();
        }
        return this.locatedNone;
    }

    /**
     * Gets the value of the typeAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeAny() {
        if (typeAny == null) {
            typeAny = new ArrayList<String>();
        }
        return this.typeAny;
    }

    /**
     * Gets the value of the typeNone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeNone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeNone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeNone() {
        if (typeNone == null) {
            typeNone = new ArrayList<String>();
        }
        return this.typeNone;
    }

    /**
     * Gets the value of the remarksAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarksAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarksAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FcaRemarksType }
     * 
     * 
     */
    public List<FcaRemarksType> getRemarksAny() {
        if (remarksAny == null) {
            remarksAny = new ArrayList<FcaRemarksType>();
        }
        return this.remarksAny;
    }

    /**
     * Gets the value of the remarksAll property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarksAll property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarksAll().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FcaRemarksType }
     * 
     * 
     */
    public List<FcaRemarksType> getRemarksAll() {
        if (remarksAll == null) {
            remarksAll = new ArrayList<FcaRemarksType>();
        }
        return this.remarksAll;
    }

    /**
     * Gets the value of the remarksNone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarksNone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarksNone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FcaRemarksType }
     * 
     * 
     */
    public List<FcaRemarksType> getRemarksNone() {
        if (remarksNone == null) {
            remarksNone = new ArrayList<FcaRemarksType>();
        }
        return this.remarksNone;
    }

    /**
     * Gets the value of the headingIs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadingIs() {
        return headingIs;
    }

    /**
     * Sets the value of the headingIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadingIs(String value) {
        this.headingIs = value;
    }

    /**
     * Gets the value of the headingNot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadingNot() {
        return headingNot;
    }

    /**
     * Sets the value of the headingNot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadingNot(String value) {
        this.headingNot = value;
    }

    /**
     * Gets the value of the acidAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acidAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcidAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAcidAny() {
        if (acidAny == null) {
            acidAny = new ArrayList<String>();
        }
        return this.acidAny;
    }

    /**
     * Gets the value of the acidNone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acidNone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcidNone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAcidNone() {
        if (acidNone == null) {
            acidNone = new ArrayList<String>();
        }
        return this.acidNone;
    }

}