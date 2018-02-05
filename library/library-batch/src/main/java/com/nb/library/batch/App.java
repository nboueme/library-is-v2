package com.nb.library.batch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

        //ManagerFactory managerFactory = applicationContext.getBean("managerFactory", ManagerFactory.class);
        // Add borrowing
        /*Borrowing borrowing = new Borrowing();
        borrowing.setUserId(14); // Elrond
        borrowing.setBookId(12);

        GregorianCalendar calendar = new GregorianCalendar();
        borrowing.setBorrowingDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
        calendar.add(Calendar.WEEK_OF_MONTH, 4);
        borrowing.setReturnDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
        borrowing.setLoaned(true);
        borrowing.setExtended(false);

        managerFactory.getBorrowingManager().addBorrowing(borrowing);*/
    }
}
