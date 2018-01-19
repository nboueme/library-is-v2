package com.nb.library.entity;

import java.util.Date;

public interface BorrowingInterface {
    Integer getId();

    void setId(Integer id);

    Date getBorrowingDate();

    void setBorrowingDate(Date borrowingDate);

    Date getReturnDate();

    void setReturnDate(Date returnDate);

    Boolean getLoaned();

    void setLoaned(Boolean loaned);

    Boolean getExtended();

    void setExtended(Boolean extended);
}
