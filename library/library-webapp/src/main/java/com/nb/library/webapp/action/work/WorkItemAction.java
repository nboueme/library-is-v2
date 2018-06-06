package com.nb.library.webapp.action.work;

import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.reservation.Reservation;
import com.nb.library.client.work.Book;
import com.nb.library.client.work.Work;
import com.nb.library.webapp.AbstractService;
import com.opensymphony.xwork2.ActionContext;

import java.util.ArrayList;
import java.util.List;

public class WorkItemAction extends AbstractService {

    private Work work;
    private List<Borrowing> borrowings;
    private Integer countBooksByWork;
    private Integer countReservationsByWork;
    private List<Reservation> reservations;

    public String execute() {
        String workId = ActionContext.getContext().getParameters().get("work.id").toString();
        Work inputWork = new Work();
        inputWork.setId(Integer.parseInt(workId));

        work = getManagerFactory().getWorkManager().getWork(inputWork);
        countBooksByWork = work.getBooks().size();
        countReservationsByWork = getManagerFactory().getReservationManager().countReservationsByWork(work.getId());

        Borrowing borrowing = new Borrowing();
        borrowings = new ArrayList<>(0);

        for (Book book : work.getBooks()) {
            borrowing.setBookId(book.getId());
            borrowings.add(getManagerFactory().getBorrowingManager().getBorrowingByBookId(borrowing));
        }

        reservations = new ArrayList<>(0);
        com.nb.library.client.reservation.Work workRes = new com.nb.library.client.reservation.Work();
        workRes.setId(work.getId());
        reservations.addAll(getManagerFactory().getReservationManager().listReservationsByWork(workRes));

        return SUCCESS;
    }

    public Work getWork() {
        return work;
    }

    public List<Borrowing> getBorrowings() {
        return borrowings;
    }

    public Integer getCountBooksByWork() {
        return countBooksByWork;
    }

    public Integer getCountReservationsByWork() {
        return countReservationsByWork;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
