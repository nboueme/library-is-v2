package com.nb.library.consumer.impl;

import com.nb.library.consumer.contract.DaoFactory;
import com.nb.library.consumer.contract.dao.*;

public class DaoFactoryImpl implements DaoFactory {

    private AuthorDao authorDao;
    public AuthorDao getAuthorDao() {
        return authorDao;
    }
    public void setAuthorDao(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    private BorrowingDao borrowingDao;
    public BorrowingDao getBorrowingDao() {
        return borrowingDao;
    }
    public void setBorrowingDao(BorrowingDao borrowingDao) {
        this.borrowingDao = borrowingDao;
    }

    private EditorDao editorDao;
    public EditorDao getEditorDao() {
        return editorDao;
    }
    public void setEditorDao(EditorDao editorDao) {
        this.editorDao = editorDao;
    }

    private TypeWorkDao typeWorkDao;
    public TypeWorkDao getTypeWorkDao() {
        return typeWorkDao;
    }
    public void setTypeWorkDao(TypeWorkDao typeWorkDao) {
        this.typeWorkDao = typeWorkDao;
    }

    private UserDao userDao;
    public UserDao getUserDao() {
        return userDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private WorkDao workDao;
    public WorkDao getWorkDao() {
        return workDao;
    }
    public void setWorkDao(WorkDao workDao) {
        this.workDao = workDao;
    }
}
