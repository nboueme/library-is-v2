package com.nb.library.repository.contract;

import com.nb.library.client.borrowing.Borrowing;

import java.util.List;

public interface BorrowingDaoContract {
    void addBorrowing(Borrowing borrowing);

    Borrowing getBorrowing(Borrowing borrowing);

    List<Borrowing> listBorrowing(Borrowing borrowing);

    void updateBorrowing(Borrowing borrowing);

    void deleteBorrowing(Borrowing borrowing);

    List<Borrowing> getLoanPeriodsExceeded();
}
