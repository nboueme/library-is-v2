package com.nb.library.business.impl;

import com.nb.library.business.contract.TypeWorkManager;
import com.nb.library.business.AbstractManager;
import com.nb.library.client.type.TypeWork;

import java.util.List;

public class TypeWorkManagerImpl extends AbstractManager implements TypeWorkManager {

    public TypeWork getTypeWork(TypeWork typeWork) {
        return getDaoFactory().getTypeWorkDao().getTypeWork(typeWork);
    }

    public List<TypeWork> listTypesWorks() {
        return getDaoFactory().getTypeWorkDao().listTypesWorks();
    }
}
