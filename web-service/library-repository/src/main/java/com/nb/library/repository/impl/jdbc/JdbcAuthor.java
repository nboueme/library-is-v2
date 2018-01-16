package com.nb.library.repository.impl.jdbc;

import com.nb.library.repository.AbstractDao;
import com.nb.library.repository.contract.AuthorDaoContract;
import com.nb.library.repository.impl.jdbc.rowmapper.AuthorRM;
import com.nb.library.entity.author.Author;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import java.sql.Types;
import java.util.List;

public class JdbcAuthor extends AbstractDao implements AuthorDaoContract {

    public Author getAuthor(Author author) {
        String sql = "SELECT author.id, first_name || ' ' || last_name AS author, title " +
                "FROM author, work_authors, work " +
                "WHERE author.id = work_authors.author_id " +
                "AND work_authors.work_id = work.id " +
                "AND author.id = :author_id;";

        MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("author_id", author.getId(), Types.INTEGER);

        RowMapper<Author> rowMapper = new AuthorRM();

        return getNamedParameterJdbcTemplate().queryForObject(sql, args, rowMapper);
    }

    public List<Author> listAuthors() {
        String sql = "SELECT id, first_name || ' ' || last_name AS author FROM author;";

        RowMapper<Author> rowMapper = new AuthorRM();

        return getJdbcTemplate().query(sql, rowMapper);
    }
}
