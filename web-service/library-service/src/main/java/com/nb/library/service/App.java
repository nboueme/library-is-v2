package com.nb.library.service;

import com.nb.library.entity.reservation.Reservation;
import com.nb.library.entity.reservation.UserAccount;
import com.nb.library.entity.reservation.Work;
import com.nb.library.repository.contract.ReservationDaoContract;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bootstrapContext.xml");
        ReservationDaoContract reservationDao = applicationContext.getBean("reservationDao", ReservationDaoContract.class);

        /*Work work = new Work();
        work.setId(1);
        UserAccount user = new UserAccount();
        user.setId(12);

        for (Reservation reservation: reservationDao.findAllByWorkId(work)) {
            System.out.println(reservation.getUser().getId() + "\t\t" + reservation.getWork().getId() + "\t\t" + reservation.getReservationDate());
        }*/

        Reservation reservation = new Reservation();
        UserAccount user = new UserAccount();
        user.setId(12);
        reservation.setUser(user);
        Work work = new Work();
        work.setId(5);
        reservation.setWork(work);
        reservation.setReservationDate(new Date());

        //reservationDao.save(reservation);

        reservation.setId(9);
        reservationDao.delete(reservation);
    }
}
