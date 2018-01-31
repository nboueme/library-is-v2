package com.nb.library.entity;

import java.util.Date;

public interface BookInterface {
    Integer getId();

    void setId(Integer id);

    String getISBN();

    void setISBN(String ISBN);

    Date getPurchaseDate();

    void setPurchaseDate(Date purchaseDate);

    Double getPrice();

    void setPrice(Double price);

    Integer getYear();

    void setYear(Integer year);
}
