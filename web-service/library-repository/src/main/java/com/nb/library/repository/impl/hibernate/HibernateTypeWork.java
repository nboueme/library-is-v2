package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.type.TypeWork;
import com.nb.library.repository.contract.TypeWorkDaoContract;
import com.nb.library.repository.impl.data.TypeWorkRepository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HibernateTypeWork implements TypeWorkDaoContract {

    @Resource
    private TypeWorkRepository typeWorkRepository;

    @Transactional
    public TypeWork findById(TypeWork typeWork) {
        Optional<TypeWork> existingTypeWork = typeWorkRepository.findById(typeWork.getId());
        return existingTypeWork.orElse(null);
    }

    @Transactional
    public List<TypeWork> findAll() {
        List<TypeWork> typeWorks = new ArrayList<>(0);
        typeWorkRepository.findAll().iterator().forEachRemaining(typeWorks::add);
        return typeWorks;
    }
}
