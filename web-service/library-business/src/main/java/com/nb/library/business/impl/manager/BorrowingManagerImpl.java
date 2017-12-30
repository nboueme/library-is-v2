package com.nb.library.business.impl.manager;

import com.nb.library.business.contract.manager.BorrowingManager;
import com.nb.library.business.impl.AbstractManager;
import com.nb.library.model.entity.Borrowing;

import java.util.List;

public class BorrowingManagerImpl extends AbstractManager implements BorrowingManager {

    public void addBorrowing(Borrowing borrowing) {
        getDaoFactory().getBorrowingDao().addBorrowing(borrowing);
    }

    public Borrowing getBorrowing(Borrowing borrowing) {
        return getDaoFactory().getBorrowingDao().getBorrowing(borrowing);
    }

    public List<Borrowing> listBorrowing(Borrowing borrowing) {
        return getDaoFactory().getBorrowingDao().listBorrowing(borrowing);
    }

    public void updateBorrowing(Borrowing borrowing) {
        getDaoFactory().getBorrowingDao().updateBorrowing(borrowing);
    }

    public void deleteBorrowing(Borrowing borrowing) {
        getDaoFactory().getBorrowingDao().deleteBorrowing(borrowing);
    }

    public List<Borrowing> getLoanPeriodsExceeded() {
        return getDaoFactory().getBorrowingDao().getLoanPeriodsExceeded();
    }
}
