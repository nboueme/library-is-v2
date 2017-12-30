package com.nb.library.consumer.impl.dao;

import com.nb.library.consumer.contract.dao.UserDao;
import com.nb.library.consumer.impl.dao.rowmapper.UserAccountRM;
import com.nb.library.model.entity.UserAccount;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.sql.Types;

public class UserDaoImpl extends AbstractDaoImpl implements UserDao {

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
