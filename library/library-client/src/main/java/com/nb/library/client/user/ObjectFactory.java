
package com.nb.library.client.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nb.library.client.user package. 
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

    private final static QName _UpdateReminderResponse_QNAME = new QName("user.client.library.nb.com", "updateReminderResponse");
    private final static QName _UpdateReminder_QNAME = new QName("user.client.library.nb.com", "updateReminder");
    private final static QName _GetUserResponse_QNAME = new QName("user.client.library.nb.com", "getUserResponse");
    private final static QName _GetUser_QNAME = new QName("user.client.library.nb.com", "getUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nb.library.client.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link UpdateReminderResponse }
     * 
     */
    public UpdateReminderResponse createUpdateReminderResponse() {
        return new UpdateReminderResponse();
    }

    /**
     * Create an instance of {@link UpdateReminder }
     * 
     */
    public UpdateReminder createUpdateReminder() {
        return new UpdateReminder();
    }

    /**
     * Create an instance of {@link UserAccount }
     * 
     */
    public UserAccount createUserAccount() {
        return new UserAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReminderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "user.client.library.nb.com", name = "updateReminderResponse")
    public JAXBElement<UpdateReminderResponse> createUpdateReminderResponse(UpdateReminderResponse value) {
        return new JAXBElement<UpdateReminderResponse>(_UpdateReminderResponse_QNAME, UpdateReminderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateReminder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "user.client.library.nb.com", name = "updateReminder")
    public JAXBElement<UpdateReminder> createUpdateReminder(UpdateReminder value) {
        return new JAXBElement<UpdateReminder>(_UpdateReminder_QNAME, UpdateReminder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "user.client.library.nb.com", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "user.client.library.nb.com", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

}
