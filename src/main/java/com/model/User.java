package com.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    @NotEmpty()
    private String userName;

    @Column(name = "user_surname")
    @NotEmpty()
    private  String userSurname;

    @Column(name = "user_email")
    @NotEmpty()
    private String userEmail;

    @Column(name = "user_password")
    @NotEmpty()
    private String userPassword;

    @Column(name = "user_date_register")
    @NotEmpty()
    private Date userDateRegister;


    @NotEmpty
    private Role role;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Date getUserDateRegister() {
        return userDateRegister;
    }

    public void setUserDateRegister(Date userDateRegister) {
        this.userDateRegister = userDateRegister;
    }
}
