package com.library.models;

import jakarta.persistence.*;

import java.util.List;
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue
    private long roleId;

    @Column(name = "title")
    private String roleTitle;

    @OneToMany(mappedBy = "role")
    private List<User> users;

    public Role() {
    }

    public long getId() {
        return roleId;
    }

    public void setId(long id) {
        this.roleId = id;
    }

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
