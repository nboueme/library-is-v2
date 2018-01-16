package com.nb.library.repository.impl.jdbc.rowmapper;

import com.nb.library.entity.TypeWork;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TypeWorkRM implements RowMapper<TypeWork> {
    public TypeWork mapRow(ResultSet rs, int rowNum) throws SQLException {
        TypeWork typeWork = new TypeWork();

        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
            if (rs.getMetaData().getColumnName(i).equals("id")) typeWork.setId(rs.getInt("id"));
            else if (rs.getMetaData().getColumnName(i).equals("type_work")) typeWork.setType(rs.getString("type_work"));
        }

        return typeWork;
    }
}
