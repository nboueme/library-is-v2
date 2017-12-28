package com.nb.library.consumer.contract.dao;

import com.nb.library.model.entity.Work;

import java.util.List;

public interface WorkDao {
    Work getWork(Work work);

    List<Work> listWorks();
}
