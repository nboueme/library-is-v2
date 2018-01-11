package com.nb.library.repository.impl.soap;

import com.nb.library.repository.contract.AuthorDaoContract;
import com.nb.library.client.author.Author;
import com.nb.library.client.author.AuthorClient;
import com.nb.library.client.author.AuthorService;

import java.util.List;

public class SoapAuthorDao implements AuthorDaoContract {

    private AuthorService service = new AuthorService();
    private AuthorClient client = service.getAuthorPort();

    public Author getAuthor(Author author) {
        return client.getAuthor(author);
    }

    public List<Author> listAuthors() {
        return client.listAuthors();
    }
}
