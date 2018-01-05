package com.nb.library.service.resource;

import com.nb.library.model.entity.Author;
import com.nb.library.service.AbstractService;

import javax.jws.WebService;
import java.util.List;

@WebService(name = "AuthorClient", serviceName = "AuthorService", portName = "AuthorPort", targetNamespace = "author.entity.model.library.nb.com")
public class AuthorService extends AbstractService {

    public Author getAuthor(Author author) {
        return getManagerFactory().getAuthorManager().getAuthor(author);
    }

    public List<Author> listAuthors() {
        return getManagerFactory().getAuthorManager().listAuthors();
    }
}
