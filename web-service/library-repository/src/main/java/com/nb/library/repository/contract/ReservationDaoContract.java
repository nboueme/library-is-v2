package com.nb.library.repository.contract;

import com.nb.library.entity.reservation.Reservation;
import com.nb.library.entity.reservation.UserAccount;
import com.nb.library.entity.reservation.Work;

import java.util.List;

public interface ReservationDaoContract {
    List<Reservation> findAllByWorkId(Work work);
    List<Reservation> findAllByUserId(UserAccount user);
}
