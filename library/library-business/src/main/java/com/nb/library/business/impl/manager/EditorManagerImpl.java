package com.nb.library.business.impl.manager;

import com.nb.library.business.contract.manager.EditorManager;
import com.nb.library.business.impl.AbstractManager;
import com.nb.library.model.entity.editor.Editor;

import java.util.List;

public class EditorManagerImpl extends AbstractManager implements EditorManager {

    public Editor getEditor(Editor editor) {
        return getDaoFactory().getEditorDao().getEditor(editor);
    }

    public List<Editor> listEditors() {
        return getDaoFactory().getEditorDao().listEditors();
    }
}
