package com.nb.library.business.contract.manager;

import com.nb.library.model.entity.user.UserAccount;

public interface UserManager {
    UserAccount getUser(UserAccount user);
}
