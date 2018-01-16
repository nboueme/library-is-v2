package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.work.Work;
import com.nb.library.repository.AbstractDao;
import com.nb.library.repository.contract.WorkDaoContract;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import javax.transaction.Transactional;
import java.util.List;

public class HibernateWork extends AbstractDao implements WorkDaoContract {

    @Transactional
    public Work findById(Work work) {
        Session session = getSessionFactory().getCurrentSession();
        Work workSession = session.load(Work.class, work.getId());
        Hibernate.initialize(workSession.getAuthors());
        //TypedQuery<Work> query = session.createQuery("from Work where id = :work_id", Work.class);
        //query.setParameter("work_id", work.getId());
        return workSession;
    }

    @Transactional
    public List<Work> findAll() {
        Session session = getSessionFactory().getCurrentSession();
        List<Work> works = session.createQuery("from Work order by title asc", Work.class).getResultList();
        for (Work work : works)
            Hibernate.initialize(work.getAuthors());
        return works;
    }
}
