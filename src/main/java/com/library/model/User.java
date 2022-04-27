package com.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @Column(name = "first_name")
    @NotEmpty(message = "Please, enter your first name")
    private String name;

    @Column(name = "last_name")
    @NotEmpty(message = "Please, enter your last name")
    private String surname;

    @Column(name = "date_of_birth")
    @DateTimeFormat (pattern = "DD.MM.YY")
    private LocalDate dateOfBirth;

    @DateTimeFormat (pattern = "DD.MM.YY")
    @Column(name = "create_time")
    private LocalDate createTime;

    @Column
    private String email;

    @Column
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @NotNull
    private Role role;

}
