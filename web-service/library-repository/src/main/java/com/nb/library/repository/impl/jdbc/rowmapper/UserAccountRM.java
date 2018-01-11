package com.nb.library.repository.impl.jdbc.rowmapper;

import com.nb.library.entity.UserAccount;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAccountRM implements RowMapper<UserAccount> {
    public UserAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
        UserAccount user = new UserAccount();

        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
            if (rs.getMetaData().getColumnName(i).equals("id")) user.setId(rs.getInt("id"));
            else if (rs.getMetaData().getColumnName(i).equals("title")) user.setTitle(rs.getString("title"));
            else if (rs.getMetaData().getColumnName(i).equals("first_name")) user.setFirstName(rs.getString("first_name"));
            else if (rs.getMetaData().getColumnName(i).equals("last_name")) user.setLastName(rs.getString("last_name"));
            else if (rs.getMetaData().getColumnName(i).equals("birth_day")) user.setBirthDay(rs.getDate("birth_day"));
            else if (rs.getMetaData().getColumnName(i).equals("address")) user.setAddress(rs.getString("address"));
            else if (rs.getMetaData().getColumnName(i).equals("postal_code")) user.setPostalCode(rs.getInt("postal_code"));
            else if (rs.getMetaData().getColumnName(i).equals("city")) user.setCity(rs.getString("city"));
            else if (rs.getMetaData().getColumnName(i).equals("phone_number")) user.setPhoneNumber(rs.getString("phone_number"));
            else if (rs.getMetaData().getColumnName(i).equals("email")) user.setEmail(rs.getString("email"));
            else if (rs.getMetaData().getColumnName(i).equals("password")) user.setPassword(rs.getString("password"));
            else if (rs.getMetaData().getColumnName(i).equals("image_url")) user.setImageURL(rs.getString("image_url"));
            else if (rs.getMetaData().getColumnName(i).equals("role")) user.setRole(rs.getString("role"));
            else if (rs.getMetaData().getColumnName(i).equals("created_at")) user.setCreatedAt(rs.getTimestamp("created_at"));
            else if (rs.getMetaData().getColumnName(i).equals("updated_at")) user.setUpdatedAt(rs.getTimestamp("updated_at"));
        }

        return user;
    }
}
