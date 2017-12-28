package com.nb.library.business.contract.manager;

import com.nb.library.model.entity.Editor;

import java.util.List;

public interface EditorManager {
    Editor getEditor(Editor editor);

    List<Editor> listEditors();
}
