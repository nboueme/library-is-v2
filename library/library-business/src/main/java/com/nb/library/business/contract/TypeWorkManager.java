package com.nb.library.business.contract;

import com.nb.library.client.type.TypeWork;

import java.util.List;

public interface TypeWorkManager {
    TypeWork getTypeWork(TypeWork typeWork);

    List<TypeWork> listTypesWorks();
}
