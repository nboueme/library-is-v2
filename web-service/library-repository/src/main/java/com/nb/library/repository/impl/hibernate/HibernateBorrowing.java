package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.borrowing.Borrowing;
import com.nb.library.repository.contract.BorrowingDaoContract;
import com.nb.library.repository.impl.data.BorrowingRepository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class HibernateBorrowing implements BorrowingDaoContract {

    @Resource
    private BorrowingRepository borrowingRepository;

    @Transactional
    public void save(Borrowing borrowing) {
        borrowingRepository.save(borrowing);
    }

    @Transactional
    public Borrowing findByIdAndUserId(Borrowing borrowing) {
        Optional<Borrowing> existingBorrowing = borrowingRepository.findByIdAndUserId(borrowing.getId(), borrowing.getUserId());
        return existingBorrowing.orElse(null);
    }

    @Transactional
    public List<Borrowing> findAllByUserId(Borrowing borrowing) {
        List<Borrowing> borrowings = new ArrayList<>(0);
        borrowingRepository.findAllByUserId(borrowing.getUserId()).iterator().forEachRemaining(borrowings::add);
        return borrowings;
    }

    @Transactional
    public List<Borrowing> findAllByIsLoanedTrue() {
        List<Borrowing> borrowings = new ArrayList<>(0);
        borrowingRepository.findAllByIsLoanedTrue().iterator().forEachRemaining(borrowings::add);
        return borrowings;
    }

    @Transactional
    public void update(Borrowing borrowing) {
        Optional<Borrowing> optionalBorrowing = borrowingRepository.findByIdAndUserId(borrowing.getId(), borrowing.getUserId());
        if (optionalBorrowing.isPresent()) {
            optionalBorrowing.get().setReturnDate(borrowing.getReturnDate());
            optionalBorrowing.get().setLoaned(borrowing.getLoaned());
            optionalBorrowing.get().setExtended(borrowing.getExtended());
        }
    }

    @Transactional
    public void delete(Borrowing borrowing) {
        /*EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        Borrowing existingBorrowing = entityManager.getReference(Borrowing.class, borrowing.getId());
        if (existingBorrowing != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(existingBorrowing);
            entityManager.getTransaction().commit();
        }*/
        borrowingRepository.deleteByIdAndUserId(borrowing.getId(), borrowing.getUserId());
    }
}
