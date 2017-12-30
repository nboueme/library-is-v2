package com.nb.library.consumer.impl.dao;

import com.nb.library.consumer.contract.dao.WorkDao;
import com.nb.library.consumer.impl.dao.rowmapper.WorkRM;
import com.nb.library.model.entity.Work;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import java.sql.Types;
import java.util.List;

public class WorkDaoImpl extends AbstractDaoImpl implements WorkDao {

    public Work getWork(Work work) {
        String sql = "SELECT work.id, title, summary, image_url, isbn, type_work, first_name || ' ' || last_name AS author " +
                "FROM book, work, type_work, work_authors, author " +
                "WHERE work.type_work_id = type_work.id " +
                "AND work.id = work_authors.work_id " +
                "AND work_authors.author_id = author.id " +
                "AND book.work_id = work.id " +
                "AND work.id = :work_id";

        MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("work_id", work.getId(), Types.INTEGER);

        RowMapper<Work> rowMapper = new WorkRM();

        return getNamedParameterJdbcTemplate().queryForObject(sql, args, rowMapper);
    }

    public List<Work> listWorks() {
        String sql = "SELECT DISTINCT ON (title) " +
                "work.id, title, summary, image_url, first_name || ' ' || last_name AS author " +
                "FROM work, work_authors, author " +
                "WHERE work.id = work_authors.work_id " +
                "AND work_authors.author_id = author.id;";

        RowMapper<Work> rowMapper = new WorkRM();

        return getJdbcTemplate().query(sql, rowMapper);
    }
}
