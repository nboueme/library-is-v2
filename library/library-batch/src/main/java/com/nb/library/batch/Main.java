package com.nb.library.batch;

import com.nb.library.business.ManagerFactory;
import com.nb.library.client.work.Author;
import com.nb.library.client.work.Work;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");
        ManagerFactory managerFactory = applicationContext.getBean("managerFactory", ManagerFactory.class);

        /*Work work = new Work();
        work.setId(4);
        System.out.println(managerFactory.getWorkManager().getWork(work).getAuthors().get(0));*/
        /*for (Author author : managerFactory.getWorkManager().getWork(work).getAuthors()) {
            System.out.println("par " + author.getFirstName() + " " + author.getLastName());
        }*/
        for (Work work : managerFactory.getWorkManager().listWorks()) {
            System.out.println(work.getTitle() + " de type " + "work.getTypeWork().getType()");
            for (Author author : work.getAuthors()) {
                System.out.println("par " + author.getFirstName() + " " + author.getLastName());
            }
            System.out.println("----------------------------------------------------------------------");
        }

        com.nb.library.client.author.Author author = new com.nb.library.client.author.Author();
        author.setId(2);
        //System.out.println(managerFactory.getAuthorManager().getAuthor(author));
        for (com.nb.library.client.author.Author item : managerFactory.getAuthorManager().listAuthors()) {
            System.out.println(item.getFirstName() + " " + item.getLastName());
            for (com.nb.library.client.author.Work item2 : item.getWorks()) {
                System.out.println("- " + item2.getTitle());
            }
        }
    }
}
