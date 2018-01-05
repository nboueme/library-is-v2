package com.nb.library.consumer.impl.dao;

import com.nb.library.consumer.contract.dao.AuthorDao;
import com.nb.library.model.entity.author.Author;
import com.nb.library.model.entity.author.AuthorClient;
import com.nb.library.model.entity.author.AuthorService;

import java.util.List;

public class AuthorDaoImpl implements AuthorDao {

    public Author getAuthor(Author author) {
        AuthorService service = new AuthorService();
        AuthorClient client = service.getAuthorPort();
        return client.getAuthor(author);
    }

    public List<Author> listAuthors() {
        AuthorService service = new AuthorService();
        AuthorClient client = service.getAuthorPort();
        return client.listAuthors();
    }
}
