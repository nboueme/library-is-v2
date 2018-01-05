package com.nb.library.consumer.impl.dao;

import com.nb.library.consumer.contract.dao.EditorDao;
import com.nb.library.model.entity.editor.Editor;
import com.nb.library.model.entity.editor.EditorClient;
import com.nb.library.model.entity.editor.EditorService;

import java.util.List;

public class EditorDaoImpl implements EditorDao {

    public Editor getEditor(Editor editor) {
        EditorService service = new EditorService();
        EditorClient client = service.getEditorPort();
        return client.getEditor(editor);
    }

    public List<Editor> listEditors() {
        EditorService service = new EditorService();
        EditorClient client = service.getEditorPort();
        return client.listEditors();
    }
}
