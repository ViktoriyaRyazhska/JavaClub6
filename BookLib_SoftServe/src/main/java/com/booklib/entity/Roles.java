package com.booklib.entity;

import java.util.Set;

import javax.persistence.*;
import lombok.*;
//import org.springframework.context.annotation.Primary;

@Entity
@Setter
@Getter
@Table(name = "roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String role;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;


}