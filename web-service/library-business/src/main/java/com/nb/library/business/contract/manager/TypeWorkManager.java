package com.nb.library.business.contract.manager;

import com.nb.library.model.entity.TypeWork;

import java.util.List;

public interface TypeWorkManager {
    TypeWork getTypeWork(TypeWork typeWork);

    List<TypeWork> listTypesWorks();
}
