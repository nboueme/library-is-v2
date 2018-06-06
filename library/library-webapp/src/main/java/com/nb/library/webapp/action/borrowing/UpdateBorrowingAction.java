package com.nb.library.webapp.action.borrowing;

import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.user.UserAccount;
import com.nb.library.webapp.AbstractService;
import com.nb.library.webapp.utility.Constant;
import com.opensymphony.xwork2.ActionContext;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class UpdateBorrowingAction extends AbstractService {

    private Borrowing borrowing;

    public String execute() throws DatatypeConfigurationException {
        UserAccount userSession = (UserAccount) ActionContext.getContext().getSession().get(Constant.USER_SESSION);

        if (userSession == null)
            return LOGIN;


        borrowing.setUserId(userSession.getId());
        Borrowing existingBorrowing = getManagerFactory().getBorrowingManager().getBorrowingByIdAndUserId(borrowing);

        GregorianCalendar calendar = existingBorrowing.getReturnDate().toGregorianCalendar();
        calendar.add(Calendar.WEEK_OF_MONTH, 4);
        borrowing.setReturnDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));

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
