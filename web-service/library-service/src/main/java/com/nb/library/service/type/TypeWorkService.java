package com.nb.library.service.type;

import com.nb.library.entity.type.TypeWork;
import com.nb.library.repository.contract.TypeWorkDaoContract;
import com.nb.library.service.AbstractService;

import javax.jws.WebService;
import java.util.List;

@WebService(name = "TypeWorkClient", serviceName = "TypeWorkService", portName = "TypeWorkPort", targetNamespace = "type.client.library.nb.com")
public class TypeWorkService extends AbstractService {

    private TypeWorkDaoContract contract = getDaoFactory().getTypeWorkDao();

    public TypeWork getTypeWork(TypeWork typeWork) {
        return contract.findById(typeWork);
    }

    public List<TypeWork> listTypesWorks() {
        return contract.findAll();
    }
}
