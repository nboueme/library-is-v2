package com.nb.library.repository.contract;

import com.nb.library.entity.work.Work;

import java.util.List;

public interface WorkDaoContract {
    Work findById(Work work);

    List<Work> findAll();
}
