package com.nb.library.service;

import com.nb.library.entity.reservation.Reservation;
import com.nb.library.entity.reservation.UserAccount;
import com.nb.library.entity.reservation.Work;
import com.nb.library.repository.contract.ReservationDaoContract;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bootstrapContext.xml");
        ReservationDaoContract reservationDao = applicationContext.getBean("reservationDao", ReservationDaoContract.class);

        Work work = new Work();
        work.setId(1);
        UserAccount user = new UserAccount();
        user.setId(12);

        for (Reservation reservation: reservationDao.findAllByUserId(user)) {
            System.out.println(reservation.getUser().getId() + "\t\t" + reservation.getWorks().iterator().next().getId() + "\t\t" + reservation.getReservationDate());
        }
    }
}
