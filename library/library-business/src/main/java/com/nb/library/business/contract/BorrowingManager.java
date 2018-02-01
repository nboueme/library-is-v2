package com.nb.library.business.contract;

import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.borrowing.BorrowingArchive;

import java.util.List;

public interface BorrowingManager {
    void addBorrowing(Borrowing borrowing);

    Borrowing getBorrowing(Borrowing borrowing);

    Borrowing getBorrowingByBookId(Borrowing borrowing);

    List<Borrowing> listBorrowing(Borrowing borrowing);

    List<BorrowingArchive> listArchive(BorrowingArchive archive);

    void updateBorrowing(Borrowing borrowing);

    void deleteBorrowing(Borrowing borrowing);

    List<Borrowing> getLoanPeriodsExceeded();
}
