package com.nb.library.webapp;

import com.nb.library.business.impl.ManagerFactoryImpl;

public class AbstractService {

    private static ManagerFactoryImpl managerFactory;

    public static ManagerFactoryImpl getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactoryImpl managerFactory) {
        AbstractService.managerFactory = managerFactory;
    }
}
