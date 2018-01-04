package com.nb.library.consumer.contract;

import com.nb.library.consumer.contract.dao.*;

public interface DaoFactory {
    AuthorDao getAuthorDao();

    void setAuthorDao(AuthorDao authorDao);

    BorrowingDao getBorrowingDao();

    void setBorrowingDao(BorrowingDao borrowingDao);

    EditorDao getEditorDao();

    void setEditorDao(EditorDao editorDao);

    TypeWorkDao getTypeWorkDao();

    void setTypeWorkDao(TypeWorkDao typeWorkDao);

    UserDao getUserDao();

    void setUserDao(UserDao userDao);

    WorkDao getWorkDao();

    void setWorkDao(WorkDao workDao);
}
