//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.rapttimeline;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.gov.dot.faa.atm.tfm.rapttimeline package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.gov.dot.faa.atm.tfm.rapttimeline
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RaptDataType }
     * 
     */
    public RaptDataType createRaptDataType() {
        return new RaptDataType();
    }

    /**
     * Create an instance of {@link RaptDataType.RAPTData }
     * 
     */
    public RaptDataType.RAPTData createRaptDataTypeRAPTData() {
        return new RaptDataType.RAPTData();
    }

    /**
     * Create an instance of {@link RaptDataType.RAPTData.RAPTTimelineData }
     * 
     */
    public RaptDataType.RAPTData.RAPTTimelineData createRaptDataTypeRAPTDataRAPTTimelineData() {
        return new RaptDataType.RAPTData.RAPTTimelineData();
    }

    /**
     * Create an instance of {@link RaptDataType.RAPTData.RAPTTimelineData.RAPTBlockageData }
     * 
     */
    public RaptDataType.RAPTData.RAPTTimelineData.RAPTBlockageData createRaptDataTypeRAPTDataRAPTTimelineDataRAPTBlockageData() {
        return new RaptDataType.RAPTData.RAPTTimelineData.RAPTBlockageData();
    }

    /**
     * Create an instance of {@link RaptDataType.RAPTData.RAPTTimelineData.HistoricalRouteTrend }
     * 
     */
    public RaptDataType.RAPTData.RAPTTimelineData.HistoricalRouteTrend createRaptDataTypeRAPTDataRAPTTimelineDataHistoricalRouteTrend() {
        return new RaptDataType.RAPTData.RAPTTimelineData.HistoricalRouteTrend();
    }

}
