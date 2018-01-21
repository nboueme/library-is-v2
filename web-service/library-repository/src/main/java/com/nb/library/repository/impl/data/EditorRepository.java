package com.nb.library.repository.impl.data;

import com.nb.library.entity.editor.Editor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface EditorRepository extends Repository<Editor, Integer> {

    @Query("SELECT e FROM editor e JOIN FETCH e.books b JOIN FETCH b.work w WHERE e.id = :editor_id")
    Optional<Editor> findById(@Param("editor_id") Integer editorId);

    @Query("SELECT e FROM editor e ORDER BY e.name ASC")
    Iterable<Editor> findAll();
}
