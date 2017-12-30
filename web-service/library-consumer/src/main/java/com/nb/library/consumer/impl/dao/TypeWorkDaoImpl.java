package com.nb.library.consumer.impl.dao;

import com.nb.library.consumer.contract.dao.TypeWorkDao;
import com.nb.library.consumer.impl.dao.rowmapper.TypeWorkRM;
import com.nb.library.model.entity.TypeWork;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import java.sql.Types;
import java.util.List;

public class TypeWorkDaoImpl extends AbstractDaoImpl implements TypeWorkDao {

    public TypeWork getTypeWork(TypeWork typeWork) {
        String sql = "SELECT type_work.type_work, title " +
                "FROM type_work, work " +
                "WHERE type_work.id = work.type_work_id " +
                "AND type_work.id = :type_work_id;";

        MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("type_work_id", typeWork.getId(), Types.INTEGER);

        RowMapper<TypeWork> rowMapper = new TypeWorkRM();

        return getNamedParameterJdbcTemplate().queryForObject(sql, args, rowMapper);
    }

    public List<TypeWork> listTypesWorks() {
        String sql = "SELECT id, type_work FROM type_work;";

        RowMapper<TypeWork> rowMapper = new TypeWorkRM();

        return getJdbcTemplate().query(sql, rowMapper);
    }
}
