package com.nb.library.repository.impl.data;

import com.nb.library.entity.work.Work;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface WorkRepository extends Repository<Work, Integer> {

    @Query("SELECT w FROM work w JOIN FETCH w.authors a JOIN FETCH w.typeWork t JOIN FETCH w.books b WHERE w.id = :work_id")
    Optional<Work> findById(@Param("work_id") Integer workId);

    @Query("SELECT DISTINCT w FROM work w JOIN FETCH w.authors a JOIN FETCH w.typeWork t JOIN FETCH w.books b ORDER BY w.title ASC")
    Iterable<Work> findAll();
}
