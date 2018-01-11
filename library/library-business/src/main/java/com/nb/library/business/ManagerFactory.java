package com.nb.library.business;

import com.nb.library.business.contract.*;

public class ManagerFactory {

    private AuthorManager authorManager;
    public AuthorManager getAuthorManager() {
        return authorManager;
    }
    public void setAuthorManager(AuthorManager authorManager) {
        this.authorManager = authorManager;
    }

    private BorrowingManager borrowingManager;
    public BorrowingManager getBorrowingManager() {
        return borrowingManager;
    }
    public void setBorrowingManager(BorrowingManager borrowingManager) {
        this.borrowingManager = borrowingManager;
    }

    private EditorManager editorManager;
    public EditorManager getEditorManager() {
        return editorManager;
    }
    public void setEditorManager(EditorManager editorManager) {
        this.editorManager = editorManager;
    }

    private TypeWorkManager typeWorkManager;
    public TypeWorkManager getTypeWorkManager() {
        return typeWorkManager;
    }
    public void setTypeWorkManager(TypeWorkManager typeWorkManager) {
        this.typeWorkManager = typeWorkManager;
    }

    private UserManager userManager;
    public UserManager getUserManager() {
        return userManager;
    }
    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    private WorkManager workManager;
    public WorkManager getWorkManager() {
        return workManager;
    }
    public void setWorkManager(WorkManager workManager) {
        this.workManager = workManager;
    }
}
