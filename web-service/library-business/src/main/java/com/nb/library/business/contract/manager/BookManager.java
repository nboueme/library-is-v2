package com.nb.library.business.contract.manager;

import com.nb.library.model.entity.Book;

import java.util.List;

public interface BookManager {
    Book getBook(Book book);

    List<Book> listBooksFromWork(Book book);
}
