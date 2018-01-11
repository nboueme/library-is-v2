package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.Borrowing;
import com.nb.library.entity.UserAccount;
import com.nb.library.repository.contract.BorrowingDaoContract;

import java.util.List;

public class HibernateBorrowing implements BorrowingDaoContract {
    public void addBorrowing(Borrowing borrowing) {

    }

    public Borrowing getBorrowing(Borrowing borrowing) {
        return null;
    }

    public List<Borrowing> listBorrowing(UserAccount user) {
        return null;
    }

    public void updateBorrowing(Borrowing borrowing) {

    }

    public void deleteBorrowing(Borrowing borrowing) {

    }

    public List<Borrowing> getLoanPeriodsExceeded() {
        return null;
    }
}
