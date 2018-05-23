package com.nb.library.repository.impl.data;

import com.nb.library.entity.reservation.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

    @Query("SELECT r FROM reservation r JOIN FETCH r.works w JOIN FETCH r.user u")
    Iterable<Reservation> findAll();
}
