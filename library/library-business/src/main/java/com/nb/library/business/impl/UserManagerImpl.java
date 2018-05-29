package com.nb.library.business.impl;

import com.nb.library.business.contract.UserManager;
import com.nb.library.business.AbstractManager;
import com.nb.library.client.user.UserAccount;

public class UserManagerImpl extends AbstractManager implements UserManager {

    public UserAccount getUser(UserAccount user) {
        return getDaoFactory().getUserDao().getUser(user);
    }

    public void updateUser(UserAccount user) {
        getDaoFactory().getUserDao().updateUser(user);
    }
}
