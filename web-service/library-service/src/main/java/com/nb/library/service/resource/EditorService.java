package com.nb.library.service.resource;

import com.nb.library.model.entity.Editor;
import com.nb.library.service.AbstractService;

import javax.jws.WebService;
import java.util.List;

@WebService(name = "EditorClient", serviceName = "EditorService", portName = "EditorPort", targetNamespace = "editor.entity.model.library.nb.com")
public class EditorService extends AbstractService {

    public Editor getEditor(Editor editor) {
        return getManagerFactory().getEditorManager().getEditor(editor);
    }

    public List<Editor> listEditors() {
        return getManagerFactory().getEditorManager().listEditors();
    }
}
