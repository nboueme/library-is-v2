package com.nb.library.repository.impl.data;

import com.nb.library.entity.work.Work;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface WorkRepository extends CrudRepository<Work, Integer> {

    @Query("SELECT w FROM work w JOIN FETCH w.authors a JOIN FETCH w.typeWork t JOIN FETCH w.books b WHERE w.id = :id")
    Optional<Work> findWorkById(@Param("id") Integer workId);

    @Query("SELECT DISTINCT w FROM work w JOIN FETCH w.authors a JOIN FETCH w.typeWork t ORDER BY w.title ASC")
    Iterable<Work> findAllWorks();
}
