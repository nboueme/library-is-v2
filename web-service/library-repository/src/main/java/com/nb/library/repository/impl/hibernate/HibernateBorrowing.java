package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.borrowing.Borrowing;
import com.nb.library.entity.borrowing.UserAccount;
import com.nb.library.repository.AbstractDao;
import com.nb.library.repository.contract.BorrowingDaoContract;
import com.nb.library.repository.impl.data.BorrowingRepository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HibernateBorrowing extends AbstractDao implements BorrowingDaoContract {

    @Resource
    private BorrowingRepository borrowingRepository;

    @Transactional
    public void save(Borrowing borrowing) {
        borrowingRepository.save(borrowing);
    }

    @Transactional
    public Borrowing findByIdAndUserId(Borrowing borrowing) {
        Optional<Borrowing> existingBorrowing = borrowingRepository.findByIdAndUserId(borrowing.getId(), borrowing.getUser().getId());
        return existingBorrowing.orElse(null);
    }

    @Transactional
    public List<Borrowing> findAllByUserId(UserAccount user) {
        List<Borrowing> borrowings = new ArrayList<>(0);
        borrowingRepository.findAllByUserId(user.getId()).iterator().forEachRemaining(borrowings::add);
        return borrowings;
    }

    @Transactional
    public void merge(Borrowing borrowing) {
        EntityManager entityManager = getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(borrowing);
        entityManager.getTransaction().commit();

        //borrowingRepository.save(borrowing);
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
        borrowingRepository.deleteById(borrowing.getId());
    }

    @Transactional
    public List<Borrowing> getLoanPeriodsExceeded(Borrowing borrowing) {
        List<Borrowing> borrowings = new ArrayList<>(0);
        borrowingRepository.findAllByReturnDateBeforeAndIsLoanedTrue(borrowing.getReturnDate()).iterator().forEachRemaining(borrowings::add);
        return borrowings;
    }
}
