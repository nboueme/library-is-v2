package com.nb.library.service;

import com.nb.library.entity.borrowing.Book;
import com.nb.library.entity.borrowing.Borrowing;
import com.nb.library.entity.borrowing.UserAccount;
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

        /*UserDaoContract userContract = applicationContext.getBean("userDao", UserDaoContract.class);
        UserAccount userInput = new UserAccount();
        userInput.setEmail("lotr_elrond@gmail.com");
        userInput.setPassword("lotr_elrond");
        UserAccount elrond = userContract.login(userInput);
        if (elrond != null) {
            System.out.println("Hello " + elrond.getFirstName());
            System.out.println("Your password is " + elrond.getPassword());
        }*/

        /*WorkDaoContract workContract = applicationContext.getBean("workDao", WorkDaoContract.class);
        for (Work work : workContract.findAll()) {
            System.out.println(work.getTitle() + " de type " + work.getTypeWork().getType());
            for (Author author : work.getAuthors()) {
                System.out.println("- " + author.getFirstName());
            }
        }*/

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

        /*EditorDaoContract editorContract = applicationContext.getBean("editorDao", EditorDaoContract.class);
        Editor editor = new Editor();
        editor.setId(1);
        Editor existingEditor = editorContract.findById(editor);
        System.out.println("Editor: " + existingEditor.getName());
        for (Book book : existingEditor.getBooks()) {
            System.out.println("Book title: " + book.getWork().getTitle());
        }*/

        //AuthorDaoContract authorContract = applicationContext.getBean("authorDao", AuthorDaoContract.class);
        /*for (Author author : authorContract.findAll()) {
            System.out.println("- " + author.getFirstName() + " " + author.getLastName());
            for (Work work : author.getWorks()) {
                System.out.println("-> " + work.getTitle());
            }
        }*/
        /*Author author = new Author();
        author.setId(2);
        Author existingAuthor = authorContract.findById(author);
        for (Work work : existingAuthor.getWorks()) {
            System.out.println("-> " + work.getTitle());
        }*/

        BorrowingDaoContract borrowingContract = applicationContext.getBean("borrowingDao", BorrowingDaoContract.class);
        Borrowing borrowing = new Borrowing();
        /*borrowing.setId(18);
        borrowing.setUserId(14);
        borrowing.setBookId("2290148172");
        borrowing.setBorrowingDate(new Date());
        borrowing.setReturnDate(new Date());
        borrowing.setLoaned(true);
        borrowing.setExtended(false);
        borrowingContract.update(borrowing);*/

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

        for (Borrowing item : borrowingContract.findAllByIsLoanedTrue()) {
            System.out.println(item.getBook().getWork().getTitle());
            System.out.println(item.getBorrowingDate());
            System.out.println(item.getReturnDate());
        }
    }
}
