package com.nb.library.business.impl;

import com.nb.library.business.contract.AuthorManager;
import com.nb.library.business.AbstractManager;
import com.nb.library.client.author.Author;

import java.util.List;

public class AuthorManagerImpl extends AbstractManager implements AuthorManager {

    public Author getAuthor(Author author) {
        return getDaoFactory().getAuthorDao().getAuthor(author);
    }

    public List<Author> listAuthors() {
        return getDaoFactory().getAuthorDao().listAuthors();
    }
}
