package com.nb.library.repository.impl.data;

import com.nb.library.entity.work.Work;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface WorkRepository extends Repository<Work, Integer> {

    @Query("SELECT w FROM work w JOIN FETCH w.authors a JOIN FETCH w.typeWork t JOIN FETCH w.books b JOIN FETCH b.editor WHERE w.id = :work_id")
    Optional<Work> findById(@Param("work_id") Integer workId);

    @Query("SELECT DISTINCT w FROM work w JOIN FETCH w.authors a JOIN FETCH w.typeWork t JOIN FETCH w.books b JOIN FETCH b.editor ORDER BY w.title ASC")
    Iterable<Work> findAll();

    @Query("SELECT DISTINCT w FROM work w JOIN FETCH w.authors a JOIN FETCH w.typeWork t JOIN FETCH w.books b JOIN FETCH b.editor e WHERE LOWER(w.title) LIKE LOWER(:word) OR LOWER(CONCAT(a.firstName, ' ', a.lastName)) LIKE LOWER(:word) OR LOWER(t.type) LIKE LOWER(:word) OR LOWER(e.name) LIKE LOWER(:word) ORDER BY w.title ASC")
    Iterable<Work> findByWord(@Param("word") String word);
}
