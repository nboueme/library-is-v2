package com.nb.library.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

public abstract class AbstractDao {

    private JdbcTemplate jdbcTemplate;
    protected JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    protected NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
        return namedParameterJdbcTemplate;
    }

    @Resource
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Resource
    private EntityManagerFactory entityManagerFactory;
    protected EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
