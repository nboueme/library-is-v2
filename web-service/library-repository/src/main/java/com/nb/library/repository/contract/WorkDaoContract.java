package com.nb.library.repository.contract;

import com.nb.library.entity.Work;

import java.util.List;

public interface WorkDaoContract {
    Work getWork(Work work);

    List<Work> listWorks();
}
