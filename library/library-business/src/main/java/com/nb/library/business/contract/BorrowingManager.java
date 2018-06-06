package com.nb.library.business.contract;

import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.borrowing.BorrowingArchive;

import java.util.List;
import java.util.Map;

public interface BorrowingManager {
    void addBorrowing(Borrowing borrowing);

    Borrowing getBorrowingByIdAndUserId(Borrowing borrowing);

    Borrowing getBorrowingByBookId(Borrowing borrowing);

    List<Borrowing> listBorrowing(Borrowing borrowing);

    List<Borrowing> listBorrowingsByWorkId(Borrowing borrowing);

    List<BorrowingArchive> listArchive(BorrowingArchive archive);

    List<Borrowing> listBorrowingByPeriodsExceeded();

    Map<String, List<Borrowing>> listBorrowingsByUserIsReminder();

    void updateBorrowing(Borrowing borrowing);

    void deleteBorrowing(Borrowing borrowing);
}
