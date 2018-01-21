package com.nb.library.repository.contract;

import com.nb.library.entity.borrowing.Borrowing;

import java.util.List;

public interface BorrowingDaoContract {
    void save(Borrowing borrowing);

    Borrowing findByIdAndUserId(Borrowing borrowing);

    List<Borrowing> findAllByUserId(Borrowing borrowing);

    List<Borrowing> findAllByIsLoanedTrue();

    void update(Borrowing borrowing);

    void delete(Borrowing borrowing);

}
