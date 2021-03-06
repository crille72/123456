
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FastighetPortType", targetNamespace = "http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    net.opengis.gml._3.ObjectFactory.class,
    se.lantmateriet.namespace.distribution.produkter.fastighet.v1.ObjectFactory.class
})
public interface FastighetPortType {


    /**
     * 
     * @param getRegisterenhetRequest
     * @return
     *     returns se.lantmateriet.namespace.distribution.produkter.fastighet.v1.RegisterenhetResponseType
     */
    @WebMethod(operationName = "GetRegisterenhet")
    @WebResult(name = "RegisterenhetResponse", targetNamespace = "http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6", partName = "RegisterenhetResponse")
    public RegisterenhetResponseType getRegisterenhet(
        @WebParam(name = "GetRegisterenhetRequest", targetNamespace = "http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6", partName = "GetRegisterenhetRequest")
        GetRegisterenhetRequestType getRegisterenhetRequest);

    /**
     * 
     * @param findRegisterenhetRequest
     * @return
     *     returns se.lantmateriet.namespace.distribution.produkter.fastighet.v1.RegisterenhetsreferensResponseType
     */
    @WebMethod(operationName = "FindRegisterenhet")
    @WebResult(name = "RegisterenhetsreferensResponse", targetNamespace = "http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6", partName = "RegisterenhetsreferensResponse")
    public RegisterenhetsreferensResponseType findRegisterenhet(
        @WebParam(name = "FindRegisterenhetRequest", targetNamespace = "http://namespace.lantmateriet.se/distribution/produkter/fastighet/v1.6", partName = "FindRegisterenhetRequest")
        FindRegisterenhetRequestType findRegisterenhetRequest);

}
