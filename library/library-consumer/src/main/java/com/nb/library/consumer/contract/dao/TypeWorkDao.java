package com.nb.library.consumer.contract.dao;

import com.nb.library.model.entity.type.TypeWork;

import java.util.List;

public interface TypeWorkDao {
    TypeWork getTypeWork(TypeWork typeWork);

    List<TypeWork> listTypesWorks();
}
