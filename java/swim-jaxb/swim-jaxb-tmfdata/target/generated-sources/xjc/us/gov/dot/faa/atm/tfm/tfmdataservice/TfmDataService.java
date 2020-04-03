//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 10:08:32 AM EDT 
//


package us.gov.dot.faa.atm.tfm.tfmdataservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.tfm._3.TfmIInternationalFlighDataType;
import aero.fixm.tfm._3.TfmTerminalFlighDataType;
import us.gov.dot.faa.atm.tfm.flightdata.FltdOutputType;
import us.gov.dot.faa.atm.tfm.flowinformation.FiOutputType;
import us.gov.dot.faa.atm.tfm.tfmrequestreplytypes.ReplyType;
import us.gov.dot.faa.atm.tfm.tfmrequestreplytypes.RequestType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="fltdOutput" type="{urn:us:gov:dot:faa:atm:tfm:flightdata}fltdOutputType"/&gt;
 *         &lt;element name="internationalData"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="intdInput" type="{http://www.fixm.aero/tfm/3.1}TfmIInternationalFlighDataType"/&gt;
 *                   &lt;element name="intdOutput" type="{http://www.fixm.aero/tfm/3.1}TfmIInternationalFlighDataType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="terminalFlightData"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="tfdInput" type="{http://www.fixm.aero/tfm/3.1}TfmTerminalFlighDataType"/&gt;
 *                   &lt;element name="tfdOutput" type="{http://www.fixm.aero/tfm/3.1}TfmTerminalFlighDataType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tfmRequestReply"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="reply" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}replyType"/&gt;
 *                   &lt;element name="request" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}requestType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fiOutput" type="{urn:us:gov:dot:faa:atm:tfm:flowinformation}fiOutputType"/&gt;
 *         &lt;element name="tfmsStatusOutput"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="status" type="{urn:us:gov:dot:faa:atm:tfm:tfmdataservice}tfmdataStatusType" maxOccurs="unbounded"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fltdOutput",
    "internationalData",
    "terminalFlightData",
    "tfmRequestReply",
    "fiOutput",
    "tfmsStatusOutput"
})
@XmlRootElement(name = "tfmDataService")
public class TfmDataService {

    protected FltdOutputType fltdOutput;
    protected TfmDataService.InternationalData internationalData;
    protected TfmDataService.TerminalFlightData terminalFlightData;
    protected TfmDataService.TfmRequestReply tfmRequestReply;
    protected FiOutputType fiOutput;
    protected TfmDataService.TfmsStatusOutput tfmsStatusOutput;

    /**
     * Gets the value of the fltdOutput property.
     * 
     * @return
     *     possible object is
     *     {@link FltdOutputType }
     *     
     */
    public FltdOutputType getFltdOutput() {
        return fltdOutput;
    }

    /**
     * Sets the value of the fltdOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltdOutputType }
     *     
     */
    public void setFltdOutput(FltdOutputType value) {
        this.fltdOutput = value;
    }

    /**
     * Gets the value of the internationalData property.
     * 
     * @return
     *     possible object is
     *     {@link TfmDataService.InternationalData }
     *     
     */
    public TfmDataService.InternationalData getInternationalData() {
        return internationalData;
    }

    /**
     * Sets the value of the internationalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfmDataService.InternationalData }
     *     
     */
    public void setInternationalData(TfmDataService.InternationalData value) {
        this.internationalData = value;
    }

    /**
     * Gets the value of the terminalFlightData property.
     * 
     * @return
     *     possible object is
     *     {@link TfmDataService.TerminalFlightData }
     *     
     */
    public TfmDataService.TerminalFlightData getTerminalFlightData() {
        return terminalFlightData;
    }

    /**
     * Sets the value of the terminalFlightData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfmDataService.TerminalFlightData }
     *     
     */
    public void setTerminalFlightData(TfmDataService.TerminalFlightData value) {
        this.terminalFlightData = value;
    }

    /**
     * Gets the value of the tfmRequestReply property.
     * 
     * @return
     *     possible object is
     *     {@link TfmDataService.TfmRequestReply }
     *     
     */
    public TfmDataService.TfmRequestReply getTfmRequestReply() {
        return tfmRequestReply;
    }

    /**
     * Sets the value of the tfmRequestReply property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfmDataService.TfmRequestReply }
     *     
     */
    public void setTfmRequestReply(TfmDataService.TfmRequestReply value) {
        this.tfmRequestReply = value;
    }

    /**
     * Gets the value of the fiOutput property.
     * 
     * @return
     *     possible object is
     *     {@link FiOutputType }
     *     
     */
    public FiOutputType getFiOutput() {
        return fiOutput;
    }

    /**
     * Sets the value of the fiOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiOutputType }
     *     
     */
    public void setFiOutput(FiOutputType value) {
        this.fiOutput = value;
    }

    /**
     * Gets the value of the tfmsStatusOutput property.
     * 
     * @return
     *     possible object is
     *     {@link TfmDataService.TfmsStatusOutput }
     *     
     */
    public TfmDataService.TfmsStatusOutput getTfmsStatusOutput() {
        return tfmsStatusOutput;
    }

