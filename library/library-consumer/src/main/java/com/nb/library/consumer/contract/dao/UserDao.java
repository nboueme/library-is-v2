package com.nb.library.consumer.contract.dao;

import com.nb.library.model.entity.user.UserAccount;

public interface UserDao {
    UserAccount getUser(UserAccount user);
}
