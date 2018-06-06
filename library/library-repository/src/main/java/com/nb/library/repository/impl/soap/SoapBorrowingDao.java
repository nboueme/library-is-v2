package com.nb.library.repository.impl.soap;

import com.nb.library.client.borrowing.BorrowingArchive;
import com.nb.library.repository.contract.BorrowingDaoContract;
import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.borrowing.BorrowingClient;
import com.nb.library.client.borrowing.BorrowingService;

import java.util.List;

public class SoapBorrowingDao implements BorrowingDaoContract {

    private BorrowingService service = new BorrowingService();
    private BorrowingClient client = service.getBorrowingPort();

    public void addBorrowing(Borrowing borrowing) {
        client.addBorrowing(borrowing);
    }

    public Borrowing getBorrowingByIdAndUserId(Borrowing borrowing) {
        return client.getBorrowingByIdAndUserId(borrowing);
    }

    public Borrowing getBorrowingByBookId(Borrowing borrowing) {
        return client.getBorrowingByBookId(borrowing);
    }

    public List<Borrowing> listBorrowing(Borrowing borrowing) {
        return client.listBorrowing(borrowing);
    }

    public List<Borrowing> listBorrowingsByWorkId(Borrowing borrowing) {
        return client.listBorrowingsByWorkId(borrowing);
    }

    public List<BorrowingArchive> listArchive(BorrowingArchive archive) {
        return client.listArchive(archive);
    }

    public List<Borrowing> listBorrowingByPeriodsExceeded() {
        return client.listBorrowingByReturnDateBeforeCurrent();
    }

    public List<Borrowing> listBorrowingsByUserIsReminder() {
        return client.listBorrowingsByUserIsReminder();
    }

    public void updateBorrowing(Borrowing borrowing) {
        client.updateBorrowing(borrowing);
    }

    public void deleteBorrowing(Borrowing borrowing) {
        client.deleteBorrowing(borrowing);
    }
}
