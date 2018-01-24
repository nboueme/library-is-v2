package com.nb.library.webapp.action.work;

import com.nb.library.client.work.Work;
import com.nb.library.webapp.AbstractService;

import java.util.List;

public class WorkAction extends AbstractService {

    private List<Work> works;

    public String execute() {
        works = getManagerFactory().getWorkManager().listWorks();

        return SUCCESS;
    }

    public List<Work> getWorks() {
        return works;
    }
}
