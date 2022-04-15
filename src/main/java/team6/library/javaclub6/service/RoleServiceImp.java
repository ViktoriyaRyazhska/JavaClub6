package team6.library.javaclub6.service;

import team6.library.javaclub6.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import team6.library.javaclub6.model.Role;

@Repository
public class RoleServiceImp implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Transactional(readOnly = true)
    public Role findById(int id){
        return roleDao.findById(id);
    }
}
