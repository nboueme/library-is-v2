package com.nb.library.entity.reservation;

import com.nb.library.entity.ReservationInterface;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity(name = "reservation")
@Table(name = "reservation")
public class Reservation implements ReservationInterface {

    @EmbeddedId
    private ReservationId id;

    @MapsId("userId")
    @ManyToOne(targetEntity = UserAccount.class, fetch = FetchType.LAZY)
    private UserAccount user;
    public UserAccount getUser() {
        return user;
    }
    public void setUser(UserAccount user) {
        this.user = user;
    }

    @MapsId("workId")
    @ManyToOne(targetEntity = Work.class, fetch = FetchType.LAZY)
    private Work work;
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

    private Reservation() {}

    public Reservation(UserAccount user, Work work) {
        this.user = user;
        this.work = work;
        this.id = new ReservationId(user.getId(), work.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Reservation that = (Reservation) o;
        return Objects.equals(user, that.user) &&
                Objects.equals(work, that.work);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, work);
    }
}
