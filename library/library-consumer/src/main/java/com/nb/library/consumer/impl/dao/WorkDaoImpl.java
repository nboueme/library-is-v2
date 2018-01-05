package com.nb.library.consumer.impl.dao;

import com.nb.library.consumer.contract.dao.WorkDao;
import com.nb.library.model.entity.work.Work;
import com.nb.library.model.entity.work.WorkClient;
import com.nb.library.model.entity.work.WorkService;

import java.util.List;

public class WorkDaoImpl implements WorkDao {

    public Work getWork(Work work) {
        WorkService service = new WorkService();
        WorkClient client = service.getWorkPort();
        return client.getWork(work);
    }

    public List<Work> listWorks() {
        WorkService service = new WorkService();
        WorkClient client = service.getWorkPort();
        return client.listWorks();
    }
}
