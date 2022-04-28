package team3.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team3.library.dao.RequestStatusDao;
import team3.library.model.RequestStatus;

@Service
public class RequestStatusServiceImp implements RequestStatusService{

    @Autowired
    RequestStatusDao requestStatusDao;

    @Transactional
    public RequestStatus findById(int id) {
        return requestStatusDao.findById(id);
    }
}
