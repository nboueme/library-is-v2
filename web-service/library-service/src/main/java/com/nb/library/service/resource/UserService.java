package com.nb.library.service.resource;

import com.nb.library.model.entity.UserAccount;
import com.nb.library.service.AbstractService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "User")
public class UserService extends AbstractService {

    @WebMethod
    public void getUser(UserAccount user) {
        getManagerFactory().getUserManager().getUser(user);
    }
}
