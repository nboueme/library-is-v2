package com.nb.library.webapp.action.work;

import com.nb.library.client.work.Work;
import com.nb.library.webapp.AbstractService;

import java.util.List;

public class SearchAction extends AbstractService {

    private List<Work> works;
    private String search;

    public String execute() {
        works = getManagerFactory().getWorkManager().listWorksByWord(search);

        return SUCCESS;
    }

    public List<Work> getWorks() {
        return works;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
