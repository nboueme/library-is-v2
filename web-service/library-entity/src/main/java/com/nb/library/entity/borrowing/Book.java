package com.nb.library.entity.borrowing;

import com.nb.library.entity.BookInterface;

import javax.persistence.*;
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

    @ManyToOne(targetEntity = Work.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "work_id", referencedColumnName = "id")
    private Work work;
    public Work getWork() {
        return work;
    }
    public void setWork(Work work) {
        this.work = work;
    }
}
