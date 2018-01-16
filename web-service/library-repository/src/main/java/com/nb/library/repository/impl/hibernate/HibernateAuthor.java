package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.author.Author;
import com.nb.library.repository.AbstractDao;
import com.nb.library.repository.contract.AuthorDaoContract;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import javax.transaction.Transactional;
import java.util.List;

public class HibernateAuthor extends AbstractDao implements AuthorDaoContract {

    @Transactional
    public Author findById(Author author) {
        Session session = getSessionFactory().getCurrentSession();
        Author authorSession = session.load(Author.class, author.getId());
        Hibernate.initialize(authorSession.getWorks());
        return authorSession;
    }

    @Transactional
    public List<Author> findAll() {
        Session session = getSessionFactory().getCurrentSession();
        List<Author> authors = session.createQuery("from Author order by firstName asc", Author.class).getResultList();
        for (Author author : authors)
            Hibernate.initialize(author.getWorks());
        return authors;
    }
}
