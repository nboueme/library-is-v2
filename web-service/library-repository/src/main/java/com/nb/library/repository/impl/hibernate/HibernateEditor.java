package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.editor.Book;
import com.nb.library.entity.editor.Editor;
import com.nb.library.repository.AbstractDao;
import com.nb.library.repository.contract.EditorDaoContract;
import org.hibernate.Hibernate;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class HibernateEditor extends AbstractDao implements EditorDaoContract {

    @Transactional
    public Editor findById(Editor editor) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        Editor editorResult = entityManager.getReference(Editor.class, editor.getId());
        Hibernate.initialize(editorResult.getBooks());
        for (Book book : editorResult.getBooks())
            Hibernate.initialize(book.getWork());
        return editorResult;
    }

    @Transactional
    public List<Editor> findAll() {
        String query = "select e from editor e";
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        return entityManager.createQuery(query, Editor.class).getResultList();
    }
}
