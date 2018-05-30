package com.nb.library.service;

import com.nb.library.entity.borrowing.Book;
import com.nb.library.entity.borrowing.Borrowing;
import com.nb.library.entity.reservation.Reservation;
import com.nb.library.entity.reservation.UserAccount;
import com.nb.library.entity.reservation.Work;
import com.nb.library.repository.contract.BorrowingDaoContract;
import com.nb.library.repository.contract.ReservationDaoContract;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bootstrapContext.xml");
        ReservationDaoContract reservationDao = applicationContext.getBean("reservationDao", ReservationDaoContract.class);
        BorrowingDaoContract borrowingDao = applicationContext.getBean("borrowingDao", BorrowingDaoContract.class);

        /*Work work = new Work();
        work.setId(1);
        UserAccount user = new UserAccount();
        user.setId(12);

        for (Reservation reservation: reservationDao.findAllByWorkId(work)) {
            System.out.println(reservation.getUser().getId() + "\t\t" + reservation.getWork().getId() + "\t\t" + reservation.getReservationDate());
        }*/

        /*Reservation reservation = new Reservation();
        UserAccount user = new UserAccount();
        user.setId(13);
        reservation.setUser(user);
        Work work = new Work();
        work.setId(11);
        reservation.setWork(work);
        reservation.setReservationDate(new Date());

        reservationDao.save(reservation);

        //reservation.setId(9);
        //reservationDao.delete(reservation);*/

        //System.out.println("Nombre d'exemplaires réservés pour l'oeuvre : " + reservationDao.countAllByWorkId(1));

        /*Borrowing borrowing = new Borrowing();
        borrowing.setBookId(12);
        borrowing.setUserId(13);
        Book book = new Book();
        com.nb.library.entity.borrowing.Work work = new com.nb.library.entity.borrowing.Work();
        work.setId(11);
        book.setWork(work);
        borrowing.setBook(book);
        borrowing.setBorrowingDate(new Date());
        borrowing.setReturnDate(new Date());
        borrowing.setLoaned(true);
        borrowing.setExtended(false);

        borrowingDao.save(borrowing);*/

        for (Borrowing borrowing : borrowingDao.findAllByUserIsReminder()) {
            System.out.println(borrowing.getId() + " " + borrowing.getBook().getWork().getTitle());
        }
    }
}
