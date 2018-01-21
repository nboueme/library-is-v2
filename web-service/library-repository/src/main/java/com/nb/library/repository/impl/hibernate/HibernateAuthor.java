package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.author.Author;
import com.nb.library.repository.contract.AuthorDaoContract;
import com.nb.library.repository.impl.data.AuthorRepository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HibernateAuthor implements AuthorDaoContract {

    @Resource
    private AuthorRepository authorRepository;

    @Transactional
    public Author findById(Author author) {
        Optional<Author> existingAuthor = authorRepository.findById(author.getId());
        return existingAuthor.orElse(null);
    }

    @Transactional
    public List<Author> findAll() {
        List<Author> authors = new ArrayList<>(0);
        authorRepository.findAll().iterator().forEachRemaining(authors::add);
        return authors;
    }
}
