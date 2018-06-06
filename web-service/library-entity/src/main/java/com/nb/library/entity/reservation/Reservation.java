package com.nb.library.entity.reservation;

import com.nb.library.entity.ReservationInterface;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "reservation")
@Table(name = "reservation")
public class Reservation implements ReservationInterface {

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

    @ManyToOne(targetEntity = UserAccount.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserAccount user;
    public UserAccount getUser() {
        return user;
    }
    public void setUser(UserAccount user) {
        this.user = user;
    }

    @ManyToOne(targetEntity = Work.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "work_id", referencedColumnName = "id")
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

    @Column(name = "notification_date", columnDefinition = "DATE")
    private Date notificationDate;
    public Date getNotificationDate() {
        return notificationDate;
    }
    public void setNotificationDate(Date notificationDate) {
        this.notificationDate = notificationDate;
    }
}
