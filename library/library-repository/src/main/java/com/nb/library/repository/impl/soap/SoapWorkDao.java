package com.nb.library.repository.impl.soap;

import com.nb.library.repository.contract.WorkDaoContract;
import com.nb.library.client.work.Work;
import com.nb.library.client.work.WorkClient;
import com.nb.library.client.work.WorkService;

import java.util.List;

public class SoapWorkDao implements WorkDaoContract {

    private WorkService service = new WorkService();
    private WorkClient client = service.getWorkPort();

    public Work getWork(Work work) {
        return client.getWork(work);
    }

    public List<Work> listWorks() {
        return client.listWorks();
    }
}
