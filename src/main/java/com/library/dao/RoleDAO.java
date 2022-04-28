package com.library.dao;

import com.library.model.Role;

public interface RoleDAO {
    Role findByTitle(String s);
}
