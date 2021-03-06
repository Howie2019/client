
package com.cd.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MerchantImpl", targetNamespace = "http://service.cd.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MerchantImpl {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "update", targetNamespace = "http://service.cd.com/", className = "com.cd.service.Update")
    @ResponseWrapper(localName = "updateResponse", targetNamespace = "http://service.cd.com/", className = "com.cd.service.UpdateResponse")
    @Action(input = "http://service.cd.com/MerchantImpl/updateRequest", output = "http://service.cd.com/MerchantImpl/updateResponse")
    public int update(
        @WebParam(name = "arg0", targetNamespace = "")
        MerchantInfo arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        MerchantInfo arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "delete", targetNamespace = "http://service.cd.com/", className = "com.cd.service.Delete")
    @ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://service.cd.com/", className = "com.cd.service.DeleteResponse")
    @Action(input = "http://service.cd.com/MerchantImpl/deleteRequest", output = "http://service.cd.com/MerchantImpl/deleteResponse")
    public int delete(
        @WebParam(name = "arg0", targetNamespace = "")
        MerchantInfo arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "create", targetNamespace = "http://service.cd.com/", className = "com.cd.service.Create")
    @ResponseWrapper(localName = "createResponse", targetNamespace = "http://service.cd.com/", className = "com.cd.service.CreateResponse")
    @Action(input = "http://service.cd.com/MerchantImpl/createRequest", output = "http://service.cd.com/MerchantImpl/createResponse")
    public int create(
        @WebParam(name = "arg0", targetNamespace = "")
        List<MerchantInfo> arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://service.cd.com/", className = "com.cd.service.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://service.cd.com/", className = "com.cd.service.SayHelloResponse")
    @Action(input = "http://service.cd.com/MerchantImpl/sayHelloRequest", output = "http://service.cd.com/MerchantImpl/sayHelloResponse")
    public String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createOne", targetNamespace = "http://service.cd.com/", className = "com.cd.service.CreateOne")
    @ResponseWrapper(localName = "createOneResponse", targetNamespace = "http://service.cd.com/", className = "com.cd.service.CreateOneResponse")
    @Action(input = "http://service.cd.com/MerchantImpl/createOneRequest", output = "http://service.cd.com/MerchantImpl/createOneResponse")
    public int createOne(
        @WebParam(name = "arg0", targetNamespace = "")
        MerchantInfo arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.cd.service.MerchantInfo>
     */
    @WebMethod(operationName = "Retrieve")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Retrieve", targetNamespace = "http://service.cd.com/", className = "com.cd.service.Retrieve")
    @ResponseWrapper(localName = "RetrieveResponse", targetNamespace = "http://service.cd.com/", className = "com.cd.service.RetrieveResponse")
    @Action(input = "http://service.cd.com/MerchantImpl/RetrieveRequest", output = "http://service.cd.com/MerchantImpl/RetrieveResponse")
    public List<MerchantInfo> retrieve(
        @WebParam(name = "arg0", targetNamespace = "")
        MerchantInfo arg0);

}
