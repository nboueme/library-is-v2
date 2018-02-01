package com.nb.library.webapp.action.work;

import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.work.Book;
import com.nb.library.client.work.Work;
import com.nb.library.webapp.AbstractService;
import com.opensymphony.xwork2.ActionContext;

import java.util.ArrayList;
import java.util.List;

public class WorkItemAction extends AbstractService {

    private Work work;
    private List<Borrowing> borrowings;

    public String execute() {
        String workId = ActionContext.getContext().getParameters().get("work.id").toString();
        Work inputWork = new Work();
        inputWork.setId(Integer.parseInt(workId));

        work = getManagerFactory().getWorkManager().getWork(inputWork);

        Borrowing borrowing = new Borrowing();
        borrowings = new ArrayList<>(0);

        for (Book book : work.getBooks()) {
            borrowing.setBookId(book.getId());
            borrowings.add(getManagerFactory().getBorrowingManager().getBorrowingByBookId(borrowing));
        }

        return SUCCESS;
    }

    public Work getWork() {
        return work;
    }

    public List<Borrowing> getBorrowings() {
        return borrowings;
    }
}
