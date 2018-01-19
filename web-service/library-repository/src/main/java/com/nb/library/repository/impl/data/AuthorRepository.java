package com.nb.library.repository.impl.data;

import com.nb.library.entity.author.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
