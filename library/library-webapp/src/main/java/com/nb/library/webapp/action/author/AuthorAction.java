package com.nb.library.webapp.action.author;

import com.nb.library.client.author.Author;
import com.nb.library.webapp.AbstractService;

import java.util.List;

public class AuthorAction extends AbstractService {

    private List<Author> authors;

    public String execute() {
        authors = getManagerFactory().getAuthorManager().listAuthors();

        return SUCCESS;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
