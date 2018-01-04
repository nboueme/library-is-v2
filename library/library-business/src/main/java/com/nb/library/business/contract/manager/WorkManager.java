package com.nb.library.business.contract.manager;

import com.nb.library.service.work.Work;

import java.util.List;

public interface WorkManager {
    Work getWork(Work work);

    List<Work> listWorks();
}
