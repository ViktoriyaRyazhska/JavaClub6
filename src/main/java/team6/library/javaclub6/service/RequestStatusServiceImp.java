package team6.library.javaclub6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team6.library.javaclub6.dao.RequestStatusDao;
import team6.library.javaclub6.model.RequestStatus;

@Service
public class RequestStatusServiceImp implements RequestStatusService{

    @Autowired
    RequestStatusDao requestStatusDao;

    @Transactional
    public RequestStatus findById(int id) {
        return requestStatusDao.findById(id);
    }
}
