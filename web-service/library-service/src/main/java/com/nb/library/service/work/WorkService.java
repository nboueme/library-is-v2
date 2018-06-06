package com.nb.library.service.work;

import com.nb.library.entity.work.Work;
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
        return contract.findById(work);
    }

    @WebMethod
    public List<Work> listWorks() {
        return contract.findAll();
    }

    @WebMethod
    public List<Work> listWorksByWord(String word) {
        return contract.findByWord(word);
    }
}
