package com.nb.library.repository.contract;

import com.nb.library.entity.user.UserAccount;

public interface UserDaoContract {
    UserAccount login(UserAccount user);
    void updateReminder(UserAccount user);
}
