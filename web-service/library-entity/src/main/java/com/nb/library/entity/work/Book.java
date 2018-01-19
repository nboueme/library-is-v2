package com.nb.library.entity.work;

import com.nb.library.entity.BookInterface;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "book")
public class Book implements BookInterface {

    @Id
    @Column(name = "isbn", nullable = false, unique = true, updatable = false)
    private String ISBN;
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Column(name = "work_id")
    private Integer workId;
    public Integer getWorkId() {
        return workId;
    }
    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    @Column(name = "editor_id")
    private Integer editorId;
    public Integer getEditorId() {
        return editorId;
    }
    public void setEditorId(Integer editorId) {
        this.editorId = editorId;
    }

    @Column(name = "purchase_date", columnDefinition = "DATE")
    private Date purchaseDate;
    public Date getPurchaseDate() {
        return purchaseDate;
    }
    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Column(name = "price", columnDefinition = "NUMERIC(4,2)")
    private Double price;
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Column(name = "year")
    private Integer year;
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
}
