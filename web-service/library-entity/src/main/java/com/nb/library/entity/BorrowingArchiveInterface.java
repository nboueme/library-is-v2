package com.nb.library.entity;

import java.util.Date;

public interface BorrowingArchiveInterface {
    Integer getId();

    void setId(Integer id);

    Date getBorrowingDate();

    void setBorrowingDate(Date borrowingDate);

    Date getReturnDate();

    void setReturnDate(Date returnDate);
}
