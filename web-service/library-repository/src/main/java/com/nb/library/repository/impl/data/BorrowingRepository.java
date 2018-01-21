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

    @Query("SELECT b FROM borrowing b JOIN FETCH b.user u JOIN FETCH b.book book JOIN FETCH book.work WHERE b.isLoaned = true")
    Iterable<Borrowing> findAllByIsLoanedTrue();

    void deleteByIdAndUserId(Integer borrowingId, Integer userId);
}
