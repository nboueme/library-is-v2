package com.nb.library.repository;

import com.nb.library.repository.contract.*;

public class DaoFactory {

    private AuthorDaoContract authorDao;
    public AuthorDaoContract getAuthorDao() {
        return authorDao;
    }
    public void setAuthorDao(AuthorDaoContract authorDao) {
        this.authorDao = authorDao;
    }

    private BorrowingDaoContract borrowingDao;
    public BorrowingDaoContract getBorrowingDao() {
        return borrowingDao;
    }
    public void setBorrowingDao(BorrowingDaoContract borrowingDao) {
        this.borrowingDao = borrowingDao;
    }

    private EditorDaoContract editorDao;
    public EditorDaoContract getEditorDao() {
        return editorDao;
    }
    public void setEditorDao(EditorDaoContract editorDao) {
        this.editorDao = editorDao;
    }

    private ReservationDaoContract reservationDao;
    public ReservationDaoContract getReservationDao() {
        return reservationDao;
    }
    public void setReservationDao(ReservationDaoContract reservationDao) {
        this.reservationDao = reservationDao;
    }

    private TypeWorkDaoContract typeWorkDao;
    public TypeWorkDaoContract getTypeWorkDao() {
        return typeWorkDao;
    }
    public void setTypeWorkDao(TypeWorkDaoContract typeWorkDao) {
        this.typeWorkDao = typeWorkDao;
    }

    private UserDaoContract userDao;
    public UserDaoContract getUserDao() {
        return userDao;
    }
    public void setUserDao(UserDaoContract userDao) {
        this.userDao = userDao;
    }

    private WorkDaoContract workDao;
    public WorkDaoContract getWorkDao() {
        return workDao;
    }
    public void setWorkDao(WorkDaoContract workDao) {
        this.workDao = workDao;
    }
}
