package com.nb.library.business.impl.manager;

import com.nb.library.business.contract.manager.BorrowingManager;
import com.nb.library.business.impl.AbstractManager;
import com.nb.library.model.entity.borrowing.Borrowing;
import com.nb.library.model.entity.borrowing.UserAccount;

import java.util.List;

public class BorrowingManagerImpl extends AbstractManager implements BorrowingManager {

    public void addBorrowing(Borrowing borrowing) {
        getDaoFactory().getBorrowingDao().addBorrowing(borrowing);
    }

    public Borrowing getBorrowing(Borrowing borrowing) {
        return getDaoFactory().getBorrowingDao().getBorrowing(borrowing);
    }

    public List<Borrowing> listBorrowing(UserAccount user) {
        return getDaoFactory().getBorrowingDao().listBorrowing(user);
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
