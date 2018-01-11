package com.nb.library.repository.contract;

import com.nb.library.client.user.UserAccount;

public interface UserDaoContract {
    UserAccount getUser(UserAccount user);
}
