package com.nb.library.webapp.action.user;

import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.user.UserAccount;
import com.nb.library.webapp.AbstractService;
import com.nb.library.webapp.utility.Constant;
import com.opensymphony.xwork2.ActionContext;

import java.util.Date;
import java.util.List;

public class UserBorrowingAction extends AbstractService {

    private List<Borrowing> borrowings;
    private Date currentDate;

    public String execute() {
        UserAccount userSession = (UserAccount) ActionContext.getContext().getSession().get(Constant.USER_SESSION);

        Borrowing inputBorrowing = new Borrowing();
        inputBorrowing.setUserId(userSession.getId());

        borrowings = getManagerFactory().getBorrowingManager().listBorrowing(inputBorrowing);

        currentDate = new Date();

        return SUCCESS;
    }

    public List<Borrowing> getBorrowings() {
        return borrowings;
    }

    public Date getCurrentDate() {
        return currentDate;
    }
}
