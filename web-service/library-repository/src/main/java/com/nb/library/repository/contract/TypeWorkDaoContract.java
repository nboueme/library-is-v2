package com.nb.library.repository.contract;

import com.nb.library.entity.type.TypeWork;

import java.util.List;

public interface TypeWorkDaoContract {
    TypeWork findById(TypeWork typeWork);

    List<TypeWork> findAll();
}
