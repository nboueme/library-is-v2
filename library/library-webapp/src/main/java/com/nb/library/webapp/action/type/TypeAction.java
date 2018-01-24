package com.nb.library.webapp.action.type;

import com.nb.library.client.type.TypeWork;
import com.nb.library.webapp.AbstractService;

import java.util.List;

public class TypeAction extends AbstractService {

    private List<TypeWork> types;

    public String execute() {
        types = getManagerFactory().getTypeWorkManager().listTypesWorks();

        return SUCCESS;
    }

    public List<TypeWork> getTypes() {
        return types;
    }
}
