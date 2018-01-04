package com.nb.library.consumer.contract.dao;

import com.nb.library.service.work.Work;

import java.util.List;

public interface WorkDao {
    Work getWork(Work work);

    List<Work> listWorks();
}
