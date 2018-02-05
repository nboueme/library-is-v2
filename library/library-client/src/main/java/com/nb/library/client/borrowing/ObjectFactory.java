
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

    private final static QName _ListArchive_QNAME = new QName("borrowing.client.library.nb.com", "listArchive");
    private final static QName _FindByBookIdResponse_QNAME = new QName("borrowing.client.library.nb.com", "findByBookIdResponse");
    private final static QName _ListArchiveResponse_QNAME = new QName("borrowing.client.library.nb.com", "listArchiveResponse");
    private final static QName _DeleteBorrowingResponse_QNAME = new QName("borrowing.client.library.nb.com", "deleteBorrowingResponse");
    private final static QName _ListBorrowingByReturnDateBeforeCurrent_QNAME = new QName("borrowing.client.library.nb.com", "listBorrowingByReturnDateBeforeCurrent");
    private final static QName _UpdateBorrowing_QNAME = new QName("borrowing.client.library.nb.com", "updateBorrowing");
    private final static QName _AddBorrowingResponse_QNAME = new QName("borrowing.client.library.nb.com", "addBorrowingResponse");
    private final static QName _DeleteBorrowing_QNAME = new QName("borrowing.client.library.nb.com", "deleteBorrowing");
    private final static QName _GetBorrowingResponse_QNAME = new QName("borrowing.client.library.nb.com", "getBorrowingResponse");
    private final static QName _GetBorrowing_QNAME = new QName("borrowing.client.library.nb.com", "getBorrowing");
    private final static QName _AddBorrowing_QNAME = new QName("borrowing.client.library.nb.com", "addBorrowing");
    private final static QName _ListBorrowingByReturnDateBeforeCurrentResponse_QNAME = new QName("borrowing.client.library.nb.com", "listBorrowingByReturnDateBeforeCurrentResponse");
    private final static QName _ListBorrowing_QNAME = new QName("borrowing.client.library.nb.com", "listBorrowing");
    private final static QName _FindByBookId_QNAME = new QName("borrowing.client.library.nb.com", "findByBookId");
    private final static QName _ListBorrowingResponse_QNAME = new QName("borrowing.client.library.nb.com", "listBorrowingResponse");
    private final static QName _UpdateBorrowingResponse_QNAME = new QName("borrowing.client.library.nb.com", "updateBorrowingResponse");

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
     * Create an instance of {@link ListBorrowingByReturnDateBeforeCurrent }
     * 
     */
    public ListBorrowingByReturnDateBeforeCurrent createListBorrowingByReturnDateBeforeCurrent() {
        return new ListBorrowingByReturnDateBeforeCurrent();
    }

    /**
     * Create an instance of {@link ListArchiveResponse }
     * 
     */
    public ListArchiveResponse createListArchiveResponse() {
        return new ListArchiveResponse();
    }

    /**
     * Create an instance of {@link FindByBookIdResponse }
     * 
     */
    public FindByBookIdResponse createFindByBookIdResponse() {
        return new FindByBookIdResponse();
    }

    /**
     * Create an instance of {@link ListArchive }
     * 
     */
    public ListArchive createListArchive() {
        return new ListArchive();
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
     * Create an instance of {@link FindByBookId }
     * 
     */
    public FindByBookId createFindByBookId() {
        return new FindByBookId();
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
     * Create an instance of {@link ListBorrowingByReturnDateBeforeCurrentResponse }
     * 
     */
    public ListBorrowingByReturnDateBeforeCurrentResponse createListBorrowingByReturnDateBeforeCurrentResponse() {
        return new ListBorrowingByReturnDateBeforeCurrentResponse();
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
     * Create an instance of {@link BorrowingArchive }
     * 
     */
    public BorrowingArchive createBorrowingArchive() {
        return new BorrowingArchive();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListArchive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "listArchive")
    public JAXBElement<ListArchive> createListArchive(ListArchive value) {
        return new JAXBElement<ListArchive>(_ListArchive_QNAME, ListArchive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByBookIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "findByBookIdResponse")
    public JAXBElement<FindByBookIdResponse> createFindByBookIdResponse(FindByBookIdResponse value) {
        return new JAXBElement<FindByBookIdResponse>(_FindByBookIdResponse_QNAME, FindByBookIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListArchiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "listArchiveResponse")
    public JAXBElement<ListArchiveResponse> createListArchiveResponse(ListArchiveResponse value) {
        return new JAXBElement<ListArchiveResponse>(_ListArchiveResponse_QNAME, ListArchiveResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListBorrowingByReturnDateBeforeCurrent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "listBorrowingByReturnDateBeforeCurrent")
    public JAXBElement<ListBorrowingByReturnDateBeforeCurrent> createListBorrowingByReturnDateBeforeCurrent(ListBorrowingByReturnDateBeforeCurrent value) {
        return new JAXBElement<ListBorrowingByReturnDateBeforeCurrent>(_ListBorrowingByReturnDateBeforeCurrent_QNAME, ListBorrowingByReturnDateBeforeCurrent.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListBorrowingByReturnDateBeforeCurrentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "listBorrowingByReturnDateBeforeCurrentResponse")
    public JAXBElement<ListBorrowingByReturnDateBeforeCurrentResponse> createListBorrowingByReturnDateBeforeCurrentResponse(ListBorrowingByReturnDateBeforeCurrentResponse value) {
        return new JAXBElement<ListBorrowingByReturnDateBeforeCurrentResponse>(_ListBorrowingByReturnDateBeforeCurrentResponse_QNAME, ListBorrowingByReturnDateBeforeCurrentResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByBookId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "borrowing.client.library.nb.com", name = "findByBookId")
    public JAXBElement<FindByBookId> createFindByBookId(FindByBookId value) {
        return new JAXBElement<FindByBookId>(_FindByBookId_QNAME, FindByBookId.class, null, value);
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

}
