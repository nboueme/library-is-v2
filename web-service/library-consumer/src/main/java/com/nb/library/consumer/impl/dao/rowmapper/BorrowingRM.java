package com.nb.library.consumer.impl.dao.rowmapper;

import com.nb.library.model.entity.Borrowing;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BorrowingRM implements RowMapper<Borrowing> {
    public Borrowing mapRow(ResultSet rs, int rowNum) throws SQLException {
        Borrowing borrowing = new Borrowing();

        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
            if (rs.getMetaData().getColumnName(i).equals("id")) borrowing.setId(rs.getInt("id"));
            else if (rs.getMetaData().getColumnName(i).equals("user_id")) borrowing.setUserId(rs.getInt("user_id"));
            else if (rs.getMetaData().getColumnName(i).equals("book_id")) borrowing.setBookId(rs.getInt("book_id"));
            else if (rs.getMetaData().getColumnName(i).equals("borrowing_date")) borrowing.setBorrowingDate(rs.getTimestamp("borrowing_date"));
            else if (rs.getMetaData().getColumnName(i).equals("return_date")) borrowing.setReturnDate(rs.getDate("return_date"));
            else if (rs.getMetaData().getColumnName(i).equals("is_loaned")) borrowing.setLoaned(rs.getBoolean("is_loaned"));
            else if (rs.getMetaData().getColumnName(i).equals("is_extended")) borrowing.setExtended(rs.getBoolean("is_extended"));
        }

        WorkRM workRM = new WorkRM();
        borrowing.setWork(workRM.mapRow(rs, rowNum));

        return borrowing;
    }
}
