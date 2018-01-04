package com.nb.library.business.impl.manager;

import com.nb.library.business.contract.manager.UserManager;
import com.nb.library.business.impl.AbstractManager;
import com.nb.library.service.user.UserAccount;

public class UserManagerImpl extends AbstractManager implements UserManager {

    public UserAccount getUser(UserAccount user) {
        return getDaoFactory().getUserDao().getUser(user);
    }
}
