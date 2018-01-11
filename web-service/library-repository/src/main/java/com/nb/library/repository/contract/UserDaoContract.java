package com.nb.library.repository.contract;

import com.nb.library.entity.UserAccount;

public interface UserDaoContract {
    UserAccount getUser(UserAccount user);
}
