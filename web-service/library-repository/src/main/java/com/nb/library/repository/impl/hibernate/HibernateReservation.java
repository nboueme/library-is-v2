package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.reservation.Reservation;
import com.nb.library.repository.contract.ReservationDaoContract;
import com.nb.library.repository.impl.data.ReservationRepository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public class HibernateReservation implements ReservationDaoContract {

    @Resource
    private ReservationRepository reservationRepository;

    @Transactional
    public List<Reservation> findAll() {
        List<Reservation> reservations = new ArrayList<>(0);
        reservationRepository.findAll().iterator().forEachRemaining(reservations::add);
        return reservations;
    }
}
