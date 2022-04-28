package com.library.service.impl;

import com.library.dao.RoleDAO;
import com.library.model.Role;
import com.library.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleDAO roleDAO;
    @Transactional(readOnly = true)
    public Role findByTitle(String s) {
        return roleDAO.findByTitle(s);
    }
}
