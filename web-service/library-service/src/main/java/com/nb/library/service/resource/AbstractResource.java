package com.nb.library.service.resource;

import com.nb.library.business.impl.ManagerFactoryImpl;

public abstract class AbstractResource {

    private static ManagerFactoryImpl managerFactory;

    protected static ManagerFactoryImpl getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactoryImpl managerFactory) {
        AbstractResource.managerFactory = managerFactory;
    }
}
