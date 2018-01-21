package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.editor.Editor;
import com.nb.library.repository.contract.EditorDaoContract;
import com.nb.library.repository.impl.data.EditorRepository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HibernateEditor implements EditorDaoContract {

    @Resource
    private EditorRepository editorRepository;

    @Transactional
    public Editor findById(Editor editor) {
        Optional<Editor> existingEditor = editorRepository.findById(editor.getId());
        return existingEditor.orElse(null);
    }

    @Transactional
    public List<Editor> findAll() {
        List<Editor> editors = new ArrayList<>(0);
        editorRepository.findAll().iterator().forEachRemaining(editors::add);
        return editors;
    }
}
