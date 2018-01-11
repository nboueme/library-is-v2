package com.nb.library.repository.impl.jdbc;

import com.nb.library.repository.AbstractDao;
import com.nb.library.repository.contract.UserDaoContract;
import com.nb.library.repository.impl.jdbc.rowmapper.UserAccountRM;
import com.nb.library.entity.UserAccount;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.sql.Types;

public class JdbcUser extends AbstractDao implements UserDaoContract {

    public UserAccount getUser(UserAccount user) {
        String sql = "SELECT * FROM user_account WHERE email = :user_login;";

        MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("user_login", user.getEmail(), Types.VARCHAR);

        RowMapper<UserAccount> rowMapper = new UserAccountRM();

        try {
            UserAccount userQuery = getNamedParameterJdbcTemplate().queryForObject(sql, args, rowMapper);

            if (BCrypt.checkpw(user.getPassword(), userQuery.getPassword())) {
                System.out.println("Correct login credentials");
                return userQuery;
            }
            else {
                System.out.println("Incorrect login credentials");
                return null;
            }

        } catch (EmptyResultDataAccessException exception) {
            System.out.println("Incorrect login credentials");
            return null;
        }
    }
}
