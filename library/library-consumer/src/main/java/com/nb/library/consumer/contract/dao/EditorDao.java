package com.nb.library.consumer.contract.dao;

import com.nb.library.model.entity.Editor;

import java.util.List;

public interface EditorDao {
    Editor getEditor(Editor editor);

    List<Editor> listEditors();
}
