package com.nb.library.service;

import com.nb.library.repository.DaoFactory;

public abstract class AbstractService {

    private static DaoFactory daoFactory;

    protected static DaoFactory getDaoFactory() {
        return daoFactory;
    }

    public static void setDaoFactory(DaoFactory daoFactory) {
        AbstractService.daoFactory = daoFactory;
    }
}
