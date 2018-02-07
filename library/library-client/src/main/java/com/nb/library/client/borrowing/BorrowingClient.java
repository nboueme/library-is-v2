
package com.nb.library.client.borrowing;

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
@WebService(name = "BorrowingClient", targetNamespace = "borrowing.client.library.nb.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BorrowingClient {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addBorrowing", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.AddBorrowing")
    @ResponseWrapper(localName = "addBorrowingResponse", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.AddBorrowingResponse")
    @Action(input = "borrowing.client.library.nb.com/BorrowingClient/addBorrowingRequest", output = "borrowing.client.library.nb.com/BorrowingClient/addBorrowingResponse")
    public void addBorrowing(
        @WebParam(name = "arg0", targetNamespace = "")
        Borrowing arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.nb.library.client.borrowing.Borrowing
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBorrowing", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.GetBorrowing")
    @ResponseWrapper(localName = "getBorrowingResponse", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.GetBorrowingResponse")
    @Action(input = "borrowing.client.library.nb.com/BorrowingClient/getBorrowingRequest", output = "borrowing.client.library.nb.com/BorrowingClient/getBorrowingResponse")
    public Borrowing getBorrowing(
        @WebParam(name = "arg0", targetNamespace = "")
        Borrowing arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.nb.library.client.borrowing.Borrowing>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listBorrowing", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.ListBorrowing")
    @ResponseWrapper(localName = "listBorrowingResponse", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.ListBorrowingResponse")
    @Action(input = "borrowing.client.library.nb.com/BorrowingClient/listBorrowingRequest", output = "borrowing.client.library.nb.com/BorrowingClient/listBorrowingResponse")
    public List<Borrowing> listBorrowing(
        @WebParam(name = "arg0", targetNamespace = "")
        Borrowing arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.nb.library.client.borrowing.BorrowingArchive>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listArchive", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.ListArchive")
    @ResponseWrapper(localName = "listArchiveResponse", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.ListArchiveResponse")
    @Action(input = "borrowing.client.library.nb.com/BorrowingClient/listArchiveRequest", output = "borrowing.client.library.nb.com/BorrowingClient/listArchiveResponse")
    public List<BorrowingArchive> listArchive(
        @WebParam(name = "arg0", targetNamespace = "")
        BorrowingArchive arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.nb.library.client.borrowing.Borrowing>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listBorrowingByReturnDateBeforeCurrent", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.ListBorrowingByReturnDateBeforeCurrent")
    @ResponseWrapper(localName = "listBorrowingByReturnDateBeforeCurrentResponse", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.ListBorrowingByReturnDateBeforeCurrentResponse")
    @Action(input = "borrowing.client.library.nb.com/BorrowingClient/listBorrowingByReturnDateBeforeCurrentRequest", output = "borrowing.client.library.nb.com/BorrowingClient/listBorrowingByReturnDateBeforeCurrentResponse")
    public List<Borrowing> listBorrowingByReturnDateBeforeCurrent();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.nb.library.client.borrowing.Borrowing
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByBookId", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.FindByBookId")
    @ResponseWrapper(localName = "findByBookIdResponse", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.FindByBookIdResponse")
    @Action(input = "borrowing.client.library.nb.com/BorrowingClient/findByBookIdRequest", output = "borrowing.client.library.nb.com/BorrowingClient/findByBookIdResponse")
    public Borrowing findByBookId(
        @WebParam(name = "arg0", targetNamespace = "")
        Borrowing arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateBorrowing", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.UpdateBorrowing")
    @ResponseWrapper(localName = "updateBorrowingResponse", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.UpdateBorrowingResponse")
    @Action(input = "borrowing.client.library.nb.com/BorrowingClient/updateBorrowingRequest", output = "borrowing.client.library.nb.com/BorrowingClient/updateBorrowingResponse")
    public void updateBorrowing(
        @WebParam(name = "arg0", targetNamespace = "")
        Borrowing arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteBorrowing", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.DeleteBorrowing")
    @ResponseWrapper(localName = "deleteBorrowingResponse", targetNamespace = "borrowing.client.library.nb.com", className = "com.nb.library.client.borrowing.DeleteBorrowingResponse")
    @Action(input = "borrowing.client.library.nb.com/BorrowingClient/deleteBorrowingRequest", output = "borrowing.client.library.nb.com/BorrowingClient/deleteBorrowingResponse")
    public void deleteBorrowing(
        @WebParam(name = "arg0", targetNamespace = "")
        Borrowing arg0);

}
