package com.nb.library.webapp.action.editor;

import com.nb.library.client.editor.Editor;
import com.nb.library.webapp.AbstractService;
import com.opensymphony.xwork2.ActionContext;

public class EditorItemAction extends AbstractService {

    private Editor editor;

    public String execute() {
        String editorId = ActionContext.getContext().getParameters().get("editor.id").toString();
        Editor inputEditor = new Editor();
        inputEditor.setId(Integer.parseInt(editorId));

        editor = getManagerFactory().getEditorManager().getEditor(inputEditor);

        return SUCCESS;
    }

    public Editor getEditor() {
        return editor;
    }
}
