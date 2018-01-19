package com.nb.library.service;

import com.nb.library.entity.borrowing.Borrowing;
import com.nb.library.entity.work.Author;
import com.nb.library.entity.work.Book;
import com.nb.library.entity.work.Work;
import com.nb.library.repository.contract.BorrowingDaoContract;
import com.nb.library.repository.contract.WorkDaoContract;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");

        /*UserDaoContract userContract = applicationContext.getBean("userDao", UserDaoContract.class);
        UserAccount userInput = new UserAccount();
        userInput.setEmail("lotr_elrond@gmail.com");
        userInput.setPassword("lotr_elrond");
        UserAccount elrond = userContract.login(userInput);
        if (elrond != null) {
            System.out.println("Hello " + elrond.getFirstName());
            System.out.println("Your password is " + elrond.getPassword());
        }*/

        WorkDaoContract workContract = applicationContext.getBean("workDao", WorkDaoContract.class);
        for (Work work : workContract.findAll()) {
            System.out.println(work.getTitle() + " de type " + work.getTypeWork().getType());
            for (Author author : work.getAuthors()) {
                System.out.println("- " + author.getFirstName());
            }
        }
        /*Work work = new Work();
        work.setId(2);
        Work workResult = workContract.findById(work);
        System.out.println(workResult.getTitle() + " de type " + workResult.getTypeWork().getType());
        for (Author author : workResult.getAuthors()) System.out.println("de " + author.getFirstName() + " " + author.getLastName());
        for (Book book : workResult.getBooks()) System.out.println("ISBN: " + book.getISBN());*/

        /*BorrowingDaoContract borrowingContract = applicationContext.getBean("borrowingDao", BorrowingDaoContract.class);
        Borrowing borrowing = new Borrowing();
        borrowing.setId(10);
        borrowingContract.delete(borrowing);*/
    }
}
