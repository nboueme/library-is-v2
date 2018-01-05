package com.nb.library.business.impl.manager;

import com.nb.library.business.contract.manager.AuthorManager;
import com.nb.library.business.impl.AbstractManager;
import com.nb.library.model.entity.author.Author;

import java.util.List;

public class AuthorManagerImpl extends AbstractManager implements AuthorManager {

    public Author getAuthor(Author author) {
        return getDaoFactory().getAuthorDao().getAuthor(author);
    }

    public List<Author> listAuthors() {
        return getDaoFactory().getAuthorDao().listAuthors();
    }
}
