package com.nb.library.consumer.impl.dao;

import com.nb.library.consumer.contract.dao.TypeWorkDao;
import com.nb.library.model.entity.type.TypeWork;
import com.nb.library.model.entity.type.TypeWorkClient;
import com.nb.library.model.entity.type.TypeWorkService;

import java.util.List;

public class TypeWorkDaoImpl implements TypeWorkDao {

    public TypeWork getTypeWork(TypeWork typeWork) {
        TypeWorkService service = new TypeWorkService();
        TypeWorkClient client = service.getTypeWorkPort();
        return client.getTypeWork(typeWork);
    }

    public List<TypeWork> listTypesWorks() {
        TypeWorkService service = new TypeWorkService();
        TypeWorkClient client = service.getTypeWorkPort();
        return client.listTypesWorks();
    }
}
