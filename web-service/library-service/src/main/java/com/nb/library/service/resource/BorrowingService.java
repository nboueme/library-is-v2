package com.nb.library.service.resource;

import com.nb.library.model.entity.Borrowing;
import com.nb.library.model.entity.UserAccount;
import com.nb.library.service.AbstractService;

import javax.jws.WebService;
import java.util.List;

@WebService(name = "BorrowingClient", serviceName = "BorrowingService", portName = "BorrowingPort", targetNamespace = "borrowing.entity.model.library.nb.com")
public class BorrowingService extends AbstractService {

    public void addBorrowing(Borrowing borrowing) {
        getManagerFactory().getBorrowingManager().addBorrowing(borrowing);
    }

    public Borrowing getBorrowing(Borrowing borrowing) {
        return getManagerFactory().getBorrowingManager().getBorrowing(borrowing);
    }

    public List<Borrowing> listBorrowing(UserAccount user) {
        return getManagerFactory().getBorrowingManager().listBorrowing(user);
    }

    public void updateBorrowing(Borrowing borrowing) {
        getManagerFactory().getBorrowingManager().updateBorrowing(borrowing);
    }

    public void deleteBorrowing(Borrowing borrowing) {
        getManagerFactory().getBorrowingManager().deleteBorrowing(borrowing);
    }

    public List<Borrowing> getLoanPeriodsExceeded() {
        return getManagerFactory().getBorrowingManager().getLoanPeriodsExceeded();
    }
}
