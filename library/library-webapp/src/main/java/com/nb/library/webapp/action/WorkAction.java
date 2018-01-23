package com.nb.library.webapp.action;

import com.nb.library.business.contract.WorkManager;
import com.nb.library.client.work.Work;
import com.nb.library.webapp.AbstractService;

import java.util.ArrayList;
import java.util.List;

public class WorkAction extends AbstractService {

    private WorkManager workManager = getManagerFactory().getWorkManager();
    private Work work;
    private List<Work> works;

    public String execute() {
        Work inputWork = new Work();
        inputWork.setId(4);
        work = workManager.getWork(inputWork);

        works = new ArrayList<>(0);
        works = workManager.listWorks();

        return SUCCESS;
    }

    public Work getWork() {
        return work;
    }

    public List<Work> getWorks() {
        return works;
    }
}
