package com.nb.library.repository.impl.data;

import com.nb.library.entity.type.TypeWork;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TypeWorkRepository extends Repository<TypeWork, Integer> {

    @Query("SELECT t FROM type_work t JOIN FETCH t.works w JOIN FETCH w.authors WHERE t.id = :type_work_id")
    Optional<TypeWork> findById(@Param("type_work_id") Integer typeWorkId);

    @Query("SELECT DISTINCT t FROM type_work t JOIN FETCH t.works w JOIN FETCH w.authors ORDER BY t.type ASC")
    Iterable<TypeWork> findAll();
}
