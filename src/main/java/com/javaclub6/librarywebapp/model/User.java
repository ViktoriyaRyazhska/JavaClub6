package com.javaclub6.librarywebapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message = "Please Enter your name")
    private String firstName;

    @Column(name = "last_name")
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message = "Please Enter your name")
    private String lastName;

    @Column(name = "email", unique = true)
    @Email(message = "{user.email.invalid}")
    @NotEmpty(message = "Please Enter your email")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
