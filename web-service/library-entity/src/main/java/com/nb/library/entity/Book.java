package com.nb.library.entity;

import java.util.Date;

public class Book {

    private String ISBN;
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    private Integer workId;
    public Integer getWorkId() {
        return workId;
    }
    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    private Integer editorId;
    public Integer getEditorId() {
        return editorId;
    }
    public void setEditorId(Integer editorId) {
        this.editorId = editorId;
    }

    private Date purchaseDate;
    public Date getPurchaseDate() {
        return purchaseDate;
    }
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    private Double price;
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    private Integer year;
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
}
