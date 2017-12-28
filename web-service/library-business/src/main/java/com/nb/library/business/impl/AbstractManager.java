package com.nb.library.business.impl;

import com.nb.library.consumer.impl.DaoFactoryImpl;

public abstract class AbstractManager {

    private static DaoFactoryImpl daoFactory;

    protected static DaoFactoryImpl getDaoFactory() {
        return daoFactory;
    }

    public static void setDaoFactory(DaoFactoryImpl daoFactory) {
        AbstractManager.daoFactory = daoFactory;
    }
}
