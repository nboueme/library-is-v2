package com.nb.library.webapp.action;

import com.nb.library.business.contract.WorkManager;
import com.nb.library.client.work.Work;
import com.nb.library.webapp.AbstractService;

public class WorkAction extends AbstractService {

    private WorkManager contract = getManagerFactory().getWorkManager();

    public Work getWork() {
        Work work = new Work();
        work.setId(7);
        //return contract.listWorks().get(2);
        return contract.getWork(work);
    }
}
