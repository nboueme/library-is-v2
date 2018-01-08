package com.nb.library.webapp;

import com.nb.library.business.impl.ManagerFactoryImpl;
import com.opensymphony.xwork2.ActionSupport;

public class AbstractService extends ActionSupport {

    private static ManagerFactoryImpl managerFactory;

    protected static ManagerFactoryImpl getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactoryImpl managerFactory) {
        AbstractService.managerFactory = managerFactory;
    }
}
