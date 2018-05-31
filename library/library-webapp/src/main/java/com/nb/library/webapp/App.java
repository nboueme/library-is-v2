package com.nb.library.webapp;

import com.nb.library.business.contract.BorrowingManager;
import com.nb.library.business.contract.ReservationManager;
import com.nb.library.client.borrowing.Book;
import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.reservation.Reservation;
import com.nb.library.client.reservation.UserAccount;
import com.nb.library.client.reservation.Work;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.GregorianCalendar;

public class App {

    public static void main(String[] args) throws DatatypeConfigurationException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bootstrapContext.xml");
        ReservationManager reservationManager = applicationContext.getBean("reservationManager", ReservationManager.class);
        BorrowingManager borrowingManager = applicationContext.getBean("borrowingManager", BorrowingManager.class);

        /*Work work = new Work();
        work.setId(1);
        UserAccount user = new UserAccount();
        user.setId(12);

        System.out.println("User ID\tWork ID\tReservation date");
        for (Reservation reservation : reservationManager.listReservationsByWork(work)) {
            System.out.println(reservation.getUser().getId() + "\t\t" + reservation.getWork().getId() + "\t\t" + reservation.getReservationDate());
        }*/

        /*Reservation reservation = new Reservation();
        UserAccount user = new UserAccount();
        user.setId(12);
        reservation.setUser(user);
        Work work = new Work();
        work.setId(5);
        reservation.setWork(work);
        reservation.setReservationDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));

        //reservationManager.addReservation(reservation);

        reservation.setId(10);
        reservationManager.deleteReservation(reservation);*/

        //System.out.println("Nombre d'exemplaires réservés pour l'oeuvre : " + reservationManager.countReservationsByWork(1));

        //System.out.println("Taille : " + borrowingManager.listAllByUserIsReminder().size());

        Borrowing borrowing = new Borrowing();
        Book book = new Book();
        com.nb.library.client.borrowing.Work work = new com.nb.library.client.borrowing.Work();

        reservationManager.listAllReservations().iterator().forEachRemaining(reservation -> {
            //System.out.println(reservation.getWork().getTitle());
            work.setId(reservation.getWork().getId());
            book.setWork(work);
            borrowing.setBook(book);
            System.out.println(borrowingManager.listBorrowingsByWorkId(borrowing).size());
        });
    }
}
