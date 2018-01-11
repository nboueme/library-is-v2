package com.nb.library.service.user;

import com.nb.library.entity.UserAccount;
import com.nb.library.repository.contract.UserDaoContract;
import com.nb.library.service.AbstractService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "UserClient", serviceName = "UserService", portName = "UserPort", targetNamespace = "user.client.library.nb.com")
public class UserService extends AbstractService {

    private UserDaoContract contract = getDaoFactory().getUserDao();

    @WebMethod
    public UserAccount getUser(UserAccount user) {
        return contract.getUser(user);
    }
}
