package com.nb.library.repository.impl.jdbc.rowmapper;

import com.nb.library.entity.Editor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EditorRM implements RowMapper<Editor> {
    public Editor mapRow(ResultSet rs, int rowNum) throws SQLException {
        Editor editor = new Editor();

        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
            if (rs.getMetaData().getColumnName(i).equals("id")) editor.setId(rs.getInt("id"));
            else if (rs.getMetaData().getColumnName(i).equals("name")) editor.setName(rs.getString("name"));
        }

        BookRM bookRM = new BookRM();
        editor.setBook(bookRM.mapRow(rs, rowNum));

        WorkRM workRM = new WorkRM();
        editor.setWork(workRM.mapRow(rs, rowNum));

        return editor;
    }
}
