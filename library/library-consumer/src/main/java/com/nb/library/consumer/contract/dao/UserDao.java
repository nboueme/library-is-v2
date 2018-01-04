package com.nb.library.consumer.contract.dao;

import com.nb.library.service.user.UserAccount;

public interface UserDao {
    UserAccount getUser(UserAccount user);
}
