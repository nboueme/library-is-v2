package com.nb.library.webapp.action.editor;

import com.nb.library.client.editor.Editor;
import com.nb.library.webapp.AbstractService;

import java.util.List;

public class EditorAction extends AbstractService {

    private List<Editor> editors;

    public String execute() {
        editors = getManagerFactory().getEditorManager().listEditors();

        return SUCCESS;
    }

    public List<Editor> getEditors() {
        return editors;
    }
}
