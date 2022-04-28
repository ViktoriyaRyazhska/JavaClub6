package team3.library.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team3.library.model.RequestStatus;

@Repository
public class RequestStatusDaoImp implements RequestStatusDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public RequestStatus findById(int id) {
        return sessionFactory.getCurrentSession().get(RequestStatus.class, id);
    }
}
