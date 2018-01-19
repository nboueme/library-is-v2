package com.nb.library.repository.impl.data;

import com.nb.library.entity.borrowing.Borrowing;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.Optional;

public interface BorrowingRepository extends CrudRepository<Borrowing, Integer> {

    Optional<Borrowing> findByIdAndUserId(Integer borrowingId, Integer userId);
    Iterable<Borrowing> findAllByUserId(Integer userId);
    Iterable<Borrowing> findAllByReturnDateBeforeAndIsLoanedTrue(Date returnDate);
}
