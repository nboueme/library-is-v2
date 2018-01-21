package com.nb.library.repository;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;

public abstract class AbstractDao {

    @Resource
    private EntityManagerFactory entityManagerFactory;
    protected EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
