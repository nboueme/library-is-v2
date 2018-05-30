package com.nb.library.repository.impl.data;

import com.nb.library.entity.borrowing.Borrowing;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BorrowingRepository extends CrudRepository<Borrowing, Integer> {

    @Query("SELECT b FROM borrowing b JOIN FETCH b.user u JOIN FETCH b.book book JOIN FETCH book.work WHERE b.id = :borrowing_id AND b.userId = :user_id")
    Optional<Borrowing> findByIdAndUserId(@Param("borrowing_id") Integer borrowingId, @Param("user_id") Integer userId);

    @Query("SELECT b FROM borrowing b JOIN FETCH b.user u JOIN FETCH b.book book JOIN FETCH book.work WHERE u.id = :user_id ORDER BY b.returnDate ASC")
    Iterable<Borrowing> findAllByUserId(@Param("user_id") Integer userId);

    @Query("SELECT b FROM borrowing b JOIN FETCH b.user u JOIN FETCH b.book book JOIN FETCH book.work WHERE b.returnDate <= current_date ORDER BY b.returnDate ASC")
    Iterable<Borrowing> findAllByReturnDateBeforeCurrent();

    @Query("SELECT b FROM borrowing b JOIN FETCH b.user u JOIN FETCH b.book book JOIN FETCH book.work WHERE u.isReminder = true AND cast((current_date - b.returnDate) as integer) BETWEEN 0 AND 5 ORDER BY u.email, b.returnDate ASC")
    Iterable<Borrowing> findAllByUserIsReminder();

    @Query("SELECT b FROM borrowing b JOIN FETCH b.user u JOIN FETCH b.book book JOIN FETCH book.work WHERE b.bookId = :book_id")
    Optional<Borrowing> findByBookId(@Param("book_id") Integer bookId);

    void deleteByBookId(Integer bookId);

    void deleteByIdAndUserId(Integer borrowingId, Integer userId);
}
