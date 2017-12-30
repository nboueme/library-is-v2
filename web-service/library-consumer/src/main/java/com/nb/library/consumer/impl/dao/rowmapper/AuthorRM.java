package com.nb.library.consumer.impl.dao.rowmapper;

import com.nb.library.model.entity.Author;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthorRM implements RowMapper<Author> {
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
        Author author = new Author();

        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
            if (rs.getMetaData().getColumnName(i).equals("id")) author.setId(rs.getInt("id"));
            else if (rs.getMetaData().getColumnName(i).equals("author")) author.setFullName(rs.getString("author"));
        }

        WorkRM workRM = new WorkRM();
        author.setWork(workRM.mapRow(rs, rowNum));

        return author;
    }
}
