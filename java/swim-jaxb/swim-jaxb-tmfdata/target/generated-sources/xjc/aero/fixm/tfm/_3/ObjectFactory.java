//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package aero.fixm.tfm._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import aero.fixm.flight._3.FlightType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aero.fixm.tfm._3 package. 
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

    private final static QName _Flight_QNAME = new QName("http://www.fixm.aero/tfm/3.1", "flight");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aero.fixm.tfm._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TfmFlightDataChangeType }
     * 
     */
    public TfmFlightDataChangeType createTfmFlightDataChangeType() {
        return new TfmFlightDataChangeType();
    }

    /**
     * Create an instance of {@link TfmIInternationalFlighDataType }
     * 
     */
    public TfmIInternationalFlighDataType createTfmIInternationalFlighDataType() {
        return new TfmIInternationalFlighDataType();
    }

    /**
     * Create an instance of {@link TfmTfdmFlightType }
     * 
     */
    public TfmTfdmFlightType createTfmTfdmFlightType() {
        return new TfmTfdmFlightType();
    }

    /**
     * Create an instance of {@link TfmTerminalFlighDataType }
     * 
     */
    public TfmTerminalFlighDataType createTfmTerminalFlighDataType() {
        return new TfmTerminalFlighDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/tfm/3.1", name = "flight", substitutionHeadNamespace = "http://www.fixm.aero/base/3.0", substitutionHeadName = "Feature")
    public JAXBElement<FlightType> createFlight(FlightType value) {
        return new JAXBElement<FlightType>(_Flight_QNAME, FlightType.class, null, value);
    }

}
