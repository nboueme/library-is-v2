package com.nb.library.consumer.contract.dao;

import com.nb.library.model.entity.Book;

import java.util.List;

public interface BookDao {
    Book getBook(Book book);

    List<Book> listBooksFromWork(Book book);
}
