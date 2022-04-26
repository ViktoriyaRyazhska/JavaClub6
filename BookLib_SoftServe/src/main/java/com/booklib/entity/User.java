package com.booklib.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message = "Please Enter your name")
    private String name;

    @Column(nullable = false, length = 50)
    @Size(max = 20, min = 3, message = "{user.surname.invalid}")
    @NotEmpty(message = "Please Enter your surname")
    private String surname;

    @Column(unique = true)
    @Email(message = "{user.email.invalid}")
    @NotEmpty(message = "Please Enter your email")
    private String email;

    @Column(nullable = false, length = 50)
    @NotEmpty(message = "Please Enter your password")
    private String password;

    @Column(nullable = false)
    @NotNull(message = "Please Enter Date Registration")
    private Date date_registr;

    @Column(nullable = false)
    @NotNull(message = "Please Enter Date of Birth")
    private Date birthday;

    @ManyToOne
    @JoinColumn(name = "roles ", referencedColumnName = "id")
    private Roles roles;
}
