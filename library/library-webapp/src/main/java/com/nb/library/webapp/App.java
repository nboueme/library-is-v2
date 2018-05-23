package com.nb.library.webapp;

import com.nb.library.business.contract.ReservationManager;
import com.nb.library.client.reservation.Reservation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bootstrapContext.xml");
        ReservationManager reservationManager = applicationContext.getBean("reservationManager", ReservationManager.class);

        System.out.println("User ID\tWork ID\tReservation date");
        for (Reservation reservation : reservationManager.listReservations()) {
            System.out.println(reservation.getUser().getId() + "\t\t" + reservation.getWorks().iterator().next().getId() + "\t\t" + reservation.getReservationDate());
        }
    }
}
