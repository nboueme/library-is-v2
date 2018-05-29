package com.nb.library.repository.impl.soap;

import com.nb.library.repository.contract.UserDaoContract;
import com.nb.library.client.user.UserAccount;
import com.nb.library.client.user.UserClient;
import com.nb.library.client.user.UserService;

public class SoapUserDao implements UserDaoContract {

    private UserService service = new UserService();
    private UserClient client = service.getUserPort();

    public UserAccount getUser(UserAccount user) {
        return client.getUser(user);
    }

    public void updateUser(UserAccount user) {
        client.updateUser(user);
    }
}
