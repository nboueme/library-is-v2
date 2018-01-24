package com.nb.library.webapp.action.type;

import com.nb.library.client.type.TypeWork;
import com.nb.library.webapp.AbstractService;
import com.opensymphony.xwork2.ActionContext;

public class TypeItemAction extends AbstractService {

    private TypeWork typeWork;

    public String execute() {
        String typeId = ActionContext.getContext().getParameters().get("typeWork.id").toString();
        TypeWork inputType = new TypeWork();
        inputType.setId(Integer.parseInt(typeId));

        typeWork = getManagerFactory().getTypeWorkManager().getTypeWork(inputType);

        return SUCCESS;
    }

    public TypeWork getTypeWork() {
        return typeWork;
    }
}
