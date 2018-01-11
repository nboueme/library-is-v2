package com.nb.library.repository.contract;

import com.nb.library.entity.TypeWork;

import java.util.List;

public interface TypeWorkDaoContract {
    TypeWork getTypeWork(TypeWork typeWork);

    List<TypeWork> listTypesWorks();
}
