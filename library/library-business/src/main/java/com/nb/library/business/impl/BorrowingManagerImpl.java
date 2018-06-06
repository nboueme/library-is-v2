package com.nb.library.business.impl;

import com.nb.library.business.contract.BorrowingManager;
import com.nb.library.business.AbstractManager;
import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.borrowing.BorrowingArchive;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.time.temporal.ChronoUnit.DAYS;

public class BorrowingManagerImpl extends AbstractManager implements BorrowingManager {

    public void addBorrowing(Borrowing borrowing) {
        getDaoFactory().getBorrowingDao().addBorrowing(borrowing);
    }

    public Borrowing getBorrowingByIdAndUserId(Borrowing borrowing) {
        return getDaoFactory().getBorrowingDao().getBorrowingByIdAndUserId(borrowing);
    }

    public Borrowing getBorrowingByBookId(Borrowing borrowing) {
        return getDaoFactory().getBorrowingDao().getBorrowingByBookId(borrowing);
    }

    public List<Borrowing> listBorrowing(Borrowing borrowing) {
        return getDaoFactory().getBorrowingDao().listBorrowing(borrowing);
    }

    public List<Borrowing> listBorrowingsByWorkId(Borrowing borrowing) {
        return getDaoFactory().getBorrowingDao().listBorrowingsByWorkId(borrowing);
    }

    public List<BorrowingArchive> listArchive(BorrowingArchive archive) {
        return getDaoFactory().getBorrowingDao().listArchive(archive);
    }

    public List<Borrowing> listBorrowingByPeriodsExceeded() {
        return getDaoFactory().getBorrowingDao().listBorrowingByPeriodsExceeded();
    }

    public Map<String, List<Borrowing>> listBorrowingsByUserIsReminder() {
        List<Borrowing> borrowings = getDaoFactory().getBorrowingDao().listBorrowingsByUserIsReminder();
        List<Borrowing> userBorrowings = new ArrayList<>(0);
        Map<String, List<Borrowing>> sortedBorrowings = new HashMap<>(0);

        String currentUserEmail = "";

        for (Borrowing borrowing : borrowings) {
            String email = borrowing.getUser().getEmail();

            if (currentUserEmail.equals("")) {
                currentUserEmail = email;
            }

            if (currentUserEmail.equals(email)) {
                userBorrowings.add(borrowing);
            }
            else if (!currentUserEmail.equals(email)) {
                if (checkDaysBetween(userBorrowings)) {
                    sortedBorrowings.put(currentUserEmail, userBorrowings);
                }

                userBorrowings = new ArrayList<>(0);
                userBorrowings.add(borrowing);

                currentUserEmail = email;
            }
        }

        if (checkDaysBetween(userBorrowings)) {
            sortedBorrowings.put(currentUserEmail, userBorrowings);
        }

        return sortedBorrowings;
    }

    public void updateBorrowing(Borrowing borrowing) {
        getDaoFactory().getBorrowingDao().updateBorrowing(borrowing);
    }

    public void deleteBorrowing(Borrowing borrowing) {
        getDaoFactory().getBorrowingDao().deleteBorrowing(borrowing);
    }

    private boolean checkDaysBetween(List<Borrowing> userBorrowings) {
        LocalDate currentDate = LocalDate.now();
        LocalDate returnDate;

        for (Borrowing borrowing : userBorrowings) {
            returnDate = LocalDate.from(borrowing.getReturnDate().toGregorianCalendar().toZonedDateTime().toLocalDate());
            if (DAYS.between(currentDate, returnDate) == 5) return true;
        }

        return false;
    }
}
