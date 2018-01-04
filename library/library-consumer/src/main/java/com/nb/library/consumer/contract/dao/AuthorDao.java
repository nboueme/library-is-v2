package com.nb.library.consumer.contract.dao;

import com.nb.library.model.entity.Author;

import java.util.List;

public interface AuthorDao {
    Author getAuthor(Author author);

    List<Author> listAuthors();
}
