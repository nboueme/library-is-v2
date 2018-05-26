package com.nb.library.webapp.action.work;

import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.reservation.Reservation;
import com.nb.library.client.user.UserAccount;
import com.nb.library.client.work.Book;
import com.nb.library.client.work.Work;
import com.nb.library.webapp.AbstractService;
import com.nb.library.webapp.utility.Constant;
import com.opensymphony.xwork2.ActionContext;

import java.util.ArrayList;
import java.util.List;

public class SearchAction extends AbstractService {

    private List<Work> works;
    private String search;
    private List<Borrowing> borrowings;
    private List<Integer> countReservationsByWork;
    private List<Boolean> cantReserve;
    private List<Reservation> reservations;

    public String execute() {
        works = getManagerFactory().getWorkManager().listWorksByWord(search);

        Borrowing borrowing = new Borrowing();
        borrowings = new ArrayList<>(0);

        countReservationsByWork = new ArrayList<>(0);
        cantReserve = new ArrayList<>(0);

        for (Work work : works) {
            for (Book book : work.getBooks()) {
                borrowing.setBookId(book.getId());
                borrowings.add(getManagerFactory().getBorrowingManager().getBorrowingByBookId(borrowing));
            }
            countReservationsByWork.add(getManagerFactory().getReservationManager().countReservationsByWork(work.getId()));
            cantReserve.add(work.getBooks().size() * 2 == getManagerFactory().getReservationManager().countReservationsByWork(work.getId()));
        }

        reservations = new ArrayList<>(0);
        UserAccount userSession = (UserAccount) ActionContext.getContext().getSession().get(Constant.USER_SESSION);
        if (userSession != null) {
            com.nb.library.client.reservation.UserAccount user = new com.nb.library.client.reservation.UserAccount();
            user.setId(userSession.getId());
            reservations.addAll(getManagerFactory().getReservationManager().listReservationsByUser(user));
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

    public List<Integer> getCountReservationsByWork() {
        return countReservationsByWork;
    }

    public List<Boolean> getCantReserve() {
        return cantReserve;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
