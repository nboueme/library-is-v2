package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.author.Author;
import com.nb.library.repository.AbstractDao;
import com.nb.library.repository.contract.AuthorDaoContract;
import org.hibernate.Hibernate;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class HibernateAuthor extends AbstractDao implements AuthorDaoContract {

    @Transactional
    public Author findById(Author author) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        Author authorResult = entityManager.getReference(Author.class, author.getId()); // same to session.load
        Hibernate.initialize(authorResult.getWorks());
        return authorResult;
    }

    @Transactional
    public List<Author> findAll() {
        String query = "select a from author a join fetch a.works w order by a.firstName, w.title asc";
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        return entityManager.createQuery(query, Author.class).getResultList();
    }
}
