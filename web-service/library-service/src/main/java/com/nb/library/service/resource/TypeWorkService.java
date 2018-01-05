package com.nb.library.service.resource;

import com.nb.library.model.entity.TypeWork;
import com.nb.library.service.AbstractService;

import javax.jws.WebService;
import java.util.List;

@WebService(name = "TypeWorkClient", serviceName = "TypeWorkService", portName = "TypeWorkPort", targetNamespace = "type.entity.model.library.nb.com")
public class TypeWorkService extends AbstractService {

    public TypeWork getTypeWork(TypeWork typeWork) {
        return getManagerFactory().getTypeWorkManager().getTypeWork(typeWork);
    }

    public List<TypeWork> listTypesWorks() {
        return getManagerFactory().getTypeWorkManager().listTypesWorks();
    }
}
