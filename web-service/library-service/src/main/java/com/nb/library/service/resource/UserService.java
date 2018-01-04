package com.nb.library.service.resource;

import com.nb.library.model.entity.UserAccount;
import com.nb.library.service.AbstractService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "UserClient", serviceName = "UserService", portName = "UserPort", targetNamespace = "user.service.library.nb.com")
public class UserService extends AbstractService {

    @WebMethod
    public UserAccount getUser(UserAccount user) {
        return getManagerFactory().getUserManager().getUser(user);
    }
}
