package com.nb.library.repository.impl.soap;

import com.nb.library.repository.contract.TypeWorkDaoContract;
import com.nb.library.client.type.TypeWork;
import com.nb.library.client.type.TypeWorkClient;
import com.nb.library.client.type.TypeWorkService;

import java.util.List;

public class SoapTypeWorkDao implements TypeWorkDaoContract {

    private TypeWorkService service = new TypeWorkService();
    private TypeWorkClient client = service.getTypeWorkPort();

    public TypeWork getTypeWork(TypeWork typeWork) {
        return client.getTypeWork(typeWork);
    }

    public List<TypeWork> listTypesWorks() {
        return client.listTypesWorks();
    }
}
