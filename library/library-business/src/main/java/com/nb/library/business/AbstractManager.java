package com.nb.library.business;

import com.nb.library.repository.DaoFactory;

public abstract class AbstractManager {

    private static DaoFactory daoFactory;

    protected static DaoFactory getDaoFactory() {
        return daoFactory;
    }

    public static void setDaoFactory(DaoFactory daoFactory) {
        AbstractManager.daoFactory = daoFactory;
    }
}
