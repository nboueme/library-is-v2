package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.work.Work;
import com.nb.library.repository.AbstractDao;
import com.nb.library.repository.contract.WorkDaoContract;
import com.nb.library.repository.impl.data.WorkRepository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HibernateWork extends AbstractDao implements WorkDaoContract {

    @Resource
    private WorkRepository workRepository;

    @Transactional
    public Work findById(Work work) {
        Optional<Work> existingWork = workRepository.findWorkById(work.getId());
        return existingWork.orElse(null);
    }

    @Transactional
    public List<Work> findAll() {
        List<Work> works = new ArrayList<>(0);
        workRepository.findAllWorks().iterator().forEachRemaining(works::add);
        return works;
    }
}
