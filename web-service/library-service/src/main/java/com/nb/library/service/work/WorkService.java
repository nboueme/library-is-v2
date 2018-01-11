package com.nb.library.service.work;

import com.nb.library.entity.Work;
import com.nb.library.repository.contract.WorkDaoContract;
import com.nb.library.service.AbstractService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(name = "WorkClient", serviceName = "WorkService", portName = "WorkPort", targetNamespace = "work.client.library.nb.com")
public class WorkService extends AbstractService {

    private WorkDaoContract contract = getDaoFactory().getWorkDao();

    @WebMethod
    public Work getWork(Work work) {
        return contract.getWork(work);
    }

    @WebMethod
    public List<Work> listWorks() {
        //List<Work> works = getDaoFactory().getWorkDao().listWorks();
        //return works.toArray(new Work[works.size()]);
        return contract.listWorks();
    }
}