    /**
     * Sets the value of the tfmsStatusOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfmDataService.TfmsStatusOutput }
     *     
     */
    public void setTfmsStatusOutput(TfmDataService.TfmsStatusOutput value) {
        this.tfmsStatusOutput = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="intdInput" type="{http://www.fixm.aero/tfm/3.1}TfmIInternationalFlighDataType"/&gt;
     *         &lt;element name="intdOutput" type="{http://www.fixm.aero/tfm/3.1}TfmIInternationalFlighDataType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "intdInput",
        "intdOutput"
    })
    public static class InternationalData {

        protected TfmIInternationalFlighDataType intdInput;
        protected TfmIInternationalFlighDataType intdOutput;

        /**
         * Gets the value of the intdInput property.
         * 
         * @return
         *     possible object is
         *     {@link TfmIInternationalFlighDataType }
         *     
         */
        public TfmIInternationalFlighDataType getIntdInput() {
            return intdInput;
        }

        /**
         * Sets the value of the intdInput property.
         * 
         * @param value
         *     allowed object is
         *     {@link TfmIInternationalFlighDataType }
         *     
         */
        public void setIntdInput(TfmIInternationalFlighDataType value) {
            this.intdInput = value;
        }

        /**
         * Gets the value of the intdOutput property.
         * 
         * @return
         *     possible object is
         *     {@link TfmIInternationalFlighDataType }
         *     
         */
        public TfmIInternationalFlighDataType getIntdOutput() {
            return intdOutput;
        }

        /**
         * Sets the value of the intdOutput property.
         * 
         * @param value
         *     allowed object is
         *     {@link TfmIInternationalFlighDataType }
         *     
         */
        public void setIntdOutput(TfmIInternationalFlighDataType value) {
            this.intdOutput = value;
        }

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
     *       &lt;choice&gt;
     *         &lt;element name="tfdInput" type="{http://www.fixm.aero/tfm/3.1}TfmTerminalFlighDataType"/&gt;
     *         &lt;element name="tfdOutput" type="{http://www.fixm.aero/tfm/3.1}TfmTerminalFlighDataType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tfdInput",
        "tfdOutput"
    })
    public static class TerminalFlightData {

        protected TfmTerminalFlighDataType tfdInput;
        protected TfmTerminalFlighDataType tfdOutput;

        /**
         * Gets the value of the tfdInput property.
         * 
         * @return
         *     possible object is
         *     {@link TfmTerminalFlighDataType }
         *     
         */
        public TfmTerminalFlighDataType getTfdInput() {
            return tfdInput;
        }

        /**
         * Sets the value of the tfdInput property.
         * 
         * @param value
         *     allowed object is
         *     {@link TfmTerminalFlighDataType }
         *     
         */
        public void setTfdInput(TfmTerminalFlighDataType value) {
            this.tfdInput = value;
        }

        /**
         * Gets the value of the tfdOutput property.
         * 
         * @return
         *     possible object is
         *     {@link TfmTerminalFlighDataType }
         *     
         */
        public TfmTerminalFlighDataType getTfdOutput() {
            return tfdOutput;
        }

        /**
         * Sets the value of the tfdOutput property.
         * 
         * @param value
         *     allowed object is
         *     {@link TfmTerminalFlighDataType }
         *     
         */
        public void setTfdOutput(TfmTerminalFlighDataType value) {
            this.tfdOutput = value;
        }

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
     *       &lt;choice&gt;
     *         &lt;element name="reply" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}replyType"/&gt;
     *         &lt;element name="request" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}requestType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reply",
        "request"
    })
    public static class TfmRequestReply {

        protected ReplyType reply;
        protected RequestType request;

        /**
         * Gets the value of the reply property.
         * 
         * @return
         *     possible object is
         *     {@link ReplyType }
         *     
         */
        public ReplyType getReply() {
            return reply;
        }

        /**
         * Sets the value of the reply property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReplyType }
         *     
         */
        public void setReply(ReplyType value) {
            this.reply = value;
        }

        /**
         * Gets the value of the request property.
         * 
         * @return
         *     possible object is
         *     {@link RequestType }
         *     
         */
        public RequestType getRequest() {
            return request;
        }

        /**
         * Sets the value of the request property.
         * 
         * @param value
         *     allowed object is
         *     {@link RequestType }
         *     
         */
        public void setRequest(RequestType value) {
            this.request = value;
        }

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
     *       &lt;choice&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="status" type="{urn:us:gov:dot:faa:atm:tfm:tfmdataservice}tfmdataStatusType" maxOccurs="unbounded"/&gt;
     *         &lt;/sequence&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "status"
    })
    public static class TfmsStatusOutput {

        protected List<TfmdataStatusType> status;

        /**
         * Gets the value of the status property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the status property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TfmdataStatusType }
         * 
         * 
         */
        public List<TfmdataStatusType> getStatus() {
            if (status == null) {
                status = new ArrayList<TfmdataStatusType>();
            }
            return this.status;
        }

    }

}
