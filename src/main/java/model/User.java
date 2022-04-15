package com.spring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @Column(name = "first_name")
    @NotEmpty(message = "Please, enter your first name")
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty(message = "Please, enter your last name")
    private String lastName;

    @Column(name = "date_of_birth")
    @DateTimeFormat (pattern = "DD.MM.YY")
    private Date dateOfBirth;

    @DateTimeFormat (pattern = "DD.MM.YY")
    @Column(name = "create_time")
    private Date createTime;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @NotNull
    private Role role;

    public User() {
    }

    public long getId() {
        return userId;
    }

    public void setId(long id) {
        this.userId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
