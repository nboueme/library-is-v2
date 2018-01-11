package com.nb.library.business.impl;

import com.nb.library.business.contract.EditorManager;
import com.nb.library.business.AbstractManager;
import com.nb.library.client.editor.Editor;

import java.util.List;

public class EditorManagerImpl extends AbstractManager implements EditorManager {

    public Editor getEditor(Editor editor) {
        return getDaoFactory().getEditorDao().getEditor(editor);
    }

    public List<Editor> listEditors() {
        return getDaoFactory().getEditorDao().listEditors();
    }
}
