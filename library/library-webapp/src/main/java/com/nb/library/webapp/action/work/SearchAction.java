package com.nb.library.webapp.action.work;

import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.work.Book;
import com.nb.library.client.work.Work;
import com.nb.library.webapp.AbstractService;

import java.util.ArrayList;
import java.util.List;

public class SearchAction extends AbstractService {

    private List<Work> works;
    private String search;
    private List<Borrowing> borrowings;

    public String execute() {
        works = getManagerFactory().getWorkManager().listWorksByWord(search);

        Borrowing borrowing = new Borrowing();
        borrowings = new ArrayList<>(0);

        for (Work work : works) {
            for (Book book : work.getBooks()) {
                borrowing.setBookId(book.getId());
                borrowings.add(getManagerFactory().getBorrowingManager().getBorrowingByBookId(borrowing));
            }
        }

        return SUCCESS;
    }

    public List<Work> getWorks() {
        return works;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public List<Borrowing> getBorrowings() {
        return borrowings;
    }
}
