package com.nb.library.repository.contract;

import com.nb.library.entity.Editor;

import java.util.List;

public interface EditorDaoContract {
    Editor getEditor(Editor editor);

    List<Editor> listEditors();
}
