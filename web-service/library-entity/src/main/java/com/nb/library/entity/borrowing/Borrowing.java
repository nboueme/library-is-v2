package com.nb.library.entity.borrowing;

import com.nb.library.entity.BorrowingInterface;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "borrowing")
@Table(name = "borrowing")
public class Borrowing implements BorrowingInterface {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "borrowing_id_seq")
    @SequenceGenerator(name = "borrowing_id_seq", sequenceName = "borrowing_id_seq")
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "borrowing_date")
    private Date borrowingDate;
    public Date getBorrowingDate() {
        return borrowingDate;
    }
    public void setBorrowingDate(Date borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    @Column(name = "return_date", columnDefinition = "DATE")
    private Date returnDate;
    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Column(name = "is_loaned")
    private Boolean isLoaned;
    public Boolean getLoaned() {
        return isLoaned;
    }
    public void setLoaned(Boolean loaned) {
        isLoaned = loaned;
    }

    @Column(name = "is_extended")
    private Boolean isExtended;
    public Boolean getExtended() {
        return isExtended;
    }
    public void setExtended(Boolean extended) {
        isExtended = extended;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserAccount user;
    public UserAccount getUser() {
        return user;
    }
    public void setUser(UserAccount user) {
        this.user = user;
    }

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "isbn")
    private Book book;
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
}