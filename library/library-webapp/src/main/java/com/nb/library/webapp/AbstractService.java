package com.nb.library.webapp;

import com.nb.library.business.ManagerFactory;
import com.opensymphony.xwork2.ActionSupport;

public class AbstractService extends ActionSupport {

    private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactory managerFactory) {
        AbstractService.managerFactory = managerFactory;
    }
}
