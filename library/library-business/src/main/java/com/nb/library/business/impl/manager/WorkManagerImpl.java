package com.nb.library.business.impl.manager;

import com.nb.library.business.contract.manager.WorkManager;
import com.nb.library.business.impl.AbstractManager;
import com.nb.library.service.work.Work;

import java.util.List;

public class WorkManagerImpl extends AbstractManager implements WorkManager {

    public Work getWork(Work work) {
        return getDaoFactory().getWorkDao().getWork(work);
    }

    public List<Work> listWorks() {
        return getDaoFactory().getWorkDao().listWorks();
    }
}
