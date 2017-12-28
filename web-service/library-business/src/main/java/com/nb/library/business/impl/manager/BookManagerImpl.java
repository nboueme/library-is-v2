package com.nb.library.business.impl.manager;

import com.nb.library.business.contract.manager.BookManager;
import com.nb.library.business.impl.AbstractManager;
import com.nb.library.model.entity.Book;

import java.util.List;

public class BookManagerImpl extends AbstractManager implements BookManager {

    public Book getBook(Book book) {
        return getDaoFactory().getBookDao().getBook(book);
    }

    public List<Book> listBooksFromWork(Book book) {
        return getDaoFactory().getBookDao().listBooksFromWork(book);
    }
}
