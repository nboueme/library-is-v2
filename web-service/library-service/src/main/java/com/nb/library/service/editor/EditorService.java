package com.nb.library.service.editor;

import com.nb.library.entity.editor.Editor;
import com.nb.library.repository.contract.EditorDaoContract;
import com.nb.library.service.AbstractService;

import javax.jws.WebService;
import java.util.List;

@WebService(name = "EditorClient", serviceName = "EditorService", portName = "EditorPort", targetNamespace = "editor.client.library.nb.com")
public class EditorService extends AbstractService {

    EditorDaoContract contract = getDaoFactory().getEditorDao();

    public Editor getEditor(Editor editor) {
        return contract.findById(editor);
    }

    public List<Editor> listEditors() {
        return contract.findAll();
    }
}
