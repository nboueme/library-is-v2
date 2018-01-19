package com.nb.library.repository.contract;

import com.nb.library.entity.editor.Editor;

import java.util.List;

public interface EditorDaoContract {
    Editor findById(Editor editor);

    List<Editor> findAll();
}
