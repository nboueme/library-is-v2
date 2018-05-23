package com.nb.library.entity;

import com.nb.library.entity.reservation.UserAccount;
import com.nb.library.entity.reservation.Work;

import java.util.Date;

public interface ReservationInterface {
    UserAccount getUser();

    void setUser(UserAccount user);

    Work getWork();

    void setWork(Work work);

    Date getReservationDate();

    void setReservationDate(Date reservationDate);
}
