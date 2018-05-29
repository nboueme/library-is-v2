package com.nb.library.entity;

import java.util.Date;

public interface ReservationInterface {
    Integer getId();

    void setId(Integer id);

    Date getReservationDate();

    void setReservationDate(Date notificationDate);

    Date getNotificationDate();

    void setNotificationDate(Date notificationDate);
}
