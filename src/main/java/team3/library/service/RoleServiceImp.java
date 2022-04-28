package team3.library.service;

import org.springframework.stereotype.Service;
import team3.library.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import team3.library.model.Role;

@Service
public class RoleServiceImp implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Transactional(readOnly = true)
    public Role findById(int id){
        return roleDao.findById(id);
    }
}
