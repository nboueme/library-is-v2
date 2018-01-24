package com.nb.library.webapp.action.work;

import com.nb.library.client.work.Work;
import com.nb.library.webapp.AbstractService;
import com.opensymphony.xwork2.ActionContext;

public class WorkItemAction extends AbstractService {

    private Work work;

    public String execute() {
        String workId = ActionContext.getContext().getParameters().get("work.id").toString();
        Work inputWork = new Work();
        inputWork.setId(Integer.parseInt(workId));

        work = getManagerFactory().getWorkManager().getWork(inputWork);

        return SUCCESS;
    }

    public Work getWork() {
        return work;
    }
}
