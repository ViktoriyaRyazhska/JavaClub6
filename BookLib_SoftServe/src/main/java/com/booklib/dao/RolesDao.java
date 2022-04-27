package com.booklib.dao;


import com.booklib.entity.Roles;

public interface RolesDao {
    Roles findByRole(String role);
    Roles findRole(Long id);
}
