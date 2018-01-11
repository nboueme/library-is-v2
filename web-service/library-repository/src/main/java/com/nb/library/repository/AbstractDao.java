package com.nb.library.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;

public abstract class AbstractDao {

    private static JdbcTemplate jdbcTemplate;
    private static NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public static void setDataSource(DataSource dataSource) {
        AbstractDao.jdbcTemplate = new JdbcTemplate(dataSource);
        AbstractDao.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    protected static JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    protected static NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
        return namedParameterJdbcTemplate;
    }
}
