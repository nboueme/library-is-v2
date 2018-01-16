package com.nb.library.service.author;

import com.nb.library.entity.author.Author;
import com.nb.library.repository.contract.AuthorDaoContract;
import com.nb.library.service.AbstractService;

import javax.jws.WebService;
import java.util.List;

@WebService(name = "AuthorClient", serviceName = "AuthorService", portName = "AuthorPort", targetNamespace = "author.client.library.nb.com")
public class AuthorService extends AbstractService {

    private AuthorDaoContract contract = getDaoFactory().getAuthorDao();

    public Author getAuthor(Author author) {
        return contract.findById(author);
    }

    public List<Author> listAuthors() {
        return contract.findAll();
    }
}
