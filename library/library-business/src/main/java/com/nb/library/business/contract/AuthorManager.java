package com.nb.library.business.contract;

import com.nb.library.client.author.Author;

import java.util.List;

public interface AuthorManager {
    Author getAuthor(Author author);

    List<Author> listAuthors();
}
