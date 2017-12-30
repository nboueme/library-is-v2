package com.nb.library.consumer.impl.dao;

import com.nb.library.consumer.contract.dao.AuthorDao;
import com.nb.library.consumer.impl.dao.rowmapper.AuthorRM;
import com.nb.library.model.entity.Author;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import java.sql.Types;
import java.util.List;

public class AuthorDaoImpl extends AbstractDaoImpl implements AuthorDao {

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
