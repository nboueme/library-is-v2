package com.nb.library.consumer.impl.dao;

import com.nb.library.consumer.contract.dao.UserDao;
import com.nb.library.model.entity.user.UserAccount;
import com.nb.library.model.entity.user.UserClient;
import com.nb.library.model.entity.user.UserService;

public class UserDaoImpl implements UserDao {

    public UserAccount getUser(UserAccount user) {
        UserService service = new UserService();
        UserClient client = service.getUserPort();
        return client.getUser(user);
    }
}
