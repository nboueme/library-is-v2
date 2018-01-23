package com.nb.library.webapp.action;

import com.nb.library.webapp.AbstractService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@Namespace("/")
@ResultPath(value = "/")
public class HomeAction extends AbstractService {

    @Action(value = "home", results = {
            @Result(name = "success", location = "WEB-INF/index.jsp")
    })
    public String execute() {
        return SUCCESS;
    }
}
