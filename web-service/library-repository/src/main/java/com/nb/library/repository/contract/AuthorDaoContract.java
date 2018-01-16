package com.nb.library.repository.contract;

import com.nb.library.entity.author.Author;

import java.util.List;

public interface AuthorDaoContract {
    Author findById(Author author);

    List<Author> findAll();
}
