package com.nb.library.consumer.impl.dao;

import com.nb.library.consumer.contract.dao.BorrowingDao;
import com.nb.library.consumer.impl.dao.rowmapper.BorrowingRM;
import com.nb.library.model.entity.Borrowing;
import com.nb.library.model.entity.UserAccount;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import java.sql.Types;
import java.util.List;

public class BorrowingDaoImpl extends AbstractDaoImpl implements BorrowingDao {

    public void addBorrowing(Borrowing borrowing) {
        String sql = "INSERT INTO borrowing (user_id, book_id, return_date, is_loaned, is_extended) " +
                "VALUES (:user_id, :book_id, :return_date, TRUE, FALSE);";

        MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("user_id", borrowing.getUserId(), Types.INTEGER);
        args.addValue("book_id", borrowing.getBookId(), Types.VARCHAR);
        args.addValue("return_date", borrowing.getReturnDate(), Types.DATE);

        getNamedParameterJdbcTemplate().update(sql, args);
    }

    public Borrowing getBorrowing(Borrowing borrowing) {
        String sql = "SELECT work.title, borrowing_date, return_date, is_extended " +
                "FROM work, book, borrowing, user_account " +
                "WHERE user_account.id = borrowing.user_id " +
                "AND borrowing.book_id = book.isbn " +
                "AND book.work_id = work.id " +
                "AND user_id = :user_id " +
                "AND borrowing.id = :borrowing_id " +
                "ORDER BY borrowing.return_date ASC;";

        MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("user_id", borrowing.getUserId(), Types.INTEGER);
        args.addValue("borrowing_id", borrowing.getId(), Types.INTEGER);

        RowMapper<Borrowing> rowMapper = new BorrowingRM();

        return getNamedParameterJdbcTemplate().queryForObject(sql, args, rowMapper);
    }

    public List<Borrowing> listBorrowing(UserAccount user) {
        String sql = "SELECT work.title, borrowing_date, return_date, is_extended " +
                "FROM work, book, borrowing, user_account " +
                "WHERE user_account.id = borrowing.user_id " +
                "AND borrowing.book_id = book.isbn " +
                "AND book.work_id = work.id " +
                "AND user_id = :user_id " +
                "AND return_date >= now() " +
                "ORDER BY borrowing.return_date ASC;";

        MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("user_id", user.getId(), Types.INTEGER);

        RowMapper<Borrowing> rowMapper = new BorrowingRM();

        return getNamedParameterJdbcTemplate().query(sql, args, rowMapper);
    }

    public void updateBorrowing(Borrowing borrowing) {
        String sql = "UPDATE borrowing SET return_date = :return_date, is_loaned = :is_loaned, is_extended = :is_extended " +
                "WHERE borrowing.id = :borrowing_id AND borrowing.user_id = :user_id;";

        MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("borrowing_id", borrowing.getId(), Types.INTEGER);
        args.addValue("user_id", borrowing.getUserId(), Types.INTEGER);
        args.addValue("return_date", borrowing.getReturnDate(), Types.DATE);
        args.addValue("is_loaned", borrowing.isLoaned(), Types.BOOLEAN);
        args.addValue("is_extended", borrowing.isExtended(), Types.BOOLEAN);

        getNamedParameterJdbcTemplate().update(sql, args);
    }

    public void deleteBorrowing(Borrowing borrowing) {
        String sql = "DELETE FROM borrowing WHERE borrowing.id = :borrowing_id AND borrowing.user_id = :user_id;";

        MapSqlParameterSource args = new MapSqlParameterSource();
        args.addValue("borrowing_id", borrowing.getId(), Types.INTEGER);
        args.addValue("user_id", borrowing.getUserId(), Types.INTEGER);

        getNamedParameterJdbcTemplate().update(sql, args);
    }

    public List<Borrowing> getLoanPeriodsExceeded() {
        String sql = "SELECT * FROM borrowing WHERE return_date <= now() AND is_loaned = TRUE;";

        RowMapper<Borrowing> rowMapper = new BorrowingRM();

        return getJdbcTemplate().query(sql, rowMapper);
    }
}
