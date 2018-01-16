package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.work.Work;
import com.nb.library.repository.AbstractDao;
import com.nb.library.repository.contract.WorkDaoContract;
import org.hibernate.Hibernate;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class HibernateWork extends AbstractDao implements WorkDaoContract {

    @Transactional
    public Work findById(Work work) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        Work workResult = entityManager.getReference(Work.class, work.getId());
        Hibernate.initialize(workResult.getAuthors());
        return workResult;
    }

    @Transactional
    public List<Work> findAll() {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        List<Work> works = entityManager.createQuery("select w from Work w order by w.title asc", Work.class).getResultList();
        for (Work work : works)
            Hibernate.initialize(work.getAuthors());
        return works;
    }
}
