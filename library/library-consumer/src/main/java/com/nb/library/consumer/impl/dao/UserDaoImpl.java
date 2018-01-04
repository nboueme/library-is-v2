package com.nb.library.consumer.impl.dao;

import com.nb.library.consumer.contract.dao.UserDao;
import com.nb.library.service.user.UserAccount;
import com.nb.library.service.user.UserClient;
import com.nb.library.service.user.UserService;

public class UserDaoImpl implements UserDao {

    public UserAccount getUser(UserAccount user) {
        UserService service = new UserService();
        UserClient client = service.getUserPort();
        return client.getUser(user);
    }
}
