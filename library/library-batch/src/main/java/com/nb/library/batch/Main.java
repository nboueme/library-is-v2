package com.nb.library.batch;

import com.nb.library.business.ManagerFactory;
import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.editor.Editor;
import com.nb.library.client.type.TypeWork;
import com.nb.library.client.work.Author;
import com.nb.library.client.work.Book;
import com.nb.library.client.work.Work;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");
        ManagerFactory managerFactory = applicationContext.getBean("managerFactory", ManagerFactory.class);

        /*Work work = new Work();
        work.setId(4);
        System.out.println(managerFactory.getWorkManager().getWork(work).getTitle());
        for (Author author : managerFactory.getWorkManager().getWork(work).getAuthors()) {
            System.out.println("par " + author.getFirstName() + " " + author.getLastName());
        }*/
        /*for (Work work : managerFactory.getWorkManager().listWorks()) {
            System.out.println(work.getTitle() + " de type " + work.getTypeWork().getType());
            for (Author author : work.getAuthors()) {
                System.out.println("par " + author.getFirstName() + " " + author.getLastName());
            }
            System.out.println("----------------------------------------------------------------------");
        }*/

        // list borrowing
        /*Borrowing borrowing = new Borrowing();
        borrowing.setId(1);
        borrowing.setUserId(14);
        //System.out.println(managerFactory.getBorrowingManager().getBorrowing(borrowing).getReturnDate());
        for (Borrowing item : managerFactory.getBorrowingManager().listBorrowing(borrowing)) {
            System.out.println(item.getReturnDate());
        }*/

        /*Editor editor = new Editor();
        editor.setId(1);
        System.out.println(managerFactory.getEditorManager().getEditor(editor).getName());
        for (Editor item : managerFactory.getEditorManager().listEditors()) {
            System.out.println("- " + item.getName());
            for (com.nb.library.client.editor.Book book : item.getBooks()) {
                System.out.println(book.getWork().getTitle());
            }
        }*/

        for (TypeWork item : managerFactory.getTypeWorkManager().listTypesWorks()) {
            System.out.println("- " + item.getType());
            for (com.nb.library.client.type.Work work : item.getWorks()) {
                System.out.println(work.getTitle());
            }
        }
    }
}
