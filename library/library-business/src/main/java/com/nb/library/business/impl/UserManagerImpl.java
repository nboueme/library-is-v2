package com.nb.library.business.impl;

import com.nb.library.business.contract.UserManager;
import com.nb.library.business.AbstractManager;
import com.nb.library.client.user.UserAccount;

public class UserManagerImpl extends AbstractManager implements UserManager {

    public UserAccount getUser(UserAccount user) {
        return getDaoFactory().getUserDao().getUser(user);
    }

    public void updateReminder(UserAccount user) {
        getDaoFactory().getUserDao().updateReminder(user);
    }
}
