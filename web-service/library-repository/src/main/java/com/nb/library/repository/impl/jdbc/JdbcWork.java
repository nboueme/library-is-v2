package com.nb.library.repository.impl.jdbc;

import com.nb.library.repository.AbstractDao;
import com.nb.library.repository.contract.WorkDaoContract;
import com.nb.library.repository.impl.jdbc.rowmapper.WorkRM;
import com.nb.library.entity.work.Work;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import java.sql.Types;
import java.util.List;

public class JdbcWork extends AbstractDao implements WorkDaoContract {

    public Work findById(Work work) {
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

    public List<Work> findAll() {
        String sql = "SELECT DISTINCT ON (title) " +
                "work.id, title, summary, image_url, first_name || ' ' || last_name AS author " +
                "FROM work, work_authors, author " +
                "WHERE work.id = work_authors.work_id " +
                "AND work_authors.author_id = author.id;";

        RowMapper<Work> rowMapper = new WorkRM();

        return getJdbcTemplate().query(sql, rowMapper);
    }
}
