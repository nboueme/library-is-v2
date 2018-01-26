package com.nb.library.webapp.action.borrowing;

import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.user.UserAccount;
import com.nb.library.webapp.AbstractService;
import com.nb.library.webapp.utility.Constant;
import com.opensymphony.xwork2.ActionContext;

public class UpdateBorrowingAction extends AbstractService {

    private Borrowing borrowing;

    public String execute() {
        UserAccount userSession = (UserAccount) ActionContext.getContext().getSession().get(Constant.USER_SESSION);

        if (userSession == null)
            return LOGIN;

        borrowing.setUserId(userSession.getId());
        borrowing.setLoaned(true);
        borrowing.setExtended(true);

        getManagerFactory().getBorrowingManager().updateBorrowing(borrowing);

        return SUCCESS;
    }

    public Borrowing getBorrowing() {
        return borrowing;
    }

    public void setBorrowing(Borrowing borrowing) {
        this.borrowing = borrowing;
    }
}
