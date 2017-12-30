package com.nb.library.consumer.impl.dao.rowmapper;

import com.nb.library.model.entity.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRM implements RowMapper<Book> {
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();

        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
            if (rs.getMetaData().getColumnName(i).equals("isbn")) book.setISBN(rs.getString("isbn"));
            else if (rs.getMetaData().getColumnName(i).equals("work_id")) book.setWorkId(rs.getInt("work_id"));
            else if (rs.getMetaData().getColumnName(i).equals("editor_id")) book.setEditorId(rs.getInt("editor_id"));
            else if (rs.getMetaData().getColumnName(i).equals("purchase_date")) book.setPurchaseDate(rs.getDate("purchase_date"));
            else if (rs.getMetaData().getColumnName(i).equals("price")) book.setPrice(rs.getInt("price"));
            else if (rs.getMetaData().getColumnName(i).equals("year")) book.setYear(rs.getInt("year"));
        }

        return book;
    }
}
