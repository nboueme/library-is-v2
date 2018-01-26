package com.nb.library.webapp.action.user;

import com.nb.library.client.user.UserAccount;
import com.nb.library.webapp.AbstractService;
import com.nb.library.webapp.utility.Constant;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class AuthAction extends AbstractService implements SessionAware {

    private UserAccount user;
    private Map<String, Object> session;

    public String execute() {
        if (user == null)
            return ERROR;

        UserAccount existingUser = getManagerFactory().getUserManager().getUser(user);

        if (existingUser != null) {
            session.put(Constant.USER_SESSION, existingUser);
            return SUCCESS;
        } else {
            addActionError("Wrong credentials!");
            return INPUT;
        }
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public void validate() {
        if (user != null) {
            if (user.getEmail().length() == 0) {
                addFieldError("user.email", "Email is required.");
            }
            if (user.getPassword().length() == 0) {
                addFieldError("user.password", "Password is required.");
            }
        }
    }

    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }
}
