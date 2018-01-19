package com.nb.library.repository.contract;

import com.nb.library.entity.borrowing.Borrowing;
import com.nb.library.entity.borrowing.UserAccount;

import java.util.List;

public interface BorrowingDaoContract {
    void save(Borrowing borrowing);

    Borrowing findByIdAndUserId(Borrowing borrowing);

    List<Borrowing> findAllByUserId(UserAccount user);

    void delete(Borrowing borrowing);

    List<Borrowing> getLoanPeriodsExceeded(Borrowing borrowing);
}
