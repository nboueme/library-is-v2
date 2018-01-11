package com.nb.library.service.borrowing;

import com.nb.library.entity.Borrowing;
import com.nb.library.entity.UserAccount;
import com.nb.library.repository.contract.BorrowingDaoContract;
import com.nb.library.service.AbstractService;

import javax.jws.WebService;
import java.util.List;

@WebService(name = "BorrowingClient", serviceName = "BorrowingService", portName = "BorrowingPort", targetNamespace = "borrowing.client.library.nb.com")
public class BorrowingService extends AbstractService {

    private BorrowingDaoContract contract = getDaoFactory().getBorrowingDao();

    public void addBorrowing(Borrowing borrowing) {
        contract.addBorrowing(borrowing);
    }

    public Borrowing getBorrowing(Borrowing borrowing) {
        return contract.getBorrowing(borrowing);
    }

    public List<Borrowing> listBorrowing(UserAccount user) {
        return contract.listBorrowing(user);
    }

    public void updateBorrowing(Borrowing borrowing) {
        contract.updateBorrowing(borrowing);
    }

    public void deleteBorrowing(Borrowing borrowing) {
        contract.deleteBorrowing(borrowing);
    }

    public List<Borrowing> getLoanPeriodsExceeded() {
        return contract.getLoanPeriodsExceeded();
    }
}
