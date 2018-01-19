
package com.nb.library.client.borrowing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nb.library.client.borrowing package. 
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

    private final static QName _UpdateBorrowing_QNAME = new QName("borrowing.client.library.nb.com", "updateBorrowing");
    private final static QName _AddBorrowingResponse_QNAME = new QName("borrowing.client.library.nb.com", "addBorrowingResponse");
    private final static QName _DeleteBorrowing_QNAME = new QName("borrowing.client.library.nb.com", "deleteBorrowing");
    private final static QName _GetBorrowingResponse_QNAME = new QName("borrowing.client.library.nb.com", "getBorrowingResponse");
    private final static QName _GetBorrowing_QNAME = new QName("borrowing.client.library.nb.com", "getBorrowing");
    private final static QName _AddBorrowing_QNAME = new QName("borrowing.client.library.nb.com", "addBorrowing");
    private final static QName _DeleteBorrowingResponse_QNAME = new QName("borrowing.client.library.nb.com", "deleteBorrowingResponse");
    private final static QName _ListBorrowing_QNAME = new QName("borrowing.client.library.nb.com", "listBorrowing");
    private final static QName _GetLoanPeriodsExceededResponse_QNAME = new QName("borrowing.client.library.nb.com", "getLoanPeriodsExceededResponse");
    private final static QName _ListBorrowingResponse_QNAME = new QName("borrowing.client.library.nb.com", "listBorrowingResponse");
    private final static QName _UpdateBorrowingResponse_QNAME = new QName("borrowing.client.library.nb.com", "updateBorrowingResponse");
    private final static QName _GetLoanPeriodsExceeded_QNAME = new QName("borrowing.client.library.nb.com", "getLoanPeriodsExceeded");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nb.library.client.borrowing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteBorrowingResponse }
     * 
     */
    public DeleteBorrowingResponse createDeleteBorrowingResponse() {
        return new DeleteBorrowingResponse();
    }

    /**
     * Create an instance of {@link GetBorrowing }
     * 
     */
    public GetBorrowing createGetBorrowing() {
        return new GetBorrowing();
    }

    /**
     * Create an instance of {@link AddBorrowing }
     * 
     */
    public AddBorrowing createAddBorrowing() {
        return new AddBorrowing();
    }

    /**
     * Create an instance of {@link DeleteBorrowing }
     * 
     */
    public DeleteBorrowing createDeleteBorrowing() {
        return new DeleteBorrowing();
    }

    /**
     * Create an instance of {@link GetBorrowingResponse }
     * 
     */
    public GetBorrowingResponse createGetBorrowingResponse() {
        return new GetBorrowingResponse();
    }

    /**
     * Create an instance of {@link UpdateBorrowing }
     * 
     */
    public UpdateBorrowing createUpdateBorrowing() {
        return new UpdateBorrowing();
    }

    /**
     * Create an instance of {@link AddBorrowingResponse }
     * 
     */
    public AddBorrowingResponse createAddBorrowingResponse() {
        return new AddBorrowingResponse();
    }

    /**
     * Create an instance of {@link GetLoanPeriodsExceeded }
     * 
     */
    public GetLoanPeriodsExceeded createGetLoanPeriodsExceeded() {
        return new GetLoanPeriodsExceeded();
    }

    /**
     * Create an instance of {@link GetLoanPeriodsExceededResponse }
     * 
     */
    public GetLoanPeriodsExceededResponse createGetLoanPeriodsExceededResponse() {
        return new GetLoanPeriodsExceededResponse();
    }

    /**
     * Create an instance of {@link ListBorrowingResponse }
     * 
     */
    public ListBorrowingResponse createListBorrowingResponse() {
        return new ListBorrowingResponse();
    }

    /**
     * Create an instance of {@link UpdateBorrowingResponse }
     * 
     */
    public UpdateBorrowingResponse createUpdateBorrowingResponse() {
        return new UpdateBorrowingResponse();
    }

    /**
     * Create an instance of {@link ListBorrowing }
     * 
     */
    public ListBorrowing createListBorrowing() {
        return new ListBorrowing();
    }

    /**
     * Create an instance of {@link Work }
     * 
     */
    public Work createWork() {
        return new Work();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link UserAccount }
     * 
     */
    public UserAccount createUserAccount() {
        return new UserAccount();
    }

    /**
     * Create an instance of {@link Borrowing }
     * 
     */
    public Borrowing createBorrowing() {
        return new Borrowing();
    }

    /**
     * Create an instance of {@link TypeWork }
     * 
     */
    public TypeWork createTypeWork() {
        return new TypeWork();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBorrowing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "updateBorrowing")
    public JAXBElement<UpdateBorrowing> createUpdateBorrowing(UpdateBorrowing value) {
        return new JAXBElement<UpdateBorrowing>(_UpdateBorrowing_QNAME, UpdateBorrowing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBorrowingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "addBorrowingResponse")
    public JAXBElement<AddBorrowingResponse> createAddBorrowingResponse(AddBorrowingResponse value) {
        return new JAXBElement<AddBorrowingResponse>(_AddBorrowingResponse_QNAME, AddBorrowingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBorrowing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "deleteBorrowing")
    public JAXBElement<DeleteBorrowing> createDeleteBorrowing(DeleteBorrowing value) {
        return new JAXBElement<DeleteBorrowing>(_DeleteBorrowing_QNAME, DeleteBorrowing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBorrowingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "getBorrowingResponse")
    public JAXBElement<GetBorrowingResponse> createGetBorrowingResponse(GetBorrowingResponse value) {
        return new JAXBElement<GetBorrowingResponse>(_GetBorrowingResponse_QNAME, GetBorrowingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBorrowing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "getBorrowing")
    public JAXBElement<GetBorrowing> createGetBorrowing(GetBorrowing value) {
        return new JAXBElement<GetBorrowing>(_GetBorrowing_QNAME, GetBorrowing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBorrowing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "addBorrowing")
    public JAXBElement<AddBorrowing> createAddBorrowing(AddBorrowing value) {
        return new JAXBElement<AddBorrowing>(_AddBorrowing_QNAME, AddBorrowing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteBorrowingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "deleteBorrowingResponse")
    public JAXBElement<DeleteBorrowingResponse> createDeleteBorrowingResponse(DeleteBorrowingResponse value) {
        return new JAXBElement<DeleteBorrowingResponse>(_DeleteBorrowingResponse_QNAME, DeleteBorrowingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListBorrowing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "listBorrowing")
    public JAXBElement<ListBorrowing> createListBorrowing(ListBorrowing value) {
        return new JAXBElement<ListBorrowing>(_ListBorrowing_QNAME, ListBorrowing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoanPeriodsExceededResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "getLoanPeriodsExceededResponse")
    public JAXBElement<GetLoanPeriodsExceededResponse> createGetLoanPeriodsExceededResponse(GetLoanPeriodsExceededResponse value) {
        return new JAXBElement<GetLoanPeriodsExceededResponse>(_GetLoanPeriodsExceededResponse_QNAME, GetLoanPeriodsExceededResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListBorrowingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "listBorrowingResponse")
    public JAXBElement<ListBorrowingResponse> createListBorrowingResponse(ListBorrowingResponse value) {
        return new JAXBElement<ListBorrowingResponse>(_ListBorrowingResponse_QNAME, ListBorrowingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBorrowingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "updateBorrowingResponse")
    public JAXBElement<UpdateBorrowingResponse> createUpdateBorrowingResponse(UpdateBorrowingResponse value) {
        return new JAXBElement<UpdateBorrowingResponse>(_UpdateBorrowingResponse_QNAME, UpdateBorrowingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoanPeriodsExceeded }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "getLoanPeriodsExceeded")
    public JAXBElement<GetLoanPeriodsExceeded> createGetLoanPeriodsExceeded(GetLoanPeriodsExceeded value) {
        return new JAXBElement<GetLoanPeriodsExceeded>(_GetLoanPeriodsExceeded_QNAME, GetLoanPeriodsExceeded.class, null, value);
    }

}
