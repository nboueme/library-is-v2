
package com.nb.library.client.type;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nb.library.client.type package. 
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

    private final static QName _ListTypesWorks_QNAME = new QName("type.client.library.nb.com", "listTypesWorks");
    private final static QName _ListTypesWorksResponse_QNAME = new QName("type.client.library.nb.com", "listTypesWorksResponse");
    private final static QName _GetTypeWork_QNAME = new QName("type.client.library.nb.com", "getTypeWork");
    private final static QName _GetTypeWorkResponse_QNAME = new QName("type.client.library.nb.com", "getTypeWorkResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nb.library.client.type
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListTypesWorks }
     * 
     */
    public ListTypesWorks createListTypesWorks() {
        return new ListTypesWorks();
    }

    /**
     * Create an instance of {@link ListTypesWorksResponse }
     * 
     */
    public ListTypesWorksResponse createListTypesWorksResponse() {
        return new ListTypesWorksResponse();
    }

    /**
     * Create an instance of {@link GetTypeWork }
     * 
     */
    public GetTypeWork createGetTypeWork() {
        return new GetTypeWork();
    }

    /**
     * Create an instance of {@link GetTypeWorkResponse }
     * 
     */
    public GetTypeWorkResponse createGetTypeWorkResponse() {
        return new GetTypeWorkResponse();
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
     * Create an instance of {@link TypeWork }
     * 
     */
    public TypeWork createTypeWork() {
        return new TypeWork();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTypesWorks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "type.client.library.nb.com", name = "listTypesWorks")
    public JAXBElement<ListTypesWorks> createListTypesWorks(ListTypesWorks value) {
        return new JAXBElement<ListTypesWorks>(_ListTypesWorks_QNAME, ListTypesWorks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTypesWorksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "type.client.library.nb.com", name = "listTypesWorksResponse")
    public JAXBElement<ListTypesWorksResponse> createListTypesWorksResponse(ListTypesWorksResponse value) {
        return new JAXBElement<ListTypesWorksResponse>(_ListTypesWorksResponse_QNAME, ListTypesWorksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTypeWork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "type.client.library.nb.com", name = "getTypeWork")
    public JAXBElement<GetTypeWork> createGetTypeWork(GetTypeWork value) {
        return new JAXBElement<GetTypeWork>(_GetTypeWork_QNAME, GetTypeWork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTypeWorkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "type.client.library.nb.com", name = "getTypeWorkResponse")
    public JAXBElement<GetTypeWorkResponse> createGetTypeWorkResponse(GetTypeWorkResponse value) {
        return new JAXBElement<GetTypeWorkResponse>(_GetTypeWorkResponse_QNAME, GetTypeWorkResponse.class, null, value);
    }

}
