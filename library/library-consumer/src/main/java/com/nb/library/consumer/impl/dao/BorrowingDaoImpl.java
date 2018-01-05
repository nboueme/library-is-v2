package com.nb.library.consumer.impl.dao;

import com.nb.library.consumer.contract.dao.BorrowingDao;
import com.nb.library.model.entity.borrowing.Borrowing;
import com.nb.library.model.entity.borrowing.BorrowingClient;
import com.nb.library.model.entity.borrowing.BorrowingService;
import com.nb.library.model.entity.borrowing.UserAccount;

import java.util.List;

public class BorrowingDaoImpl implements BorrowingDao {

    public void addBorrowing(Borrowing borrowing) {
        BorrowingService service = new BorrowingService();
        BorrowingClient client = service.getBorrowingPort();
        client.addBorrowing(borrowing);
    }

    public Borrowing getBorrowing(Borrowing borrowing) {
        BorrowingService service = new BorrowingService();
        BorrowingClient client = service.getBorrowingPort();
        return client.getBorrowing(borrowing);
    }

    public List<Borrowing> listBorrowing(UserAccount user) {
        BorrowingService service = new BorrowingService();
        BorrowingClient client = service.getBorrowingPort();
        return client.listBorrowing(user);
    }

    public void updateBorrowing(Borrowing borrowing) {
        BorrowingService service = new BorrowingService();
        BorrowingClient client = service.getBorrowingPort();
        client.updateBorrowing(borrowing);
    }

    public void deleteBorrowing(Borrowing borrowing) {
        BorrowingService service = new BorrowingService();
        BorrowingClient client = service.getBorrowingPort();
        client.deleteBorrowing(borrowing);
    }

    public List<Borrowing> getLoanPeriodsExceeded() {
        BorrowingService service = new BorrowingService();
        BorrowingClient client = service.getBorrowingPort();
        return client.getLoanPeriodsExceeded();
    }
}
