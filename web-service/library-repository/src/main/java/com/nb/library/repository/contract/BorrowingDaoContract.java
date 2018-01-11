package com.nb.library.repository.contract;

import com.nb.library.entity.Borrowing;
import com.nb.library.entity.UserAccount;

import java.util.List;

public interface BorrowingDaoContract {
    void addBorrowing(Borrowing borrowing);

    Borrowing getBorrowing(Borrowing borrowing);

    List<Borrowing> listBorrowing(UserAccount user);

    void updateBorrowing(Borrowing borrowing);

    void deleteBorrowing(Borrowing borrowing);

    List<Borrowing> getLoanPeriodsExceeded();
}
