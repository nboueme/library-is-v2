package com.nb.library.entity;

import java.util.Date;

public interface BookInterface {
    String getISBN();

    void setISBN(String ISBN);

    Date getPurchaseDate();

    void setPurchaseDate(Date purchaseDate);

    Double getPrice();

    void setPrice(Double price);

    Integer getYear();

    void setYear(Integer year);
}
