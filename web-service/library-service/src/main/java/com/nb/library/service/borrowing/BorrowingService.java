package com.nb.library.service.borrowing;

import com.nb.library.entity.borrowing.Borrowing;
import com.nb.library.entity.borrowing.UserAccount;
import com.nb.library.repository.contract.BorrowingDaoContract;
import com.nb.library.service.AbstractService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(name = "BorrowingClient", serviceName = "BorrowingService", portName = "BorrowingPort", targetNamespace = "borrowing.client.library.nb.com")
public class BorrowingService extends AbstractService {

    private BorrowingDaoContract contract = getDaoFactory().getBorrowingDao();

    @WebMethod
    public void addBorrowing(Borrowing borrowing) {
        contract.save(borrowing);
    }

    @WebMethod
    public Borrowing getBorrowing(Borrowing borrowing) {
        return contract.findByIdAndUserId(borrowing);
    }

    @WebMethod
    public List<Borrowing> listBorrowing(UserAccount user) {
        return contract.findAllByUserId(user);
    }

    @WebMethod
    public void deleteBorrowing(Borrowing borrowing) {
        contract.delete(borrowing);
    }

    @WebMethod
    public List<Borrowing> getLoanPeriodsExceeded(Borrowing borrowing) {
        return contract.getLoanPeriodsExceeded(borrowing);
    }
}
