package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.type.TypeWork;
import com.nb.library.repository.AbstractDao;
import com.nb.library.repository.contract.TypeWorkDaoContract;
import org.hibernate.Hibernate;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class HibernateTypeWork extends AbstractDao implements TypeWorkDaoContract {

    @Transactional
    public TypeWork findById(TypeWork typeWork) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        TypeWork typeWorkResult = entityManager.getReference(TypeWork.class, typeWork.getId());
        Hibernate.initialize(typeWorkResult.getWorks());
        return typeWorkResult;
    }

    @Transactional
    public List<TypeWork> findAll() {
        String query = "select t from type_work t";
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        return entityManager.createQuery(query, TypeWork.class).getResultList();
    }
}
