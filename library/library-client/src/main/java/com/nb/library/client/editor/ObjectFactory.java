
package com.nb.library.client.editor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nb.library.client.editor package. 
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

    private final static QName _ListEditors_QNAME = new QName("editor.client.library.nb.com", "listEditors");
    private final static QName _GetEditorResponse_QNAME = new QName("editor.client.library.nb.com", "getEditorResponse");
    private final static QName _GetEditor_QNAME = new QName("editor.client.library.nb.com", "getEditor");
    private final static QName _ListEditorsResponse_QNAME = new QName("editor.client.library.nb.com", "listEditorsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nb.library.client.editor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEditor }
     * 
     */
    public GetEditor createGetEditor() {
        return new GetEditor();
    }

    /**
     * Create an instance of {@link GetEditorResponse }
     * 
     */
    public GetEditorResponse createGetEditorResponse() {
        return new GetEditorResponse();
    }

    /**
     * Create an instance of {@link ListEditorsResponse }
     * 
     */
    public ListEditorsResponse createListEditorsResponse() {
        return new ListEditorsResponse();
    }

    /**
     * Create an instance of {@link ListEditors }
     * 
     */
    public ListEditors createListEditors() {
        return new ListEditors();
    }

    /**
     * Create an instance of {@link LocalDateTime }
     * 
     */
    public LocalDateTime createLocalDateTime() {
        return new LocalDateTime();
    }

    /**
     * Create an instance of {@link Editor }
     * 
     */
    public Editor createEditor() {
        return new Editor();
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
     * Create an instance of {@link TypeWork }
     * 
     */
    public TypeWork createTypeWork() {
        return new TypeWork();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEditors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "editor.client.library.nb.com", name = "listEditors")
    public JAXBElement<ListEditors> createListEditors(ListEditors value) {
        return new JAXBElement<ListEditors>(_ListEditors_QNAME, ListEditors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEditorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "editor.client.library.nb.com", name = "getEditorResponse")
    public JAXBElement<GetEditorResponse> createGetEditorResponse(GetEditorResponse value) {
        return new JAXBElement<GetEditorResponse>(_GetEditorResponse_QNAME, GetEditorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEditor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "editor.client.library.nb.com", name = "getEditor")
    public JAXBElement<GetEditor> createGetEditor(GetEditor value) {
        return new JAXBElement<GetEditor>(_GetEditor_QNAME, GetEditor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEditorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "editor.client.library.nb.com", name = "listEditorsResponse")
    public JAXBElement<ListEditorsResponse> createListEditorsResponse(ListEditorsResponse value) {
        return new JAXBElement<ListEditorsResponse>(_ListEditorsResponse_QNAME, ListEditorsResponse.class, null, value);
    }

}
