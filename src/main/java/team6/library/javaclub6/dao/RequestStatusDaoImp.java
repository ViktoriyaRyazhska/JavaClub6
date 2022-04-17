package team6.library.javaclub6.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team6.library.javaclub6.model.RequestStatus;

@Repository
public class RequestStatusDaoImp implements RequestStatusDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public RequestStatus findById(int id) {
        return sessionFactory.getCurrentSession().get(RequestStatus.class, id);
    }
}
