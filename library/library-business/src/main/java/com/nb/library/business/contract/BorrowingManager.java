package com.nb.library.business.contract;

import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.borrowing.UserAccount;

import java.util.List;

public interface BorrowingManager {
    void addBorrowing(Borrowing borrowing);

    Borrowing getBorrowing(Borrowing borrowing);

    List<Borrowing> listBorrowing(UserAccount user);

    void updateBorrowing(Borrowing borrowing);

    void deleteBorrowing(Borrowing borrowing);

    List<Borrowing> getLoanPeriodsExceeded();
}
