package com.nb.library.repository.impl.soap;

import com.nb.library.repository.contract.EditorDaoContract;
import com.nb.library.client.editor.Editor;
import com.nb.library.client.editor.EditorClient;
import com.nb.library.client.editor.EditorService;

import java.util.List;

public class SoapEditorDao implements EditorDaoContract {

    private EditorService service = new EditorService();
    private EditorClient client = service.getEditorPort();

    public Editor getEditor(Editor editor) {
        return client.getEditor(editor);
    }

    public List<Editor> listEditors() {
        return client.listEditors();
    }
}
