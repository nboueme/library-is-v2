package com.nb.library.webapp.action.user;

import com.nb.library.business.contract.UserManager;
import com.nb.library.client.user.UserAccount;
import com.nb.library.webapp.AbstractService;

public class LoginAction extends AbstractService {

    private UserManager userManager = getManagerFactory().getUserManager();
    private UserAccount user;
    private UserAccount existingUser;

    public String execute() {
        //existingUser = userManager.getUser(user);

        return SUCCESS;
    }

    /*public void validate(){
        if (user.getEmail().length() == 0) {
            addFieldError("user.email", "Email is required.");
        }
        if (user.getPassword().length() == 0) {
            addFieldError("user.password", "Password is required.");
        }
    }*/


    public UserAccount getUser() {
        return user;
    }

    public UserAccount getExistingUser() {
        return existingUser;
    }
}
