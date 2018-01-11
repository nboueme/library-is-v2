package com.nb.library.business.impl;

import com.nb.library.business.contract.WorkManager;
import com.nb.library.business.AbstractManager;
import com.nb.library.client.work.Work;

import java.util.List;

public class WorkManagerImpl extends AbstractManager implements WorkManager {

    public Work getWork(Work work) {
        return getDaoFactory().getWorkDao().getWork(work);
    }

    public List<Work> listWorks() {
        return getDaoFactory().getWorkDao().listWorks();
    }
}
