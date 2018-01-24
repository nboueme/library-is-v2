package com.nb.library.webapp.action.author;

import com.nb.library.client.author.Author;
import com.nb.library.webapp.AbstractService;
import com.opensymphony.xwork2.ActionContext;

public class AuthorItemAction extends AbstractService {

    private Author author;

    public String execute() {
        String authorId = ActionContext.getContext().getParameters().get("author.id").toString();
        Author inputAuthor = new Author();
        inputAuthor.setId(Integer.parseInt(authorId));

        author = getManagerFactory().getAuthorManager().getAuthor(inputAuthor);

        return SUCCESS;
    }

    public Author getAuthor() {
        return author;
    }
}
