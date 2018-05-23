package com.nb.library.service;

import com.nb.library.entity.reservation.Reservation;
import com.nb.library.repository.contract.ReservationDaoContract;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bootstrapContext.xml");
        ReservationDaoContract reservationDao = applicationContext.getBean("reservationDao", ReservationDaoContract.class);

        System.out.println("User ID\tWork ID\tReservation date");
        for (Reservation reservation: reservationDao.findAll()) {
            System.out.println(reservation.getUser().getId() + "\t\t" + reservation.getWork().getId() + "\t\t" + reservation.getReservationDate());
        }
    }
}
