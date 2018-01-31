package com.nb.library.service;

import com.nb.library.entity.archive.BorrowingArchive;
import com.nb.library.entity.borrowing.Borrowing;
import com.nb.library.entity.work.Work;
import com.nb.library.repository.contract.AuthorDaoContract;
import com.nb.library.repository.contract.BorrowingDaoContract;
import com.nb.library.repository.contract.EditorDaoContract;
import com.nb.library.repository.contract.WorkDaoContract;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

        BorrowingDaoContract borrowingContract = applicationContext.getBean("borrowingDao", BorrowingDaoContract.class);
        /*Borrowing borrowing = new Borrowing();
        //borrowing.setId(4);
        borrowing.setBookId(12);
        borrowing.setUserId(14);
        borrowing.setBorrowingDate(new Date());
        borrowing.setReturnDate(new Date());
        borrowing.setLoaned(true);
        borrowing.setExtended(false);
        borrowingContract.save(borrowing);*/

        BorrowingArchive borrowingArchive = new BorrowingArchive();
        borrowingArchive.setUserId(14);
        for (BorrowingArchive archive : borrowingContract.findArchivesByUserId(borrowingArchive)) {
            System.out.println(archive.getBook().getWork().getTitle());
            System.out.println(archive.getBorrowingDate());
            System.out.println(archive.getReturnDate());
        }

        /*borrowing.setUserId(14);
        for (Borrowing item : borrowingContract.findAllByUserId(borrowing)) {
            System.out.println(item.getUser().getFirstName() + " " + item.getUser().getLastName() + " for ISBN "  + item.getBookId());
            System.out.println("Book: " + item.getBook().getWork().getTitle());
            System.out.println("Borrowing date: " + item.getBorrowingDate());
            System.out.println("Return date: " + item.getReturnDate());
            System.out.println("--------------------------------------------------");
        }*/

        /*borrowing.setId(5);
        borrowing.setUserId(14);
        Borrowing existingBorrowing = borrowingContract.findByIdAndUserId(borrowing);
        System.out.println(existingBorrowing.getUser().getFirstName() + " " + existingBorrowing.getUser().getLastName());
        System.out.println(existingBorrowing.getBook().getWork().getTitle());
        System.out.println("Borrowing date: " + existingBorrowing.getBorrowingDate());
        System.out.println("Return date: " + existingBorrowing.getReturnDate());*/

        /*for (Borrowing item : borrowingContract.findAllByIsLoanedTrue()) {
            System.out.println(item.getBook().getWork().getTitle());
            System.out.println(item.getBorrowingDate());
            System.out.println(item.getReturnDate());
        }*/

        /*WorkDaoContract workContract = applicationContext.getBean("workDao", WorkDaoContract.class);
        String word = "française";
        for (Work work : workContract.findByWord(word)) {
            System.out.println(work.getTitle());
        }*/
    }
}
