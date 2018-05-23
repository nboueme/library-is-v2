package com.nb.library.repository.impl.data;

import com.nb.library.entity.reservation.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

    @Query("SELECT r FROM reservation r JOIN FETCH r.work w JOIN FETCH r.user u WHERE w.id = :work_id ORDER BY r.reservationDate ASC")
    Iterable<Reservation> findAllByWorkId(@Param("work_id") Integer workId);

    @Query("SELECT r FROM reservation r JOIN FETCH r.work w JOIN FETCH r.user u WHERE u.id = :user_id ORDER BY r.reservationDate ASC")
    Iterable<Reservation> findAllByUserId(@Param("user_id") Integer userId);
}
