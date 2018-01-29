package com.nb.library.repository.contract;

import com.nb.library.client.work.Work;

import java.util.List;

public interface WorkDaoContract {
    Work getWork(Work work);

    List<Work> listWorks();

    List<Work> listWorksByWord(String word);
}
