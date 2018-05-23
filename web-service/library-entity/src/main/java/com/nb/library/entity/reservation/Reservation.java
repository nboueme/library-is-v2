package com.nb.library.entity.reservation;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "reservation")
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @OneToOne(targetEntity = UserAccount.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserAccount user;
    public UserAccount getUser() {
        return user;
    }
    public void setUser(UserAccount user) {
        this.user = user;
    }

    @OneToOne(targetEntity = Work.class, fetch = FetchType.LAZY)
    @JoinTable(name = "reservation_work",
            joinColumns = { @JoinColumn(name = "reservation_id", referencedColumnName = "id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "work_id", referencedColumnName = "id", nullable = false, updatable = false) })
    private Work work = new Work();
    public Work getWork() {
        return work;
    }
    public void setWork(Work work) {
        this.work = work;
    }

    @Column(name = "reservation_date", columnDefinition = "DATE")
    private Date reservationDate;
    public Date getReservationDate() {
        return reservationDate;
    }
    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
