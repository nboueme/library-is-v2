package com.nb.library.repository.contract;

import com.nb.library.client.author.Author;

import java.util.List;

public interface AuthorDaoContract {
    Author getAuthor(Author author);

    List<Author> listAuthors();
}
