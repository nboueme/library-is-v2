package com.nb.library.batch;

import com.nb.library.business.ManagerFactory;
import com.nb.library.client.work.Work;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");
        ManagerFactory managerFactory = applicationContext.getBean("managerFactory", ManagerFactory.class);

        for (Work item : managerFactory.getWorkManager().listWorks()) {
            System.out.println(item.getTitle() + " de " + item.getAuthor().getFullName());
            System.out.println("Sommaire : " + item.getSummary());
            System.out.println("----------------------------------------------------------------------");
        }
    }
}
