package com.nb.library.webapp.interceptor;

import com.nb.library.client.user.UserAccount;
import com.nb.library.webapp.utility.Constant;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;

import java.util.Map;

public class AuthInterceptor implements Interceptor {

    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        Map<String, Object> session = invocation.getInvocationContext().getSession();
        UserAccount userSession = (UserAccount) session.get(Constant.USER_SESSION);
        if (userSession == null) {
            return ActionSupport.LOGIN;
        }
        return invocation.invoke();
    }
}
