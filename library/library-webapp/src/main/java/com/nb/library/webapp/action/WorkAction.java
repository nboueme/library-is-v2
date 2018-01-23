package com.nb.library.webapp.action;

import com.nb.library.business.contract.WorkManager;
import com.nb.library.client.work.Work;
import com.nb.library.webapp.AbstractService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import java.util.ArrayList;
import java.util.List;

@Namespace("/")
@ResultPath(value = "/")
public class WorkAction extends AbstractService {

    private WorkManager workManager = getManagerFactory().getWorkManager();
    private Work work;
    private List<Work> works;

    @Action(value = "work", results = {
            @Result(name = "success", location = "WEB-INF/work.jsp")
    })
    public String execute() {
        Work inputWork = new Work();
        inputWork.setId(4);
        work = workManager.getWork(inputWork);

        works = new ArrayList<>(0);
        works = workManager.listWorks();

        return SUCCESS;
    }

    public Work getWork() {
        return work;
    }

    public List<Work> getWorks() {
        return works;
    }
}
