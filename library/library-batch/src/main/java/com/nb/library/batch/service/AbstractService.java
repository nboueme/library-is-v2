package com.nb.library.batch.service;

import com.nb.library.business.ManagerFactory;

public class AbstractService {

    private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactory managerFactory) {
        AbstractService.managerFactory = managerFactory;
    }
}
