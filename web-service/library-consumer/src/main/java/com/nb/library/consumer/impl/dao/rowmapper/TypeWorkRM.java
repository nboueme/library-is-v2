package com.nb.library.consumer.impl.dao.rowmapper;

import com.nb.library.model.entity.TypeWork;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TypeWorkRM implements RowMapper<TypeWork> {
    public TypeWork mapRow(ResultSet rs, int rowNum) throws SQLException {
        TypeWork typeWork = new TypeWork();

        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
            if (rs.getMetaData().getColumnName(i).equals("id")) typeWork.setId(rs.getInt("id"));
            else if (rs.getMetaData().getColumnName(i).equals("type_work")) typeWork.setTypeWork(rs.getString("type_work"));
        }

        WorkRM workRM = new WorkRM();
        typeWork.setWork(workRM.mapRow(rs, rowNum));

        return typeWork;
    }
}
