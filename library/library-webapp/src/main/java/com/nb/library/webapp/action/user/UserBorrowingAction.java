package com.nb.library.webapp.action.user;

import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.borrowing.BorrowingArchive;
import com.nb.library.client.reservation.Book;
import com.nb.library.client.reservation.Reservation;
import com.nb.library.client.user.UserAccount;
import com.nb.library.webapp.AbstractService;
import com.nb.library.webapp.utility.Constant;
import com.opensymphony.xwork2.ActionContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserBorrowingAction extends AbstractService {

    private List<Borrowing> borrowings;
    private Date currentDate;
    private List<Reservation> reservationsUser;
    private List<List<Reservation>> reservationsWork;
    private List<Borrowing> borrowingsWork;
    private List<BorrowingArchive> archives;

    public String execute() {
        UserAccount userSession = (UserAccount) ActionContext.getContext().getSession().get(Constant.USER_SESSION);

        Borrowing borrowing = new Borrowing();
        borrowing.setUserId(userSession.getId());
        borrowings = getManagerFactory().getBorrowingManager().listBorrowing(borrowing);

        currentDate = new Date();

        com.nb.library.client.reservation.UserAccount userReservation = new com.nb.library.client.reservation.UserAccount();
        userReservation.setId(userSession.getId());
        reservationsUser = getManagerFactory().getReservationManager().listReservationsByUser(userReservation);

        reservationsWork = new ArrayList<>(0);
        borrowingsWork = new ArrayList<>(0);

        for (Reservation reservation : reservationsUser) {
            reservationsWork.add(getManagerFactory().getReservationManager().listReservationsByWork(reservation.getWork()));

            for (Book book : reservation.getWork().getBooks()) {
                borrowing.setBookId(book.getId());
                borrowingsWork.add(getManagerFactory().getBorrowingManager().getBorrowingByBookId(borrowing));
            }
        }

        BorrowingArchive archive = new BorrowingArchive();
        archive.setUserId(userSession.getId());
        archives = getManagerFactory().getBorrowingManager().listArchive(archive);

        return SUCCESS;
    }

    public List<Borrowing> getBorrowings() {
        return borrowings;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public List<Reservation> getReservationsUser() {
        return reservationsUser;
    }

    public List<List<Reservation>> getReservationsWork() {
        return reservationsWork;
    }

    public List<Borrowing> getBorrowingsWork() {
        return borrowingsWork;
    }

    public List<BorrowingArchive> getArchives() {
        return archives;
    }
}
