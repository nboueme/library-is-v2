package com.nb.library.webapp.action;

import com.nb.library.model.entity.work.Work;
import com.nb.library.webapp.AbstractService;

public class WorkAction extends AbstractService {

    public Work getWork() {
        Work work = new Work();
        work.setId(9);
        return getManagerFactory().getWorkManager().getWork(work);
    }
}
