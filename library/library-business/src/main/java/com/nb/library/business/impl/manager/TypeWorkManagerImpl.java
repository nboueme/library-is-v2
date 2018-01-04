package com.nb.library.business.impl.manager;

import com.nb.library.business.contract.manager.TypeWorkManager;
import com.nb.library.business.impl.AbstractManager;
import com.nb.library.model.entity.TypeWork;

import java.util.List;

public class TypeWorkManagerImpl extends AbstractManager implements TypeWorkManager {

    public TypeWork getTypeWork(TypeWork typeWork) {
        return getDaoFactory().getTypeWorkDao().getTypeWork(typeWork);
    }

    public List<TypeWork> listTypesWorks() {
        return getDaoFactory().getTypeWorkDao().listTypesWorks();
    }
}
