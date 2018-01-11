package com.nb.library.repository.impl.soap;

import com.nb.library.repository.contract.BorrowingDaoContract;
import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.borrowing.BorrowingClient;
import com.nb.library.client.borrowing.BorrowingService;
import com.nb.library.client.borrowing.UserAccount;

import java.util.List;

public class SoapBorrowingDao implements BorrowingDaoContract {

    private BorrowingService service = new BorrowingService();
    private BorrowingClient client = service.getBorrowingPort();

    public void addBorrowing(Borrowing borrowing) {
        client.addBorrowing(borrowing);
    }

    public Borrowing getBorrowing(Borrowing borrowing) {
        return client.getBorrowing(borrowing);
    }

    public List<Borrowing> listBorrowing(UserAccount user) {
        return client.listBorrowing(user);
    }

    public void updateBorrowing(Borrowing borrowing) {
        client.updateBorrowing(borrowing);
    }

    public void deleteBorrowing(Borrowing borrowing) {
        client.deleteBorrowing(borrowing);
    }

    public List<Borrowing> getLoanPeriodsExceeded() {
        return client.getLoanPeriodsExceeded();
    }
}
