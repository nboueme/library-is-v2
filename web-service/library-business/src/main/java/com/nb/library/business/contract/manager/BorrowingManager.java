package com.nb.library.business.contract.manager;

import com.nb.library.model.entity.Borrowing;

import java.util.List;

public interface BorrowingManager {
    void addBorrowing(Borrowing borrowing);

    Borrowing getBorrowing(Borrowing borrowing);

    List<Borrowing> listBorrowing();

    void updateBorrowing(Borrowing borrowing);

    void deleteBorrowing(Borrowing borrowing);

    List<Borrowing> getLoanPeriodsExceeded();
}
