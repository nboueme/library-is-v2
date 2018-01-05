
package com.nb.library.model.entity.author;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nb.library.model.entity.author package. 
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

    private final static QName _GetAuthor_QNAME = new QName("author.entity.model.library.nb.com", "getAuthor");
    private final static QName _ListAuthorsResponse_QNAME = new QName("author.entity.model.library.nb.com", "listAuthorsResponse");
    private final static QName _GetAuthorResponse_QNAME = new QName("author.entity.model.library.nb.com", "getAuthorResponse");
    private final static QName _ListAuthors_QNAME = new QName("author.entity.model.library.nb.com", "listAuthors");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nb.library.model.entity.author
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListAuthorsResponse }
     * 
     */
    public ListAuthorsResponse createListAuthorsResponse() {
        return new ListAuthorsResponse();
    }

    /**
     * Create an instance of {@link GetAuthor }
     * 
     */
    public GetAuthor createGetAuthor() {
        return new GetAuthor();
    }

    /**
     * Create an instance of {@link ListAuthors }
     * 
     */
    public ListAuthors createListAuthors() {
        return new ListAuthors();
    }

    /**
     * Create an instance of {@link GetAuthorResponse }
     * 
     */
    public GetAuthorResponse createGetAuthorResponse() {
        return new GetAuthorResponse();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link Work }
     * 
     */
    public Work createWork() {
        return new Work();
    }

    /**
     * Create an instance of {@link TypeWork }
     * 
     */
    public TypeWork createTypeWork() {
        return new TypeWork();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "author.entity.model.library.nb.com", name = "getAuthor")
    public JAXBElement<GetAuthor> createGetAuthor(GetAuthor value) {
        return new JAXBElement<GetAuthor>(_GetAuthor_QNAME, GetAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAuthorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "author.entity.model.library.nb.com", name = "listAuthorsResponse")
    public JAXBElement<ListAuthorsResponse> createListAuthorsResponse(ListAuthorsResponse value) {
        return new JAXBElement<ListAuthorsResponse>(_ListAuthorsResponse_QNAME, ListAuthorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "author.entity.model.library.nb.com", name = "getAuthorResponse")
    public JAXBElement<GetAuthorResponse> createGetAuthorResponse(GetAuthorResponse value) {
        return new JAXBElement<GetAuthorResponse>(_GetAuthorResponse_QNAME, GetAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAuthors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "author.entity.model.library.nb.com", name = "listAuthors")
    public JAXBElement<ListAuthors> createListAuthors(ListAuthors value) {
        return new JAXBElement<ListAuthors>(_ListAuthors_QNAME, ListAuthors.class, null, value);
    }

}
