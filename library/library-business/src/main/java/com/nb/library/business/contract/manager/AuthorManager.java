package com.nb.library.business.contract.manager;

import com.nb.library.model.entity.author.Author;

import java.util.List;

public interface AuthorManager {
    Author getAuthor(Author author);

    List<Author> listAuthors();
}
