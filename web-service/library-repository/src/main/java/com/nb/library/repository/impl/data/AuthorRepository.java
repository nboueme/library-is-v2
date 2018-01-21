package com.nb.library.repository.impl.data;

import com.nb.library.entity.author.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AuthorRepository extends Repository<Author, Integer> {

    @Query("SELECT a FROM author a JOIN FETCH a.works w WHERE a.id = :author_id")
    Optional<Author> findById(@Param("author_id") Integer authorId);

    @Query("SELECT DISTINCT a FROM author a JOIN FETCH a.works w ORDER BY a.firstName ASC")
    Iterable<Author> findAll();
}
