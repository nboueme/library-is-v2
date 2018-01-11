package com.nb.library.business.contract;

import com.nb.library.client.editor.Editor;

import java.util.List;

public interface EditorManager {
    Editor getEditor(Editor editor);

    List<Editor> listEditors();
}
