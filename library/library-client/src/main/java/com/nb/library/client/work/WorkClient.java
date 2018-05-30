
package com.nb.library.client.work;

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
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WorkClient", targetNamespace = "work.client.library.nb.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WorkClient {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.nb.library.client.work.Work
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWork", targetNamespace = "work.client.library.nb.com", className = "com.nb.library.client.work.GetWork")
    @ResponseWrapper(localName = "getWorkResponse", targetNamespace = "work.client.library.nb.com", className = "com.nb.library.client.work.GetWorkResponse")
    @Action(input = "work.client.library.nb.com/WorkClient/getWorkRequest", output = "work.client.library.nb.com/WorkClient/getWorkResponse")
    public Work getWork(
        @WebParam(name = "arg0", targetNamespace = "")
        Work arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.nb.library.client.work.Work>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listWorks", targetNamespace = "work.client.library.nb.com", className = "com.nb.library.client.work.ListWorks")
    @ResponseWrapper(localName = "listWorksResponse", targetNamespace = "work.client.library.nb.com", className = "com.nb.library.client.work.ListWorksResponse")
    @Action(input = "work.client.library.nb.com/WorkClient/listWorksRequest", output = "work.client.library.nb.com/WorkClient/listWorksResponse")
    public List<Work> listWorks();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.nb.library.client.work.Work>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listWorksByWord", targetNamespace = "work.client.library.nb.com", className = "com.nb.library.client.work.ListWorksByWord")
    @ResponseWrapper(localName = "listWorksByWordResponse", targetNamespace = "work.client.library.nb.com", className = "com.nb.library.client.work.ListWorksByWordResponse")
    @Action(input = "work.client.library.nb.com/WorkClient/listWorksByWordRequest", output = "work.client.library.nb.com/WorkClient/listWorksByWordResponse")
    public List<Work> listWorksByWord(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
