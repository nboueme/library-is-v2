package com.nb.library.business.contract;

import com.nb.library.business.contract.manager.*;

public interface ManagerFactory {
    AuthorManager getAuthorManager();

    void setAuthorManager(AuthorManager authorManager);

    BorrowingManager getBorrowingManager();

    void setBorrowingManager(BorrowingManager borrowingManager);

    EditorManager getEditorManager();

    void setEditorManager(EditorManager editorManager);

    TypeWorkManager getTypeWorkManager();

    void setTypeWorkManager(TypeWorkManager typeWorkManager);

    UserManager getUserManager();

    void setUserManager(UserManager userManager);

    WorkManager getWorkManager();

    void setWorkManager(WorkManager workManager);
}
