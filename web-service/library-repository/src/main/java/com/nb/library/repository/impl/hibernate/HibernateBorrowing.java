package com.nb.library.repository.impl.hibernate;

import com.nb.library.entity.archive.BorrowingArchive;
import com.nb.library.entity.borrowing.Borrowing;
import com.nb.library.repository.contract.BorrowingDaoContract;
import com.nb.library.repository.impl.data.BorrowingArchiveRepository;
import com.nb.library.repository.impl.data.BorrowingRepository;
import com.nb.library.repository.impl.data.ReservationRepository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class HibernateBorrowing implements BorrowingDaoContract {

    @Resource
    private BorrowingRepository borrowingRepository;

    @Resource
    private BorrowingArchiveRepository borrowingArchiveRepository;

    @Resource
    private ReservationRepository reservationRepository;

    @Transactional
    public void save(Borrowing borrowing) {
        /* SI un emprunt n'existe pas dans la table borrowing avec pour book_id passé via l'objet borrowing
         * ALORS on sauvegarde le nouvel emprunt dans la table borrowing
         */
        Optional<Borrowing> existingBorrowing = borrowingRepository.findByBookId(borrowing.getBookId());
        if (!existingBorrowing.isPresent()) {
            reservationRepository.deleteByUserIdAndWorkId(borrowing.getUserId(), borrowing.getBook().getWork().getId());
            borrowing.setBook(null);
            borrowingRepository.save(borrowing);
        }
    }

    @Transactional
    public Borrowing findByIdAndUserId(Borrowing borrowing) {
        Optional<Borrowing> existingBorrowing = borrowingRepository.findByIdAndUserId(borrowing.getId(), borrowing.getUserId());
        return existingBorrowing.orElse(null);
    }

    @Transactional
    public List<Borrowing> findBorrowingsByUserId(Borrowing borrowing) {
        List<Borrowing> borrowings = new ArrayList<>(0);
        borrowingRepository.findAllByUserId(borrowing.getUserId()).iterator().forEachRemaining(borrowings::add);
        return borrowings;
    }

    @Transactional
    public List<BorrowingArchive> findArchivesByUserId(BorrowingArchive archive) {
        List<BorrowingArchive> archives = new ArrayList<>(0);
        borrowingArchiveRepository.findAllByUserId(archive.getUserId()).iterator().forEachRemaining(archives::add);
        return archives;
    }

    @Transactional
    public List<Borrowing> findAllByReturnDateBeforeCurrent() {
        List<Borrowing> borrowings = new ArrayList<>(0);
        borrowingRepository.findAllByReturnDateBeforeCurrent().iterator().forEachRemaining(borrowings::add);
        return borrowings;
    }

    @Transactional
    public Borrowing findByBookId(Borrowing borrowing) {
        Optional<Borrowing> existingBorrowing = borrowingRepository.findByBookId(borrowing.getBookId());
        return existingBorrowing.orElse(null);
    }

    @Transactional
    public void update(Borrowing borrowing) {
        /* SI un emprunt existe dans la table borrowing avec pour id et user_id passé via l'objet borrowing
         * ALORS
         *   SI l'emprunt reçu en paramètre n'a pas le status "emprunté" (ni null, ni true)
         *   ALORS on sauvegarde  l'emprunt dans la table borrowing_archive et on supprime l'emprunt de la table borrowing
         *   SINON
         *     SI l'emprunt n'a jamais été prolongé et que la date de retour est supérieure à la date courrante
         *     ALORS on met à jour l'emprunt dans la table borrowing
         */
        Optional<Borrowing> optionalBorrowing = borrowingRepository.findByIdAndUserId(borrowing.getId(), borrowing.getUserId());
        if (optionalBorrowing.isPresent()) {
            if (borrowing.getLoaned() != null && !borrowing.getLoaned()) {
                BorrowingArchive borrowingArchive = new BorrowingArchive();
                borrowingArchive.setUserId(optionalBorrowing.get().getUserId());
                borrowingArchive.setBookId(optionalBorrowing.get().getBookId());
                borrowingArchive.setBorrowingDate(optionalBorrowing.get().getBorrowingDate());
                borrowingArchive.setReturnDate(optionalBorrowing.get().getReturnDate());
                borrowingArchiveRepository.save(borrowingArchive);
                borrowingRepository.deleteByBookId(optionalBorrowing.get().getBookId());
            } else {
                Date currentDate = new Date();
                if (!optionalBorrowing.get().getExtended() && optionalBorrowing.get().getReturnDate().after(currentDate)) {
                    optionalBorrowing.get().setReturnDate(borrowing.getReturnDate());
                    optionalBorrowing.get().setExtended(borrowing.getExtended());
                }
            }
        }
    }

    @Transactional
    public void delete(Borrowing borrowing) {
        borrowingRepository.deleteByIdAndUserId(borrowing.getId(), borrowing.getUserId());
    }
}
