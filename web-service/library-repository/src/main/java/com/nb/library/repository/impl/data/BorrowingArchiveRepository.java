package com.nb.library.repository.impl.data;

import com.nb.library.entity.archive.BorrowingArchive;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BorrowingArchiveRepository extends CrudRepository<BorrowingArchive, Integer> {

    @Query("SELECT archive FROM borrowing_archive archive JOIN FETCH archive.user user JOIN FETCH archive.book book JOIN FETCH book.work WHERE archive.userId = :user_id ORDER BY archive.returnDate ASC")
    Iterable<BorrowingArchive> findAllByUserId(@Param("user_id") Integer userId);
}
