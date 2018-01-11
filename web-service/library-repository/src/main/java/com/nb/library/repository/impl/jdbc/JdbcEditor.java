package com.nb.library.repository.impl.jdbc;

import com.nb.library.repository.AbstractDao;
import com.nb.library.repository.contract.EditorDaoContract;
import com.nb.library.repository.impl.jdbc.rowmapper.EditorRM;
import com.nb.library.entity.Editor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import java.sql.Types;
import java.util.List;

public class JdbcEditor extends AbstractDao implements EditorDaoContract {

    public Editor getEditor(Editor editor) {
        String sql = "SELECT editor.name, isbn, title " +
                "FROM editor, book, work " +
                "WHERE editor.id = book.editor_id " +
                "AND book.work_id = work.id " +
                "AND editor.id = :editor_id;";

        MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("editor_id", editor.getId(), Types.INTEGER);

        RowMapper<Editor> rowMapper = new EditorRM();

        return getNamedParameterJdbcTemplate().queryForObject(sql, args, rowMapper);
    }

    public List<Editor> listEditors() {
        String sql = "SELECT id, name FROM editor;";

        RowMapper<Editor> rowMapper = new EditorRM();

        return getJdbcTemplate().query(sql, rowMapper);
    }
}
