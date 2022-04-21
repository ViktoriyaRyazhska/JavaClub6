package com.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "user")
@Data
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


}
