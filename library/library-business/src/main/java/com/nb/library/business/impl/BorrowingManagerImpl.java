package com.nb.library.business.impl;

import com.nb.library.business.contract.BorrowingManager;
import com.nb.library.business.AbstractManager;
import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.borrowing.BorrowingArchive;

import java.util.List;

public class BorrowingManagerImpl extends AbstractManager implements BorrowingManager {

    public void addBorrowing(Borrowing borrowing) {
        getDaoFactory().getBorrowingDao().addBorrowing(borrowing);
    }

    public Borrowing getBorrowing(Borrowing borrowing) {
        return getDaoFactory().getBorrowingDao().getBorrowing(borrowing);
    }

    public Borrowing getBorrowingByBookId(Borrowing borrowing) {
        return getDaoFactory().getBorrowingDao().getBorrowingByBookId(borrowing);
    }

    public List<Borrowing> listBorrowing(Borrowing borrowing) {
        return getDaoFactory().getBorrowingDao().listBorrowing(borrowing);
    }

    public List<BorrowingArchive> listArchive(BorrowingArchive archive) {
        return getDaoFactory().getBorrowingDao().listArchive(archive);
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
