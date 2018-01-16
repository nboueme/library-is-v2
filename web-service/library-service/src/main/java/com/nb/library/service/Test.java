package com.nb.library.service;

import com.nb.library.entity.work.Author;
import com.nb.library.entity.work.Work;
import com.nb.library.repository.contract.AuthorDaoContract;
import com.nb.library.repository.contract.WorkDaoContract;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");
        WorkDaoContract workContract = applicationContext.getBean("workDao", WorkDaoContract.class);

        for (Work work : workContract.findAll()) {
            System.out.println(work.getTitle() + " de type " + work.getTypeWork().getType());
            for (Author author : work.getAuthors()) {
                System.out.println("Author: " + author.getFirstName() + " " + author.getLastName());
            }
            System.out.println("----------------------------------------------------------------------");
        }

        /*System.out.println("----------------------------------------------------------------------");
        Work work = new Work();
        work.setId(4);
        Work workResult = contract.getWork(work);
        System.out.println("Id: " + workResult.getId());
        System.out.println("Title: " + workResult.getTitle());
        System.out.println("Date: " + workResult.getCreatedAt());
        System.out.println("Type: " + workResult.getTypeWork().getType());
        for (Author author : workResult.getAuthors()) {
            System.out.println("Author: " + author.getFirstName() + " " + author.getLastName());
        }*/

        AuthorDaoContract authorContract = applicationContext.getBean("authorDao", AuthorDaoContract.class);
        com.nb.library.entity.author.Author author = new com.nb.library.entity.author.Author();
        author.setId(2);
        com.nb.library.entity.author.Author authorResult = authorContract.findById(author);
        System.out.println("Les livres de " + authorResult.getFirstName() + " " + authorResult.getLastName() + " :");
        for (com.nb.library.entity.author.Work work : authorResult.getWorks()) {
            System.out.println("- " + work.getTitle());
        }
    }
}
