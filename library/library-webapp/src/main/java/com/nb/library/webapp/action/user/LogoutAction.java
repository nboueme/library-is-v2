package com.nb.library.webapp.action.user;

import com.nb.library.webapp.AbstractService;
import com.nb.library.webapp.utility.Constant;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class LogoutAction extends AbstractService implements SessionAware {

    private Map<String, Object> session;

    public String execute() {
        session.remove(Constant.USER_SESSION);
        return SUCCESS;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
