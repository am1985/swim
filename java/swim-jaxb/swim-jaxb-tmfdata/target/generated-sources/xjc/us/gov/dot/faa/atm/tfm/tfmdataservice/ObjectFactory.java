//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmdataservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.gov.dot.faa.atm.tfm.tfmdataservice package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.gov.dot.faa.atm.tfm.tfmdataservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TfmDataService }
     * 
     */
    public TfmDataService createTfmDataService() {
        return new TfmDataService();
    }

    /**
     * Create an instance of {@link TfmDataService.InternationalData }
     * 
     */
    public TfmDataService.InternationalData createTfmDataServiceInternationalData() {
        return new TfmDataService.InternationalData();
    }

    /**
     * Create an instance of {@link TfmDataService.TerminalFlightData }
     * 
     */
    public TfmDataService.TerminalFlightData createTfmDataServiceTerminalFlightData() {
        return new TfmDataService.TerminalFlightData();
    }

    /**
     * Create an instance of {@link TfmDataService.TfmRequestReply }
     * 
     */
    public TfmDataService.TfmRequestReply createTfmDataServiceTfmRequestReply() {
        return new TfmDataService.TfmRequestReply();
    }

    /**
     * Create an instance of {@link TfmDataService.TfmsStatusOutput }
     * 
     */
    public TfmDataService.TfmsStatusOutput createTfmDataServiceTfmsStatusOutput() {
        return new TfmDataService.TfmsStatusOutput();
    }

    /**
     * Create an instance of {@link TfmdataStatusType }
     * 
     */
    public TfmdataStatusType createTfmdataStatusType() {
        return new TfmdataStatusType();
    }

}
