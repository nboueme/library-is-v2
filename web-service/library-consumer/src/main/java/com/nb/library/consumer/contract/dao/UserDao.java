package com.nb.library.consumer.contract.dao;

import com.nb.library.model.entity.UserAccount;

public interface UserDao {
    UserAccount getUser(UserAccount user);
}
