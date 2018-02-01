package com.nb.library.batch;

import com.nb.library.business.ManagerFactory;
import com.nb.library.client.borrowing.Borrowing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) throws DatatypeConfigurationException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");
        ManagerFactory managerFactory = applicationContext.getBean("managerFactory", ManagerFactory.class);

        // Add borrowing
        Borrowing borrowing = new Borrowing();
        borrowing.setUserId(14); // Elrond
        borrowing.setBookId(12);

        GregorianCalendar calendar = new GregorianCalendar();
        borrowing.setBorrowingDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
        calendar.add(Calendar.WEEK_OF_MONTH, 4);
        borrowing.setReturnDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
        borrowing.setLoaned(true);
        borrowing.setExtended(false);

        managerFactory.getBorrowingManager().addBorrowing(borrowing);
    }
}
