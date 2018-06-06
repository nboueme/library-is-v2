package com.nb.library.repository.contract;

import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.borrowing.BorrowingArchive;

import java.util.List;

public interface BorrowingDaoContract {
    void addBorrowing(Borrowing borrowing);

    Borrowing getBorrowingByIdAndUserId(Borrowing borrowing);

    Borrowing getBorrowingByBookId(Borrowing borrowing);

    List<Borrowing> listBorrowing(Borrowing borrowing);

    List<Borrowing> listBorrowingsByWorkId(Borrowing borrowing);

    List<BorrowingArchive> listArchive(BorrowingArchive archive);

    List<Borrowing> listBorrowingByPeriodsExceeded();

    List<Borrowing> listBorrowingsByUserIsReminder();

    void updateBorrowing(Borrowing borrowing);

    void deleteBorrowing(Borrowing borrowing);
}
