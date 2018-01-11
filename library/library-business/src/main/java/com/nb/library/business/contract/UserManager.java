package com.nb.library.business.contract;

import com.nb.library.client.user.UserAccount;

public interface UserManager {
    UserAccount getUser(UserAccount user);
}
