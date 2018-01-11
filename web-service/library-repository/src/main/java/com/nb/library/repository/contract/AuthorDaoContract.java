package com.nb.library.repository.contract;

import com.nb.library.entity.Author;

import java.util.List;

public interface AuthorDaoContract {
    Author getAuthor(Author author);

    List<Author> listAuthors();
}
