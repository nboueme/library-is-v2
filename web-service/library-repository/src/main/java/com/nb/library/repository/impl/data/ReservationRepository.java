package com.nb.library.repository.impl.data;

import com.nb.library.entity.reservation.Reservation;
import com.nb.library.entity.reservation.ReservationId;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, ReservationId> {
    Iterable<Reservation> findAll();
}
