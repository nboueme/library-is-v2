package com.nb.library.consumer.impl.dao.rowmapper;

import com.nb.library.model.entity.Work;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WorkRM implements RowMapper<Work> {
    public Work mapRow(ResultSet rs, int rowNum) throws SQLException {
        Work work = new Work();

        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
            if (rs.getMetaData().getColumnName(i).equals("id")) work.setId(rs.getInt("id"));
            else if (rs.getMetaData().getColumnName(i).equals("type_work_id")) work.setTypeWorkId(rs.getInt("type_work_id"));
            else if (rs.getMetaData().getColumnName(i).equals("title")) work.setTitle(rs.getString("title"));
            else if (rs.getMetaData().getColumnName(i).equals("summary")) work.setSummary(rs.getString("summary"));
            else if (rs.getMetaData().getColumnName(i).equals("image_url")) work.setImageURL(rs.getString("image_url"));
            else if (rs.getMetaData().getColumnName(i).equals("created_at")) work.setCreatedAt(rs.getTimestamp("created_at"));
            else if (rs.getMetaData().getColumnName(i).equals("updated_at")) work.setUpdatedAt(rs.getTimestamp("updated_at"));
        }

        AuthorRM authorRM = new AuthorRM();
        work.setAuthor(authorRM.mapRow(rs, rowNum));

        TypeWorkRM typeWorkRM = new TypeWorkRM();
        work.setTypeWork(typeWorkRM.mapRow(rs, rowNum));

        return work;
    }
}
