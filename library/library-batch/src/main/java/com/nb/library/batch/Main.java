package com.nb.library.batch;

import com.nb.library.business.contract.ManagerFactory;
import com.nb.library.service.work.Work;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/bootstrapContext.xml");
        ManagerFactory managerFactory = applicationContext.getBean("managerFactory", ManagerFactory.class);

        Work work = new Work();
        work.setId(18);
        Work getWork = managerFactory.getWorkManager().getWork(work);

        System.out.println(getWork.getTitle() + " de " + getWork.getAuthor().getFullName());
    }
}
