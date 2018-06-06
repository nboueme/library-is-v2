package com.nb.library.repository.contract;

import com.nb.library.entity.archive.BorrowingArchive;
import com.nb.library.entity.borrowing.Borrowing;

import java.util.List;

public interface BorrowingDaoContract {
    void save(Borrowing borrowing);

    Borrowing findByIdAndUserId(Borrowing borrowing);

    List<Borrowing> findBorrowingsByUserId(Borrowing borrowing);

    List<Borrowing> findBorrowingsByWorkId(Borrowing borrowing);

    List<BorrowingArchive> findArchivesByUserId(BorrowingArchive archive);

    List<Borrowing> findAllByReturnDateBeforeCurrent();

    List<Borrowing> findAllByUserIsReminder();

    Borrowing findByBookId(Borrowing borrowing);

    void update(Borrowing borrowing);

    void delete(Borrowing borrowing);

}
